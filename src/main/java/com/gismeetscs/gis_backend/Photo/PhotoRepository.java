package com.gismeetscs.gis_backend.Photo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Integer>{
    Photo findById(int photo_id);
}
