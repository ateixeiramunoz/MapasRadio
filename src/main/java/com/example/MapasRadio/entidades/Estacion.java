package com.example.Mapasradio.entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Estacion {

    @Id
    private String codigoCentro;
    private String name;
    private double lat;
    private double lon;
    private String frecuenciaEmision;

    // Getters y setters
    public String getCodigoCentro() {
        return codigoCentro;
    }

    public void setCodigoCentro(String codigoCentro) {
        this.codigoCentro = codigoCentro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getFrecuenciaEmision() {
        return frecuenciaEmision;
    }

    public void setFrecuenciaEmision(String frecuenciaEmision) {
        this.frecuenciaEmision = frecuenciaEmision;
    }
}
