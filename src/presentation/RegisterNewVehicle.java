/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package presentation;

import java.util.ArrayList;
import data.BDColors;
import javax.swing.DefaultComboBoxModel;
import data.BDVehicles;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.text.AbstractDocument;


/**
 *
 * @author Admin
 */
public class RegisterNewVehicle extends javax.swing.JDialog {

    public RegisterNewVehicle(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarElementosDeLosArchivosEnLosjCombox();
        KeyListenerDePrecio();

        // Apply the PlateDocumentFilter to txtNumeroPlaca
        ((AbstractDocument) txtNumeroPlaca.getDocument()).setDocumentFilter(new PlateDocumentFilter());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SVUOAutomovil = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jCBMarcas = new javax.swing.JComboBox<>();
        jCBColores = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        lblNumeroPlaca = new javax.swing.JLabel();
        txtNumeroPlaca = new javax.swing.JTextField();
        rbtnSVU = new javax.swing.JRadioButton();
        rbtnAutomovil = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jCBMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMarcasActionPerformed(evt);
            }
        });

        jCBColores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Marcas");

        jLabel2.setText("Colores");

        lblPrecio.setText("Precio:");

        lblNumeroPlaca.setText("Numero placa:");

        SVUOAutomovil.add(rbtnSVU);
        rbtnSVU.setText("SVU");

        SVUOAutomovil.add(rbtnAutomovil);
        rbtnAutomovil.setText("Automovil");

        jButton1.setText("Guardar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBColores, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumeroPlaca)
                            .addComponent(lblPrecio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(txtNumeroPlaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnSVU)
                            .addComponent(rbtnAutomovil)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCBMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCBColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(lblPrecio)
                        .addComponent(rbtnSVU)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumeroPlaca)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNumeroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbtnAutomovil)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarElementosDeLosArchivosEnLosjCombox() {
        BDColors bdColors = new BDColors();
        ArrayList<String> colores = bdColors.CargarDatosEnJCBColores("ListaColores.txt");
        DefaultComboBoxModel<String> modeloColor = new DefaultComboBoxModel<>();
        for (String color : colores) {
            modeloColor.addElement(color);
        }
        jCBColores.setModel(modeloColor);
        
        BDVehicles bdVehicles = new BDVehicles();
        ArrayList<String> vehiculos = bdVehicles.CargarDatosEnJCBVehiculos("ListaMarcaVehiculos.txt");
        DefaultComboBoxModel<String> modeloVehiculo = new DefaultComboBoxModel<>();
        for (String vehiculo : vehiculos) {
            modeloVehiculo.addElement(vehiculo);
        }
        jCBMarcas.setModel(modeloVehiculo);
    }
    
    private void KeyListenerDePrecio() {
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
            if (!Character.isDigit(c)) {
                evt.consume(); // Ignorar la entrada no numérica
            }
        }
    });
    }
    

    private void jCBMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMarcasActionPerformed

    }//GEN-LAST:event_jCBMarcasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterNewVehicle dialog = new RegisterNewVehicle(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup SVUOAutomovil;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBColores;
    private javax.swing.JComboBox<String> jCBMarcas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNumeroPlaca;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JRadioButton rbtnAutomovil;
    private javax.swing.JRadioButton rbtnSVU;
    private javax.swing.JTextField txtNumeroPlaca;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
