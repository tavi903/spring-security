Keycloak Client Config

Client Authentication: On
Direct Access Grant: On

Credentials > Copy Secret in application.properties

Create a Role: admin
Create two users: only one with the role

Try the endpoints from Postman!

1) Generate token
http://localhost:8888/realms/example-keycloak/protocol/openid-connect/token
x-www-form-urlencoded

username: "user_name"
password: "user_pwd"
client_id: "springboot-app"
grant_type: "password"
client_secret: "grNhrCSvnMRGhuCeVqcBrPTG3uGVlRLg"

2) Call SpringBoot Application Setting Authorization to Bearer Token with the previous access token
http://localhost:8080/hello
http://localhost:8080/ciao
