/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class Main extends javax.swing.JFrame {

    Ingresos ingre = new Ingresos();
    Empleado emple = new Empleado();
    Producto pro = new Producto();

    ArrayList<Empleado> lEmpleado = new ArrayList<Empleado>();

    static GuardaEmple gEmple;
    static GuardaGanancias gGanas;
    static GuardaProductos gProd;

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        iniciar.addActionListener(botones);
        gEmple = new GuardaEmple();
        gProd = new GuardaProductos();
        gGanas = new GuardaGanancias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        iniciar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        iniciar.setText("Iniciar");

        jLabel3.setText("Inicio de Sesion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(iniciar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(iniciar)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ActionListener botones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            gEmple  = new GuardaEmple();
            if(!gEmple.leer().isEmpty()){
                lEmpleado  = gEmple.leer();
                
                if (ae.getSource() == iniciar) {
                    if ((txtUser.getText().equals(lEmpleado.get(0).getNombre())) && (txtPass.getText().equals(lEmpleado.get(0).getContra()))) {
                        new Productos(0).setVisible(true);
                        dispose();
                    } else if ((txtUser.getText().equals(lEmpleado.get(1).getNombre())) && (txtPass.getText().equals(lEmpleado.get(1).getContra()))) {
                        new Productos(1).setVisible(true);
                        dispose();
                    } else if ((txtUser.getText().equals("Admin")) && (txtPass.getText().equals("hola1234"))) {
                        new Admin().setVisible(true);
                        dispose();
                    }
                }
            }
        }

    };

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                if (gEmple.leer().isEmpty()) {
                    Ingresos.ingresarEmple("Rosa Roja", 20, 100, "Vendedor", "Rosa1");
                    Ingresos.ingresarEmple("Lorenzo Choya", 22, 200, "Vendedor", "Lore1");
                    gEmple.serializar(Ingresos.lEmpleados);
                }
                if (gProd.leer().isEmpty()) {
                    Ingresos.ingresarProd("Silla Ejecutiva", 999.00f, 501, 3);
                    Ingresos.ingresarProd("Mesa de Juntas", 1500.00f, 502, 2);
                    Ingresos.ingresarProd("Paquetes de Plumas", 83.00f, 503, 10);
                    Ingresos.ingresarProd("Paquete de Hojas Blancas", 96.30f, 504, 5);
                    Ingresos.ingresarProd("Paquete de Marca Textos", 58.69f, 505, 5);
                    gProd.serializar(Ingresos.lProducto);
                }
                if (gGanas.leer().isEmpty()) {
                    Ingresos.ingresarGanancias(100, 0, "Rosa Roja");
                    Ingresos.ingresarGanancias(200, 0, "Lorenzo Choya");
                    gGanas.serializar(Ingresos.lGanas);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
