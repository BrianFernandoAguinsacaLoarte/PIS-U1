/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juanc
 */
public class Tarea {
    private Integer idTarea;
    private String descripcion;
    private Double Calificacion;
    private String nombreMateria;
    private String fechaLimite;

    public Tarea() {
    }

    public Tarea(Integer idTarea, String descripcion, Double Calificacion, String nombreMateria, String fechaLimite) {
        this.idTarea = idTarea;
        this.descripcion = descripcion;
        this.Calificacion = Calificacion;
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

    public Double getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(Double Calificacion) {
        this.Calificacion = Calificacion;
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
