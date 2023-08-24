package com.gismeetscs.gis_backend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gismeetscs.gis_backend.model.PhotoEntityDTO;

@Repository
public class PhotoEntityImpl implements PhotoEntityDAO {

    @Override
    public PhotoEntityDTO getPhotoEntityInfo(int photoId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPhotoEntityInfo'");
    }

    @Override
    public List<PhotoEntityDTO> getPhotoEntityList(int photoId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPhotoEntityList'");
    }

    @Override
    public int insertPhotoEntity(PhotoEntityDTO photoEntityDTO) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertPhotoEntity'");
    }

    @Override
    public int updatePhotoEntity(PhotoEntityDTO photoEntityDTO) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePhotoEntity'");
    }

    @Override
    public int deletePhotoEntity(int photoId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePhotoEntity'");
    }
    
}
