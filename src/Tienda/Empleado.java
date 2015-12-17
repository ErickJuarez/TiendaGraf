package Tienda;

import java.io.Serializable;

/**
 * Created by erick on 7/10/15.
 */
public class Empleado implements Serializable{

    private int codigo, edad;
    private String nombre, puesto, contra;

    public void setContra(String contra){
        this.contra = contra;
    }
    
    public String getContra(){
        return contra;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}

