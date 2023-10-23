package com.bkoj.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author bk
 */
public interface FileService {
    /**
     * 上传头像到OSS
     *
     * @param file
     * @return
     */
    String uploadFileAvatar(MultipartFile file);
}
