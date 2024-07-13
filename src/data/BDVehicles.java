/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDVehicles {

    public void InsertarEnArchivoVehiculo(String Vehiculo) {
        try {
            File archivo = new File("ListaMarcaVehiculos.txt");
            BufferedWriter archi = new BufferedWriter(new FileWriter(archivo, true));
            archi.write(Vehiculo + "\n");
            archi.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo", "Mensaje de error:", JOptionPane.ERROR_MESSAGE);
        }
    }
}
