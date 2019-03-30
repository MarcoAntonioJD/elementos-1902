/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

/**
 *
 * @author T-107
 */
public class Targeta {
    
    private String nombre;
    private Integer nip;
    private float saldo;

    @Override
    public String toString() {
        return "Targeta{" + "nombre=" + nombre + ", nip=" + nip + ", saldo=" + saldo + '}';
    }
    
    public Targeta() {
    }

    public Targeta(String nombre, Integer nip, float saldo) {
        this.nombre = nombre;
        this.nip = nip;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNip() {
        return nip;
    }

    public void setNip(Integer nip) {
        this.nip = nip;
    }         
    
}
