package com.krawczak.netflixPayments.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;


    @Override
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder)
            throws Exception {
        authenticationManagerBuilder.jdbcAuthentication()
                .dataSource(dataSource);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                .antMatchers("/pay-main-admin").hasAuthority("ADMIN")
                .antMatchers("/pay-users").hasAuthority("ADMIN")
                .antMatchers("/pay-users-payments").hasAuthority("ADMIN")
                .antMatchers("/pay-user-add-payment").hasAuthority("ADMIN")
                .antMatchers("/pay-user-delete-payment").hasAuthority("ADMIN")
                .antMatchers("/pay-user-add-new-payment").hasAuthority("ADMIN")
                .antMatchers("/pay-payments").hasAuthority("USER")
                .antMatchers("/pay-account").hasAuthority("USER")
                .antMatchers("/pay-account-change-password").hasAuthority("USER")
                .antMatchers("/**").permitAll()
                .antMatchers(HttpMethod.POST, "/pay-registration").permitAll()
                .and()
                .formLogin()
                .loginPage("/login").permitAll()
                .defaultSuccessUrl("/pay-main")
                .and()
                .logout()
                .permitAll()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/pay-main")
                .and()
                .csrf()
                .disable();
    }
}
