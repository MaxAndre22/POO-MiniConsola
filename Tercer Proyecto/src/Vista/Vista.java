/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.*;
import Control.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author Gerson
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    private Consola_Conecta_4 controlador= new Consola_Conecta_4();
    public int index=3;
    
    public Vista() {
        initComponents();
        
        
        this.getContentPane().setBackground(Color.DARK_GRAY);
        
        this.setLocationRelativeTo(null); /*Se centra automáticamente*/
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnIzquierda.setIcon(btn_setIcono("/iconos/1.png", btnIzquierda));
        btnIzquierda.setBackground(new Color(0,0,0,0));
        btnDerecha.setIcon(btn_setIcono("/iconos/3.png", btnDerecha));
        btnDerecha.setBackground(new Color(0,0,0,0));
        
        
        
        generar_Tablero(7,7);
        this.setVisible(true);
        //System.out.println(this.controlador.getTablero().toString());
    }
    
    public void generar_Tablero (int x, int y){
        
        
        this.setLayout(null);

        int pos_x=110;
        int pos_y=110;
        int cont=0;
        int numero;
        int promedio= ((x*y)*5)/100;
        int conty=0;
        int contx=0;
        boolean flag=true;
        
        for (int i = 0; i < (x*y); i++) {
            
           
               
            Casilla casilla= new Casilla(i);
            casilla.getLblcasilla().setBounds(pos_x, pos_y, 90, 90);
            
            
                    
            
            
            if (cont<=x && pos_y==110){
                this.add(casilla.getLblcasilla());
                this.controlador.getTablero().Agregar_Casilla(casilla);
                
                if (cont==3){
                   this.controlador.getTablero().getLista_tablero().get(i).getLblcasilla().setIcon(lbl_setIcono ("/iconos/Flecha.png",
                   this.controlador.getTablero().getLista_tablero().get(i).getLblcasilla())); 
                }
                
                else{
                   this.controlador.getTablero().getLista_tablero().get(i).getLblcasilla().setIcon(lbl_setIcono ("/iconos/Transparente.png",
                   this.controlador.getTablero().getLista_tablero().get(i).getLblcasilla()));  
                    
                }
                
                
            
            }
            
            else{
                this.add(casilla.getLblcasilla());
                this.controlador.getTablero().Agregar_Casilla(casilla);
                this.controlador.getTablero().getLista_tablero().get(i).getLblcasilla().setIcon(lbl_setIcono ("/iconos/CasillaVacía.jpg",
                this.controlador.getTablero().getLista_tablero().get(i).getLblcasilla()));
                this.controlador.getTablero().getLista_tablero().get(i).getLblcasilla().addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e) {
                    System.out.println(this.getClass().getSimpleName());
                    
                    String snum_casilla =   casilla.toString();    
                    int num_casilla = Integer.parseInt(snum_casilla);
                    
                    jLabel1.setText(casilla.toString());
                    
                    
                }

            });
            }
            
           cont++;
            if (cont<x){
                pos_x=pos_x+91;
                
            }
            else{
                pos_x=110;
                pos_y=pos_y+91;
                cont=0;
                conty++;
                
            }
            
            
            
            
            
                
                
                
               
           
    
        }
        
       
        
      
        
    }
    
    public Icon lbl_setIcono(String url, JLabel label){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = label.getWidth();
        int alto = label.getHeight();
        
        ImageIcon icono = new ImageIcon (icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
        
    }
    
    public Icon btn_setIcono(String url, JButton boton){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        System.out.println("Ancho:"+ancho+"Alto:"+alto);
        
        
        ImageIcon icono = new ImageIcon (icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnIzquierda = new javax.swing.JButton();
        btnDerecha = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnIzquierda.setBackground(new java.awt.Color(0, 0, 0));
        btnIzquierda.setBorder(null);
        btnIzquierda.setBorderPainted(false);
        btnIzquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIzquierda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIzquierda.setIconTextGap(2);
        btnIzquierda.setOpaque(false);
        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });

        btnDerecha.setBackground(new java.awt.Color(0, 0, 0));
        btnDerecha.setBorder(null);
        btnDerecha.setBorderPainted(false);
        btnDerecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDerecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDerecha.setIconTextGap(2);
        btnDerecha.setOpaque(false);
        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });

        btnJugar.setBackground(new java.awt.Color(0, 0, 204));
        btnJugar.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(240, 240, 240));
        btnJugar.setText("JUGAR TURNO");
        btnJugar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(btnIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDerecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIzquierda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 718, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        
        if (index>=0 && index <6){
            this.controlador.getTablero().getLista_tablero().get(index).getLblcasilla().setIcon(lbl_setIcono ("/iconos/Transparente.png",
            this.controlador.getTablero().getLista_tablero().get(index).getLblcasilla()));
            this.index=this.index+1;
            this.controlador.getTablero().getLista_tablero().get(index).getLblcasilla().setIcon(lbl_setIcono ("/iconos/Flecha.png",
            this.controlador.getTablero().getLista_tablero().get(index).getLblcasilla())); 
        }
        
                                                
    }//GEN-LAST:event_btnDerechaActionPerformed

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
    
        
     if (index>0 && index <=6){
        
        this.controlador.getTablero().getLista_tablero().get(index).getLblcasilla().setIcon(lbl_setIcono ("/iconos/Transparente.png",
        this.controlador.getTablero().getLista_tablero().get(index).getLblcasilla()));
        this.index=this.index-1;
        this.controlador.getTablero().getLista_tablero().get(index).getLblcasilla().setIcon(lbl_setIcono ("/iconos/Flecha.png",
        this.controlador.getTablero().getLista_tablero().get(index).getLblcasilla()));
            
     }
    }//GEN-LAST:event_btnIzquierdaActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
       
        
        for (int i = 6; i > 0; i--) {
            
            System.out.println(index+(7*i));
            if (this.controlador.getTablero().getLista_tablero().get(index+(7*i)).getFicha()==null){
               this.controlador.getTablero().getLista_tablero().get(index+(7*i)).getLblcasilla().setIcon(lbl_setIcono ("/iconos/FRoja.jpg",
               this.controlador.getTablero().getLista_tablero().get(index+(7*i)).getLblcasilla())); 
               this.controlador.getTablero().getLista_tablero().get(index+(7*i)).setFicha(Ficha.Rojo);
               break;
            }
            
           
        }
        
    }//GEN-LAST:event_btnJugarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnIzquierda;
    private javax.swing.JButton btnJugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
