/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Medac
 */
public class Persona {
    String nombre;
    String apellido;
    String dni;
    String edad;
    char sexo;
    boolean fumador;
    
    
    public Persona(String nombre, String apellido, String dni, String edad, boolean fumador, char sexo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.fumador = fumador;
        this.sexo = sexo;
        
        
       
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public boolean isFumador() {
        return fumador;
    }

    public void setFumador(boolean fumador) {
        this.fumador = fumador;
    }

    
    
    @Override
    public String toString() {
        String fuma;
        if (fumador = true){
                fuma = "Si";
        }
        else{
                fuma = "No ";
        }

        return "Nombre= " + nombre + ", apellido= " + apellido + ", dni= " + dni + ", edad= " + edad + ", fumador= " + fuma + ", Sexo= " + sexo  + '\n';
    }
    
}
