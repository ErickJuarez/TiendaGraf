package Tienda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Erick
 */
public class Productos extends javax.swing.JFrame implements Serializable {

    ArrayList<Ganancias> lGanancias = new ArrayList<Ganancias>();
    static GuardaGanancias gGanas;

    ArrayList<Empleado> lEmpleado = new ArrayList<Empleado>();
    static GuardaEmple gEmple;
    
    ArrayList<Producto> lProducto = new ArrayList<Producto>();
    static GuardaProductos gProd;

    String nombre, puesto;
    int edad, id, codigo, j;

    public Productos(int i) {

        initComponents();

        gEmple = new GuardaEmple();
        lEmpleado = gEmple.leer();
        
        this.j=i;
        this.nombre = lEmpleado.get(i).getNombre();
        this.puesto = lEmpleado.get(i).getPuesto();
        this.edad = lEmpleado.get(i).getEdad();
        this.id = lEmpleado.get(i).getCodigo();

        txtID.setEditable(false);
        txtID.setText(String.valueOf(lEmpleado.get(i).getCodigo()));

        txtNombre.setEditable(false);
        txtNombre.setText(lEmpleado.get(i).getNombre());

        txtEdad.setEditable(false);
        txtEdad.setText(String.valueOf(lEmpleado.get(i).getEdad()));

        txtPuesto.setEditable(false);
        txtPuesto.setText(lEmpleado.get(i).getPuesto());

        txtArticulo.setEditable(false);
        txtPrecio.setEditable(false);
        txtCant.setEditable(false);

        btnVender.setEnabled(false);
        btnLimpiar.setEnabled(true);

        btnVender.addActionListener(botones);
        btnLimpiar.addActionListener(botones);
        btnVer.addActionListener(botones);
        btnSalir.addActionListener(botones);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Salir = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtPuesto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnVer = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtArticulo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        btnVender = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Información");

        jLabel2.setText("Nombre:");

        jLabel3.setText("ID: ");

        jLabel4.setText("Edad:");

        jLabel5.setText("Puesto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(txtNombre)
                    .addComponent(txtPuesto)
                    .addComponent(txtEdad))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        Salir.addTab("Empleado", jPanel1);

        jLabel6.setText("Codigo:");

        btnVer.setText("Ver");

        jLabel7.setText("Articulo:");

        jLabel8.setText("Precio:");

        jLabel9.setText("Cantidad Disponible:");

        btnVender.setText("Vender");

        btnLimpiar.setText("Limpiar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVender)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))))
                    .addComponent(jLabel8))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVer)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(txtCant))
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addComponent(txtArticulo))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVer)
                    .addComponent(btnLimpiar))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnVender)
                .addContainerGap())
        );

        Salir.addTab("Producto", jPanel2);

        btnSalir.setText("Salir");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(btnSalir)
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnSalir)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        Salir.addTab("Salir", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Salir)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Salir))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public ActionListener botones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            gProd = new GuardaProductos(); 
            gGanas = new GuardaGanancias();
            lGanancias = gGanas.leer();
            lProducto = gProd.leer();
            
            if (ae.getSource() == btnVer) {
                if (txtCodigo.getText() != null) {
                    int codigo = Integer.parseInt(txtCodigo.getText());
                    if (lProducto.size() != 0) {
                        for (int i = 0; i < lProducto.size(); i++) {
                            if (codigo == lProducto.get(i).getId()) {
                                txtCodigo.setEditable(false);
                                txtArticulo.setText(lProducto.get(i).getNombre());
                                txtPrecio.setText(String.valueOf(lProducto.get(i).getPrecio()));
                                txtCant.setText(String.valueOf(lProducto.get(i).getCantidad()));
                                if (lProducto.get(i).getCantidad() > 0) {
                                    btnVender.setEnabled(true);
                                }
                            }
                        }
                    }
                }
            } else if (ae.getSource() == btnVender) {
                int codigo = Integer.parseInt(txtCodigo.getText());
                if (lProducto.size() != 0) {
                    for (int i = 0; i < lProducto.size(); i++) {
                        if (codigo == lProducto.get(i).getId()) {
                            if (lProducto.get(i).getCantidad() > 0) {
                                Ingresos.actualizaDatos(id, lProducto.get(i).getPrecio(), nombre);
                                lProducto.get(i).setCantidad(lProducto.get(i).getCantidad()- 1);
                                txtCant.setText(String.valueOf(lProducto.get(i).getCantidad()));
                                lGanancias.get(j).setSaldo(lGanancias.get(j).getSaldo() + lProducto.get(i).getPrecio());
                                gGanas.serializar(lGanancias);
                                gProd.serializar(lProducto);
                                btnVer.setEnabled(false);
                                btnLimpiar.setEnabled(true);
                            } else {
                                btnVender.setEnabled(false);
                            }
                        }
                    }
                }
            } else if (ae.getSource() == btnLimpiar) {
                btnVer.setEnabled(true);
                btnVender.setEnabled(false);
                txtCodigo.setEditable(true);
                txtCodigo.setText(null);
                txtArticulo.setText(null);
                txtPrecio.setText(null);
                txtCant.setText(null);
            } else if (ae.getSource() == btnSalir) {
                gProd.serializar(lProducto);
                gGanas.serializar(lGanancias);
                dispose();
                new Main().setVisible(true);
            }
        }

    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Salir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtArticulo;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPuesto;
    // End of variables declaration//GEN-END:variables
}
