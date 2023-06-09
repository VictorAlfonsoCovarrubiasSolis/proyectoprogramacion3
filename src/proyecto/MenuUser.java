/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *  Covarrubias Solís Víctor Alfonso – 177294
    Puente Sánchez Erick Emmanuel – 174662
 * 
 */
public class MenuUser extends javax.swing.JFrame {

    String usuario;
    
    Connection con;
    public MenuUser(Connection c, String u)  throws SQLException {
        con = c;
        usuario=u;
        this.setTitle("Menu Usuario");
        this.setResizable(false);//para que no se pueda cambiar el tamaño
        this.setVisible(true);//mostrar la ventana
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Fondo();
        jLabel1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        btnApartar = new javax.swing.JButton();
        btnConstltarcomapar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 800));

        jPanel1.setBackground(new java.awt.Color(153, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 24)); // NOI18N
        jLabel1.setText("MENU USUARIO");

        btnModificar.setBackground(new java.awt.Color(0, 153, 204));
        btnModificar.setText("Modificar mi usuario");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnComprar.setBackground(new java.awt.Color(0, 153, 204));
        btnComprar.setText("Comprar producto");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnApartar.setBackground(new java.awt.Color(0, 153, 204));
        btnApartar.setText("Apartar producto");
        btnApartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApartarActionPerformed(evt);
            }
        });

        btnConstltarcomapar.setBackground(new java.awt.Color(0, 153, 204));
        btnConstltarcomapar.setText("Consultar compras/apartados");
        btnConstltarcomapar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstltarcomaparActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 153, 204));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        cerrar.setBackground(new java.awt.Color(0, 153, 204));
        cerrar.setText("Cerrar sesion");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnConstltarcomapar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnApartar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(387, 387, 387))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(368, 368, 368))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(btnModificar)
                .addGap(53, 53, 53)
                .addComponent(btnComprar)
                .addGap(52, 52, 52)
                .addComponent(btnApartar)
                .addGap(58, 58, 58)
                .addComponent(btnConstltarcomapar)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(cerrar))
                .addContainerGap(290, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            new ModificacionUser(con, usuario).setVisible(true);
        }catch(SQLException e) {
            System.out.println("Error"+e);
        }
        this.dispose();//se cierra la ventana de login al abrirse la de registro
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        try {
            new MenuProductos(con, usuario).setVisible(true);
        }catch(SQLException e) {
            System.out.println("Error"+e);
        }
        this.dispose();//se cierra la ventana de login al abrirse la de registro
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnApartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApartarActionPerformed
        try {
            new MenuApartar(con, usuario).setVisible(true);
        }catch(SQLException e) {
            System.out.println("Error"+e);
        }
        this.dispose();//se cierra la ventana de login al abrirse la de registro
    }//GEN-LAST:event_btnApartarActionPerformed

    private void btnConstltarcomaparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstltarcomaparActionPerformed
        try {
            new Consultacomprasapartados(con, usuario).setVisible(true);
        }catch(SQLException e) {
            System.out.println("Error"+e);
        }
        this.dispose();
    }//GEN-LAST:event_btnConstltarcomaparActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Graphics papel = jPanel1.getGraphics();//devuelve un objeto de tipo grafics que se guarda en el objeto papel
        papel.setColor(Color.BLACK);//cambiar color
        papel.fillRect(0, 0, 800, 700);//imprimir rectangulo
        ImageIcon img4 = new ImageIcon(getClass().getResource("/imagenes/salir.png"));
        papel.drawImage(img4.getImage(), 0, 0,getWidth(), getHeight(), this);//se dibuja la imagen de salida
        try {//para parar el tiempo unos cuantos milisegundos
            Thread.sleep(600);
        } catch (InterruptedException e) {
            System.out.println("Error"+ e);
        }
        exit(0);//terminar el programa
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        try{
            new Login(con).setVisible(true);
        }catch(SQLException e) {
            System.out.println("Error"+e);
        }
        this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    class Fondo extends javax.swing.JPanel{//funcion creada para que se cambie el fondo del panel
        private java.awt.Image imagen;//se crea una variable para la imagen del fondo
        @Override//viene de JFrame por eso se sobreescribio
        public void paint(java.awt.Graphics g){//funcion que recibe graficos y sirve para cambiar fondos
            imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/menucliente.jpeg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);//se dibuja la imagen
            setOpaque(false);
            super.paint(g);//se usa el metodo de la clase padre con super
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApartar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnConstltarcomapar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
