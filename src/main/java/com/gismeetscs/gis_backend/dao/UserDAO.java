package com.gismeetscs.gis_backend.dao;

import java.util.List;

import com.gismeetscs.gis_backend.model.UserDTO;

/**
 * UserDAO
 */
public interface UserDAO {
    public UserDTO getUserInfo(int userId) throws Exception;
    public List<UserDTO> getUserList(int userId) throws Exception;
    public int insertUser(UserDTO userDTO) throws Exception;
    public int updateUser(UserDTO userDTO) throws Exception;
    public int deleteUser(int userId) throws Exception;
}