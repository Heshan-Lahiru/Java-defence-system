/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package securityarea;

/**
 *
 * @author iuhs
 */
public class SecurityArea {
    
    
    public static void main(String[] args) {
       observable observable = new observable();
       
       observable.adddevice(new helicopter(observable,"Helicopter"));
       observable.adddevice(new tank(observable,"Tank"));
       observable.adddevice(new submarine(observable,"Submarine"));
        observable.adddevice(new controllpanel(observable,"controllpanel"));
    }
    
}
