package com.rjsang.carson.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * A {@link Lodge} meeting
 *
 * @author rjsang
 */
@Entity
public class Meeting {

    @Id
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dateTime;

    private String description;
    
    @ManyToOne
    @JsonIgnore
    private Lodge lodge;

    public Meeting() {
    }

    public Meeting(LocalDateTime dateTime, String description, Lodge lodge) {
        this.dateTime = dateTime;
        this.description = description;
        this.lodge = lodge;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Lodge getLodge() {
        return lodge;
    }

    public void setLodge(Lodge lodge) {
        this.lodge = lodge;
    }

}
