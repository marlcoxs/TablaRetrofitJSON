/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author FP Mañana A
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
    .baseUrl("http://datos.comunidad.madrid/")
    .addConverterFactory(GsonConverterFactory.create())
    .build();
    ServicioContaminacion service=retrofit.create(ServicioContaminacion.class);
    Call<Datos> datos=service.recuperarDatos();
    datos.enqueue(new Callback<Datos>() {
        @Override
        public void onResponse(Call<Datos> call, Response<Datos> rspns) {
               Datos d=rspns.body();
               System.out.println("Datos: "+d);
        }

        @Override
        public void onFailure(Call<Datos> call, Throwable thrwbl) {
            System.out.println("Hubo un problema: "+thrwbl.getMessage());
        }
    });
    
    }

    
    }

