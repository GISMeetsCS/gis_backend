package com.gismeetscs.gis_backend.Photo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity(name="photo_entity")
public class PhotoEntity {
    @Id
    @Column(name="photo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long photoId;

    @Column(name="pixel_x")
    private int pixelX;

    @Column(name="pixel_y")
    private int pixelY;

    @Column(name="type")
    private int type;
}
