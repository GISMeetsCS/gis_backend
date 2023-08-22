package com.gismeetscs.gis_backend.model;

public class UserDTO {
    private int userNum;
    private String email;
    private String userName;
    private String nickname;
    private String password;
    private int status;
    private String jwtToken;
    private int numUpload;
    private int numIssue;

    public int getUserNum(){
        return userNum;
    }

    public void setUserNum(int userNum){
        this.userNum = userNum;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public int getStatus(){
        return status;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public String getJwtToken(){
        return jwtToken;
    }

    public void setJwtToken(String jwtToken){
        this.jwtToken = jwtToken;
    }

    public int getNumUpload(){
        return numUpload;
    }

    public void setNumUpload(int numUpload){
        this.numUpload = numUpload;
    }

    public int getNumIssue(){
        return numIssue;
    }

    public void setNumIssue(int numIssue){
        this.numIssue = numIssue;
    }
}
