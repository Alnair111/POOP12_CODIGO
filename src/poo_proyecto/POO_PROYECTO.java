/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_proyecto;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static poo_proyecto.Generador_Alumno.Generador_Alumno;
import static poo_proyecto.Generador_Alumno.direccion;
import static poo_proyecto.Generador_Alumno.imprimirTxt;
import static poo_proyecto.Generador_Alumno.listaAlumnos;
/**
 *
 * @author Juarez Terrazas Al Nair
 *         Cano Ortiz Tani Itzel
 * Clase principal en donde se van a mandar
 * a llamar a las demas clases
 */
public class POO_PROYECTO {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("    ****BIENVENIDO A LA GESTIÓN ESCOLAR****");
        ArrayList<Alumno> arregloAlumnos= new ArrayList<>();
        Crud_Alumnos gestion = new Crud_Alumnos();
        Scanner leer=new Scanner(System.in);
        int opcion =0;
        do{  
            System.out.println("\n"+"       MENU");
            System.out.println("\nSelecciona la opcion que quieres realizar.\n");        
            System.out.println("1. Crear lista de 500 Alumnos con sus datos");
            System.out.println("2. Ver lista de los 500 Alumnos");
            System.out.println("3. Ver Direcciones de los 500 Alumnos");
            System.out.println("4. Modificar datos de un alumno");
            System.out.println("5. Crear Archivo con los datos generados");
            System.out.println("6. Salir del programa");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("\nGENERAR ALUMNOS");
                    globalVar.indice=0;
                    listaAlumnos.clear();
                    arregloAlumnos = Generador_Alumno();
                    break;     
                case 2:

                    System.out.println("\nLISTA DE LOS ALUMNOS REGISTRADOS\n"+arregloAlumnos);
                    break;

                case 3:
                    System.out.println("\nDIRECCIONES DE LOS 500 ALUMNOS\n");
                    direccion();

                    break;
                case 4:
                    System.out.println("\n  LISTA DE ALUMNOS\n");
                    System.out.println(listaAlumnos); 
                    System.out.println("\n  BUSCAR ALUMNO");
                    System.out.println("\nEscribe el id del alumno que deseas modificar: ");
                    int id=leer.nextInt();  
                    Crud_Alumnos.modificarAlumno(arregloAlumnos,id);
                    //System.out.println(Crud_Alumnos.modificarAlumno(arregloAlumnos,id));
                    break;
                case 5:
                    imprimirTxt();
                    String nombreDeArchivo = "./DatosAlumnos.csv";
                    String delim=",";
                    String NEXT_LINE = "\n";
                    try {
                        FileWriter fw = new FileWriter(nombreDeArchivo);
                        fw.append("Id,Nombre,Apellido 1,Apellido 2,Numero de Cuenta,Edad,Promedio,Semestre,Materias\n");
                        for (int i = 0; i <arregloAlumnos.size() ; i++) {
                            fw.append(String.valueOf(i+1)+",");
                            fw.append(arregloAlumnos.get(i).nombre+",");
                            fw.append(arregloAlumnos.get(i).apellido+",");
                            fw.append(arregloAlumnos.get(i).apellido2+",");
                            fw.append(arregloAlumnos.get(i).numCuenta+",");
                            fw.append(arregloAlumnos.get(i).edad+",");
                            fw.append(arregloAlumnos.get(i).promedio+",");
                            fw.append(arregloAlumnos.get(i).semestre+",");
                            fw.append(arregloAlumnos.get(i).materias+",");
                            fw.append("\n");
                            
                        }
                        
                        fw.flush();
                        fw.close();
                    } catch (IOException e) {
                        // Error al crear el archivo, por ejemplo, el archivo
                        // está actualmente abierto.
                        e.printStackTrace();
                    }
                    System.out.println("    SE GUARDARON LOS DATOS EN LOS ARCHIVOS EXITOSAMENTE\n");
                    System.out.println("DatosAlumnos.csv\nDatos y Direcciones Alumnos.txt");
                    break;
                case 6:
                    System.out.println("\nSALIO DEL PROGRAMA");
                    break;
                default:
                    System.out.println("\n¡¡¡¡¡ERROR!!!!!"+"\n"+ "Teclea una opcion valida");
            }
        }
        while(opcion!=6);   
    } 
}

