package Tienda;

import java.io.Serializable;

/**
 * Created by erick on 7/10/15.
 */
public class Ganancias implements Serializable{
    private int idEmple;
    private String nombre;
    private float saldo;

    public int getIdEmple() {

        return idEmple;
    }

    public void setIdEmple(int idEmple) {
        this.idEmple = idEmple;
    }
    
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
