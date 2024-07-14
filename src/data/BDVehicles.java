/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDVehicles {

    public ArrayList<String> CargarDatosEnJCBVehiculos(String ListaMarcaVehiculos) {
        ArrayList<String> vehiculos = new ArrayList();
        try (BufferedReader leedor = new BufferedReader(new FileReader(ListaMarcaVehiculos))) {
            String linea;
            while ((linea = leedor.readLine()) != null) {
                vehiculos.add(linea);
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Un error en el archivo ha ocurrido.");
        }
        return vehiculos;
    }
}
