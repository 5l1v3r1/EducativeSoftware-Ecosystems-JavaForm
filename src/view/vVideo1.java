package view;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.mPlayVideo;
import model.mIconX;


public class vVideo1 extends javax.swing.JInternalFrame {
     //Creamos un objeto de la clase Reproductor
    private mPlayVideo repro;
    //Creamos la variable de tipo String para almacenar la ruta del video
    private boolean video = false;
    private final int square = 50;
    private final String tttlitle = "Video de ecosistemas";
    private final String path= "src\\resources\\vid\\VID-20191109-WA0025.mp4";
    mIconX iPlay = new mIconX("src\\resources\\img\\icon\\11.png",square,square);
    mIconX iVideo = new mIconX("src\\resources\\img\\icon\\5.png",square,square);
    mIconX iPause = new mIconX("src\\resources\\img\\icon\\7.png",square,square);
    mIconX iMute = new mIconX("src\\resources\\img\\icon\\4.png",square,square);
    mIconX iMin = new mIconX("src\\resources\\img\\icon\\34.png",square,square); 
    mIconX iMax = new mIconX("src\\resources\\img\\icon\\35.png",square,square); 
     

    public vVideo1() {
        initComponents();
        //Intanciamos el objeto de la clase Reproductor
        this.repro = new mPlayVideo();
        //System.out.println(btnPlay.getWidth()+" || "+btnPlay.getHeight() );
       // btnPlay.setIcon(iconSetSize("src\\resources\\img\\fondo.jpg", 50,50));
        btnVideo.setIcon(iVideo.Standard());
        btnPlay.setIcon(iPlay.Standard());
        btnPause.setIcon(iPause.Standard());
        btnMute.setIcon(iMute.Standard());
        btnMax.setIcon(iMax.Standard());
        btnMin.setIcon(iMin.Standard());
        
        
       
    }
    
    public void showC(){
        //btnPlay.setEnabled(true);
        //btnPlay.setOpaque(true);
        btnPlay.setSize(50, 50);
        
    }
    public void hideC(){
        //btnPlay.setOpaque(false);
        //btnPlay.setEnabled(false);
        btnPlay.setSize(0, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pVideo = new javax.swing.JPanel();
        btnPlay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnPause = new javax.swing.JLabel();
        btnMute = new javax.swing.JLabel();
        btnMax = new javax.swing.JLabel();
        btnMin = new javax.swing.JLabel();
        lTitle = new javax.swing.JLabel();
        vVolume = new javax.swing.JSlider();
        btnVideo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setMaximumSize(new java.awt.Dimension(1270, 710));
        setMinimumSize(new java.awt.Dimension(1270, 710));
        setName(""); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pVideoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pVideoMouseExited(evt);
            }
        });

        btnPlay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPlay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPlayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPlayMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPlayMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPlayMouseReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/gif/pato2.gif"))); // NOI18N

        btnPause.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPause.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPauseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPauseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPauseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPauseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPauseMouseReleased(evt);
            }
        });

        btnMute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMute.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMuteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMuteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMuteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMuteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMuteMouseReleased(evt);
            }
        });

        btnMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMax.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMaxMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMaxMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMaxMouseReleased(evt);
            }
        });

        btnMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMinMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMinMouseReleased(evt);
            }
        });

        lTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitle.setText("Video");
        lTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        vVolume.setMaximum(10);
        vVolume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                vVolumeStateChanged(evt);
            }
        });

        btnVideo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVideo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVideoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVideoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVideoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVideoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVideoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pVideoLayout = new javax.swing.GroupLayout(pVideo);
        pVideo.setLayout(pVideoLayout);
        pVideoLayout.setHorizontalGroup(
            pVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVideoLayout.createSequentialGroup()
                .addGroup(pVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pVideoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(lTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pVideoLayout.createSequentialGroup()
                        .addGap(92, 280, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)
                        .addGroup(pVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMax, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMute, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGap(70, 70, 70))
        );
        pVideoLayout.setVerticalGroup(
            pVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVideoLayout.createSequentialGroup()
                .addGroup(pVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pVideoLayout.createSequentialGroup()
                        .addGroup(pVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pVideoLayout.createSequentialGroup()
                                .addContainerGap(43, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE))
                            .addGroup(pVideoLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnMute, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMax, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lTitle)
                                .addComponent(vVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pVideoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );

        getContentPane().add(pVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pVideoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVideoMouseEntered
        // Aparecer todo 
       // showC();
    }//GEN-LAST:event_pVideoMouseEntered

    private void pVideoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVideoMouseExited
        // Desaparecer todo 
        //hideC();
    }//GEN-LAST:event_pVideoMouseExited

    private void btnPlayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMousePressed
       btnPlay.setIcon(iPlay.Pressed());
    }//GEN-LAST:event_btnPlayMousePressed

    private void btnPlayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseReleased
       btnPlay.setIcon(iPlay.Released());
    }//GEN-LAST:event_btnPlayMouseReleased

    private void btnPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseClicked
        if(video){
            repro.play();
        }
    }//GEN-LAST:event_btnPlayMouseClicked

    private void btnPlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseEntered
        btnPlay.setIcon(iPlay.Entered());
    }//GEN-LAST:event_btnPlayMouseEntered

    private void btnPlayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseExited
         btnPlay.setIcon(iPlay.Standard());
        
    }//GEN-LAST:event_btnPlayMouseExited

    private void btnPauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPauseMouseClicked
        if(video){
            repro.pause();
        }
  
    }//GEN-LAST:event_btnPauseMouseClicked

    private void btnPauseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPauseMouseEntered
        btnPause.setIcon(iPause.Entered());
    }//GEN-LAST:event_btnPauseMouseEntered

    private void btnPauseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPauseMouseExited
        btnPause.setIcon(iPause.Exited());
    }//GEN-LAST:event_btnPauseMouseExited

    private void btnPauseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPauseMousePressed
        btnPause.setIcon(iPause.Pressed());
    }//GEN-LAST:event_btnPauseMousePressed

    private void btnPauseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPauseMouseReleased
        btnPause.setIcon(iPause.Released());
    }//GEN-LAST:event_btnPauseMouseReleased

    private void btnMuteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuteMouseClicked
        if(video){
            repro.setVolume(0);
            vVolume.setValue((int)(0.1));
        }
    }//GEN-LAST:event_btnMuteMouseClicked

    private void btnMuteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuteMouseEntered
        btnMute.setIcon(iMute.Entered());
    }//GEN-LAST:event_btnMuteMouseEntered

    private void btnMuteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuteMouseExited
        btnMute.setIcon(iMute.Exited());
    }//GEN-LAST:event_btnMuteMouseExited

    private void btnMuteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuteMousePressed
        btnMute.setIcon(iMute.Pressed());
    }//GEN-LAST:event_btnMuteMousePressed

    private void btnMuteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuteMouseReleased
        btnMute.setIcon(iMute.Released());
    }//GEN-LAST:event_btnMuteMouseReleased

    private void btnMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaxMouseClicked
        if(video){
            try {
                
                double v = repro.getVolume();
                if (v > 0.9){
                    System.out.println("volumen máximo");
                }else{
                    v = repro.getVolume()+0.1;
                }
                
                
                repro.setVolume(v);
                System.out.println("Max volumen: "+v);
                
               // repro.setVolume((double)this.vVolume.getValue()/100);
                
               vVolume.setValue((int)(v*10));
            } catch (Exception e) {
                System.out.println("Ya no se puede subir más volumen");
            }
        }
    }//GEN-LAST:event_btnMaxMouseClicked

    private void btnMaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaxMouseEntered
        btnMax.setIcon(iMax.Entered());
    }//GEN-LAST:event_btnMaxMouseEntered

    private void btnMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaxMouseExited
       btnMax.setIcon(iMax.Exited());
    }//GEN-LAST:event_btnMaxMouseExited

    private void btnMaxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaxMousePressed
        btnMax.setIcon(iMax.Pressed());
    }//GEN-LAST:event_btnMaxMousePressed

    private void btnMaxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaxMouseReleased
        btnMax.setIcon(iMax.Released());
    }//GEN-LAST:event_btnMaxMouseReleased

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        if(video){
            try {
                
                double v = repro.getVolume();
                if (v < 0.1){
                    System.out.println("volumen máximo");
                }else{
                    v = repro.getVolume()-0.1;
                }
                
                
                repro.setVolume(v);
                System.out.println("Min volumen: "+v);
                
               // repro.setVolume((double)this.vVolume.getValue()/100);
                
               vVolume.setValue((int)(v*10));
            } catch (Exception e) {
                System.out.println("Ya no se puede bajar más volumen");
            }
        }
        
    }//GEN-LAST:event_btnMinMouseClicked

    private void btnMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseEntered
        btnMin.setIcon(iMin.Entered());
    }//GEN-LAST:event_btnMinMouseEntered

    private void btnMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseExited
        btnMin.setIcon(iMin.Exited());
    }//GEN-LAST:event_btnMinMouseExited

    private void btnMinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMousePressed
        btnMin.setIcon(iMin.Pressed());
    }//GEN-LAST:event_btnMinMousePressed

    private void btnMinMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseReleased
        btnMin.setIcon(iMin.Released());
    }//GEN-LAST:event_btnMinMouseReleased

    private void btnVideoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVideoMouseClicked
        if (!video){
            try {
                if(this.repro.getMediaplayer()!= null){
                    repro.pause();
                }
                if (!path.isEmpty()){

                    repro.setPath(path.replace("\\", "/"));
                        repro.setJpanel(pVideo);
                        repro.showVideo();
                        repro.play();
                        lTitle.setText(tttlitle);
                        video = true;

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"There was a mistake mientras ");
                }
            }else{
                repro.play();
            }
    }//GEN-LAST:event_btnVideoMouseClicked

    private void btnVideoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVideoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVideoMouseEntered

    private void btnVideoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVideoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVideoMouseExited

    private void btnVideoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVideoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVideoMousePressed

    private void btnVideoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVideoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVideoMouseReleased

    private void vVolumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_vVolumeStateChanged
        repro.setVolume((double)this.vVolume.getValue()/10);
    }//GEN-LAST:event_vVolumeStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnMax;
    private javax.swing.JLabel btnMin;
    private javax.swing.JLabel btnMute;
    private javax.swing.JLabel btnPause;
    private javax.swing.JLabel btnPlay;
    private javax.swing.JLabel btnVideo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lTitle;
    private javax.swing.JPanel pVideo;
    private javax.swing.JSlider vVolume;
    // End of variables declaration//GEN-END:variables
}
