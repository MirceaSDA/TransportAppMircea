package org.example.transport.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http
                .authorizeRequests()
                .antMatchers("/css/**", "/403", "/", "/login", "/frontpage", "/user", "/addTransport",
                        "/transports", "/addCompany", "/companies", "/saveCompany")
                .permitAll()

                .and()
                .authorizeRequests()
                .antMatchers("/userTransport").hasRole("ADMIN")

                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated()

                .and()
                .exceptionHandling()
                .accessDeniedPage("/403")

                .and()
                .formLogin()
                .loginProcessingUrl("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .loginPage("/frontpage")
                .defaultSuccessUrl("/transports")
                .failureUrl("/frontpage")

                .and()
                .logout()
                .logoutUrl("/logout")
                .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        PasswordEncoder encoder = passwordEncoder();
        auth
                .jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(encoder);
//                .usersByUsernameQuery("select username, password, true from users where username = ?");
//        System.out.println("pass 'parola' encrypted: " + encoder.encode("parola"));

//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        auth.inMemoryAuthentication().withUser("mircea").password(encoder.encode("mircea")).roles("ADMIN", "USER")
//                .and()
//                .withUser("fulga").password(encoder.encode("fulga")).roles("USER")
//                .and()
//                .passwordEncoder(encoder);
    }
}
