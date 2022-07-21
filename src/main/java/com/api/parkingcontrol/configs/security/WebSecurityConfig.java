//package com.api.parkingcontrol.configs.security;
//
//import com.api.parkingcontrol.enums.RoleNameEnum;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//// Comentado para utilizar a versão mais atual dos métodos
////@Configuration
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    public static final String PARKING_SPOT_BASE_URI = "/parking-spot";
//    @Autowired
//    private UserDetailsServiceImpl userDetailsService;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .httpBasic()
//            .and()
//                .authorizeHttpRequests()
//                .antMatchers(HttpMethod.GET, PARKING_SPOT_BASE_URI + "/**").permitAll()
//                .antMatchers(HttpMethod.POST, PARKING_SPOT_BASE_URI).hasRole(RoleNameEnum.ROLE_USER.toString())
//                .antMatchers(HttpMethod.DELETE, PARKING_SPOT_BASE_URI + "/**").hasRole(RoleNameEnum.ROLE_ADMIN.toString())
//                .anyRequest().authenticated() // Todas as solicitações http precisam ser autenticadas
//            .and()
//                .csrf().disable(); // Desabilitando a proteção csrf
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }
//
//    // Método para autenticação em memória
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.inMemoryAuthentication()
////                .withUser("diego")
////                .password(passwordEncoder().encode("123456"))
////                .roles("ADMIN");
////    }
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//}
