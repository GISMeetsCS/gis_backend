package com.gismeetscs.gis_backend.dao;

import java.util.List;
import com.gismeetscs.gis_backend.model.PhotoEntityDTO;

public interface PhotoEntityDAO {
    public PhotoEntityDTO getPhotoEntityInfo(int photoId) throws Exception;
    public List<PhotoEntityDTO> getPhotoEntityList(int photoId) throws Exception;
    public int insertPhotoEntity(PhotoEntityDTO photoEntityDTO) throws Exception;
    public int updatePhotoEntity(PhotoEntityDTO photoEntityDTO) throws Exception;
    public int deletePhotoEntity(int photoId) throws Exception;
}
