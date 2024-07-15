/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import objects.objAutomovil;
import objects.objCarroSUV;

public class BDArchivos {

    private static ArrayList<objCarroSUV> listaCarrosSUV91 = new ArrayList<>();
    private static ArrayList<objAutomovil> listaAutomovil91 = new ArrayList<>();

    public ArrayList<String> CargarDatosEnJCBVehiculos(String ListaMarcaVehiculos) {
        ArrayList<String> vehiculos = new ArrayList();
        try (BufferedReader leedor = new BufferedReader(new FileReader(ListaMarcaVehiculos))) {
            String linea;
            while ((linea = leedor.readLine()) != null) {
                vehiculos.add(linea);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Un error en el archivo ha ocurrido.", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
        return vehiculos;
    }
    
    public void cargarListaCarrosAutomovil(String ListaCarrosAutomoviltxt) {
        try (BufferedReader br = new BufferedReader(new FileReader(ListaCarrosAutomoviltxt))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String [] partes = linea.split(",");
                String marca = partes[0];
                String color = partes[1];
                String precio = partes[2];
                String placa = partes[3];
                String potencia = partes[4];
                String velocidadMaxima = partes[5];
                
                objAutomovil automovil = new objAutomovil(marca, color, precio, placa, potencia, velocidadMaxima);
                listaAutomovil91.add(automovil);
            }
        } catch (Exception e) {
            
        }
    }
    
    public void cargarListaCarrosSUV(String ListaCarrosSUVtxt) {
        try (BufferedReader br = new BufferedReader(new FileReader(ListaCarrosSUVtxt))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String marca = partes[0];
                String color = partes[1];
                String precio = partes[2];
                String placa = partes[3];
                int ocupantes = Integer.parseInt(partes[4]);
                String disponibilidad = partes[5];
                objCarroSUV carroSUV = new objCarroSUV(marca, color, precio, placa, ocupantes, disponibilidad);
                listaCarrosSUV91.add(carroSUV);
            }
        } catch (Exception e) {
            
        }
    }

    
    public void guardarListaCarrosSUV(String ListaCarrosSUVtxt) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(ListaCarrosSUVtxt))) {
        for (objCarroSUV suv : listaCarrosSUV91) {
            bw.write(String.format("%s,%s,%s,%s,%d,%s\n", suv.getMarca(), suv.getColor(),
                    suv.getPrecio(), suv.getPlaca(), suv.getOcupantes(), suv.getDisponibilidad()));
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar la lista de carros SUV", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void guardarListaAutomovil(String ListaAutomoviltxt) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(ListaAutomoviltxt))) {
        for (objAutomovil automovil : listaAutomovil91) {
            bw.write(String.format("%s,%s,%s,%s,%s,%s\n", automovil.getMarca(), automovil.getColor(),
                    automovil.getPrecio(), automovil.getPlaca(), automovil.getPotencia(), automovil.getVelocidadMaxima()));
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar la lista de automóviles", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
}