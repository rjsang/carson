package com.rjsang.carson.services;

import com.rjsang.carson.model.Brother;
import com.rjsang.carson.repo.BrethrenRepository;
import javax.inject.Inject;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 *
 * @author rjsang
 */
@RestController
@RequestMapping("brethren")
public class BrethrenService
{

  @Inject
  private BrethrenRepository repo;

  @Inject
  private PasswordEncoder passwordEncoder;

  @RequestMapping(value = "/add", method = POST)
  public Brother addBrother(@RequestBody Brother brother)
  {
    brother.setPassword(passwordEncoder.encode(brother.getPassword()));
    brother.getRoles().add("ROLE_USER");
    repo.save(brother);
    return brother;
  }

}
