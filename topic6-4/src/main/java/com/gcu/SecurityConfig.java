package com.gcu;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Create a new class named SecurityConfig, which will be used to configure the
 * OAuth2 access rules. The class should be marked with the @Configuration
 * annotation and
 *
 * @EnableOAuth2Sso annotation. Override the configure() method and set the
 *                  configuration so that the /, /login, /callback, and /error
 *                  URIs are all permitted and all other URIs need
 *                  authentication
 * @author jjk14
 *
 */
@Configuration
@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.antMatcher("/**").authorizeRequests().antMatchers("/", "/login**", "/callback", "/error**").permitAll()
				.anyRequest().authenticated();
	}
}
