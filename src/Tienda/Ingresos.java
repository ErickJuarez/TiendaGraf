/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import java.util.ArrayList;

/**
 *
 * @author Erick
 */
public class Ingresos {

    static Empleado empleado[] = new Empleado[5];
    static Producto producto[] = new Producto[8];
    static Ganancias ganancias[] = new Ganancias[5];

    static ArrayList<Producto> lProducto = new ArrayList<Producto>();
    static ArrayList<Empleado> lEmpleados = new ArrayList<Empleado>(); 
    static ArrayList<Ganancias> lGanas = new ArrayList<Ganancias>();
    
    static GuardaGanancias ganas;
    
    static int cuentaUsuarios = 0, cuentaProductos = 0, cuentaGanancias = 0;

    public static void actualizaDatos(int idEmple, float saldo, String nombre) {
        ganas=new GuardaGanancias();
        lGanas=ganas.leer();
        for (int i = 0; i < lGanas.size(); i++) {
            if (idEmple == lGanas.get(i).getIdEmple()) {
                lGanas.get(i).setSaldo(lGanas.get(i).getSaldo() + saldo);
            }
            System.out.println(lGanas.get(i).getIdEmple());
            System.out.println(lGanas.get(i).getNombre());
            System.out.println(lGanas.get(i).getSaldo());
        }
        
    }

    public static void ingresarGanancias(int idEmple, float saldo, String nombre) {
        Ganancias gan = new Ganancias();
        gan.setIdEmple(idEmple);
        gan.setSaldo(saldo);
        gan.setNombre(nombre);
        lGanas.add(gan);
        ganancias[cuentaGanancias] = gan;
        cuentaGanancias++;
    }

    public static void ingresarEmple(String nombre, int edad, int codigo, String puesto, String contra) {
        Empleado emp = new Empleado();
        emp.setNombre(nombre);
        emp.setEdad(edad);
        emp.setCodigo(codigo);
        emp.setPuesto(puesto);
        emp.setContra(contra);
        lEmpleados.add(emp);
        empleado[cuentaUsuarios] = emp;
        cuentaUsuarios++;
    }

    public static void ingresarProd(String nombre, float precio, int id, int cantidad) {
        Producto pro = new Producto();
        pro.setNombre(nombre);
        pro.setPrecio(precio);
        pro.setId(id);
        pro.setCantidad(cantidad);
        producto[cuentaProductos] = pro;
        lProducto.add(pro);
        cuentaProductos++;
    }
}
