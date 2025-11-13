package HeartDonar.Heartdonar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.csrf().disable()
            .authorizeHttpRequests()
                .requestMatchers("/", "/home", "/index", "/donor", "/recipient",
                                 "/css/**", "/js/**", "/images/**").permitAll()  // public
                .requestMatchers("/admin/**").authenticated()  // protected
                .anyRequest().permitAll()
            .and()
            .formLogin()
                .loginPage("/login")  // your login page
                .permitAll()
            .and()
            .logout()
                .permitAll();

        return http.build();
    }
}
