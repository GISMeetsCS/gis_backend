package com.gismeetscs.gis_backend.Photo;

import java.io.IOException;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class PhotoService {
    
    private final PhotoRepository photoRepository;

    public String upload(Photo photo, MultipartFile file) throws IOException {
        log.info("upload file: {}", file);
        photo.setOriginalFile(PhotoUtils.compressImage(file.getBytes()));
        photoRepository.save(photo);
        return null;
    }

	// 이미지 파일로 압축하기
    public byte[] downloadImage(int photo_id) {
        Photo imageData = photoRepository.findById(photo_id);

        log.info("download imageData: {}", imageData);

        return PhotoUtils.decompressImage(imageData.getOriginalFile());
    }

    @Query(value = "SELECT *\r\n" + //
            "FROM photo limit 1\r\n" + //
            "WHERE ST_DistanceSphere(\r\n" + //
            "    ST_MakePoint(?2, ?1),\r\n" + //
            "    ST_MakePoint(photo.latitude , photo.longitude)\r\n" + //
            ") <= 10;\r\n" + //
            "order by photo.upload_time", nativeQuery = true)
    public Photo getLocInfo(long lat, long lng){};
}
