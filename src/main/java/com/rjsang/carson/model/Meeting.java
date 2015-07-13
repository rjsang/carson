package com.rjsang.carson.model;

import java.util.Date;
import org.springframework.data.annotation.Id;

/**
 * A {@link Lodge} meeting
 *
 * @author rjsang
 */
public class Meeting
{

  @Id
  private Long id;

  private Date dateTime;

  private String description;


  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public Date getDateTime()
  {
    return dateTime;
  }

  public void setDateTime(Date dateTime)
  {
    this.dateTime = dateTime;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }


}
