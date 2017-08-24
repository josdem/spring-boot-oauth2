package com.jos.dem.oauth2.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class DemoController {

  @RequestMapping('/')
  String index(){
    'index'
  }

}
