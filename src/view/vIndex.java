
package view;
import java.awt.Dimension;
import java.awt.event.KeyEvent;

public class vIndex extends javax.swing.JFrame {

    private vAbout about = null;
    private vFinalizar finalizar = null;
    private vJuegoAnimales juego_animales = null;
    private vOrganizaFiguras organizar = null;
    private vPresentacion presentacion = null;
    private vVideo1 video1 = null;
    private vVideo2 video2 = null;
    private int x = 5;
    private int y = 5;
    private int velocidad =6;
    
    public vIndex() {
        initComponents();
        panel.setFocusable(true);
        panel.setSize(new Dimension(12,21));
        imgAve.setLocation(y,x);
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
        imgAve = new javax.swing.JLabel();
        textMain = new javax.swing.JLabel();
        imgFondo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        juegoM = new javax.swing.JMenu();
        organizaM = new javax.swing.JMenu();
        presentacionM = new javax.swing.JMenu();
        video1M = new javax.swing.JMenu();
        video2M = new javax.swing.JMenu();
        finalizarM = new javax.swing.JMenu();
        aboutM = new javax.swing.JMenu();

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

        imgAve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/gif/ave.gif"))); // NOI18N
        imgAve.setToolTipText("");
        panel.add(imgAve);
        imgAve.setBounds(0, 0, 330, 220);

        textMain.setBackground(new java.awt.Color(0, 0, 0));
        textMain.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 95)); // NOI18N
        textMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textMain.setText("Ecosistemas");
        panel.add(textMain);
        textMain.setBounds(0, 10, 1280, 110);

        imgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/fondo2.png"))); // NOI18N
        panel.add(imgFondo);
        imgFondo.setBounds(0, 0, 1280, 710);

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

        juegoM.setText("Juego Animales");
        juegoM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                juegoMMouseClicked(evt);
            }
        });
        menuBar.add(juegoM);

        organizaM.setText("Organiza Figuras");
        organizaM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                organizaMMouseClicked(evt);
            }
        });
        menuBar.add(organizaM);

        presentacionM.setText("Presentación");
        presentacionM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                presentacionMMouseClicked(evt);
            }
        });
        menuBar.add(presentacionM);

        video1M.setText("Ver Video 1");
        video1M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                video1MMouseClicked(evt);
            }
        });
        menuBar.add(video1M);

        video2M.setText("Ver Video 2");
        video2M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                video2MMouseClicked(evt);
            }
        });
        menuBar.add(video2M);

        finalizarM.setText("Finalizar");
        finalizarM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizarMMouseClicked(evt);
            }
        });
        menuBar.add(finalizarM);

        aboutM.setMnemonic('h');
        aboutM.setText("About");
        aboutM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMMouseClicked(evt);
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
            juego_animales.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
       
    }//GEN-LAST:event_juegoMMouseClicked

    private void aboutMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMMouseClicked
        System.out.println("-----[Form]-----");
        if (about == null || about.isClosed()){
            System.out.println("[Form] - The form is created - vAbout ");
            about = new vAbout();
            this.panel.add(about);
            about.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
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
            finalizar.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
    }//GEN-LAST:event_finalizarMMouseClicked

    private void organizaMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizaMMouseClicked
        System.out.println("-----[Form]-----");
        if (organizar == null || organizar.isClosed()){
            System.out.println("[Form] - The form is created - vOrganizarFiguras");
            organizar = new vOrganizaFiguras();
            this.panel.add(organizar);
            organizar.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }      
    }//GEN-LAST:event_organizaMMouseClicked

    private void presentacionMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presentacionMMouseClicked
       System.out.println("-----[Form]-----");
        if (presentacion == null || presentacion.isClosed()){
            System.out.println("[Form] - The form is created - vPresentacion");
            presentacion = new vPresentacion();
            this.panel.add(presentacion);
            presentacion.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
       
    }//GEN-LAST:event_presentacionMMouseClicked

    private void video1MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_video1MMouseClicked
        System.out.println("-----[Form]-----");
        if (video1 == null || video1.isClosed()){
            System.out.println("[Form] - The form is created - vVideo1");
            video1 = new vVideo1();
            this.panel.add(video1);
            video1.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
    }//GEN-LAST:event_video1MMouseClicked

    private void video2MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_video2MMouseClicked
        System.out.println("-----[Form]-----");
        if (video2 == null || video2.isClosed()){
            System.out.println("[Form] - The form is created - vVideo2");
            video2 = new vVideo2();
            this.panel.add(video2);
            video2.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
    }//GEN-LAST:event_video2MMouseClicked

   
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
