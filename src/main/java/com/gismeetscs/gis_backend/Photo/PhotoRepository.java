package com.gismeetscs.gis_backend.Photo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PhotoRepository extends JpaRepository<Photo, Integer>{
    Photo findById(int photo_id);

    @Query(value = "SELECT *\r\n" + //
            "FROM photo \r\n" + //
            "WHERE ST_DWithin(\r\n" + //
            "ST_Transform(ST_SetSRID(ST_MakePoint(?2, ?1), 4326), 3857),\r\n" + //
            "ST_Transform(ST_SetSRID(ST_MakePoint(photo.longitude, photo.latitude), 4326), 3857),10)\r\n" + //
            "order by photo.upload_time limit 1;", nativeQuery = true)
    Photo getLocInfo(double lat, double lng);
}
