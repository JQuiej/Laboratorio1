
package modelo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quiej
 */
public class Gasolina {
    private int Regular;
    private int Diesel;
    private int Super;
    
    public ArrayList<Reporte> reporte = new ArrayList();
    
    public int getRegular() {
        return Regular;
    }

    public void setRegular(int Regular) {
        this.Regular = Regular;
    }

    public int getDiesel() {
        return Diesel;
    }

    public void setDiesel(int Diesel) {
        this.Diesel = Diesel;
    }

    public int getSuper() {
        return Super;
    }

    public void setSuper(int Super) {
        this.Super = Super;
    }
    
    public void agregarDiesel(int cantidad){
        this.Diesel += cantidad;
    }
    
    public void agregarSuper(int cantidad){
        this.Super += cantidad;
    }
    public void agregarRegular(int cantidad){
        this.Regular += cantidad;
    }
    public void venderDiesel(int cantidad){
        this.Diesel -= cantidad; 
    }
    public void venderRegular(int cantidad){
        this.Regular -= cantidad;
    }
    public void venderSuper(int cantidad){
        this.Super -= cantidad;
    }
    public void guardarReporte(String Tipo, int cantidad){
        Reporte venta = new Reporte();
        venta.setTipo(Tipo);
        venta.setCantidad(cantidad);
        reporte.add(venta);
    }
    public void Tabla(DefaultTableModel model){
        model.addColumn("Tipo");
        model.addColumn("Cantidad");
        model.setRowCount(0);
        
        for (int i=0; i<reporte.size();i++){           
            Object[] fila={
              reporte.get(i).getTipo(),
              reporte.get(i).getCantidad() + " Galones"
            };
            model.addRow(fila);
        }
        
    }
}
