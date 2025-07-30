# Jasypt encryption in Spring Boot

https://youtrack.jetbrains.com/issue/IDEA-376214/Spring-Debugger-field-injectionvm-option-to-fail

How to reproduce:
1. in the test class set
  - the DB password you use for your database in as the 'password' field value
  - some secret key you use for your encryption in as the 'secret' field value
2. run the test
3. copy the encrypted password from the console
4. paste it in the DB password field in the application.properties file like
``spring.datasource.password=ENC(<copied password>)``
5. in the Spring Boot run configuration add the following VM argument to the VM arguments field:
``-Djasypt.encryptor.password=<your secret key>``
5. run the application in debugger mode
6. check that it works
7. enable Spring Debugger
8. try to debug the application - it fails
9. comment-out the `@Configuration` annotation in the `JasyptConfig` class and 
uncomment the `@Configuration` annotation in the `JasyptConfigWithConstructor` class
10. try to debug the application - it works again


