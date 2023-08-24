package com.gismeetscs.gis_backend.Photo;
import javax.persistence.Entity;
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
    private long photo_id;

    private double latitude;

    private double longitude;

    private int user_id;

    private int green_area;

    private int num_trees;

    private int vertical_diversity;

    private byte original_file;

    private byte entity_file;

    private Timestamp upload_time;
}
