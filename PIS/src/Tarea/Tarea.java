/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

/**
 *
 * @author juanc
 */
public class Tarea {
    private Integer idTarea;
    private String descripcion;
    private Double Calificicacion;
    private String nombreMateria;
    private String fechaLimite;

    public Tarea() {
    }

    public Tarea(Integer idTarea, String descripcion, Double Calificicacion, String nombreMateria, String fechaLimite) {
        this.idTarea = idTarea;
        this.descripcion = descripcion;
        this.Calificicacion = Calificicacion;
        this.nombreMateria = nombreMateria;
        this.fechaLimite = fechaLimite;
    }

    public Integer getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(Integer idTarea) {
        this.idTarea = idTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getCalificicacion() {
        return Calificicacion;
    }

    public void setCalificicacion(Double Calificicacion) {
        this.Calificicacion = Calificicacion;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    
    
    
}
