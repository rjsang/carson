package com.rjsang.carson.repo;

import com.rjsang.carson.model.Brother;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rjsang
 */
public interface BrethrenRepository extends JpaRepository<Brother, Long>
{

  public Brother findByEmail(String email);

}
