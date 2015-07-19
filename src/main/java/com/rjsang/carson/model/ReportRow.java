package com.rjsang.carson.model;

import java.time.LocalDateTime;

/**
 * A row in a report table.
 * 
 * @author rjsang
 */
public class ReportRow {
    
    private String lodge;
    
    private LocalDateTime dateTime;
    
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
    
    
    
}
