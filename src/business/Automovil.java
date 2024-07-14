/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import data.BDAutomovil;
import java.util.ArrayList;
import objects.objAutomovil;

/**
 *
 * @author Admin
 */
public class Automovil {

    BDAutomovil bdautomovil = new BDAutomovil();

    public void InsertarAutomovil(ArrayList<objAutomovil> listaAutomovil) {
        String datos = "";
        for (int i = 0; i <= listaAutomovil.size() - 1; i++) {
            String marcaSeleccionada = listaAutomovil.get(i).getMarca();
            String colorSeleccionada = listaAutomovil.get(i).getColor();
            String precio = listaAutomovil.get(i).getPrecio();
            String placa = listaAutomovil.get(i).getPlaca();
            String potencia = listaAutomovil.get(i).getPotencia();
            String VelocidadMaxima = listaAutomovil.get(i).getVelocidadMaxima();

            datos = marcaSeleccionada + "," + colorSeleccionada + "," + precio + "," + placa + "," + potencia + "," + VelocidadMaxima;
        }

        bdautomovil.InsertarEnArchivo(datos);
    }

}
