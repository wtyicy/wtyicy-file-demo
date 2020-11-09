package com.wtyicy.controller;

import com.wtyicy.config.BaseConfig;
import com.wtyicy.entity.VirtualFile;
import com.wtyicy.uploader.FileUploader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
public class FileController {

    @Resource
    private BaseConfig baseConfig;

    @Resource
    private FileUploader fileUploader;

    @RequestMapping("file/upload")
    public VirtualFile upload(MultipartFile file) {
        VirtualFile upload = fileUploader.upload(file, baseConfig.getFilePath(), true);
        System.out.println(upload);

        return upload;
    }

}
