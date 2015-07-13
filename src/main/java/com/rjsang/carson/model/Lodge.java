package com.rjsang.carson.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * A Lodge
 *
 * @author rjsang
 */
public class Lodge
{

  @Id
  private Integer id;

  private String name;

  private int number;

  @DBRef
  private List<Meeting> meetings;

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getNumber()
  {
    return number;
  }

  public void setNumber(int number)
  {
    this.number = number;
  }

  public List<Meeting> getMeetings()
  {
    return meetings;
  }

  public void setMeetings(List<Meeting> meetings)
  {
    this.meetings = meetings;
  }

}
