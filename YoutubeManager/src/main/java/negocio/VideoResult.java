/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import com.github.kiulian.downloader.model.videos.VideoInfo;
import java.io.File;

/**
 *
 * @author iapereira
 */
public class VideoResult {
    
    private String videoId;
    private VideoInfo videoInfo;
    private File data;

    public VideoResult(String videoId, VideoInfo videoInfo, File data) {
        this.videoId = videoId;
        this.videoInfo = videoInfo;
        this.data = data;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public VideoInfo getVideoInfo() {
        return videoInfo;
    }

    public void setVideoInfo(VideoInfo videoInfo) {
        this.videoInfo = videoInfo;
    }

    public File getData() {
        return data;
    }

    public void setData(File data) {
        this.data = data;
    }

    
    
}
