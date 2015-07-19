/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsang.carson.repo;

import com.rjsang.carson.TheCarsonReport;
import com.rjsang.carson.model.Lodge;
import java.util.List;
import javax.inject.Inject;
import org.fest.assertions.Assertions;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 *
 * @author rjsang
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TheCarsonReport.class)
@WebAppConfiguration
public class LodgeRepositoryTest {
    
    @Inject
    private LodgeRepository repo;
    
    @Test
    public void testFindByNumber() {
        Assertions.assertThat(repo.findByNumber(474)).hasSize(1);
    }
    
    @Test
    public void testFindAllOrderByNumber() {
        
    }
    
}
