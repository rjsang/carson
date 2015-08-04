package com.rjsang.carson.services;

import com.rjsang.carson.model.Brother;
import com.rjsang.carson.repo.BrethrenRepository;
import javax.inject.Inject;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

  public Brother addBrother(Brother brother)
  {
    brother.setPassword(passwordEncoder.encode(brother.getPassword()));
    brother.getRoles().add("ROLE_ADMIN");
    repo.save(brother);
    return brother;
  }

}
