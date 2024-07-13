/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class BDColors {

    public void InsertarEnArchivoColores(String Colores) {
        try {
            File archivo = new File("ListaColores.txt");
            BufferedWriter archi = new BufferedWriter(new FileWriter(archivo,true));
            archi.write(Colores + "\n");
            archi.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo:", "Mensaje de error", JOptionPane.ERROR_MESSAGE );
        }
    }
}
