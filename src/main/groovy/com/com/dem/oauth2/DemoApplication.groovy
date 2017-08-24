package com.jos.dem.oauth2

import org.springframework.boot.SpringApplication
import org.springframework.web.bind.annotation.RestController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@SpringBootApplication
@EnableOAuth2Sso
@RestController
class DemoApplication extends WebSecurityConfigurerAdapter{

  static void main(String[] args) {
    SpringApplication.run DemoApplication, args
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
    .antMatcher("/**")
    .authorizeRequests()
    .antMatchers("/", "/login**", "/webjars/**")
    .permitAll()
    .anyRequest()
    .authenticated();
  }

}
