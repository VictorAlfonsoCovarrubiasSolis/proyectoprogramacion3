/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;//para la creacion de la tabla
/**
 *
 * @author victor
 */
public class ApartarVideojuegos extends javax.swing.JFrame {

    Connection con;
    String usuario;
    public ApartarVideojuegos(Connection c, String u) throws SQLException{//recibe la conexion a la base de datos
        con = c;
        usuario=u;
        this.setTitle("Seleccion de Videojuegos");
        this.setResizable(false);//para que no se pueda cambiar el tamaño
        this.setVisible(true);//mostrar la ventana
        initComponents();
        rellenarcombo();
        actualizartabla();//para que se actualize la tabla
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
        jLabel3 = new javax.swing.JLabel();
        Menu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        continuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 153));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Apartar Videojuegos");

        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VIDEOJUEGO");

        continuar.setText("Continuar");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Menu)
                        .addGap(267, 267, 267)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(continuar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(346, 346, 346))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Menu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(continuar)))
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            String tablaproductos= ("SELECT * FROM productos WHERE tipo='videojuego' || 'Videojuego'");
            rs= s.executeQuery(tablaproductos);
            
            while(rs.next()){
                int cantidad=Integer.parseInt(rs.getString("cantidad"));
                if(cantidad>0){//si la cantidad no es 0
                    jComboBox1.addItem(rs.getString("nombre"));
                }
            }
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }
    public void actualizartabla(){
        Statement s;
        DefaultTableModel modelo = new DefaultTableModel();
        //Encabezados de columnas
        modelo.addColumn("tipo");
        modelo.addColumn("nombre");
        modelo.addColumn("genero");
        modelo.addColumn("plataforma");
        modelo.addColumn("compañia");
        modelo.addColumn("anio");
        modelo.addColumn("cantidad");
        modelo.addColumn("precio");
        modelo.addColumn("estado");

        jTable1.setModel(modelo);
        String datos[] = new String[9];
        
        try{
            
            s = con.createStatement();//se crea un statement sql
            String tablausers= ("SELECT * FROM productos WHERE tipo='videojuego' || 'Videojuego'");
            

            ResultSet rs;   
            rs= s.executeQuery(tablausers);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);

                modelo.addRow(datos);
            }
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }
    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        try {
            new MenuApartar(con, usuario).setVisible(true);
        }catch(SQLException e) {
            System.out.println("Error"+e);
        }
        this.dispose();//se cierra la ventana de login al abrirse la de registro
    }//GEN-LAST:event_MenuActionPerformed

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
        Statement s;
        ResultSet rs;

        int cont=0;
        try{
            s = con.createStatement();//se crea un statement sql
            String tablaproductos= ("SELECT * FROM productos WHERE tipo='videojuego' || 'Videojuego'");
            rs= s.executeQuery(tablaproductos);

            while(rs.next() && cont==0){
                if((rs.getString("nombre").equals(jComboBox1.getSelectedItem().toString()))){//si se encuentra lo seleccionado en la tabla de productos
                    new Confirmarapartado(con, usuario, rs.getString("nombre"), rs.getString("cantidad"), rs.getString("precio")).setVisible(true);
                    this.dispose();//se cierra la ventana de login al abrirse la de registro
                    cont++;
                }
            }
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_continuarActionPerformed

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
    private javax.swing.JButton continuar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
