/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package presentation;

import java.util.ArrayList;
import data.BDColors;
import javax.swing.DefaultComboBoxModel;
import data.BDVehicles;
import data.BDVelocidadMaxima;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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
        configurarRadioButtons();
                            lblPotencia.setVisible(false);
                    lblVelocidadMaxima.setVisible(false);
                    txtPotencia.setVisible(false);
                    jCBVelocidadMaxima.setVisible(false);
                                        lblOcupantes.setVisible(false);
                    jSpinnerOcupantes.setVisible(false);
                    lblDisponibilidad.setVisible(false);
                    rbtnSi.setVisible(false);
                    rbtnNo.setVisible(false);
        ((AbstractDocument) txtNumeroPlaca.getDocument()).setDocumentFilter(new PlateDocumentFilter());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SVUOAutomovil = new javax.swing.ButtonGroup();
        SiNo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jCBMarcas = new javax.swing.JComboBox<>();
        jCBColores = new javax.swing.JComboBox<>();
        lblMarcas = new javax.swing.JLabel();
        lblColores = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        lblNumeroPlaca = new javax.swing.JLabel();
        txtNumeroPlaca = new javax.swing.JTextField();
        rbtnSVU = new javax.swing.JRadioButton();
        rbtnAutomovil = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        lblPotencia = new javax.swing.JLabel();
        txtPotencia = new javax.swing.JTextField();
        lblVelocidadMaxima = new javax.swing.JLabel();
        jSpinnerOcupantes = new javax.swing.JSpinner();
        lblOcupantes = new javax.swing.JLabel();
        lblDisponibilidad = new javax.swing.JLabel();
        rbtnSi = new javax.swing.JRadioButton();
        rbtnNo = new javax.swing.JRadioButton();
        jCBVelocidadMaxima = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jCBMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMarcasActionPerformed(evt);
            }
        });

        jCBColores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblMarcas.setText("Marcas");

        lblColores.setText("Colores");

        lblPrecio.setText("Precio:");

        lblNumeroPlaca.setText("Numero placa:");

        SVUOAutomovil.add(rbtnSVU);
        rbtnSVU.setText("SVU");

        SVUOAutomovil.add(rbtnAutomovil);
        rbtnAutomovil.setText("Automovil");

        btnGuardar.setText("Guardar");

        lblPotencia.setText("Potencia:");

        lblVelocidadMaxima.setText("Velocidad Maxima:");

        lblOcupantes.setText("Ocupantes:");

        lblDisponibilidad.setText("Disponibilidad:");

        SiNo.add(rbtnSi);
        rbtnSi.setText("Si");

        SiNo.add(rbtnNo);
        rbtnNo.setText("No");

        jCBVelocidadMaxima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMarcas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblColores)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVelocidadMaxima)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPotencia)
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPotencia)
                                    .addComponent(jCBVelocidadMaxima, 0, 81, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblOcupantes)
                                    .addComponent(lblDisponibilidad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbtnSi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtnNo))
                                    .addComponent(jSpinnerOcupantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(476, 476, 476)
                                .addComponent(btnGuardar)))))
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
                        .addComponent(lblMarcas)
                        .addComponent(lblColores)
                        .addComponent(lblPrecio)
                        .addComponent(rbtnSVU)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumeroPlaca)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNumeroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbtnAutomovil)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPotencia)
                    .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerOcupantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOcupantes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVelocidadMaxima)
                    .addComponent(lblDisponibilidad)
                    .addComponent(rbtnSi)
                    .addComponent(rbtnNo)
                    .addComponent(jCBVelocidadMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(btnGuardar)
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

        BDVelocidadMaxima bdVelocidadMaxima = new BDVelocidadMaxima();
        ArrayList<String> bdVelocidades = bdVelocidadMaxima.CargarDatosEnJCBVelocidadMaxima("ListaVelocidadMaxima.txt");
        DefaultComboBoxModel<String> velocidades = new DefaultComboBoxModel<>();
        for (String bdVelocidad : bdVelocidades) {
            velocidades.addElement(bdVelocidad);
        }
        jCBVelocidadMaxima.setModel(velocidades);
    }

    private void KeyListenerDePrecio() {
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume(); // Ignorar la entrada no numerica
                }
            }
        });
    }

    private void configurarRadioButtons() {

        rbtnAutomovil.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (rbtnAutomovil.isSelected()) {
                    lblPotencia.setVisible(true);
                    lblVelocidadMaxima.setVisible(true);
                    txtPotencia.setVisible(true);
                    jCBVelocidadMaxima.setVisible(true);
                } else {
                    lblPotencia.setVisible(false);
                    lblVelocidadMaxima.setVisible(false);
                    txtPotencia.setVisible(false);
                    jCBVelocidadMaxima.setVisible(false);
                }
            }
        });

        rbtnSVU.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (rbtnSVU.isSelected()) {
                    lblPotencia.setVisible(false);
                    lblVelocidadMaxima.setVisible(false);
                    txtPotencia.setVisible(false);
                    jCBVelocidadMaxima.setVisible(false);
                    lblOcupantes.setVisible(true);
                    jSpinnerOcupantes.setVisible(true);
                    lblDisponibilidad.setVisible(true);
                    rbtnSi.setVisible(true);
                    rbtnNo.setVisible(true);
                } else {
                    lblOcupantes.setVisible(false);
                    jSpinnerOcupantes.setVisible(false);
                    lblDisponibilidad.setVisible(false);
                    rbtnSi.setVisible(false);
                    rbtnNo.setVisible(false);
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
    private javax.swing.ButtonGroup SiNo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> jCBColores;
    private javax.swing.JComboBox<String> jCBMarcas;
    private javax.swing.JComboBox<String> jCBVelocidadMaxima;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerOcupantes;
    private javax.swing.JLabel lblColores;
    private javax.swing.JLabel lblDisponibilidad;
    private javax.swing.JLabel lblMarcas;
    private javax.swing.JLabel lblNumeroPlaca;
    private javax.swing.JLabel lblOcupantes;
    private javax.swing.JLabel lblPotencia;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblVelocidadMaxima;
    private javax.swing.JRadioButton rbtnAutomovil;
    private javax.swing.JRadioButton rbtnNo;
    private javax.swing.JRadioButton rbtnSVU;
    private javax.swing.JRadioButton rbtnSi;
    private javax.swing.JTextField txtNumeroPlaca;
    private javax.swing.JTextField txtPotencia;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
