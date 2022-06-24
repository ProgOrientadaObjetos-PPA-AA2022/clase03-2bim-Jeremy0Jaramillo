/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    
    public ReporteEstudiante(String a, ArrayList<Estudiante> b){
        super(a);
        lista = b;
    }
    
    public void establecerLista(ArrayList<Estudiante> a){
        lista = a;
    }
    
    public void calcularPromedioMatriculas(){
        double suma = 0;
        for(int i = 0; i < lista.size(); i++){
            suma = suma + lista.get(i).getMatricula();
        }
        promedioMatriculas = suma/lista.size();
    }
    
    public ArrayList<Estudiante> obtenerListaEstudiantes (){
    return lista;
    }
    
    public double obtenerPromedioMatriculas(){
        return promedioMatriculas;
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
