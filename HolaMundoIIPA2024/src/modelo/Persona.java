/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Persona {
    //1.-DECLARAR LOS ATRIBUTOS DE TIPO PRIVADOS
    private String nombre;
    private String apellido;
    private String cedula;
    private String signo;
    private Date fechaNacimiento;
    
    //2.-MÉTODO CONSTRUCTOR

    public Persona() {
    }

    public Persona(String nombre, String apellido, String cedula, String signo, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.signo = signo;
        this.fechaNacimiento = fechaNacimiento;
    }

   //3.-MÉTODOS DE ENCAPSULAMIENTO

    //MÉTODO DE RETORNO-> DEVUELVE CADENA
    public String getSigno() {
        //RETURN -> ALMACENA EN MEMORIA RAM ESTE RESULTADO
        return signo;
    }
    //MÉTODO DE NO RETORNO ->NO ALMACENA INFORMACIÓN
    public void setSigno(String signo) {
        //THIS-> ES UN PUNTERO QUE HACE REFERENCIA A LA CLASE
        //EN LA QUE ESTAMOS TRABAJANDO Y ACCEDE DIRECTAMENTE
        //A ATRIBUTOS O MÉTODOS
        
        this.signo = signo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
    
    
    //4.-MÉTODO DE REGLA DE NEGOCIO
    public String determinarHoroscopo(){
        //compara 2 cadenas y devuelve un entero 0 si es igual, !=0 si no es igual
           if(signo.compareTo("Aries")==0){
               return "¡Eres de Aires! Gobernado por Marte, planeta relacionado con el dios romano de la guerra, este signo de fuego enciende nuevos comienzos";
           }//ignora las mayúsculas o minúsculas de una cadena
           else if (signo.compareToIgnoreCase("Tauro")==0) {
            return "Reinadas por Venus, cuerpo celeste asociado a la divinidad del amor y la belleza, las personas de este signo conectado con la tierra, son manifestadoras de belleza y abundancia";
        }//compara 2 cadenas y devuelve un booleano true si es igual, false si no es igual
           else if (signo.equals("Géminis")==true) {
            return "Regido por Mercurio, astro vinculado al mensajero de los dioses, este signo intelectual se distingue por sus dones comunicativos.";
        }else if (signo.equals("Cáncer")) {
            return "Influenciado por la luna, este signo de agua hace a personas sumamente emocionales que nutren y se nutren del hogar y la familia. ";
        }else if (signo=="Leo") {
            return "Regido por el astro rey, este signo de fuego hace a los leoninos brillar con su esencia creativa e iluminar al prójimo, inspirándolo a rugir a su lado. ";
        }else if (signo=="Virgo") {
            return "Reinado por Mercurio, el mismo provee el don de bajar ideas a tierra. No por nada, la agenda y la rutina son mejores amigas de los virginianos, que a pesar de esto, no prescinden de la flexibilidad y son sumamente analíticos. ";
        }else if (signo=="Libra") {
            return "Gobernados por Venus, los librianos son conocidos por entrar en simbiosis con la estética y por formar alianzas y parejas.";
        }else if (signo=="Escorpio") {
            return "Regido por Plutón, astro asociado a la deidad del inframundo, este signo de agua hace a personas intuitivas y esotéricas. ";
        }else if (signo=="Sagitario") {
            return "Gobernado por Júpiter, planeta del padre de los dioses, las personas de este signo fogoso son inspiradoras y grandes maestras. ";
        }else if (signo=="Capricornio") {
            return "Al compás de Saturno, planeta anillado y dios guardián del tiempo, este signo terrenal caracteriza a personas trabajadoras, estructuradas y disciplinadas que aspiran al éxito y en muchos casos cargan con el deber ser. ";
        }else if (signo=="Acuario") {
            return "Influenciado por Urano, astro de la deidad del cielo, este signo de aire eleva la intelectualidad. ";
        }else if (signo=="Piscis") {
            return "Regido por Neptuno, planeta azul asociado al dios del mar, este signo de agua hace a personas sensibles, intuitivas y altruistas, que diluyen barreras y llevan todo lo que hacen más allá con su extraordinaria imaginación. ";
        }
        return "No existe coincidencia";
    }

    //ETAPA DE DESARROLLO 
     
    public void etapaDesarrollo(int edad){
        String resultado="";
        if(edad>=0 && edad<=5){
            resultado="Primera infancia";
        }else if (edad>=6 && edad<=11) {
            resultado= "Infancia";
        }else if (edad>=12 && edad<=18) {
             resultado= "Adolescencia";
        }else if (edad>=14 && edad<=26) {
            resultado= "Juventud";
        }else if(edad>=19 && edad<40){
             resultado= "Adultez Temprana";
        }else if (edad>=40 && edad<60) {
            resultado= "Adultez Media";
        }else if (edad>60) {
            resultado= "Adultez Mayor";
        }
        System.out.println("Tu etapa de desarrollo es: "+resultado);
    
    
    }

    @Override
    public String toString() {
            return "DATOS DEL COCHE\n"+
            "Nombre:"+getNombre()+"\n"+      
            "Aapellido:"+getApellido()+"\n"+      
            "Cedula:"+getCedula()+"\n"+      
            "Signo:"+getSigno()+"\n"+      
            "FechaNacimiento:"+getFechaNacimiento();    
    }
    
    
}
