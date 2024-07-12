/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.*;

public class BDVehicles {

    public void InsertarEnArchivoVehiculo() {
        try {
            File archivo = new File("ListaMarcaVehiculos.txt");
            BufferedWriter archi = new BufferedWriter(new FileWriter(archivo, true));
        } catch (Exception e) {
            
        }
    }
}
