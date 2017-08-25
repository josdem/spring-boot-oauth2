package com.jos.dem.oauth2.controller

import java.security.Principal

import org.springframework.stereotype.Controller
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/user")
class UserController {

  @RequestMapping('/show')
  ModelAndView show(Principal principal){
    Map details = [:]
    details.name = principal.name
    details.email =  principal.userAuthentication?.details?.email
    ModelAndView modelAndView = new ModelAndView('user/show')
    modelAndView.addObject('details', details)
    modelAndView
  }

}
