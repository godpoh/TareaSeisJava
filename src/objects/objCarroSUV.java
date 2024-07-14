/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objects;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class objCarroSUV {

    private String marca;
    private String color;
    private String precio;
    private String placa;
    private int ocupantes;
    private String disponibilidad;

    public static ArrayList listaCarrosSUV = new ArrayList();

    public objCarroSUV(String marca, String color, String precio, String placa, int ocupantes, String disponibilidad) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.placa = placa;
        this.ocupantes = ocupantes;
        this.disponibilidad = disponibilidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(int ocupantes) {
        this.ocupantes = ocupantes;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
