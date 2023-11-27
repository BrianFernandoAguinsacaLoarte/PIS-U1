/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juanc
 */
public class Malla {
    private Integer idMalla;
    private String nombreMalla;
    private Integer anioInicio;

    public Malla() {
    }

    public Malla(Integer idMalla, String nombreMalla, Integer anioInicio) {
        this.idMalla = idMalla;
        this.nombreMalla = nombreMalla;
        this.anioInicio = anioInicio;
    }

    public Integer getIdMalla() {
        return idMalla;
    }

    public void setIdMalla(Integer idMalla) {
        this.idMalla = idMalla;
    }

    public String getNombreMalla() {
        return nombreMalla;
    }

    public void setNombreMalla(String nombreMalla) {
        this.nombreMalla = nombreMalla;
    }

    public Integer getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(Integer anioInicio) {
        this.anioInicio = anioInicio;
    }
    
    
}
