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
public class objAutomovil {
     private String marca;
    private String color;
    private String precio;
    private String placa;
    private String Potencia;
    private String VelocidadMaxima;
    
    public static ArrayList<objAutomovil> listaAutomoviles = new ArrayList();
    
    public objAutomovil(String marca, String color, String precio, String placa, String Potencia, String VelocidadMaxima) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.placa = placa;
        this.Potencia = Potencia;
        this.VelocidadMaxima = VelocidadMaxima;
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

    public String getPotencia() {
        return Potencia;
    }

    public void setPotencia(String Potencia) {
        this.Potencia = Potencia;
    }

    public String getVelocidadMaxima() {
        return VelocidadMaxima;
    }

    public void setVelocidadMaxima(String VelocidadMaxima) {
        this.VelocidadMaxima = VelocidadMaxima;
    }

}
