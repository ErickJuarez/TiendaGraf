package Tienda;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class GuardaProductos implements Serializable {

    ArrayList<Producto> ListRecuperada = new ArrayList<Producto>();

    ArrayList<Producto> leer() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Producto.dat"));

            ListRecuperada = (ArrayList<Producto>) in.readObject();
            //System.out.println("Se ha leido");
        } catch (Exception e) {
            //System.out.println("No se ha leido");
            //e.printStackTrace();
        }
        return ListRecuperada;
    }

    void serializar(ArrayList<Producto> ListaSeriar) {
        try {
            //System.out.println("Se ha Serializado");
            FileOutputStream out = new FileOutputStream("Producto.dat");
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(ListaSeriar);
            objOut.close();
            out.close();
        } catch (Exception e) {
            //System.out.println("No se ha serializado");
            //System.out.println(e.getMessage());
            
        }

    }

}
