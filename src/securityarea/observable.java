
package securityarea;

import java.util.ArrayList;

public class observable {
    ArrayList <observer> arr= new ArrayList<observer>();
    
  public void adddevice(observer obj){
      arr.add(obj);
  }
  /////////////////////////////////////////////////////////////////
  public void msgall(String msg,String name){
      for (observer object : arr) {
          object.update(msg,name);
      }
  }
  
   public void counthelicopter(int soldier,int ammoamount,int fual){
       for (observer object : arr) {
           object.counthelicopter(soldier, ammoamount, fual);
       }
  }
    public void counttank(int soldier,int ammoamount,int fual){
       for (observer object : arr) {
           object.counttank(soldier, ammoamount, fual);
       }
  }
     public void countsubmariene(int soldier,int ammoamount,int fual){
       for (observer object : arr) {
           object.countsubmariene(soldier, ammoamount, fual);
       }
  }
   
   
   
 ///////////////////////////////////////////////////////////////////////////////////////////////////
    public void privatehelicopter(String msg,String name){
      for (observer object : arr) {
          object.privatehelicopter(msg,name);
      }
  }
    public void privatetanke(String msg,String name){
      for (observer object : arr) {
          object.privatetanke(msg,name);
      }
  }
    public void privatesubmarine(String msg,String name){
      for (observer object : arr) {
          object.privatesubmarine(msg,name);
      }
  }
    
    /////////////////////////////////
    
     public void buttonenable(int value){
      for (observer object : arr) {
          object.buttonenable(value);
      }
  }
    
   /////////////////////////////////
     public void areaclearmsg(String area){
       for (observer object : arr) {
           object.areaclear(area);
       }
  }
     ///////////////////////////////////////////////////////////////////strength
     public void helicopterupdateStrengthText(String name,String strengthvalue) {
          //String strengthvalue=strength.toString();
          for (observer object : arr) {
           object.helicopterupdateStrengthText(name,strengthvalue);
       }
               }
     
     public void tankupdateStrengthText(String name,String strengthvalue) {
          
          for (observer object : arr) {
           object.tankupdateStrengthText(name,strengthvalue);
       }
               }
     
     public void submarineupdateStrengthText(String name,String strengthvalue) {
          
          for (observer object : arr) {
           object.submarineupdateStrengthText(name,strengthvalue);
       }
               }
     /////////////////////////////////////////////////////////////////
  
}
