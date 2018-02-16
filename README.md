# spring-boot-mongo
Spring boot application with Mongo

Step 1: Install MongoDb using installer
Step 2: Setup a configuration file for environment - mongod.cfg ; Below directories has to be created first

 systemLog:
    destination: file
    path: E:\MongoDB\data\log\mongod.log
 storage:
    dbPath: E:\MongoDB\data\db
	
Step 3: Start MongoDb 
     
	  C:\Program Files\MongoDB\Server\3.6\bin\mongod.exe 
	  
Step 4: Connect with shell 
     
	 C:\Program Files\MongoDB\Server\3.6\bin\mongo.exe
       
