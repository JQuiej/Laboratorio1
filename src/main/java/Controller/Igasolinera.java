/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quiej
 */
public interface Igasolinera {
    public boolean ingresarInventario(String tipo, int cantidad);
    public boolean venta(String tipo, int cantidad);
    public void Informe(DefaultTableModel modelo);
}
