/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import data.BDSUV;
import java.util.ArrayList;
import objects.objCarroSUV;

/**
 *
 * @author Admin
 */
public class SVU {

    BDSUV bdsuv = new BDSUV();

    public void InsertarSVU(ArrayList<objCarroSUV> listaAutomovil) {
        String datos = "";
        for (int i = 0; i <= listaAutomovil.size() - 1; i++) {
            String marcaSeleccionada = listaAutomovil.get(i).getMarca();
            String colorSeleccionada = listaAutomovil.get(i).getColor();
            String precio = listaAutomovil.get(i).getPrecio();
            String placa = listaAutomovil.get(i).getPlaca();
            int ocupantes = listaAutomovil.get(i).getOcupantes();
            String VelocidadMaxima = listaAutomovil.get(i).getDisponibilidad();

            datos = marcaSeleccionada + "," + colorSeleccionada + "," + precio + "," + placa + "," + ocupantes + "," + VelocidadMaxima;
        }

        bdsuv.InsertarEnArchivo(datos);
    }

}
