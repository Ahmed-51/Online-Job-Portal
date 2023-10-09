# Online-Job-Portal

Job Portal For Engineers is a web application built in **JAVA**. It 
provides the candidates ability to **Register** to this application 
and **search** for jobs. Each candidate will have their own account. 
Once they find a job post attractive they can **Apply for the job** 
and his interest in a particular job will be stored in database with
the identification of the job.



On the other hand, **Recruiters** from different 
companies who are willing to publish the jobs for their company 
to candidates can **register to the Recruiter Section** and get their
own account created and can **post jobs** which are divided into **six
catagories** representing different types of engineering sectors. 
All these job post created in various sections will be stored in 
database. If they want, they can **add or remove jobs** that they 
have recently created and these jobs can be seen by various 
candidates and they can apply for the qualifying exam. Main 
aim of this web application is to make a good web application 
that can make this job search option easy and accessible to 
everyone who is interested.


&nbsp;
&nbsp;


## Database
A Centralized database is maintained in between a job 
provider and a job seeker by an administrator so that it is 
accessible every registered user. The admin can check 
every activities of the users. He can see posts and also delete 
posts if he finds anything inappropriate. Admin can also create 
posts and delete accounts of registered users who seems to 
violate rules. 


The App is made with **Netbeans IDE in JAVA SWING** is a 
part of Java Foundation Classes (JFC) that is used to create 
window-based applications. It is built on the top of **AWT 
(Abstract Windowing Toolkit) API** and entirely written in java. 
Java Swing provides platform-independent and 
lightweight components and also provide a more sophisticated 
set of GUI Componenets. And Finally, I have used **XAMPP** which 
is a free and open-source cross-platform web server solution 
stack package. I Have also used **phpMyAdmin** which is a free 
software tool written in PHP intended to handle the 
administration of **MySQL** over the Web supporting a wide range 
of operations on MySQL. 


Frequently used operations such as 
**managing databases, tables, columns, relations, indexes, users, 
permissions** etc. can be performed via the user interface, while 
you still have the ability to directly execute any SQL statement.
as the database management system.


&nbsp;
&nbsp;



## Description:
Once we have run the application, we will see Home page 
consisting of two options LogIn and Register. If the user have a 
previous account then he will go for LogIn. But if he doesn’t 
have any registed account, then he first have to create a 
account.


To create a new account, he have to click the Register 
button which will take him to Registration Page. Now he can 
create one of two types of account namely Recruiter account 
and Job seeker account. He will select the option which suits 
him. Now he will submit some information crucial for the 
opening of his account including name, email, password, 
qualification and city. If he fills up the form properly and click 
submit button, his personal account will be created in the app 
and all this information will be stored in User Table of the 
database. But if he doesn’t fill up the form properly, he will 
have an error message saying that fields are empty. 






Once he 
created his acount he can now LogIn to his account.
If he presses LogIn button, it will take him to the LogIn
page where he will have 3 options including Admin LogIn, Job 
seeker LogIn and Recruiter LogIn. He have to select right type 
of LogIn option. An Admin will press the Admin LogIn option and
it will take him to the Admin LogIn Page. He will put his email 
and password there and press LogIn. This data will be checked 
with the data stored in database. If they match, Admin Page will
be opened where it has 3 options including post job, delete job 
and delete account. He can also LogOut after he is done by 
pressing LogOut button.




If he want to create a new post, he will click Post Job 
button which will take him Post Job Page. There he will find six 
catagories of engineering sections under which he can post 
including mechanical engineering, software engineering , 
aerospace engineering, electrical engineering, civil engineering 
and computer engineering sections. 



After selecting a category, 
he will type job description and click post. A job will be created 
in that category and all this information will be stored in Job
Table of the database. If he want to delete a post, he will click Delete Job 
button which will take him Delete Job Page where if he put the 
job Id and click submit, the job will be removed from the 
database. 



And similarly If he want to delete a user account, he 
will click Delete Account button which will take him Delete
Account Page where if he put the User Id and click submit, the 
Users account will be removed from the database.
In case of a Recruiter, he will press the Recruiter
LogIn option and it will take him to the Recruiter LogIn Page. He
will put his email and password there and press LogIn. This data
will be checked with the data stored in database. If they match, 
Recruiter Page will be opened where it has two options including
post job and delete job. He can also LogOut after he is done by 
pressing LogOut button.



If he want to create a new post, he will click Post Job 
button which will take him Post Job Page. There he will find six 
catagories of engineering sections under which he can post 
including mechanical engineering, software engineering , 
aerospace engineering, electrical engineering, civil engineering 
and computer engineering sections. After selecting a category, 
he will type job description and click post. A job will be created 
in that category and all this information will be stored in Job
Table of the database.


 If he want to delete a post, he will click Delete Job 
button which will take him Delete Job Page where if he put the 
job Id and click submit, the job will be removed from the 
database. 



Now In case of Job seeker, he press the seeker LogIn 
option and it will take him to the Job seeker LogIn Page. He will 
put his email and password there and press LogIn. This data will
be checked with the data stored in database. 


If they match, 
Catagories Page will be opened where it has six catagories of 
engineering jobs in which he can search for jobs including 
mechanical engineering, software engineering , aerospace 
engineering, electrical engineering, civil engineering and 
computer engineering sections. After selecting and clicking a 
category, it will open Jobs Page where all the jobs that have 
been posted by many recuiters in that particular section will be 
shown with a Id no. and description of the job. 


If he is attracted 
by the job description, he will input the Id in the below textarea 
an click Apply. It will open a new page named Apply form where 
he will put his name, email, mobile no and click submit. All this 
information will be stored in Applications Table of the database 
where the applicants Id and Job Id are connected in a single 
table. So, now the recruiter can see who are interested in his 
job post and can email them for further steps. This way the 
process of Hiring and Finding a Job much more fast and easier 
for both the Job seekers and Recruiters.







## Images


![Home](https://github.com/Ahmed-51/Online-Job-Portal/assets/71616975/e2740156-c8c5-45c4-aa26-8d687997d738)

![3 Types of Log In](https://github.com/Ahmed-51/Online-Job-Portal/assets/71616975/0f3c80a2-6f4a-40e7-8c11-5bb16a3fa2f9)


![Registration](https://github.com/Ahmed-51/Online-Job-Portal/assets/71616975/b298eba7-71d7-4a88-8803-c3d3f666f799)

![Admin Log In](https://github.com/Ahmed-51/Online-Job-Portal/assets/71616975/06c39950-41ca-4946-aece-34a18c829db8)




![Admin Page](https://github.com/Ahmed-51/Online-Job-Portal/assets/71616975/91d6c782-5733-42e4-9102-b37b537e55b6)



![Post Job](https://github.com/Ahmed-51/Online-Job-Portal/assets/71616975/68432d86-2e37-4676-8e08-36fc20c5900a)


![Catagories](https://github.com/Ahmed-51/Online-Job-Portal/assets/71616975/b9f70560-08a9-4cc2-a017-29b0af79cf6d)

![Posted jobs](https://github.com/Ahmed-51/Online-Job-Portal/assets/71616975/ebe77ea5-fb16-4065-a00b-6ced128acdfc)


![Delete Job](https://github.com/Ahmed-51/Online-Job-Portal/assets/71616975/16ec7f69-0c11-41aa-9752-4347cfd6342f)

![Delete Account](https://github.com/Ahmed-51/Online-Job-Portal/assets/71616975/b392a152-5b36-4cfd-ab33-3a5a5e481742)




![Recruiter Log In](https://github.com/Ahmed-51/Online-Job-Portal/assets/71616975/b112bdbb-bb84-4b2e-872c-0ae610213625)




![Recruiter Page](https://github.com/Ahmed-51/Online-Job-Portal/assets/71616975/bc2e3c1b-4ffd-49d4-8b88-da0ec1f6d493)



![Job Seeker Log In](https://github.com/Ahmed-51/Online-Job-Portal/assets/71616975/9721e01b-baa9-4e0e-9418-3cd06a5a03af)


![Apply Form](https://github.com/Ahmed-51/Online-Job-Portal/assets/71616975/3aead64c-9dd1-4524-a75d-6eaa33795819)
![Project Diagram](https://github.com/Ahmed-51/Online-Job-Portal/assets/71616975/768febc2-61fe-4409-9290-a71927cb0cba)
