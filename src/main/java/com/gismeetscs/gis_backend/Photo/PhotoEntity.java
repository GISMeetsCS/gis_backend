package com.gismeetscs.gis_backend.Photo;
import javax.persistence.Entity;
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
    private long photo_id;

    private int pixel_x;

    private int pixel_y;

    private int type;
}
