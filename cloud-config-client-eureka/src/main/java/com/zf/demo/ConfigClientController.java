package com.zf.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

	/*@Value("${foo}")
    String foo;
	
	@Value("${messge}")
	String messge;
	
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
    
    @RequestMapping(value = "/me")
    public String me(){
        return messge;
    }*/
	@Value("${profile}")
	  private String profile;

	  @GetMapping("/profile")
	  public String getProfile() {
	    return this.profile;
	  }
}
