/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsang.carson.services;

import com.rjsang.carson.TheCarsonReport;
import com.rjsang.carson.model.ReportRow;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.fest.assertions.Assertions.assertThat;

/**
 *
 * @author rjsang
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TheCarsonReport.class)
@WebAppConfiguration
public class ReportServiceTest {

  @Inject
  private ReportService reportService;

    @Test
    public void testAllLodges() {
      List<ReportRow> report = reportService.allLodges();
      assertThat(report).hasSize(2);
      assertThat(report.get(0).getDescription()).isEqualTo("Third Degree: Bro Brenton Dix");
      assertThat(report.get(1).getDescription()).isEqualTo("First Degree: Mr Peter Riem");
    }
    
}
