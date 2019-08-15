/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
// Anonymous inner class
 public class MusicSystem {
     int x = 25;
    Speakers s = new Speakers(){
      public void playsound(){
          System.out.print(x);
          System.out.println("play dolby sound");
      } 
    };
     Radio r = new Radio(){
      public void playRadio(){
          System.out.println("wheather report");
      }
    };
    public void playMusic(){
        s.playsound();
        r.playRadio();
    }
    public void playdigital(PlayTheater playtheater){
        playtheater.playStuff();
    }
    
    
   // public void play(PlayAnything playAnything){
   //   playAnything.playStuff();
    //} 
    
    
    public static void main(String[] args){
        MusicSystem rk = new MusicSystem();
        rk.playMusic();
       // rk.play(new PlayAnything(){
     
     
     
     rk.playdigital(new PlayTheater(){
         public void playStuff(){
             Radio r = new Radio(){
                 public void playRadio(){
                     System.out.println("station 98.3fm");
                 }
             };
             r.playRadio();
         }
        
    });
            
         //   public void playStuff(){
           //     System.out.println("digital sound");
             //}
        //});
    }
 }