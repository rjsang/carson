package com.rjsang.carson;

import com.rjsang.carson.model.Lodge;
import com.rjsang.carson.model.Meeting;
import com.rjsang.carson.repo.LodgeRepository;
import com.rjsang.carson.repo.MeetingRepository;
import java.time.LocalDateTime;
import java.time.Month;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author rjsang
 */
@SpringBootApplication
@EntityScan(
  basePackageClasses = { TheCarsonReport.class, Jsr310JpaConverters.class }
)
public class TheCarsonReport {

    public static void main(String[] args) {
        SpringApplication.run(TheCarsonReport.class, args);
    }

    @Bean
    public InitializingBean seedDatabase(LodgeRepository lodgeRepo, MeetingRepository meetingRepo) {
        return () -> {
            lodgeRepo.deleteAll();
            Lodge kauri = new Lodge("Kauri", 474);
            lodgeRepo.save(kauri);

            meetingRepo.deleteAll();
            Meeting thirdDegree = new Meeting(LocalDateTime.of(2015, Month.AUGUST, 20, 19, 30), "Third Degree: Bro Brenton Dix", kauri);
            Meeting firstDegree = new Meeting(LocalDateTime.of(2015, Month.SEPTEMBER, 17, 19, 30), "First Degree: Mr Peter Riem", kauri);
            meetingRepo.save(thirdDegree);
            meetingRepo.save(firstDegree);
            
        };
    }

}
