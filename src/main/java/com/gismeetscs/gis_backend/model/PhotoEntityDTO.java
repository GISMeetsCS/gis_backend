package com.gismeetscs.gis_backend.model;

public class PhotoEntityDTO {
    private long photoId;
    private int pixelX;
    private int pixelY;
    private int type;

    public long getPhotoId(){
        return photoId;
    }

    public void setPhotoId(long photoId){
        this.photoId = photoId;
    }
    
    public int getPixelX(){
        return pixelX;
    }

    public void setPixelX(int pixelX){
        this.pixelX = pixelX;
    }

    public int getPixelY(){
        return pixelY;
    }

    public void setPixelY(int pixelY){
        this.pixelY = pixelY;
    }

    public int getType(){
        return type;
    }

    public void setType(int type){
        this.type = type;
    }

}
