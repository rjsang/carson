package com.rjsang.carson.security;

import com.rjsang.carson.model.Brother;
import com.rjsang.carson.repo.BrethrenRepository;
import java.util.*;
import javax.inject.Inject;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class MyUserDetailsService implements UserDetailsService
{

  @Inject
  private BrethrenRepository repo;

  @Override
  public UserDetails loadUserByUsername(final String email)
      throws UsernameNotFoundException
  {

    Brother brother = repo.findByEmail(email);
    List<GrantedAuthority> authorities
        = buildUserAuthority(brother.getRoles());

    return buildUserForAuthentication(brother, authorities);

  }

  private User buildUserForAuthentication(Brother brother,
                                          List<GrantedAuthority> authorities)
  {
    return new User(brother.getEmail(), brother.getPassword(),
        true, true, true, true, authorities);
  }

  private List<GrantedAuthority> buildUserAuthority(Set<String> roles)
  {

    List<GrantedAuthority> auths = new ArrayList<>(roles.size());

    for (String role : roles)
    {
      auths.add(new SimpleGrantedAuthority(role));
    }

    return auths;
  }
}
