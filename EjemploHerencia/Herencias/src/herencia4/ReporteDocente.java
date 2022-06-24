/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;
    
    public ReporteDocente(String a, ArrayList<Docente> b){
        super(a);
        lista = b;
    }
    
    public void establecerLista(ArrayList<Docente> a){
        lista = a;
    }
    
    public void calcularPromedioSueldos(){
        double suma = 0;
        for(int i = 0; i < lista.size(); i++){
            suma = suma + lista.get(i).getSueldo();
        }
        promedioSueldos = suma/lista.size();
    }
    
    public ArrayList<Docente> obtenerListaDocentes (){
    return lista;
    }
    
    public double obtenerPromedioSueldos(){
        return promedioSueldos;
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
