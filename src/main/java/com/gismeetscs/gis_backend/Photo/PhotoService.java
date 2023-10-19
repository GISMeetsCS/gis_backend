package com.gismeetscs.gis_backend.Photo;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class PhotoService {
    
    private final PhotoRepository photoRepository;

    public boolean upload(Photo photo, MultipartFile file) throws IOException {
        boolean isSuccess = false;
        try{

            Photo p = photoRepository.getLocInfo(photo.getLatitude(), photo.getLongitude());
            if(p != null)
                return isSuccess;

            log.info("upload file: {}", file);
            photo.setOriginalFile(PhotoUtils.compressImage(file.getBytes()));
            photoRepository.save(photo);
            isSuccess = true;
        }catch(Exception e){
            log.info("upload err");
        }
        
        return isSuccess;
    }

	// 이미지 파일로 압축하기
    public byte[] downloadImage(int photo_id) {
        Photo imageData = photoRepository.findById(photo_id);

        log.info("download imageData: {}", imageData);

        return PhotoUtils.decompressImage(imageData.getOriginalFile());
    }

    public Photo getLocInfo(double lat, double lng){
        return photoRepository.getLocInfo(lat, lng);
    }

    public List<Photo> getAll(){
        return photoRepository.findAll();
    }
}
