package com.gismeetscs.gis_backend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gismeetscs.gis_backend.model.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO{

    @Override
    public UserDTO getUserInfo(int userId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserInfo'");
    }

    @Override
    public List<UserDTO> getUserList(int userId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserList'");
    }

    @Override
    public int insertUser(UserDTO userDTO) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertUser'");
    }

    @Override
    public int updateUser(UserDTO userDTO) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public int deleteUser(int userId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }
    
}
