package com.rjsang.carson;

import com.rjsang.carson.model.Lodge;
import com.rjsang.carson.repo.LodgeRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import quicktime.std.movies.Movie;

/**
 *
 * @author rjsang
 */
@SpringBootApplication
public class TheCarsonReport
{

  public static void main(String[] args)
  {
    SpringApplication.run(TheCarsonReport.class, args);
  }
  
  @Bean
  public InitializingBean seedDatabase(LodgeRepository repo)
  {
    return () -> {
        repo.deleteAll();
        Lodge kauri = new Lodge("Kauri", 474);
        
    };
  }

}
