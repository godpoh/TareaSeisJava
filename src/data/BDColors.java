/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BDColors {

    public ArrayList<String> CargarDatosEnJCBColores(String ListaColores) {
        ArrayList<String> colores = new ArrayList();
        try (BufferedReader leedor = new BufferedReader(new FileReader(ListaColores))) {
            String linea;
            while ((linea = leedor.readLine()) != null) {
                colores.add(linea);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el archivo, no existente o algo con el archivo sucedio", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
        return colores;
    }
}
