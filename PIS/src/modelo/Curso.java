/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juanc
 */
public class Curso {
    private Integer idCurso;
    private String nombreCurso;
    private String horario;
    private Integer idMalla;
    private Integer idMateria;
    
    public Curso() {
    }

    public Curso(Integer idCurso, String nombreCurso, String horario, Integer idMalla, Integer idMateria) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.horario = horario;
        this.idMalla = idMalla;
        this.idMateria = idMateria;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Integer getIdMalla() {
        return idMalla;
    }

    public void setIdMalla(Integer idMalla) {
        this.idMalla = idMalla;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

}
