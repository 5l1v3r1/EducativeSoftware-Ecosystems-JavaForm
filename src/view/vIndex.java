
package view;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class vIndex extends javax.swing.JFrame {

    private vAbout about = null;
    private vFinalizar finalizar = null;
    //private final String pathFont = "arthriti.ttf";
    //private Font font = null ;
    
    public vIndex() {
        initComponents();
        /*
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("arthriti.ttf")));

        //labelEco.setFont(customFont);
        } catch (IOException e) {
            System.out.println(" Error: "+e);
        }
        */
        imgFondo.setFocusable(true);
        
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_lienzo = new javax.swing.JDesktopPane();
        imgOso = new javax.swing.JLabel();
        labelEco = new javax.swing.JLabel();
        imgFondo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgOso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/animalitos/oso.png"))); // NOI18N
        p_lienzo.add(imgOso);
        imgOso.setBounds(580, 290, 140, 120);

        labelEco.setBackground(new java.awt.Color(255, 51, 51));
        labelEco.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 90)); // NOI18N
        labelEco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEco.setText("\"Ecosistemas\"");
        labelEco.setName(""); // NOI18N
        p_lienzo.add(labelEco);
        labelEco.setBounds(0, 30, 1280, 120);
        labelEco.getAccessibleContext().setAccessibleName("labelEco");
        labelEco.getAccessibleContext().setAccessibleDescription("");

        imgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/fondo.jpg"))); // NOI18N
        imgFondo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imgFondoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                imgFondoKeyTyped(evt);
            }
        });
        p_lienzo.add(imgFondo);
        imgFondo.setBounds(0, 0, 1280, 720);

        getContentPane().add(p_lienzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        jMenu1.setText("Juego Animales");
        menuBar.add(jMenu1);

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
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imgFondoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imgFondoKeyPressed
        System.out.println("press");
    }//GEN-LAST:event_imgFondoKeyPressed

    private void imgFondoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imgFondoKeyTyped
        System.out.println("type");
        imgOso.setLocation(20, 20);
    }//GEN-LAST:event_imgFondoKeyTyped

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JLabel imgOso;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JLabel labelEco;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JDesktopPane p_lienzo;
    // End of variables declaration//GEN-END:variables

}
