
package paquete05;

import java.util.ArrayList;
import java.util.Scanner;


public class EjecutaEstudiante {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();  //Hacemos un Arraylist para objetos Estudiante
        
        
        //Aquí tenemos todo el proceso do while que permitira al usuario añador estudiantes indefinidamente, claro hasta que lo desee  
        do {

            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial o "
                    + "Ingrese (2) para Estudiante Distancia");         //Se elige el tipo de estudiante

            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();


            //Se pide los datos que siempre va a obtener cualquier tipo de estudiante
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();

            if (tipoEstudiante == 1) {       //Proceso estudiante presencial


                EstudiantePresencial estudianteP = new EstudiantePresencial();      //Se declara el objeto EstudiantePresencial

                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();

                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);          //Se establecen los datos propios de la subclase
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);


                estudianteP.calcularMatricula();        //Se calcula la matricula presencial desde el metodo abstracto de la clase respectiva y con los datos que le acabamos de dar


                estudiantes.add(estudianteP);           //Se añade al arrayList el estudiantePresencial ya que es una instancia de la subclase que tiene como superclase a estudiante 
            } else {

                if (tipoEstudiante == 2) {
                    EstudianteDistancia estudianteD = new EstudianteDistancia();    //Se declara el objeto EstudianteDistancia

                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = entrada.nextDouble();

                    estudianteD.establecerNombresEstudiante(nombresEst);
                    estudianteD.establecerApellidoEstudiante(apellidosEst);
                    estudianteD.establecerIdentificacionEstudiante(identificacionEst);           //Se establecen los datos propios de la subclase
                    estudianteD.establecerEdadEstudiante(edadEst);
                    estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                    estudianteD.establecerCostoAsignatura(costoAsig);


                    estudianteD.calcularMatricula();    //Se calcula la matricula a distancia desde el metodo abstracto de la subclase y sus datos con los que estamos trabajando en este caso


                     estudiantes.add(estudianteD);  //Se añade la instancia de la subclase que hereda de estudiante

                } else {
                    System.out.println("Opción fuera de rango");

                }
            }

            entrada.nextLine();
            System.out.println("Desea ingresar más estudiante. Digite la "
                    + "letra S para continuar o digite la letra N para salir "
                    + "del proceso");


            continuar = entrada.nextLine();  //Se actualiza continuar

        } while (continuar.equals("S"));        //verificamos si debemos seguir en el ciclo
        
        
        
        

        for (int i = 0; i < estudiantes.size(); i++) {      //Imprimimos todos los estudiantes que añadimos sin importar de que tipo son y utilizando sus respectivos toString
            // 1.  
            estudiantes.get(i).calcularMatricula();
            
            System.out.printf("Datos Estudiante\n"
                        + "%s\n",                        
                  estudiantes.get(i));
            
        }
    }

}