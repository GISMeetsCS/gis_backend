package com.gismeetscs.gis_backend.Photo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.Type;

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
    private int photoId;

    @Column(name="pixel_x")
    private int pixelX;

    @Column(name="pixel_y")
    private int pixelY;

    @Column(name="type")
    private int type;

    @Lob
    @Column(name="entity_file")
    @Type(type="org.hibernate.type.BinaryType")
    private byte[] entityFile;
}
