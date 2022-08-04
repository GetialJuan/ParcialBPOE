/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mauricio.munoz
 */
public class VentanaVentas extends javax.swing.JFrame {

    DefaultTableModel modeloTblHistorico = new DefaultTableModel();
    DefaultTableModel modeloTblPronostico = new DefaultTableModel();
    
    /**
     * Creates new form VentanaVentas
     */
    public VentanaVentas() {
        initComponents();
        setTitle("Pronósticos de Ventas");
        txtPromedio.setEnabled(false);
        cargarModeloTablas();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void cargarModeloTablas() {             
        modeloTblHistorico.addColumn("Año");      
        modeloTblHistorico.addColumn("Cantidad de Ventas");
        modeloTblHistorico.addColumn("Variación");
        modeloTblHistorico.addColumn("Porcentaje Variación");       
        tblHistorico.getColumnModel().getColumn(0).setMaxWidth(80);     
        tblHistorico.getColumnModel().getColumn(1).setMaxWidth(150);
        tblHistorico.getColumnModel().getColumn(2).setMaxWidth(200);
        tblHistorico.getColumnModel().getColumn(3).setMaxWidth(250);
        for(int i = 0; i < modeloTblHistorico.getColumnCount(); i++){
            tblHistorico.getColumnModel().getColumn(i).setResizable(false);
        }
        
        modeloTblPronostico.addColumn("Año");
        modeloTblPronostico.addColumn("Pronóstico de Ventas");
        tblPronostico.getColumnModel().getColumn(0).setMaxWidth(80);
        tblPronostico.getColumnModel().getColumn(1).setMaxWidth(320);
        for(int i = 0; i < modeloTblPronostico.getColumnCount(); i++){
            tblPronostico.getColumnModel().getColumn(i).setResizable(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatos = new javax.swing.JPanel();
        txtCantidadVenta = new javax.swing.JTextField();
        lblCantidadVenta = new javax.swing.JLabel();
        panelPronosticar = new javax.swing.JPanel();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        panelControles = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        panelHistorico = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistorico = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        panelPronosticoVenta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPronostico = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        lblPromedio = new javax.swing.JLabel();
        txtPromedio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Datos de Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        lblCantidadVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadVenta.setText("Cantidad de Venta : ");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCantidadVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidadVenta)
                    .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panelPronosticar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Años a Pronosticar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        lblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidad.setText("Cantidad :");

        javax.swing.GroupLayout panelPronosticarLayout = new javax.swing.GroupLayout(panelPronosticar);
        panelPronosticar.setLayout(panelPronosticarLayout);
        panelPronosticarLayout.setHorizontalGroup(
            panelPronosticarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPronosticarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPronosticarLayout.setVerticalGroup(
            panelPronosticarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPronosticarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelPronosticarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panelControles.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Controles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        panelControles.setToolTipText("Controles");

        btnAgregar.setText("Agregar Año");

        btnBorrar.setText("Borrar Año");

        btnModificar.setText("Modificar Año");

        btnNuevo.setText("Nuevo Pronostico");

        javax.swing.GroupLayout panelControlesLayout = new javax.swing.GroupLayout(panelControles);
        panelControles.setLayout(panelControlesLayout);
        panelControlesLayout.setHorizontalGroup(
            panelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        panelControlesLayout.setVerticalGroup(
            panelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlesLayout.createSequentialGroup()
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelHistorico.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Historico de Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        tblHistorico.setModel(modeloTblHistorico);
        jScrollPane1.setViewportView(tblHistorico);

        javax.swing.GroupLayout panelHistoricoLayout = new javax.swing.GroupLayout(panelHistorico);
        panelHistorico.setLayout(panelHistoricoLayout);
        panelHistoricoLayout.setHorizontalGroup(
            panelHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistoricoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelHistoricoLayout.setVerticalGroup(
            panelHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistoricoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPronosticoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Pronóstico de Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        tblPronostico.setModel(modeloTblPronostico);
        jScrollPane2.setViewportView(tblPronostico);

        lblPromedio.setText("Promedio de variación: ");

        javax.swing.GroupLayout panelPronosticoVentaLayout = new javax.swing.GroupLayout(panelPronosticoVenta);
        panelPronosticoVenta.setLayout(panelPronosticoVentaLayout);
        panelPronosticoVentaLayout.setHorizontalGroup(
            panelPronosticoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPronosticoVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPronosticoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPronosticoVentaLayout.createSequentialGroup()
                        .addComponent(lblPromedio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPronosticoVentaLayout.setVerticalGroup(
            panelPronosticoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPronosticoVentaLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(panelPronosticoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPromedio)
                    .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelPronosticoVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelPronosticar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(panelControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelPronosticar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelControles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPronosticoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelControles.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVentas().setVisible(true);
            }
        });
    }
    
    public void agregarListenersBtns(ActionListener aL){
        btnAgregar.addActionListener(aL);
        btnBorrar.addActionListener(aL);
        btnModificar.addActionListener(aL);
        btnNuevo.addActionListener(aL);
    }
    
    public String getTxtCantidadVenta(){
        return txtCantidadVenta.getText();
    }
    
    public String getTxtCantidad(){
        return txtCantidad.getText();
    }
    
    public void setTxtPromedio(String promedio){
        txtPromedio.setText(promedio);
    }
    
    public void limpiarTablaHistorico(){
        int filas = tblHistorico.getRowCount();
        for(int i = filas -1; i >= 0; i--){
            modeloTblHistorico.removeRow(i);
        }
    }
    
    public void generarTablaHistorico(ArrayList<HashMap<String,Float>> dato){
        limpiarTablaHistorico();
        int i = 1;
        for(HashMap <String,Float> map : dato){
            String ventas = Float.toString(map.get("ventas"));
            String delta = Float.toString(map.get("deltaVentas"));
            String porcentaje = Float.toString(map.get("porcentajeVariacion"));
            Object[] fila = {i, ventas, delta, porcentaje};
            modeloTblHistorico.addRow(fila);
            i++;
        }
    }
    
    public void limpiarTablaPronostico(){
        int filas = tblPronostico.getRowCount();
        for(int i = filas -1; i >= 0; i--){
            modeloTblPronostico.removeRow(i);
        }
    }
    
    public void generarTablaPronostico(ArrayList<Float> dato){
        limpiarTablaPronostico();
        int i = 1;
        for(Float ventas : dato){
            String venta = Float.toString(ventas);
            Object[] fila = {i,venta};
            modeloTblPronostico.addRow(fila);
            i++;
        }
    }
    
    public int getFilaHistorio(){
        return tblHistorico.getSelectedRow();
    }
    
    public float modificaDato(){
        float dato = Float.parseFloat
            (JOptionPane.showInputDialog(rootPane, "Digite el nuevo valor"));
        return dato; 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCantidadVenta;
    private javax.swing.JLabel lblPromedio;
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelHistorico;
    private javax.swing.JPanel panelPronosticar;
    private javax.swing.JPanel panelPronosticoVenta;
    private javax.swing.JTable tblHistorico;
    private javax.swing.JTable tblPronostico;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtPromedio;
    // End of variables declaration//GEN-END:variables
}
