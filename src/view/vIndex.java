
package view;

import java.awt.Font;
import java.awt.event.KeyEvent;


public class vIndex extends javax.swing.JFrame {

    private vAbout about = null;
    private vFinalizar finalizar = null;
    private vJuegoAnimales juego_animales = null;
    private vOrganizaFiguras organizar = null;
    private vPresentacion presentacion = null;
    private vVideo1 video1 = null;
    private vVideo2 video2 = null;
    private int x;
    private int y;
    
    public vIndex() {
        initComponents();
        panel.setFocusable(true);
        /*
        int x = 15; 
        while(true){
            textMain.setFont(new Font("Arial", Font.ITALIC, x));
            x++;
            System.out.println("size: "+x);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("error in wait 100 mini");
            }
            if (x == 50){
                break;
            }
        }
        */
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JDesktopPane();
        textMain = new javax.swing.JLabel();
        imgAve2 = new javax.swing.JLabel();
        imgFondo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuJuegoAnimales = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
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

        textMain.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        textMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textMain.setText("Ecosistemas");
        panel.add(textMain);
        textMain.setBounds(0, 20, 1280, 110);

        imgAve2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/gif/ave.gif"))); // NOI18N
        panel.add(imgAve2);
        imgAve2.setBounds(0, 0, 520, 510);

        imgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/fondo2.png"))); // NOI18N
        panel.add(imgFondo);
        imgFondo.setBounds(0, 0, 1280, 710);

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

        menuJuegoAnimales.setText("Juego Animales");
        menuJuegoAnimales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuJuegoAnimalesMouseClicked(evt);
            }
        });
        menuBar.add(menuJuegoAnimales);

        jMenu4.setText("Organiza Figuras");
        menuBar.add(jMenu4);

        jMenu5.setText("Presentación");
        menuBar.add(jMenu5);

        jMenu6.setText("Ver Video 1");
        menuBar.add(jMenu6);

        jMenu2.setText("Ver Video 2");
        menuBar.add(jMenu2);

        jMenu7.setText("Finalizar");
        menuBar.add(jMenu7);

        helpMenu.setMnemonic('h');
        helpMenu.setText("About");
        helpMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMenuMouseClicked(evt);
            }
        });
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuJuegoAnimalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuJuegoAnimalesMouseClicked
      
    }//GEN-LAST:event_menuJuegoAnimalesMouseClicked

    private void helpMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuMouseClicked
        System.out.println("-----[Form]-----");
        if (about == null || about.isClosed()){
            System.out.println("[Form] - The form is created - vAbout ");
            about = new vAbout();
            this.panel.add(about);
            about.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
    }//GEN-LAST:event_helpMenuMouseClicked

    private void panelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelKeyPressed
        int velocidad = 2;
       // x = ;
        //y = ;


        
        imgAve2.setLocation(imgAve2.getY(), imgAve2.getX()-2);
        
        
        //switch(evt.getExtendedKeyCode()){
            //case KeyEvent.VK_UP:    System.out.println("Key Up"); imgAve.setLocation(y-velocidad, x); break;
            //case KeyEvent.VK_DOWN:  System.out.println("Key Down"); imgAve.setLocation(y+velocidad, x); break;
            //case KeyEvent.VK_LEFT:  System.out.println("Key Left"); imgAve.setLocation(y, x-velocidad); break;
        //    case KeyEvent.VK_RIGHT: System.out.println("Key Right"); imgAve.setLocation(-); break;
        //}
        

    }//GEN-LAST:event_panelKeyPressed

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        System.out.println("-----[Panel actived]-----");
        panel.setFocusable(true);
    }//GEN-LAST:event_panelMouseClicked

    private void panelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_panelComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_panelComponentAdded

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel imgAve2;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuJuegoAnimales;
    private javax.swing.JDesktopPane panel;
    private javax.swing.JLabel textMain;
    // End of variables declaration//GEN-END:variables

}
