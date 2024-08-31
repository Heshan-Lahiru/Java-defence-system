/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package securityarea;

/**
 *
 * @author iuhs
 */
public interface observer {
    
    public void update(String text,String name);
    /////////////////////////////////////////count
    public void counthelicopter(int soldier,int ammoamount,int fual);
    public void counttank(int soldier,int ammoamount,int fual);
     public void countsubmariene(int soldier,int ammoamount,int fual);
    
     //////////////////////private message
     public void privatehelicopter(String text,String name);
     public void privatetanke(String text,String name);
     public void privatesubmarine(String text,String name);
     
     /////////////////////mesage enable desable
     
      public void buttonenable(int value);
     
     ///////////////////////////////////
    public void areaclear(String area);
    
    
    ////////////////////////////////////strenght
    
    public void helicopterupdateStrengthText(String name,String Strength) ;
    public void tankupdateStrengthText(String name,String Strength) ;
    public void submarineupdateStrengthText(String name,String Strength) ;
  
    
}
