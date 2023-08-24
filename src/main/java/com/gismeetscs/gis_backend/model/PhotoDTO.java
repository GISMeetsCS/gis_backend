package com.gismeetscs.gis_backend.model;
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
public class PhotoDTO {
    @Id
    private long photoId;

    private double latitude;

    private double longitude;

    private int userNum;

    private int greenArea;

    private int numTrees;

    private int verticalDiversity;

    private byte originalFile;

    private byte entityFile;
    
    private Timestamp uploadTime;
}
