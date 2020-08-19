package view;
import javax.swing.JOptionPane;
import model.mPlayVideo;


public class vVideo1 extends javax.swing.JInternalFrame {
     //Creamos un objeto de la clase Reproductor
    private mPlayVideo repro;
    //Creamos la variable de tipo String para almacenar la ruta del video
    private boolean video = false;
    private String path= "src\\resources\\vid\\VID-20191109-WA0025.mp4";


    
    public vVideo1() {
        initComponents();

        //Intanciamos el objeto de la clase Reproductor
        this.repro = new mPlayVideo();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pVideo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setMaximumSize(new java.awt.Dimension(1270, 710));
        setMinimumSize(new java.awt.Dimension(1270, 710));
        setName(""); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Repro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pVideoLayout = new javax.swing.GroupLayout(pVideo);
        pVideo.setLayout(pVideoLayout);
        pVideoLayout.setHorizontalGroup(
            pVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVideoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addContainerGap(904, Short.MAX_VALUE))
        );
        pVideoLayout.setVerticalGroup(
            pVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVideoLayout.createSequentialGroup()
                .addContainerGap(501, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        getContentPane().add(pVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!video){
            try {
                if(this.repro.getMediaplayer()!= null){
                    repro.pause();
                }
                // ("/resources/img/fondo.jpg")
                // String path= getClass().getResource("resources\\vid\\VID-20191109-WA0025.mp4").toString();//buscarVideo();
                //buscarVideo();
                //String path = "https://gitlab.com/SebastianEPH/SoftwareEducativoUNE/-/raw/master/vid/vid-ecosistemas.mp4";
                if (!path.isEmpty()){
                    String name = path.split("/")[path.split("/").length-1];
                    repro.setPath(path.replace("\\", "/"));
                        repro.setJpanel(pVideo);
                        repro.showVideo();
                        repro.play();

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"There was a mistake, file not found 404 ");
                }
            }else{
                repro.play();
            }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel pVideo;
    // End of variables declaration//GEN-END:variables
}
