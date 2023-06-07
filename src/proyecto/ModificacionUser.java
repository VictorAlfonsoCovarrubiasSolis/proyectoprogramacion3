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
public class ModificacionUser extends javax.swing.JFrame {

    Connection con;
    String usuario;
    static String correo;
    static String telefono;
    public ModificacionUser(Connection c, String u) throws SQLException {//recibe su nombre de usuario ya que un usuario solo puede modificar su propia info
        con = c;
        usuario=u;
        this.setTitle("Modificacion de cliente");
        this.setResizable(false);//para que no se pueda cambiar el tamaño
        this.setVisible(true);//mostrar la ventana
        initComponents();
        rellenarcampos();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdir = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();
        Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.black);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Modificar mis datos");

        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Nombre");

        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Telefono");

        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Direccion");

        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Contraseña");

        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Correo");

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttelefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdir, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(Menu)
                        .addGap(273, 273, 273)
                        .addComponent(Modificar)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modificar)
                    .addComponent(Menu))
                .addGap(107, 107, 107))
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

    public void rellenarcampos(){
        try{
            Statement s = con.createStatement();//se crea un statement sql
            String tablausers= ("Select * from users");
            s.execute(tablausers);
            ResultSet rs = s.getResultSet();//se guarda el resultado y despues se recorre
            while(rs.next()){//se va recorriendo la tabla users
                if(rs.getString("user").equals(usuario)){
                    txtnombre.setText(rs.getString("nombre"));
                    txtpass.setText(rs.getString("pasword"));
                    txttelefono.setText(rs.getString("telefono"));
                    txtcorreo.setText(rs.getString("correo"));
                    txtdir.setText(rs.getString("direccion"));
                }
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }
    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        //si se presiona el boton
        int cont=0;//para saber si se repitio el correo
        int cont2=0;//para saber si se repitio el telefono
        //excepciones propias
        try{
            Corroborar.validarnombre(txtnombre.getText());
        }catch(Exception e) {
            System.out.println(e);
            txtnombre.setText("");
        }
        try {
            Corroborar.validartelefono(txttelefono.getText());
        }catch(Exception e) {
            System.out.println(e);
            txttelefono.setText("");
        }
        try {
            Corroborar.validarcorreo(txtcorreo.getText());
        }catch(Exception e){
            System.out.println(e);
            txtcorreo.setText("");
        }
        try{//se checa que todos los text fields esten llenos
            if(txtnombre.getText().equals("") ||txtpass.getText().equals("")||txtcorreo.getText().equals("")||txttelefono.getText().equals("") || txtdir.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Faltan datos por llenar", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
            }else{//si estan todos los datos
                Statement s = con.createStatement();//se crea un statement sql
                String tablausers= ("Select * from users");
                s.execute(tablausers);
                ResultSet rs = s.getResultSet();//se guarda el resultado y despues se recorre
                
                while(rs.next()){//se va recorriendo la tabla users
                    if(rs.getString("user").equals(usuario)){
                        //se guardan los datos que tiene antes de la modificacion
                        correo=rs.getString("correo");
                        telefono=rs.getString("telefono");
                    }
                }
                //si otro usuario tiene el mismo correo o telefono no se hara el registro
                while(rs.next()){//se va recorriendo la tabla users
                    if((rs.getString("correo").equals(txtcorreo.getText()))){
                        if(rs.getString("correo")!=correo){
                            cont++;//si se repite y no es el que tenia antes el usuario significa que es uno que ya ocupa otra persona
                        }
                    }
                    if((rs.getString("telefono").equals(txttelefono.getText()))){
                        if(rs.getString("telefono")!=telefono){
                            cont2++;//si se repite y no es el que tenia antes el usuario significa que es uno que ya ocupa otra persona
                        }
                    }
                }
                if(cont>0){//si un dato se repitio
                    JOptionPane.showMessageDialog(null, "correo ya existente.\nIntente de nuevo con otro.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    //se limpia el text field
                    txtcorreo.setText("");
                }else{//si no hay datos ya usados, se hace el registro
                    if(cont2>0){
                        JOptionPane.showMessageDialog(null, "telefono ya existente.\nIntente de nuevo con otro.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                        //se limpia el text field
                        txttelefono.setText("");
                    }else{//si no se repitio ninguno de los 3 casos
                        Statement s2 = con.createStatement();//se crea un statement sql
                        String datosmodificados= ("UPDATE users SET pasword = '"+txtpass.getText()+"',"+"nombre= '"+txtnombre.getText()+"',"+"correo= '"+txtcorreo.getText()+"',"+"telefono='"+txttelefono.getText()+"',"+"direccion='"+txtdir.getText()+"' WHERE user='"+usuario+"'");
                        s2.executeUpdate(datosmodificados);//se modifican los datos
                        JOptionPane.showMessageDialog(null, "Modificado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                        //se limpian los campos de los textfields
                        txtnombre.setText("");
                        txtpass.setText("");
                        txtcorreo.setText("");
                        txttelefono.setText("");
                        txtdir.setText("");
                        //se inicializan
                        correo="";
                        telefono="";
                    }
                }
            }
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
        
    }//GEN-LAST:event_ModificarActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        try {
            new MenuUser(con, usuario).setVisible(true);
        }catch(SQLException e) {
            System.out.println("Error"+e);
        }
        this.dispose();
    }//GEN-LAST:event_MenuActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}