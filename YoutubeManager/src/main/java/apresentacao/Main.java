/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import negocio.VideoResult;
import negocio.Youtube;

/**
 *
 * @author iapereira
 */
public class Main {

    // Adaptação de https://github.com/sealedtx/java-youtube-downloader
    public static void main(String[] args) {
        String videoId = "nNJnoq9FR9k";
        Youtube youtube = new Youtube();
//      youtube.requestDetails(videoId);        
//      youtube.downloadSubtitle(videoId);
        VideoResult videoResult = youtube.download(videoId);
        System.out.println(videoResult.getData().getAbsolutePath());
    }

}
