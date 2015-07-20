package com.rjsang.carson.repo;

import com.rjsang.carson.model.Lodge;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {@link Lodge} repository
 *
 * @author rjsang
 */
public interface LodgeRepository extends JpaRepository<Lodge, Long> {

    public List<Lodge> findByOrderByNumber();
    
    public List<Lodge> findByNumber(int number);
    
}
