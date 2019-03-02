/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

/**
 *
 * @author Marco Antonio
 */
public class Localizacion {
    private double lat;
    private double lon;

    @Override
    public String toString() {
        return "Localizacion{" + "lat=" + lat + ", lon=" + lon + '}';
    }
 
    public Localizacion() {
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
    
}
