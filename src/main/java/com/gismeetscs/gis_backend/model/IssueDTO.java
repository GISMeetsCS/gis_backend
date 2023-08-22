package com.gismeetscs.gis_backend.model;

import javax.persistence.Lob;

public class IssueDTO {
    private int issueId;
    private int userNum;
    private String subject;
    @Lob
    private String description;
    private byte photo;
    private int status;
    private double latitude;
    private double longitude;
    private int extraScore;

    public int getIssueId(){
        return issueId;
    }

    public void setIssueId(int issueId){
        this.issueId = issueId;
    }

    public int getUserNum(){
        return userNum;
    }

    public void setUserNum(int userNum){
        this.userNum = userNum;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public byte getPhoto(){
        return photo;
    }

    public void setPhoto(byte photo){
        this.photo = photo;
    }

    public int getStatus(){
        return status;
    }

    public void setStatus(int status){
        this.status = status;
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

    public int getExtraScore(){
        return extraScore;
    }

    public void setExtraScore(int extraScore){
        this.extraScore = extraScore;
    }

}
