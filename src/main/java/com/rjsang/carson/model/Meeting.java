package com.rjsang.carson.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import static java.time.ZonedDateTime.of;

/**
 * A {@link Lodge} meeting
 *
 * @author rjsang
 */
@Entity
public class Meeting {

  @Id
  @GeneratedValue
    private Long id;

  //  @Temporal(TemporalType.TIMESTAMP)
    private OffsetDateTime dateTime;

    private String description;
    
    @ManyToOne
    @JsonIgnore
    private Lodge lodge;

    public Meeting() {
    }

  public Meeting(OffsetDateTime dateTime, String description, Lodge lodge)
  {
        this.dateTime = dateTime;
        this.description = description;
        this.lodge = lodge;
  }

  public Meeting(LocalDateTime localDateTime, String description, Lodge lodge)
  {
    ZonedDateTime zoned = of(localDateTime, ZoneId.of("Pacific/Auckland"));
    this.dateTime = zoned.toOffsetDateTime();
    this.description = description;
    this.lodge = lodge;
  }


  public OffsetDateTime getDateTime()
  {
        return dateTime;
    }

  public void setDateTime(OffsetDateTime dateTime)
  {
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
