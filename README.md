# spring-security-michelli-brito
https://www.youtube.com/watch?v=t6prPki7daU  

Projeto modelo github https://github.com/MichelliBrito/parking-control-api/tree/security#readme  


O username default do spring segurity é user, o password default é apresentado no console logo quando o projeto sobe.  
Using generated security password: xxxxxxxx......  

O tipo de autenticação default é basic auth.  
![](images/tipo_autenticacao_default.png)  

A anotação @EnableWebSecurity serve para desligar todas as configurações padrão do spring security, anotando a classe WebSecirityConfig com ela, faz com que o  
spring utilize apenas as configurações default que forem colocadas lá.  

A partir do spring security 5.7.* o WebSecurityConfigurerAdapter foi descontinuado, por esse motivo foi criada a classe WebSecurityConfigVersaoAtual com as configuracoes  
mais recentes recomendadas.  
