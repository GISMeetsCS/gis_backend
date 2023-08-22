package com.gismeetscs.gis_backend.model;

import java.security.Timestamp;

public class PhotoDTO {
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

    public long getPhotoId(){
        return photoId;
    }

    public void setPhotoId(long photoId){
        this.photoId = photoId;
    }

    public double getLatitude(){
        return latitude;
    }

    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    public int getUserNum(){
        return userNum;
    }

    public void setUserNum(int userNum){
        this.userNum = userNum;
    }    

    public int getGreenArea(){
        return greenArea;
    }

    public void setGreenArea(int greenArea){
        this.greenArea = greenArea;
    }  

    public int getNumTrees(){
        return numTrees;
    }

    public void setNumTrees(int numTrees){
        this.numTrees = numTrees;
    }  

    public int getVerticalDiversity(){
        return verticalDiversity;
    }

    public void setVerticalDiversity(int verticalDiversity){
        this.verticalDiversity = verticalDiversity;
    }  

    public byte getOriginalFile(){
        return originalFile;
    }

    public void setOriginalFile(byte originalFile){
        this.originalFile = originalFile;
    } 
    
    public byte getEntityFile(){
        return entityFile;
    }

    public void setEntityFile(byte entityFile){
        this.entityFile = entityFile;
    } 

    public Timestamp getUploadTime(){
        return uploadTime;
    }

    public void setUploadTime(Timestamp uploadTime){
        this.uploadTime = uploadTime;
    } 
}
