package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class test  extends WebSecurityConfigurerAdapter{

//	@Override
//	@Bean
//	protected UserDetailsService userDetailsService() {
//		UserDetails user1=User.builder().username("one").password("{noop}one").roles("user").build();
//		UserDetails user2=User.builder().username("two").password("{noop}two").roles("user","admin").build();
//		
//		UserDetails user3=User.builder().username("three").roles("user","admin","manager").password("{noop}three").build();
//		
//		return  new InMemoryUserDetailsManager(user1,user2,user3) ;
//	}
	
}
