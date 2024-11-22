/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Tiririn
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private String cedula;
    private String rol;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String cedula, String rol, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.rol = rol;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    @Override
    public String toString() {
        return "Empleado(" + "nombre=" + nombre + 
                "apellido=" + apellido + 
                ", cedula=" + cedula + 
                ", rol=" + rol + 
                ", salario=" + salario + ')';
    }
    public double calcularBono() {
        double porcentajeBono;
        switch (rol.toLowerCase()) {
            case "gerente":
                porcentajeBono = 0.20; 
                break;
            case "supervisor":
                porcentajeBono = 0.15; 
                break;
            case "empleado":
                porcentajeBono = 0.10; 
                break;
            default:
                porcentajeBono = 0.05;
        }

        return salario * porcentajeBono;
    }
}
