package com.rjsang.carson.services;

import com.rjsang.carson.model.Lodge;
import com.rjsang.carson.repo.LodgeRepository;
import javax.inject.Inject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Restful service for {@link Lodges}s
 * 
 * @author rjsang
 */
@RestController
@RequestMapping("lodges")
public class LodgeService {
    
    @Inject
    private LodgeRepository lodgeRepository;
    
    @RequestMapping("/")
    public Iterable<Lodge> allLodges() {
        return lodgeRepository.findAll();
    }
    
}
