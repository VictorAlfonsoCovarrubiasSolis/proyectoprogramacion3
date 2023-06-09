/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;//para la creacion de la tabla
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Administrator
 */
public class Graficas extends javax.swing.JFrame {

    /**
     * Creates new form Graficas
     */
    Connection con;

    public Graficas(Connection c) throws SQLException {
        con = c;
        this.setTitle("GRAFICAS");
        this.setResizable(false);
        this.setVisible(true);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        btnPrecios = new javax.swing.JButton();
        btnGraficar = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();
        btnApartados = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnGraficarDos = new javax.swing.JButton();
        btnGraficarTres = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTabla);

        btnPrecios.setText("Tabla Precios");
        btnPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreciosActionPerformed(evt);
            }
        });

        btnGraficar.setText("Graficar Precios");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        jPanel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 942, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnApartados.setText("Tabla Apartados");
        btnApartados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApartadosActionPerformed(evt);
            }
        });

        btnCompras.setText("Tabla Compras");
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });

        btnGraficarDos.setText("Graficar Apartados");
        btnGraficarDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarDosActionPerformed(evt);
            }
        });

        btnGraficarTres.setText("Graficar Compras");
        btnGraficarTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarTresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnApartados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(btnPrecios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGraficar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGraficarDos, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(btnGraficarTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGraficarDos, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(btnApartados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGraficarTres, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreciosActionPerformed
        Statement s;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Tipo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");

        jTabla.setModel(modelo);
        String datos[] = new String[3];

        try {

            s = con.createStatement();
            String tablausers = ("Select * from articulos");
            ResultSet rs;
            rs = s.executeQuery(tablausers);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(7);

                modelo.addRow(datos);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnPreciosActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
    // Obtener los datos de la tabla
    DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
    int rowCount = modelo.getRowCount();
    
    // Crear un dataset para el gráfico
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    for (int i = 0; i < rowCount; i++) {
        String nombre = (String) modelo.getValueAt(i, 1);
        double precio = Double.parseDouble((String) modelo.getValueAt(i, 2));
        dataset.addValue(precio, "Precio", nombre);
    }
    
    // Crear el gráfico de barras
    JFreeChart chart = ChartFactory.createBarChart(
        "Gráfico de Precios", // Título del gráfico
        "Artículos", // Etiqueta del eje X
        "Precios", // Etiqueta del eje Y
        dataset, // Datos para el gráfico
        PlotOrientation.VERTICAL, // Orientación del gráfico
        true, // Mostrar leyenda
        true, // Mostrar tooltips
        false // No permitir interacción
    );
    
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new Dimension(600, 400));
    jPanel.removeAll();
    jPanel.setLayout(new BorderLayout());
    jPanel.add(chartPanel, BorderLayout.CENTER);
    jPanel.validate();
   
        
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void btnApartadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApartadosActionPerformed
        Statement s;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio unitario");

        jTabla.setModel(modelo);
        String datos[] = new String[3];

        try {

            s = con.createStatement();
            String tablausers = ("Select * from apartados");
            ResultSet rs;
            rs = s.executeQuery(tablausers);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(4);
                datos[2] = rs.getString(5);

                modelo.addRow(datos);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnApartadosActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        Statement s;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio unitario");
        modelo.addColumn("Precio total");

        jTabla.setModel(modelo);
        String datos[] = new String[4];

        try {

            s = con.createStatement();
            String tablausers = ("Select * from compras");
            ResultSet rs;
            rs = s.executeQuery(tablausers);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(3);
                datos[2] = rs.getString(4);
                datos[3] = rs.getString(5);

                modelo.addRow(datos);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnGraficarDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarDosActionPerformed
            // Obtener los datos de la tabla
        DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
        int rowCount = modelo.getRowCount();

        // Crear un dataset para el gráfico
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < rowCount; i++) {
            String nombre = (String) modelo.getValueAt(i, 0);
            double cantidad = Double.parseDouble((String) modelo.getValueAt(i, 1));
            dataset.addValue(cantidad, "Cantidad", nombre);
        }

        // Crear el gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
            "Gráfico de Apartados", // Título del gráfico
            "Productos", // Etiqueta del eje X
            "Cantidades", // Etiqueta del eje Y
            dataset, // Datos para el gráfico
            PlotOrientation.VERTICAL, // Orientación del gráfico
            true, // Mostrar leyenda
            true, // Mostrar tooltips
            false // No permitir interacción
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(600, 400));
        jPanel.removeAll();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(chartPanel, BorderLayout.CENTER);
        jPanel.validate();
    }//GEN-LAST:event_btnGraficarDosActionPerformed

    private void btnGraficarTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarTresActionPerformed
        // Obtener los datos de la tabla
        DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
        int rowCount = modelo.getRowCount();

        // Crear un dataset para el gráfico
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < rowCount; i++) {
            String nombre = (String) modelo.getValueAt(i, 0);
            double cantidad = Double.parseDouble((String) modelo.getValueAt(i, 1));
            dataset.addValue(cantidad, "Cantidad", nombre);
        }

        // Crear el gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
            "Gráfico de Compras", // Título del gráfico
            "Productos", // Etiqueta del eje X
            "Cantidades", // Etiqueta del eje Y
            dataset, // Datos para el gráfico
            PlotOrientation.VERTICAL, // Orientación del gráfico
            true, // Mostrar leyenda
            true, // Mostrar tooltips
            false // No permitir interacción
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(600, 400));
        jPanel.removeAll();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(chartPanel, BorderLayout.CENTER);
        jPanel.validate();
    }//GEN-LAST:event_btnGraficarTresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApartados;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnGraficarDos;
    private javax.swing.JButton btnGraficarTres;
    private javax.swing.JButton btnPrecios;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}
