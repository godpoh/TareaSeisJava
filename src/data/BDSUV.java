/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class BDSUV {

    public void InsertarEnArchivo(String datosUsuario) {
        try {
            File archivo = new File("ListaCarrosSuv.txt");
            BufferedWriter archi = new BufferedWriter(new FileWriter(archivo, true));
            archi.write(datosUsuario + "\n");
            archi.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo",
                    "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
