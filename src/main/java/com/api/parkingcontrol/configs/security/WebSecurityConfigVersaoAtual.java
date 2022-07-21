package com.api.parkingcontrol.configs.security;

import com.api.parkingcontrol.enums.RoleNameEnum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true) // Habilita a restrição direto no controller
public class WebSecurityConfigVersaoAtual {

    public static final String PARKING_SPOT_BASE_URI = "/parking-spot";

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

         http
                .httpBasic()
                .and()
                .authorizeHttpRequests()
//                .antMatchers(HttpMethod.GET, PARKING_SPOT_BASE_URI + "/**").permitAll()
//                .antMatchers(HttpMethod.POST, PARKING_SPOT_BASE_URI).hasRole(RoleNameEnum.ROLE_USER.toString())
//                .antMatchers(HttpMethod.DELETE, PARKING_SPOT_BASE_URI + "/**").hasRole(RoleNameEnum.ROLE_ADMIN.toString())
                .anyRequest().authenticated() // Todas as solicitações http precisam ser autenticadas
                .and()
                .csrf().disable(); // Desabilitando a proteção csrf

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
