/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marvelmemory;
/*
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
*/

import java.io.File; 
import java.io.IOException; 
import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException; 
  
/**
 *
 * @author puennaja
 */
public class Playmusic {
    
    Clip clip; 
    AudioInputStream audioInputStream; 
    static String filePath; 
    //play music once
    public Playmusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException  
    { 
        filePath = "src/memorygame/avengersong.wav";
        audioInputStream =  AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile()); 
        clip = AudioSystem.getClip(); 
        clip.open(audioInputStream); 
        //clip.loop(Clip.LOOP_CONTINUOUSLY); if want to loop music
    } 
    public void play()  
    { 
        clip.start(); 
    } 
   
}
