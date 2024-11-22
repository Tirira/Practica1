/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Tiririn
 */
public class Libro {
    private String titulo;
    private String autor;
    private boolean prestamoDevoluvion;

    public Libro() {
    }
    
    public Libro(String titulo, String autor, boolean prestamoDevoluvion) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestamoDevoluvion = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestamoDevoluvion() {
        return prestamoDevoluvion;
    }

    public void setPrestamoDevoluvion(boolean prestamoDevoluvion) {
        this.prestamoDevoluvion = prestamoDevoluvion;
    }

    public void prestamo(){
    if(!prestamoDevoluvion){
    prestamoDevoluvion= true;
        System.out.println("El libro"+"\n" + titulo+ "\n+Se ah realizado el prèstamo");
    }else{
        System.out.println("El libro"+"\n" + titulo+ "\nNo se ah realizado el prèstamo");

    }
            }
    
    public void devolucion(){
    if(prestamoDevoluvion){
    prestamoDevoluvion= false;
        System.out.println("El libro"+"\n" + titulo+ "\n Se ah devuelto con exito");
    }else{
        System.out.println("El libro"+"\n" + titulo+ "\n Aun esta en devoluciòn");

    }
            }
    @Override
    public String toString() {
            return "DATOS DEL LIBRO \n"+
            "Titulo:"+getTitulo()+"\n"+      
            "Autor:"+getAutor();
    }
    
}
