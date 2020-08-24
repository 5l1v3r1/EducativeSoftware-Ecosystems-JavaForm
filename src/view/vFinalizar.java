/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.FontX;
import model.mIconX;
/**
 *
 * @author sebas
 */
public class vFinalizar extends javax.swing.JInternalFrame {

    private final mIconX iFondo = new mIconX("\\resources\\img\\fondo.jpg",1192,670);
    private final String pathFont = "\\resources\\fonts\\Capture it 2_0.ttf"; 
    private final FontX font = new FontX();

    
    public vFinalizar()  {
        initComponents();
        imgFondo.setIcon(iFondo.Standard());
        txttitle1.setFont(font.changed(pathFont , 29));
        txttitle.setFont(font.changed(pathFont , 45));
        
         
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img1 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        txttitle = new javax.swing.JLabel();
        txttitle1 = new javax.swing.JLabel();
        imgFondo = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Finalizar");
        setMaximumSize(new java.awt.Dimension(1192, 670));
        setMinimumSize(new java.awt.Dimension(1192, 670));
        setName(""); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/gif/rana.gif"))); // NOI18N
        img1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        img1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        img1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 440, 270));

        img4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/gif/aveztruss.gif"))); // NOI18N
        img4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        img4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        img4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 240, 260));

        img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/gif/ave2.gif"))); // NOI18N
        img2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 260, 240));

        img3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/gif/condor.gif"))); // NOI18N
        img3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 400, 240));

        img5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/gif/pato.gif"))); // NOI18N
        img5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 260, 240));

        txttitle.setBackground(new java.awt.Color(0, 0, 0));
        txttitle.setFont(new java.awt.Font("Snap ITC", 0, 28)); // NOI18N
        txttitle.setForeground(new java.awt.Color(0, 0, 0));
        txttitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txttitle.setText("La clase ha finalizado");
        txttitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txttitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txttitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 870, 80));

        txttitle1.setBackground(new java.awt.Color(0, 0, 0));
        txttitle1.setFont(new java.awt.Font("Snap ITC", 0, 28)); // NOI18N
        txttitle1.setForeground(new java.awt.Color(0, 0, 0));
        txttitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txttitle1.setText(" Hasta otra oportunidad mis queridos estudiantes ");
        txttitle1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txttitle1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txttitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 870, 80));

        imgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/background/selva/selva2.jpg"))); // NOI18N
        imgFondo.setMaximumSize(new java.awt.Dimension(1192, 670));
        imgFondo.setMinimumSize(new java.awt.Dimension(1192, 670));
        getContentPane().add(imgFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 873, 552));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JLabel txttitle;
    private javax.swing.JLabel txttitle1;
    // End of variables declaration//GEN-END:variables
}
