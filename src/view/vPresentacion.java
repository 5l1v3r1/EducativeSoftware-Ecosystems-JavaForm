/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.applet.AudioClip;

/**
 *
 * @author sebas
 */
public class vPresentacion extends javax.swing.JInternalFrame {

    private AudioClip sonido;
    private boolean playing = false;
    private String path = "\\resources\\snd\\btn.wav".replace("\\", "/");
  
    public vPresentacion() {
        initComponents();
        //String path = "\\resources\\snd\\btn.wav".replace("\\", "/");
       sonido = java.applet.Applet.newAudioClip(getClass().getResource(path));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Presentación");
        setFocusCycleRoot(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("prueba de sonido bug");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/background/selva/selva1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       System.out.println("audio acction ");
       
       

  if (!playing){
            
            new Thread(){
                public void start(){
                   sonido.play();
          
                   playing = true;
                   System.out.println("Se reprodució audio");
               }

            }.start();
        } else{
            playing = false;
            sonido.stop();
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
