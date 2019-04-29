/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marvelmemory;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author puennaja
 */
public class Playmusic {
    void play(String filepath){
        
        try{
            File f = new File(filepath);
            if(f.exists()){
                AudioInputStream audioinput = AudioSystem.getAudioInputStream(f);
                Clip clip = AudioSystem.getClip();
                clip.start();
            }else{
                System.out.println("can't find file");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println("xxx");
        }
    }
}
