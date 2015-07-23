package com.rjsang.carson.model;

import java.time.OffsetDateTime;

/**
 * A row in a report table.
 * 
 * @author rjsang
 */
public class ReportRow {
    
    private String lodge;
    
  private OffsetDateTime dateTime;
    
    private String description;

    public ReportRow() {
    }

    public ReportRow(Meeting meeting) {
        lodge = String.format("%s %s", meeting.getLodge().getName(), meeting.getLodge().getNumber());
        dateTime = meeting.getDateTime();
        description = meeting.getDescription();
    }

    public String getLodge() {
        return lodge;
    }

    public void setLodge(String lodge) {
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
    
    
    
}
