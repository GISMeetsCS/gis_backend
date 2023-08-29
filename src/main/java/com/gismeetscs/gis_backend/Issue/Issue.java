package com.gismeetscs.gis_backend.Issue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity(name="issue")
public class Issue {

    @Id
    @Column(name="issue_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int issueId;

    @Column(name="user_id")
    private int userId;

    @Column(name="subject")
    private String subject;

    @Lob
    @Column(name="description")
    private String description;

    @Column(name="photo")
    private byte photo;

    @Column(name="status")
    private int status;

    @Column(name="latitude")
    private double latitude;

    @Column(name="longitude")
    private double longitude;

    @Column(name="extra_score")
    private int extraScore;
}
