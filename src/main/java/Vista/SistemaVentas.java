
package Vista;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Gasolina;


/**
 *
 * @author Quiej
 */
public class SistemaVentas extends javax.swing.JFrame implements ActionListener {
        
        
     public SistemaVentas() {
         initComponents();
         btIngresarInve.addActionListener((ActionListener) this);
         btVender.addActionListener((ActionListener)this);
         ProgresDiesel.setMaximum(10000);
         ProgresRegular.setMaximum(10000);
         ProgresSuper.setMaximum(10000);
         TablaAc();
    }
            Gasolina gasolina = new Gasolina();
            DefaultTableModel model = new DefaultTableModel();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btIngresarInve = new javax.swing.JButton();
        btVender = new javax.swing.JButton();
        ComTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProgresDiesel.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(ProgresDiesel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 162, 57));

        ProgresSuper.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(ProgresSuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 162, 57));

        ProgresRegular.setForeground(new java.awt.Color(0, 255, 51));
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

        Ddiesel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(Ddiesel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 100, 30));

        txtCantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 290, 30));

        Dregular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(Dregular, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Inventario de Gasolina");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 30));

        Dsuper.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(Dsuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 100, 30));

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

        ComTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Super", "Regular", "Diesel" }));
        getContentPane().add(ComTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 160, 30));

        jLabel2.setText("El maximo de Galones por Inventario es de 10,000");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComTipo;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btIngresarInve){
            gasolina.agregarDiesel(Integer.parseInt(Ddiesel.getText()));
            gasolina.agregarRegular(Integer.parseInt(Dregular.getText()));
            gasolina.agregarSuper(Integer.parseInt(Dsuper.getText()));
            Ddiesel.setEnabled(false);
            Dsuper.setEnabled(false);
            Dregular.setEnabled(false);
            btIngresarInve.setEnabled(false);
            ProgresRegular.setValue(gasolina.getRegular());
            ProgresSuper.setValue(gasolina.getSuper());
            ProgresDiesel.setValue(gasolina.getDiesel());
        }
        if (e.getSource() == btVender){
            if (ComTipo.getSelectedItem().toString().equals("Regular")){
                gasolina.venderRegular(Integer.parseInt(txtCantidad.getText()));
                Dregular.setText(String.valueOf(gasolina.getRegular()));
                ProgresRegular.setValue(gasolina.getRegular());
                gasolina.guardarReporte("Regular", Integer.parseInt(txtCantidad.getText()));
            }if(ComTipo.getSelectedItem().toString().equals("Super")){
                gasolina.venderSuper(Integer.parseInt(txtCantidad.getText()));
                Dsuper.setText(String.valueOf(gasolina.getSuper()));
                ProgresSuper.setValue(gasolina.getSuper());
                gasolina.guardarReporte("Super", Integer.parseInt(txtCantidad.getText()));
            }if(ComTipo.getSelectedItem().toString().equals("Diesel")){
                gasolina.venderDiesel(Integer.parseInt(txtCantidad.getText()));
                Ddiesel.setText(String.valueOf(gasolina.getDiesel()));
                ProgresDiesel.setValue(gasolina.getDiesel());
                gasolina.guardarReporte("Diesel", Integer.parseInt(txtCantidad.getText()));
            }
            TablaAc();
        }
    }
    
    public void TablaAc(){
        DefaultTableModel model = new DefaultTableModel();
        gasolina.Tabla(model);
        Table.setModel(model);
    }
}
