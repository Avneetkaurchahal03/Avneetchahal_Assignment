package com.spring;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	 DataSource datasource;
	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		//set your configuration on the auth object
		auth.jdbcAuthentication()
		       .dataSource(datasource);
		       /*.withDefaultSchema()
		       .withUser("user")
		       .password("{noop}user")
		       .roles("USER")
		       .and()
		       .withUser("admin")
		       .password("{noop}admin")
		       .roles("ADMIN");*/
		
	}
	
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("ADMIN" , "USER")
		.antMatchers("/").permitAll()
		.and().formLogin();
	}

}

