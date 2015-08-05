package com.rjsang.carson.services;

import java.security.Principal;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/auth")
public class AuthenticationService
{

  @RequestMapping("/user")
  public Principal user(Principal user)
  {
    return user;
  }

  @RequestMapping(value = "/logout", method = POST)
  public void logout(HttpServletRequest request) throws ServletException
  {
    request.logout();
  }


}
