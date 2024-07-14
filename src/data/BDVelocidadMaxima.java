/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class BDVelocidadMaxima {
    public ArrayList<String> CargarDatosEnJCBVelocidadMaxima(String Velocidades) {
        ArrayList<String> velocidadess = new ArrayList();
        try (BufferedReader leedor = new BufferedReader(new FileReader(Velocidades))) {
            String linea;
            while ((linea = leedor.readLine()) != null) {
                velocidadess.add(linea);
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Un error en el archivo ha ocurrido.");
        }
        return velocidadess;
    }
}
