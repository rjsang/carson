package com.rjsang.carson.repo;

import com.rjsang.carson.model.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {@link Meeting} repository
 * 
 * @author rjsang
 */
public interface MeetingRepository extends JpaRepository<Meeting, Long> {
    
}
