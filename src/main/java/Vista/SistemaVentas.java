
package Vista;

import Controller.GasolineraController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



/**
 *
 * @author Quiej
 */
public class SistemaVentas extends javax.swing.JFrame implements ActionListener {

     public SistemaVentas() {
         btIngresarInve.addActionListener((ActionListener) this);
         btVender.addActionListener((ActionListener)this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProgresDiesel = new javax.swing.JProgressBar();
        ProgresSuper = new javax.swing.JProgressBar();
        ProgresRegular = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Ddiesel = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        Dregular = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Dsuper = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btIngresarInve = new javax.swing.JButton();
        btVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(ProgresDiesel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 162, 57));
        getContentPane().add(ProgresSuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 162, 57));
        getContentPane().add(ProgresRegular, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 162, 57));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Diesel");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Super  ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Regular");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, 30));
        getContentPane().add(Ddiesel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 100, 30));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 290, 30));
        getContentPane().add(Dregular, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Inventario de Gasolina");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 30));
        getContentPane().add(Dsuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 100, 30));
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 290, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Informe de Ventas");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Tipo de Gasolina");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 30));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 810, 360));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Ventas");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, 20));

        btIngresarInve.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btIngresarInve.setText("Ingresar Inventario");
        getContentPane().add(btIngresarInve, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 220, 50));

        btVender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btVender.setText("Vender");
        getContentPane().add(btVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 120, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ddiesel;
    private javax.swing.JTextField Dregular;
    private javax.swing.JTextField Dsuper;
    private javax.swing.JProgressBar ProgresDiesel;
    private javax.swing.JProgressBar ProgresRegular;
    private javax.swing.JProgressBar ProgresSuper;
    private javax.swing.JTable Table;
    private javax.swing.JButton btIngresarInve;
    private javax.swing.JButton btVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btIngresarInve){
         GasolineraController controlador = new GasolineraController();
         //controlador.setTipo(txtTipo.getText());
         //controlador.setCantidad(txtCantidad.getText());
        }else {
            JOptionPane.showMessageDialog(null, "Paciente Ingresado Correctamente" + e);
        }
    }
}
