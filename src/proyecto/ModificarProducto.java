/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *  Covarrubias Solís Víctor Alfonso – 177294
    Puente Sánchez Erick Emmanuel – 174662
 * 
 */
public class ModificarProducto extends javax.swing.JFrame{

    /**
     * Creates new form ModificarProducto
     */
    Connection con;
    
    public ModificarProducto(Connection c) throws SQLException{//recibe la conexion a la base de datos
        con = c;
        this.setTitle("Modificacion de productos");
        this.setVisible(true);//mostrar la ventana
        initComponents();
        rellenarcombo();
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
        Menu = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        txtcantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        consultar.setText("Consultar productos");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Cantidad");

        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Nombre del producto a modificar");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Modificar Producto");

        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Precio");

        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Estado");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comprar y Apartar", "Solo comprar", "Solo apartar" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(Menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(consultar)
                .addGap(231, 231, 231))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(246, 246, 246)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(340, 340, 340)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(33, 33, 33)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                        .addComponent(txtcantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modificar)
                    .addComponent(consultar)
                    .addComponent(Menu))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void rellenarcombo(){
        Statement s;
        ResultSet rs;  
        try{
            s = con.createStatement();//se crea un statement sql
            String tablaproductos= ("SELECT * FROM productos");
            rs= s.executeQuery(tablaproductos);
            
            while(rs.next()){
                jComboBox1.addItem(rs.getString("nombre"));
            }
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }
    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        try {
            new MenuAdmins(con).setVisible(true);
        }catch(SQLException e) {
            System.out.println("Error"+e);
        }
        this.dispose();
    }//GEN-LAST:event_MenuActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        //si se presiona el boton
        try{//se checa que todos los text fields esten llenos
            if(txtcantidad.getText().equals("") || txtprecio.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Faltan datos por llenar", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
            }else{//si estan todos los datos
                Statement s = con.createStatement();//se crea un statement sql
                String datosmodificados= ("UPDATE productos SET cantidad='"+txtcantidad.getText()+"',"+"precio='"+txtprecio.getText()+"',"+"estado='"+jComboBox2.getSelectedItem().toString()+"' WHERE nombre='"+jComboBox1.getSelectedItem().toString()+"'");
                s.executeUpdate(datosmodificados);//se modifican los datos
                JOptionPane.showMessageDialog(null, "Modificado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                //se limpian los campos de los textfields
                txtcantidad.setText("");
                txtprecio.setText("");
            }
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        try {
            new ConsultaProductos(con).setVisible(true);
        }catch(SQLException e) {
            System.out.println("Error"+e);
        }
        this.dispose();
    }//GEN-LAST:event_consultarActionPerformed

    class Fondo extends javax.swing.JPanel{//funcion creada para que se cambie el fondo del panel
        private java.awt.Image imagen;//se crea una variable para la imagen del fondo
        @Override//viene de JFrame por eso se sobreescribio
        public void paint(java.awt.Graphics g){//funcion que recibe graficos y sirve para cambiar fondos
            imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/RegisProducto.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);//se dibuja la imagen
            setOpaque(false);
            super.paint(g);//se usa el metodo de la clase padre con super
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton consultar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}