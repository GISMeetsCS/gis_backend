package com.gismeetscs.gis_backend.Photo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.security.Timestamp;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity(name="photo")
public class Photo {
    @Id
    @Column(name="photo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long photoId;

    @Column(name="latitude")
    private double latitude;

    @Column(name="longitude")
    private double longitude;

    @Column(name="user_id")
    private int userId;

    @Column(name="green_area")
    private int greenArea;

    @Column(name="num_trees")
    private int numTrees;

    @Column(name="vertical_diversity")
    private int verticalDiversity;

    @Column(name="original_file")
    private byte originalFile;

    @Column(name="entity_file")
    private byte entityFile;

    @Column(name="upload_time")
    private Timestamp uploadTime;
}
