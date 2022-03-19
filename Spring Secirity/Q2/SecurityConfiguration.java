package com.spring;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		//set your configuration on the auth object
		auth.inMemoryAuthentication()
		      .withUser("blah")
		      .password("{noop}blah")
		      .roles("USER")
		      .and()
		      .withUser("foo")
		      .password("{noop}foo")
		      .roles("ADMIN");
		
	}
	
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/**").hasRole("ADMIN")
		.and().formLogin();
	}

}
