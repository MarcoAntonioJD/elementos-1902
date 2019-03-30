/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;
import org.springframework.data.annotation.Id;

/**
 *
 * @author T-107
 */
public class Cliente {
    
    @Id
    private Integer id;
    private String nombre;
    private float sueldoBase;
    private Targeta targeta;

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase + ", targeta=" + targeta + '}';
    }
       
    public Cliente() {
    }
     
    public Cliente(Integer id, String nombre, float sueldoBase) {
        this.id = id;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public Targeta getTargeta() {
        return targeta;
    }

    public void setTargeta(Targeta targeta) {
        this.targeta = targeta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
                
}
