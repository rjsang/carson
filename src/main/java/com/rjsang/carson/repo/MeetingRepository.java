package com.rjsang.carson.repo;

import com.rjsang.carson.model.Meeting;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author sangr1
 */
public interface MeetingRepository extends MongoRepository<Meeting, Integer>
{

}
