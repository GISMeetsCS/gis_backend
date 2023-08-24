package com.gismeetscs.gis_backend.dao;

import java.util.List;

import com.gismeetscs.gis_backend.model.PhotoDTO;

public interface PhotoDAO {
    public PhotoDTO getPhotoInfo(int photoId) throws Exception;
    public List<PhotoDTO> getPhotoList(int photoId) throws Exception;
    public int insertPhoto(PhotoDTO photoDTO) throws Exception;
    public int updatePhoto(PhotoDTO photoDTO) throws Exception;
    public int deletePhoto(int photoId) throws Exception;
}
 