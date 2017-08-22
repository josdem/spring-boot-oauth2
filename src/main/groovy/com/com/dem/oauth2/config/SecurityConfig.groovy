package com.jos.dem.oauth2.config

import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
@EnableOAuth2Sso
class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
    .antMatcher("/**")
    .authorizeRequests()
    .antMatchers("/", "/login**", "/webjars/**")
    .permitAll()
    .anyRequest()
    .authenticated()
  }

}
