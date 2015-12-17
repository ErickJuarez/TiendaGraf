package Tienda;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class GuardaEmple implements Serializable {

    ArrayList<Empleado> ListRecuperada = new ArrayList<Empleado>();

    ArrayList<Empleado> leer() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Empleado.dat"));

            ListRecuperada = (ArrayList<Empleado>) in.readObject();
            //System.out.println("Se ha Leido");
            
        } catch (Exception e) {
            //System.out.println("No se ha Leido");
            //System.out.println(e.getMessage());
        }
        return ListRecuperada;
    }

    void serializar(ArrayList<Empleado> ListaSeriar) {
        try {
            //System.out.println("Se ha Serializado");
            FileOutputStream out = new FileOutputStream("Empleado.dat");
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(ListaSeriar);
            objOut.close();
            out.close();
        } catch (Exception e) {
            //System.out.println("No se ha Serializado");
            //System.out.println(e.getMessage());
            //e.printStackTrace();
            //e.toString();
            //System.out.println(e);
        }

    }

}
