package com.rjsang.carson.repo;

import com.rjsang.carson.model.Lodge;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * {@link Lodge} repository
 *
 * @author rjsang
 */
public interface LodgeRepository extends MongoRepository<Lodge, Integer>
{

}
