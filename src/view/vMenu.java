
package view;
import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import model.FontX;


public class vMenu extends javax.swing.JFrame  {


    private vFinalizar finalizar = null;
    private vJuegoAnimales juego_animales = null;
    private vOrganizaFiguras organizar = null;
    private vPresentacion presentacion = null;
    private vVideo2 video2 = null;
    private vVideo1 video1 = null;
    public final int H = 720, W = 1280;
    private int x = 5;
    private int y = 5;
    private final int velocidad =6;
    private final String pathFont = "\\resources\\fonts\\HelloEtchASketch.ttf"; 
    private final FontX font = new FontX();
    

     // Sondio 2.0
    private AudioClip sonido;
    private boolean playing = false;
    private final  String pathSonido = "\\resources\\snd\\btn.wav".replace("\\", "/");
    
    //sonido de fondo
    private AudioClip sonidoFondo;
    private final  String pathFondo = "\\resources\\snd\\selva1.wav".replace("\\", "/");
    
    
    
    public vMenu() {
        initComponents();
        setLocationRelativeTo(null);
        
        panel.setFocusable(true);
        panel.setSize(new Dimension(12,21));
        imgAve.setLocation(y,x);
        //setIconImage(new ImageIcon("/src/resources/ico/seph.ico").getImage());
         setIconImage(new ImageIcon(getClass().getResource("/resources/img/Circulo Blanco.png")).getImage());
        textMain.setFont(font.changed(pathFont , 110));
         sonido = java.applet.Applet.newAudioClip(getClass().getResource(pathSonido));
         sonidoFondo = java.applet.Applet.newAudioClip(getClass().getResource(pathFondo));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JDesktopPane();
        imgAve = new javax.swing.JLabel();
        textMain = new javax.swing.JLabel();
        imgFondo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        organizaM = new javax.swing.JMenu();
        juegoM = new javax.swing.JMenu();
        presentacionM = new javax.swing.JMenu();
        video1M = new javax.swing.JMenu();
        video2M = new javax.swing.JMenu();
        finalizarM = new javax.swing.JMenu();
        aboutM = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Software Educativo - EcoSoft");
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("frmMenu"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setForeground(new java.awt.Color(153, 255, 153));
        panel.setMaximumSize(new java.awt.Dimension(1280, 720));
        panel.setMinimumSize(new java.awt.Dimension(1280, 720));
        panel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                panelComponentAdded(evt);
            }
        });
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });
        panel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelKeyPressed(evt);
            }
        });

        imgAve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/gif/ave.gif"))); // NOI18N
        imgAve.setToolTipText("");
        panel.add(imgAve);
        imgAve.setBounds(0, 0, 330, 220);

        textMain.setBackground(new java.awt.Color(0, 0, 0));
        textMain.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 95)); // NOI18N
        textMain.setForeground(new java.awt.Color(0, 0, 0));
        textMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textMain.setText("Ecosistemas");
        panel.add(textMain);
        textMain.setBounds(0, 10, 1280, 110);

        imgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/fondo2.png"))); // NOI18N
        imgFondo.setIconTextGap(0);
        panel.add(imgFondo);
        imgFondo.setBounds(0, 0, 1280, 710);

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

        organizaM.setText("Organiza Figuras");
        organizaM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                organizaMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                organizaMMouseEntered(evt);
            }
        });
        menuBar.add(organizaM);

        juegoM.setText("Juego Ecosistemas");
        juegoM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                juegoMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                juegoMMouseEntered(evt);
            }
        });
        menuBar.add(juegoM);

        presentacionM.setText("Presentación");
        presentacionM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                presentacionMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                presentacionMMouseEntered(evt);
            }
        });
        menuBar.add(presentacionM);

        video1M.setText("Ver Video 1");
        video1M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                video1MMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                video1MMouseEntered(evt);
            }
        });
        menuBar.add(video1M);

        video2M.setText("Ver Video 2");
        video2M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                video2MMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                video2MMouseEntered(evt);
            }
        });
        menuBar.add(video2M);

        finalizarM.setText("Finalizar");
        finalizarM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizarMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                finalizarMMouseEntered(evt);
            }
        });
        menuBar.add(finalizarM);

        aboutM.setMnemonic('h');
        aboutM.setText("About");
        aboutM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutMMouseEntered(evt);
            }
        });
        menuBar.add(aboutM);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void juegoMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_juegoMMouseClicked
       // juego_animales
       System.out.println("-----[Form]-----");
        if (juego_animales == null || juego_animales.isClosed()){
            System.out.println("[Form] - The form is created - vJuegoAnimales");
            juego_animales = new vJuegoAnimales();
            this.panel.add(juego_animales);
            juego_animales.setLocation((W/2-(juego_animales.getWidth()/2)), (H/2)-(juego_animales.getHeight()/2));
            juego_animales.show(true);
            //juego_animales.setVisible(true);
            
        }else{
            //juego_animales.setVisible(true);
            juego_animales.setLocation((W/2-(juego_animales.getWidth()/2)), (H/2)-(juego_animales.getHeight()/2));
            System.out.println("[Form] - The form exits");
        }
       
    }//GEN-LAST:event_juegoMMouseClicked

    private void aboutMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMMouseClicked
            vAbout a =new  vAbout();
            a.setVisible(true);
    }//GEN-LAST:event_aboutMMouseClicked

    private void panelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelKeyPressed

        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_UP:    System.out.println("press Key Up");     y = y-velocidad; break;
            case KeyEvent.VK_DOWN:  System.out.println("press Key Down");   y = y+velocidad; break;
            case KeyEvent.VK_LEFT:  System.out.println("press Key Left");   x = x-velocidad; break;
            case KeyEvent.VK_RIGHT: System.out.println("press Key Right");  x = x+velocidad; break;
        }
        imgAve.setLocation(x,y);        
    }//GEN-LAST:event_panelKeyPressed

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        System.out.println("-----[Panel actived]-----");
        panel.setFocusable(true);
    }//GEN-LAST:event_panelMouseClicked

    private void panelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_panelComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_panelComponentAdded

    private void finalizarMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarMMouseClicked
        System.out.println("-----[Form]-----");
        if (finalizar == null || finalizar.isClosed()){
            System.out.println("[Form] - The form is created - vFinalizar ");
           finalizar = new vFinalizar();
            this.panel.add(finalizar);
            finalizar.setLocation((W/2-(finalizar.getWidth()/2)), (H/2)-(finalizar.getHeight()/2));
            finalizar.show(true);
        }else{
            finalizar.setLocation((W/2-(finalizar.getWidth()/2)), (H/2)-(finalizar.getHeight()/2));
            System.out.println("[Form] - The form exits");
        }
    }//GEN-LAST:event_finalizarMMouseClicked

    private void organizaMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizaMMouseClicked
        System.out.println("-----[Form]-----");
        if (organizar == null || organizar.isClosed()){
            System.out.println("[Form] - The form is created - vOrganizarFiguras");
            organizar = new vOrganizaFiguras();
            this.panel.add(organizar);
            organizar.setLocation((W/2-(organizar.getWidth()/2)), (H/2)-(organizar.getHeight()/2));
            organizar.show(true);
        }else{
            organizar.setLocation((W/2-(organizar.getWidth()/2)), (H/2)-(organizar.getHeight()/2));
            System.out.println("[Form] - The form exits");
        }      
    }//GEN-LAST:event_organizaMMouseClicked

    private void presentacionMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presentacionMMouseClicked
       System.out.println("-----[Form]-----");
        if (presentacion == null || presentacion.isClosed()){
            System.out.println("[Form] - The form is created - vPresentacion");
            presentacion = new vPresentacion();
            this.panel.add(presentacion);
            presentacion.setLocation((W/2-(presentacion.getWidth()/2)), (H/2)-(presentacion.getHeight()/2));
            presentacion.show(true);
        }else{
            presentacion.setLocation((W/2-(presentacion.getWidth()/2)), (H/2)-(presentacion.getHeight()/2));
            System.out.println("[Form] - The form exits");
        }
       
    }//GEN-LAST:event_presentacionMMouseClicked

    private void video1MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_video1MMouseClicked
        System.out.println("-----[Form]-----");
        if (video1 == null || video1.isClosed()){
            System.out.println("[Form] - The form is created - vVideo2");
            try {
                video1.dispose();
            } catch (Exception e) {
                System.out.println("Error en dispose();");
            }
            
            video1 = new vVideo1();
            this.panel.add(video1);
            video1.setLocation((W/2-(video1.getWidth()/2)), (H/2)-(video1.getHeight()/2));
            video1.show(true);
        }else{
            video1.setLocation((W/2-(video1.getWidth()/2)), (H/2)-(video1.getHeight()/2));
            System.out.println("[Form] - The form exits");
        }
    }//GEN-LAST:event_video1MMouseClicked

    private void video2MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_video2MMouseClicked
        System.out.println("-----[Form]-----");
        if (video2 == null || video2.isClosed()){
            System.out.println("[Form] - The form is created - vVideo1");
            video2 = new vVideo2();
            this.panel.add(video2);
            video2.setLocation((W/2-(video2.getWidth()/2)), (H/2)-(video2.getHeight()/2));
            video2.show(true);
        }else{
            video2.setLocation((W/2-(video2.getWidth()/2)), (H/2)-(video2.getHeight()/2));
            System.out.println("[Form] - The form exits");
        }
        
        
        
        
    }//GEN-LAST:event_video2MMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        new Thread(){
//                public void start(){
//                   sonidoFondo.play();
//                   System.out.println("Se reprodució audio fondo");
//               }
//        }.start();
    }//GEN-LAST:event_formWindowOpened

    private void organizaMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizaMMouseEntered
       new Thread(){
                public void start(){
                   sonido.play();
                   System.out.println("Se reprodució audio");
               }
        }.start();
    }//GEN-LAST:event_organizaMMouseEntered

    private void juegoMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_juegoMMouseEntered
      new Thread(){
                public void start(){
                   sonido.play();
                   System.out.println("Se reprodució audio");
               }
        }.start();
    }//GEN-LAST:event_juegoMMouseEntered

    private void presentacionMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presentacionMMouseEntered
        new Thread(){
                public void start(){
                   sonido.play();
                   System.out.println("Se reprodució audio");
               }
        }.start();
    }//GEN-LAST:event_presentacionMMouseEntered

    private void video1MMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_video1MMouseEntered
       new Thread(){
                public void start(){
                   sonido.play();
                   System.out.println("Se reprodució audio");
               }
        }.start();
    }//GEN-LAST:event_video1MMouseEntered

    private void video2MMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_video2MMouseEntered
        new Thread(){
                public void start(){
                   sonido.play();
                   System.out.println("Se reprodució audio");
               }
        }.start();
    }//GEN-LAST:event_video2MMouseEntered

    private void finalizarMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarMMouseEntered
        new Thread(){
                public void start(){
                   sonido.play();
                   System.out.println("Se reprodució audio");
               }
        }.start();
    }//GEN-LAST:event_finalizarMMouseEntered

    private void aboutMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMMouseEntered
        new Thread(){
                public void start(){
                   sonido.play();
                   System.out.println("Se reprodució audio");
               }
        }.start();
    }//GEN-LAST:event_aboutMMouseEntered

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutM;
    private javax.swing.JMenu finalizarM;
    private javax.swing.JLabel imgAve;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JMenu juegoM;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu organizaM;
    private javax.swing.JDesktopPane panel;
    private javax.swing.JMenu presentacionM;
    private javax.swing.JLabel textMain;
    private javax.swing.JMenu video1M;
    private javax.swing.JMenu video2M;
    // End of variables declaration//GEN-END:variables

}
