//package config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebFluxSecurity
//public class SecurityConfig {
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.authorizeHttpRequests(authorizeRequests -> {
//            authorizeRequests.requestMatchers("/","/login**").permitAll()
//                    .anyRequest().authenticated();
//        }).oauth2Login(oauth2Login ->{
//            oauth2Login.loginPage("login")
//                    .defaultSuccessUrl("/hr-job-view",true);
//        });
//
//        return httpSecurity.build();
//
//    }
//}
