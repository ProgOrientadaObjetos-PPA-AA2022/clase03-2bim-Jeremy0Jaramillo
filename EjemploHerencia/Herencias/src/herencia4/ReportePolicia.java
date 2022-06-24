/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;
    
    public ReportePolicia(String a, ArrayList<Policia> b){
        super(a);
        lista = b;
    }
    
    public void establecerLista(ArrayList<Policia> a){
        lista = a;
    }
    
    public void calcularPromedioMatriculas(){
        double suma = 0;
        for(int i = 0; i < lista.size(); i++){
            suma = suma + lista.get(i).getEdad();
        }
        promedioEdades = suma/lista.size();
    }
    
    public ArrayList<Policia> obtenerListaEstudiantes (){
    return lista;
    }
    
    public double obtenerPromedioMatriculas(){
        return promedioEdades;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("");
        for(int i = 0; i < lista.size(); i++){
        cadena = String.format("%s%s\n",cadena,lista.get(i));
        }
        return cadena;
    }
}
