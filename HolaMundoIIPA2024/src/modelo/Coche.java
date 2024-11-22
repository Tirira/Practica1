/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.NumberFormat;

/**
 *
 * @author Usuario
 */
public class Coche {

    //1.DECLARACIÓN DE ATRIBUTOS O VARIABLES GLOBALES
    private String placa;
    private String modelo;
    private String color;
    private double precio;
    //CONSUMIR UNA CLASE COMPUESTA/COMPLEJA
    //DECLARANDO EL OBJETO propietario de tipo PERSONA
    private Persona propietario;
    private int anio;
    private String tipoVehiculo;

    //2.CONSTRUCTOR//INICIALIZAR EL OBJETO
    //2.1.- Constructor Vacío: al inicializar el objeto el usuario
    // o programador pueda elegir solo ciertas características
    public Coche() {
    }
    //SOBRECARGA: 2 MÉTODOS PUEDEN TENER EL MISMO NOMBRE SIEMPRE Y CUANDO TENGAN DIFERENTE IMPLEMENTACIÓN
    //2.2.- Constructor Argumentos:Se inicializan los atributos que se declaren en el argumento
    //El contenido del argumento es una variable local

    public Coche(String placa, String modelo, String color,
            double precio, Persona propietario, int anio, String tipoVehiculo) {

        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.propietario = propietario;
        this.anio = anio;
        this.tipoVehiculo = tipoVehiculo;
    }
    //3.- ENCAPSULAMIENTO
    //get: obtener, leer o consultar un atributo
    public String getPlaca(){
        return placa;
    }
    
    
    //set:asignar, sobreescribir un valor del atributo
    public void setPlaca(String placa){
        this.placa=placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    //4.-MÉTODOS DE REGLA DE NEGOCIO
    
     //IMPRIMIR O TOSTRING->IMPRIMIR
    public void imprimir(){
        System.out.println("DATOS DEL COCHE\n"+
                "Placa:"+placa+"\n"+
                "Modelo:"+modelo+"\n"+
                "Color:"+getColor()+"\n"+
                "Precio:"+getPrecio()+"\n"+
                "Propietario:"+getPropietario().getSigno()+"\n"+
                "Año de Fabricación:"+getAnio()+"\n"+
                "Tipo de Vehículo:"+getTipoVehiculo());
    }

    @Override
    public String toString() {
        return "DATOS DEL COCHE\n"+
                "Placa:"+placa+"\n"+
                "Modelo:"+modelo+"\n"+
                "Color:"+getColor()+"\n"+
                "Precio:"+getPrecio()+"\n"+
                "Propietario:"+getPropietario().getSigno()+"\n"+
                "Año de Fabricación:"+getAnio()+"\n"+
                "Tipo de Vehículo:"+getTipoVehiculo();}
    
    
}
