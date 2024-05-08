/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Medac
 */
public class Tarea {
    String tareas;
    int prioridad;
    boolean estado;
    String fechalim;
    
    public Tarea(String tareas, int prioridad, boolean estado, String fechalim){
        this.tareas = tareas;
        this.prioridad = prioridad;
        this.estado = estado;
        this.fechalim = fechalim;
    }

    public String getTareas() {
        return tareas;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getFechalim() {
        return fechalim;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setFechalim(String fechalim) {
        this.fechalim = fechalim;
    }

    @Override
    public String toString() {
        return "Tarea{" + "tareas=" + tareas + ", prioridad=" + prioridad + ", estado=" + estado + ", fechalim=" + fechalim + '}';
    }
    
    
}
