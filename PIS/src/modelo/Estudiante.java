/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario iTC
 */
public class Estudiante {
    
    //Atributos
    private Integer id;
    private String id_persona;
    private String id_matricula;
    private String id_entregarTarea;
    
    //Construcotr
    public Estudiante(Integer id, String id_persona, String id_matricula, String id_entregarTarea) {
        this.id = id;
        this.id_persona = id_persona;
        this.id_matricula = id_matricula;
        this.id_entregarTarea = id_entregarTarea;
    }
    
    //Getter and Setter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(String id_matricula) {
        this.id_matricula = id_matricula;
    }

    public String getId_entregarTarea() {
        return id_entregarTarea;
    }

    public void setId_entregarTarea(String id_entregarTarea) {
        this.id_entregarTarea = id_entregarTarea;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", id_persona=" + id_persona + ", id_matricula=" + id_matricula + ", id_entregarTarea=" + id_entregarTarea + '}';
    }
    
    
    
    
}
