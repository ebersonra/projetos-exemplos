package com.algaworks.festa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class InMemorySecurityConfig {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		
		builder
			.inMemoryAuthentication().passwordEncoder(passwordEncoder())
			.withUser("joao")
				.password("$2a$10$HB.MxuJNKS.oR2WMNToAmeCxao/2haZkHJFqjfUp2K/R2PV7nEeBe").roles("USER")
			.and()
			.withUser("eberson")
				.password("$2a$10$HB.MxuJNKS.oR2WMNToAmeCxao/2haZkHJFqjfUp2K/R2PV7nEeBe").roles("USER")
			.and()
			.withUser("maria")
				.password("$2a$10$HB.MxuJNKS.oR2WMNToAmeCxao/2haZkHJFqjfUp2K/R2PV7nEeBe").roles("USER");
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("123"));
	}
}
