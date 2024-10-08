
package securityarea;

import javax.swing.JOptionPane;

public class submarine extends javax.swing.JFrame implements observer{

    observable obj;
    String name;
    int fuel;
    int soldier;
    int ammoamount;
    int buttonenablevalue;
    public submarine( observable obj,String name) {
       
        initComponents();
        this.obj=obj;
        this.name=name;
        
        jSpinner1.setValue(5);
        jSpinner2.setValue(10);
        Shoot.setEnabled(false);
        Sonar_Operation.setEnabled(false);
        Tomahawk_Mi.setEnabled(false);
        Trident_Missile.setEnabled(false);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Area_Not_Cleared = new javax.swing.JLabel();
        Energy = new javax.swing.JLabel();
        Soldier_Co = new javax.swing.JLabel();
        Oxigen = new javax.swing.JLabel();
        Shoot = new javax.swing.JButton();
        Sonar_Operation = new javax.swing.JButton();
        Tomahawk_Mi = new javax.swing.JButton();
        Ammo_Co = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        message = new javax.swing.JTextField();
        slider = new javax.swing.JSlider();
        send = new javax.swing.JButton();
        Trident_Missile = new javax.swing.JButton();
        position = new javax.swing.JCheckBox();
        jSlider1 = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextFeild = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Area_Not_Cleared.setText("Area Not Cleared");

        Energy.setText("Energy");

        Soldier_Co.setText("Soldier Co...");

        Oxigen.setText("Oxigen");

        Shoot.setText("Shoot");
        Shoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShootActionPerformed(evt);
            }
        });

        Sonar_Operation.setText("Sonar Operation");

        Tomahawk_Mi.setText("Tomahawk Mi...");

        Ammo_Co.setText("Ammo Co...");

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });

        slider.setMajorTickSpacing(20);
        slider.setOrientation(javax.swing.JSlider.VERTICAL);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setValue(100);
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        Trident_Missile.setText("Trident-2 Missile");

        position.setText("Position");

        jSlider1.setMajorTickSpacing(20);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(100);

        TextFeild.setColumns(20);
        TextFeild.setRows(5);
        jScrollPane1.setViewportView(TextFeild);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(Area_Not_Cleared))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Shoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Tomahawk_Mi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Sonar_Operation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Trident_Missile))))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ammo_Co)
                            .addComponent(Soldier_Co))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(position)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(send))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Energy)
                    .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Oxigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Area_Not_Cleared)
                                    .addComponent(Soldier_Co))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Shoot)
                                            .addComponent(Sonar_Operation))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Tomahawk_Mi)
                                            .addComponent(position)
                                            .addComponent(Trident_Missile)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Ammo_Co)))))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Energy)
                            .addComponent(Oxigen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(send))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShootActionPerformed
         int ammo = (Integer) jSpinner2.getValue()-1;
       if(ammo>0){
           jSpinner2.setValue(ammo);
       }
       else{
           int soldier = (Integer) jSpinner1.getValue()-1;
            int slidervalue = slider.getValue();
           slider.setValue(slidervalue-17);
           jSlider1.setValue(slidervalue-10);
           if(soldier>0){
           jSpinner1.setValue(soldier);
           jSpinner2.setValue(10);
       }
           else{
               jSpinner1.setValue(0);
               jSpinner2.setValue(0);
               slider.setValue(0);
               jSlider1.setValue(0);
               Shoot.setEnabled(false);
                Sonar_Operation.setEnabled(false);
                Tomahawk_Mi.setEnabled(false);
                Trident_Missile.setEnabled(false);
                 send.setEnabled(false);
               JOptionPane.showMessageDialog(null, "Helicopter Destroyed.", "Plain", JOptionPane.PLAIN_MESSAGE);
           }
           
       }
    }//GEN-LAST:event_ShootActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        // TODO add your handling code here:
          if(message.getText().equals("")){
             System.out.println("eoor");
        }
        else{
           // obj.msgall(message.getText(), name);
           obj.privatesubmarine(message.getText(), name);
        }
    }//GEN-LAST:event_sendActionPerformed

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        this.fuel=  (int) slider.getValue(); 
         obj.countsubmariene(soldier, ammoamount, fuel); 
         
          this.fuel=  (int) slider.getValue(); 
         obj.counttank(soldier, ammoamount, fuel); 
         
         if(fuel==0){obj.tankupdateStrengthText(name,"CLOSED");}
         if(fuel>=1 && fuel<40){obj.tankupdateStrengthText(name,"LOW");}
         if(fuel>=40 && fuel<60){obj.tankupdateStrengthText(name,"MEDIUM");}
         if(fuel>=60 && fuel<80){obj.tankupdateStrengthText(name,"HIGH");}
         if(fuel>=80){obj.tankupdateStrengthText(name,"STRONG");}
    }//GEN-LAST:event_sliderStateChanged

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
      this.soldier=  (int) jSpinner1.getValue(); 
         obj.countsubmariene(soldier, ammoamount, fuel); 
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        // TODO add your handling code here:
        this.ammoamount=  (int) jSpinner2.getValue(); 
         obj.countsubmariene(soldier, ammoamount, fuel);
    }//GEN-LAST:event_jSpinner2StateChanged
 public void update(String msg,String msgername) {
        if(this.name.equals(msgername)){
         TextFeild.setText(TextFeild.getText()+"ME  : "+msg+"\n\n");   
        }
        else{
          TextFeild.setText(TextFeild.getText()+msgername+"  : "+msg+"\n\n");    
        }
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ammo_Co;
    private javax.swing.JLabel Area_Not_Cleared;
    private javax.swing.JLabel Energy;
    private javax.swing.JLabel Oxigen;
    private javax.swing.JButton Shoot;
    private javax.swing.JLabel Soldier_Co;
    private javax.swing.JButton Sonar_Operation;
    private javax.swing.JTextArea TextFeild;
    private javax.swing.JButton Tomahawk_Mi;
    private javax.swing.JButton Trident_Missile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField message;
    private javax.swing.JCheckBox position;
    private javax.swing.JButton send;
    private javax.swing.JSlider slider;
    // End of variables declaration//GEN-END:variables

    @Override
    public void counthelicopter(int soldier, int ammoamount, int fual) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     @Override
    public void areaclear(String area) {
        Area_Not_Cleared.setText(area);
        }

    @Override
    public void counttank(int soldier, int ammoamount, int fual) {
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void countsubmariene(int soldier, int ammoamount, int fual) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void privatehelicopter(String text, String name) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void privatetanke(String text, String name) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void privatesubmarine(String text, String name) {
TextFeild.setText(TextFeild.getText()+name+" (private message)  : "+text+"\n\n");    }

    @Override
    public void buttonenable(int value) {
this.buttonenablevalue=value;  
if(position.isSelected()){
    if(value>20){
            Shoot.setEnabled(true);
            }
            if(value>40){
            Sonar_Operation.setEnabled(true);
            }
            if(value>60){
            Tomahawk_Mi.setEnabled(true);
            }
             if(value>90){
            Trident_Missile.setEnabled(true);
    }
             if(value<40){
                 Shoot.setEnabled(false);
                 Sonar_Operation.setEnabled(false);
                Tomahawk_Mi.setEnabled(false);
                Trident_Missile.setEnabled(false);
            }
}
    }

    @Override
    public void helicopterupdateStrengthText(String name,String Strength) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tankupdateStrengthText(String name,String Strength) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void submarineupdateStrengthText(String name,String Strength) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
