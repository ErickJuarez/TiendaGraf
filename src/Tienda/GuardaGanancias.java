package Tienda;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class GuardaGanancias implements Serializable {

    ArrayList<Ganancias> ListRecuperada = new ArrayList<Ganancias>();

    ArrayList<Ganancias> leer() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Ganancias.dat"));

            ListRecuperada = (ArrayList<Ganancias>) in.readObject();
            //System.out.println("Se ha leido");
        } catch (Exception e) {
            //System.out.println("No se ha leido");
        }
        return ListRecuperada;
    }

    void serializar(ArrayList<Ganancias> ListaSeriar) {
        try {
            //System.out.println("Se ha Serializado");
            FileOutputStream out = new FileOutputStream("Ganancias.dat");
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(ListaSeriar);
            objOut.close();
        } catch (Exception e) {
            //System.out.println("No se ha Serializado");
        }

    }

}
