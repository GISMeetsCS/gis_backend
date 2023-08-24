package com.gismeetscs.gis_backend.model;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity(name="photo_entity")
public class PhotoEntityDTO {
    @Id
    private long photoId;

    private int pixelX;

    private int pixelY;

    private int type;
}
