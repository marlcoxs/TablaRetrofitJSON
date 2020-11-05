/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.List;

/**
 *
 * @author FP Mañana A
 */
class Datos {
    private List<Casos> data;

    @Override
    public String toString() {
        return "Datos{" + "data=" + data + '}';
    }

    public List<Casos> getData() {
        return data;
    }

    public void setData(List<Casos> data) {
        this.data = data;
    }

    public Datos(List<Casos> data) {
        this.data = data;
    }
}
