/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juanc
 */
public class EntregarTarea {
    private Integer idEntrega;
    private String fechaEntrega;
    private String estadoEntrega;
    private Boolean archivoAdjunto;
    private Double calificacion;

    public EntregarTarea() {
    }

    public EntregarTarea(Integer idEntrega, String fechaEntrega, String estadoEntrega, Boolean archivoAdjunto, Double calificacion) {
        this.idEntrega = idEntrega;
        this.fechaEntrega = fechaEntrega;
        this.estadoEntrega = estadoEntrega;
        this.archivoAdjunto = archivoAdjunto;
        this.calificacion = calificacion;
    }

    public Integer getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(Integer idEntrega) {
        this.idEntrega = idEntrega;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(String estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }

    public Boolean getArchivoAdjunto() {
        return archivoAdjunto;
    }

    public void setArchivoAdjunto(Boolean archivoAdjunto) {
        this.archivoAdjunto = archivoAdjunto;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }
    
    
}
