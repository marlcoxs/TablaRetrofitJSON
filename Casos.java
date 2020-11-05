/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author FP Mañana A
 */
class Casos {
    private String zona_basica_salud ;
    private String casos_confirmados_ultimos_14dias;

    @Override
    public String toString() {
        return "Zona: " + zona_basica_salud + ", Numero de casos confirmados los ultimos 14 dias: " + casos_confirmados_ultimos_14dias + "}\n";
    }

    public String getZona_basica_salud() {
        return zona_basica_salud;
    }

    public void setZona_basica_salud(String zona_basica_salud) {
        this.zona_basica_salud = zona_basica_salud;
    }

    public String getCasos_confirmados_ultimos_14dias() {
        return casos_confirmados_ultimos_14dias;
    }

    public void setCasos_confirmados_ultimos_14dias(String casos_confirmados_ultimos_14dias) {
        this.casos_confirmados_ultimos_14dias = casos_confirmados_ultimos_14dias;
    }

    public Casos(String zona_basica_salud, String casos_confirmados_ultimos_14dias) {
        this.zona_basica_salud = zona_basica_salud;
        this.casos_confirmados_ultimos_14dias = casos_confirmados_ultimos_14dias;
    }
}
