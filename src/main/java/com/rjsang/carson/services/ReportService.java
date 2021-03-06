package com.rjsang.carson.services;

import com.rjsang.carson.model.Lodge;
import com.rjsang.carson.model.Meeting;
import com.rjsang.carson.model.ReportRow;
import com.rjsang.carson.repo.LodgeRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Restful service to get meetings
 * 
 * @author rjsang
 */
@RestController
@RequestMapping("reports")
public class ReportService {
    
    @Inject
    private LodgeRepository lodgeRepository;

  @RequestMapping("/all")
    public List<ReportRow> allLodges() {
        List<ReportRow> report = new ArrayList<>();
    Set<Lodge> lodges = lodgeRepository.findAllOrderByNumberAndIncludeMeetings();
        for(Lodge lodge : lodges) {
            for(Meeting meeting : lodge.getMeetings()) {
                report.add(new ReportRow(meeting));
            }
        }
        return report;
    }
    
}
