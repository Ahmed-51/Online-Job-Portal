import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class controller {
    private Connection connect(){
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3325/jobportal","root","");   
            return con;
            }catch(Exception e){ System.out.println(e);
                return null;
            } 
    }
    
    private ResultSet fetch(String q){
        try{
            Connection con= connect();
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery(q);
            return rs;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    private boolean run(String q){
        try{
            Connection con= connect();
            Statement stmt=con.createStatement();  
            stmt.executeUpdate(q);
            con.close();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean register(String type, String name, String email, String password, String qualification, String city){
        String query= "Insert into users (type, name, email, password, qualification, city) values ('"
                + type +"','"+ name +"','"+ email +"','"+ password +"','"+ qualification +"','"+ city +"')";
        boolean reg= run(query);
        
        return reg;
    }
    
    public ResultSet fetchUsers(){
        return fetch("Select * from users");
    }
    public boolean auth(String email, String password, String type){
        boolean flag= false;
        ResultSet rs= fetch("Select password, type from users where email='"+ email + "'");
        try {
            while(rs.next()){
                if(rs.getString("password").equals(password) && rs.getString("type").equals(type)){
                    flag= true;
                    break;
                }
            }
            return flag;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean postJob(String cat, String desc){
        return run("Insert into jobs (category, description) values ('"+cat+"','"+desc+"')");
    }
    public ResultSet getJob(String job){
        return fetch("Select * from jobs where category='"+job+"'");
    }
    public boolean deleteJob(int id){
        return run("Delete from jobs where id="+id);
    }
    public boolean deleteAcc(int id){
        return run("Delete from users where id="+id);
    }
    
    public boolean applyJob(String regMail,int job, String email, String name, String mobile){
        ResultSet rs= fetch("Select id from users where email='"+regMail+"'");
        try {
            rs.next();
            int Applicantid= rs.getInt("id");
            return run("Insert into applications values ("+job+","+Applicantid+",'"+name+"','"+email+"','"+mobile+"')");
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
