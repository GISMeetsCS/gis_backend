package com.gismeetscs.gis_backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity(name="issue")
public class IssueDTO {
    @Id
    private int issueId;

    private int userNum;

    private String subject;

    @Lob
    private String description;

    private byte photo;

    private int status;

    private double latitude;

    private double longitude;
    
    private int extraScore;
}
