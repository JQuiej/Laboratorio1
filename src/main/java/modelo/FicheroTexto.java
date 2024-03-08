
package modelo;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Quiej
 */
public class FicheroTexto {
    
    File fichero;
    
    public void crearFiichero(){
        fichero = new File("Datos.txt");
        
        if (fichero.exists()) {
        System.out.println("El archivo ya existe.");
        }else{
        try {
            if(fichero.createNewFile()){
                System.out.println("Archivo Creado");
            }else{
                System.out.println("Archivo No creado");
            }
        }catch(IOException exception){
            exception.printStackTrace(System.out);
        }
        }
    }

        public void Elimar(){

            if(fichero.delete()){
                System.out.println("Archivo eliminado");
            }else{
                System.out.println("Erro, Archivo No eliminado");
            }
    }
        public void IngresarDatos(ArrayList<Reporte> datos){
            try{
                
                FileWriter ingresar = new FileWriter(fichero, true);
                for(Reporte reporte : datos){
                 ingresar.write(reporte.toString() + "\n");   
                }
                ingresar.close();
                System.out.println("Dato ingresado con exito");
            }catch(IOException exception){
                exception.printStackTrace(System.out);
            }               
        }
        
        public ArrayList<Reporte> leerFichero(String fichero) {
            ArrayList<Reporte> listaReporte = new ArrayList<>();

            try {
            FileReader lector = new FileReader(fichero);
            BufferedReader lectura = new BufferedReader(lector);
            String linea;

            while ((linea = lectura.readLine()) != null) {
            String[] partes = linea.split(", ");
            String tipo = partes[0].trim();
            int cantidad = Integer.parseInt(partes[1].trim());

            Reporte reporte = new Reporte();
            reporte.setTipo(tipo);
            reporte.setCantidad(cantidad);

            listaReporte.add(reporte);
            }

            lectura.close();
            System.out.println("Datos leídos con éxito.");
         } catch(IOException exception) {
        exception.printStackTrace(System.out);
    }

    return listaReporte;
}
}
