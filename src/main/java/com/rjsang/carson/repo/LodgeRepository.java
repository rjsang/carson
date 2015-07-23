package com.rjsang.carson.repo;

import com.rjsang.carson.model.Lodge;
import java.util.List;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * {@link Lodge} repository
 *
 * @author rjsang
 */
public interface LodgeRepository extends JpaRepository<Lodge, Long> {

  @Query("select l from Lodge l left join fetch l.meetings m order by l.number, m.dateTime")
  public Set<Lodge> findAllOrderByNumberAndIncludeMeetings();
    
  public List<Lodge> findByNumber(int number);
    
}
