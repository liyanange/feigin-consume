package com.example.cloudprovide;


import org.hibernate.validator.constraints.URL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author luoliang
 * @date 2018/6/20
 */
public class FileInfoDTO implements Serializable {

    private String filename;

    private String filePath;
    List<FileInfoDTO> info = new ArrayList<>();

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public List<FileInfoDTO> getInfo() {
        return info;
    }

    public void setInfo(List<FileInfoDTO> info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "FileInfoDTO{" +
                "filename='" + filename + '\'' +
                ", filePath='" + filePath + '\'' +
                ", info=" + info +
                '}';
    }
}
