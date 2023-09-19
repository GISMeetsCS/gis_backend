package com.gismeetscs.gis_backend.Photo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="photo")
public class Photo {
    @Id
    @Column(name="photo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int photoId;

    @Column(name="latitude")
    private double latitude;

    @Column(name="longitude")
    private double longitude;

    @Column(name="member_id")
    private int memberId;

    @Column(name="green_area")
    private int greenArea;

    @Column(name="num_trees")
    private int numTrees;

    @Column(name="vertical_diversity")
    private int verticalDiversity;

    @Lob
    @Column(name="original_file")
    @Type(type="org.hibernate.type.BinaryType")
    private byte[] originalFile;
}
