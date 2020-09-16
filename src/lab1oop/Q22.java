/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1oop;

/**
 *
 * @author VOVOBOOK
 */
public class Q22 {
    private int channel;
    private int brightness;
    private String name;
    
    public Q22(){
        channel = 1;
        brightness = 50;
        name = "";
    }

    public Q22(int channel){ 
        this();
        this.channel=channel;
    }
     public int getChannel(){ 
     return channel;
    }
     public String getName(){ 
     return name;
    }
    public void setChannel(int channel){
        if(this.channel-channel==1) this.channel=channel;
        else if (channel-this.channel==1) this.channel=channel;
    }

public int getAdaptiveBrightness(){
    return brightness;
}
public int getAdaptiveBrightness(int extBrightness){
    return (brightness+extBrightness)/2;
}
        }
