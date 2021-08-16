/*
 *
 */
package poo_proyecto;
import java.util.ArrayList;
import java.util.Scanner;
import static poo_proyecto.Generador_Alumno.listaAlumnos;

/**
 *  Clase "Crud Alumnos", en donde 
 *  se modificaran los datos del alumno  
 *  seleccionado, buscado mediante su
 *  numero de inscripcion.
 * @author Alna
 */
public class Crud_Alumnos {
    
  public static void modificarAlumno(ArrayList<Alumno> arregloAlumnos,int id ) {
      int opcion=0;
      id-=1;
      Alumno unAlumno = new Alumno();
      unAlumno=listaAlumnos.get(id);
      try{
        do{
        System.out.println("\n  ***Datos del Alumno buscado.***");    
        System.out.println(unAlumno);    
        System.out.println("\n"+"       MENU - EDITAR ALUMNOS");
        System.out.println("\nSelecciona la opcion que quieres realizar.\n");
        System.out.println("1. Modificar Nombre ");
        System.out.println("2. Modificar Apellido 1");
        System.out.println("3. Modificar Apellido 2");
        System.out.println("4. Modificar Numero Cuenta");
        System.out.println("5. Modificar Edad");
        System.out.println("6. Modificar Semestre");
        System.out.println("7. Salir");
        Scanner leer=new Scanner(System.in);
        opcion=leer.nextInt();
        Scanner leer2=new Scanner(System.in);
        switch(opcion){
            case 1:
                String nuevoNombre;
                System.out.println("Escribe el nuevo nombre");
                nuevoNombre=leer2.nextLine();
                unAlumno.setNombre(nuevoNombre);
                listaAlumnos.set(id, unAlumno);
                System.out.println("\n  ¡Nombre modificado con exito!\n");
                break; 
            case 2:
                String nuevoApellido1;
                System.out.println("Escribe el nuevo primer Apellido: ");
                nuevoApellido1=leer2.nextLine();
                unAlumno.setApellido(nuevoApellido1);
                listaAlumnos.set(id, unAlumno);
                System.out.println("\n  ¡Primer apellido modificado con exito!\n");
                break;
            case 3:
                String nuevoApellido2;
                System.out.println("Escribe el nuevo segundo Apellido: ");
                nuevoApellido2=leer2.nextLine();
                unAlumno.setApellido2(nuevoApellido2);
                listaAlumnos.set(id, unAlumno);
                System.out.println("\n  ¡Segundo apellido modificado con exito!");
                break;
            case 4:
                String nuevoNumeroCuenta;
                System.out.println("Escribe el Nuevo Numero de Cuenta: ");
                nuevoNumeroCuenta=leer2.nextLine();
                unAlumno.setNumCuenta(nuevoNumeroCuenta);
                listaAlumnos.set(id, unAlumno);
                System.out.println("\n  ¡Numero de Cuenta modificado con exito!");
                break;   
            case 5:
                int nuevaEdad;
                try{
                    do {    
                        System.out.println("Escribe la nueva Edad: ");
                        nuevaEdad=leer2.nextInt();
                        if((nuevaEdad < 18)|| (nuevaEdad> 27)){
                            System.out.println("\n  *|ERROR|*\nEdad Fuera del rango permitido (18-27)\n");
                        }
                        else{
                            unAlumno.setEdad(nuevaEdad);
                            listaAlumnos.set(id, unAlumno);
                        }
                    }
                    while((nuevaEdad < 18)|| (nuevaEdad> 27));
                        System.out.println("\n  ¡Edad modificada con exito!");
                }catch(Exception e){
                    System.out.println("\n  *|ERROR|*\nTipo dato incorreto\n");
                }
                break;   
            case 6:
                try{
                        int nuevoSemestre;
                    do { 
                        System.out.println("Escribe el nuevo semestre: ");
                        nuevoSemestre=leer2.nextInt();
                        if((nuevoSemestre < 1)|| (nuevoSemestre> 10)){
                            System.out.println("\n  *|ERROR|*\nSemestre Fuera del rango permitido (1-10)\n");
                        }
                        else{
                            unAlumno.setSemestre(nuevoSemestre);
                            listaAlumnos.set(id, unAlumno);
                        }
                    }
                    while((nuevoSemestre < 1)|| (nuevoSemestre> 10));
                }catch(Exception e){
                    System.out.println("\n  *|ERROR|*\nTipo dato incorreto\n");
                }
                System.out.println("\n  ¡Semestre modificado con exito!");
                break; 
            case 7:
                System.out.println("\n  *DATOS ACTUALIZADOS CON EXITO*\n");
                break;
                default:
                    System.out.println("    *SELECCIONA UNA OPCION VALIDA*\n");
        }  
    }while(opcion!=7); 
            System.out.println("\n  *SALIO AL MENU PRINCIPAL*\n");     
        }
      catch(Exception e){
      System.out.println("\n  *|ERROR|*\nTipo dato incorreto\n");
            }   
  }
}
