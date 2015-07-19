package com.rjsang.carson.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

/**
 * A Lodge
 *
 * @author rjsang
 */
@Entity
public class Lodge {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int number;

    @OneToMany(mappedBy = "lodge")
    @OrderBy(value = "dateTime")
    private List<Meeting> meetings;

    public Lodge() {
    }

    public Lodge(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<Meeting> meetings) {
        this.meetings = meetings;
    }

}
