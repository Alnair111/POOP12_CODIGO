/*
 * Clase "Generador_Alumno" 
 * Se crea un alumno con
 * atributos aleatorios
 */
package poo_proyecto;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author Alna
 */
//Variables Globales
class globalVar{
   static int indice=0;
   static int edadAleatoria;
   static int semestreAleatorio;
   static int num=0;
   static int numeroInscripcion=0;
    }

public class Generador_Alumno{ 
/**
 * Se crea una lista, en donde
 * se guardaran a todos los alumnos registrados
 */
    public static ArrayList<Alumno> listaAlumnos = new ArrayList<>(); 
    public static void agregarAlumno(Alumno unAlumno){
        listaAlumnos.add(unAlumno);
    }
  /**
 * Se crea una lista, en donde
 * se guardaran a todos los alumnos registrados
 * @return listaAlumnos 
 */
   public static ArrayList<Alumno>Generador_Alumno(){   
   int total=1;         
       while (total<=500){
            int indicadorEscolar[]=new int[500];
            for(int i=0;i<indicadorEscolar.length;i++){
                int f=(int)(Math.random()*99999+1);
                indicadorEscolar[i]= f;
             }
             ordenarIndicador(indicadorEscolar);
             for (int num : indicadorEscolar) { 
                total+=1;
                globalVar.indice+=1;
                //Funcion que genera los Atibutos Aleatorios
                alumnoAleatorio();
                System.out.println("Indicador Escolar: "+num);
                globalVar.numeroInscripcion+=1;
                System.out.println("Numero de Inscripcion: "+globalVar.numeroInscripcion);      
        }          
       }
       
     return listaAlumnos;     
   }
   
 /**
 * Se crea un alumno con sus respectivos atributos
 * 
 */ 
   public static void alumnoAleatorio(){
        String [] nombres_Estruc={"Alna","Tania","Raul","Cesar","Aide",
                        "Jose","Angel","Perla","Ximena","Itzel","Julio","Cesar",
                        "Juan","Carlos","Angelica","Luis","Miguel","Arat","Mauricio",
                        "Alfredo","Maria","Frida","Emma","Alejandra","Pamela","Ariadna",
                        "Karen","Paulina","Eva","Daniela","Michelle","Gabriela","Daniel",
                        "Leonardo","Rogelio","Pedro","Pablo","Karina","Vivian","Hugo",
                        "Victor","Irving","Francisco","Pablo","Jair","Diana","Eduardo",
                        "Ricardo","Francisco","Julia" };
        String[] apellido_Estruc={"Juarez","Cano","Ortiz","Hernandez","Aguilar",
                        "Cervantes","Robledo","Téllez","Estrada","Escobar",
                        "Mancilla","Ramirez","Jimenez","Ledezma","Olmedo",
                        "Carbajal","Acevedo","Elizalde","Angulo","Espinoza",
                        "Frías","Quintana","Morales","Moreno","Rosas","Perez",
                        "Terrazas","Reyes","Carrillo","Morales",
                        "Escalona","Arroyo","Gasca","Valtierra","Mejia",
                        "Ramos","Vertíz","Cruz","Apango","Vargas",
                        "Tapia","Barbosa","Pacheco","Silva","Mascareño",
                        "Vanegas","Ocasio","Coria","Santos","Pineda"};   
        int a = (int)(Math.random()*49+1);
        int b = (int)(Math.random()*49+1);
        int c = (int)(Math.random()*49+1); 
        //Se crea un alumno recibiendo sus atributos aleatorios
        Alumno nuevoAlumno = new Alumno 
                            (globalVar.indice,nombres_Estruc[a], apellido_Estruc[b],
                            apellido_Estruc[c],generaCuenta(),edad_Aleatoria(),
                            promedios(),semestre_Aleatorio(),materias());
        System.out.println(nuevoAlumno);
        //Se agrega un alumno a la "listaAlumnos"
        agregarAlumno(nuevoAlumno);   
    }
 /**
 * Funcion que genera el numero de cuenta
 * 
 * @return cuenta
 * Regresa 9 Numeros Aleatorios de un arreglo
 */ 
    public static String generaCuenta(){
        ArrayList arreglo= new ArrayList();
        String cuenta="";
           for (int i = 0; i < 9; i++) {
                int e = (int)(Math.random()*8+1);
                arreglo.add(e);
                   if (i==7){
                       arreglo.add("-");
                   }   
           }
           cuenta = String.valueOf(arreglo.get(0))+
                    String.valueOf(arreglo.get(1))+
                    String.valueOf(arreglo.get(2))+
                    String.valueOf(arreglo.get(3))+
                    String.valueOf(arreglo.get(4))+
                    String.valueOf(arreglo.get(5))+
                    String.valueOf(arreglo.get(6))+
                    String.valueOf(arreglo.get(7))+
                    String.valueOf(arreglo.get(8))+
                    String.valueOf(arreglo.get(9));     
        return cuenta;   
    }
 /**
 * Funcion que genera la edad
 * 
 * @return globalVar.edadAleatoria
 * Regresa edad en un rango de 18 a 27
 */ 
    public static int edad_Aleatoria(){
        globalVar.edadAleatoria = (int)(Math.random()*(27-18+1)+18);
        return globalVar.edadAleatoria;
    }
 /**
 * Funcion que genera el numero de semestre
 * 
 * @return globalVar.semestreAleatorio
 * Regresa edad en un rango de 18 a 27
 */ 
    public static int semestre_Aleatorio(){   
       if (globalVar.edadAleatoria==18){
           globalVar.semestreAleatorio = (int)(Math.random()*4-1+1)+1;       
       }
       else{
           globalVar.semestreAleatorio = (int)(Math.random()*10-1+1)+1;         
       }
       return globalVar.semestreAleatorio;
    }
/**
 * Funcion que genera las materias
 * del semestre que se está cursando
 * 
 *@return m
 * Regresa materias de un semestre, pueden ser 5,4,3,2 o una materia
 */     
    public static String  materias(){
    String[] sem1={"ALGEBRA","CALCULO Y GEOMETRIA ANALITICA","FUNDAMENTOS DE PROGRAMACION","QUIMICA","FUNDAMENTOS DE FISICA"};
            String[] sem2={"REDACCION Y EXPOSIC TEMAS INGENIERIA","ALGEBRA LINEAL","CALCULO INTEGRAL","ESTRUCTURA DATOS Y ALGORITMOS I","MECANICA"};
            String[] sem3={"ESTRUCTURA DATOS Y ALGORITMOS II","CALCULO VECTORIAL","PROGRAMACION ORIENTADA A OBJETOS","ECUACIONES DIFERENCIALES","PROBABILIDAD"};
            String[] sem4={"ESTRUCTURAS DISCRETAS","ELECTRICIDAD Y MAGNETISMO","MATEMATICAS AVANZADAS","ANALISIS NUMERICO","FUNDAMENTOS DE ESTADISTICA"};
            String[] sem5={"DISPOSITIVOS ELECTRONICOS","LENGUAJES FORMALES-AUTOMATAS","SEÑALES Y SISTEMAS","ESTRUCTURA Y PROGRAMAC.COMPUTADOR","INGENIERIA DE SOFTWARE"};
            String[] sem6={"SISTEMAS OPERATIVOS","CIRCUITOS ELECTRICOS","ADMINISTRACION PROYECTOS SOFTWARE","BASES DE DATOS","DISEÑO DIGITAL MODERNO"};
            String[] sem7={"INTELIGENCIA ARTIFICIAL","COMPILADORES","INTRODUCCION A LA ECONOMIA","DISEÑO DIGITAL VLSI","FINANZAS EN INGENIERIA COMPUTACION"}; 
            String[] sem8={"ETICA PROFESIONAL","COMPUTACION GRAFICA E INTERAC.HUMANO","REDES DE DATOS SEGURAS","MICROCOMPUTADORAS","OPTATIVAS   (HUMANIDADES)"};
            String[] sem9={"FUNDAMENTOS SISTEMAS EMBEBIDOS","ORGANIZACION Y ARQUITEC.COMPUTADORA","SISTEMAS DISTRIBUIDOS","RECURSOS Y NECESIDADES DE MEXICO","OPTATIVA 1"};
            String[] sem10={"OPTATIVA 1","OPTATIVA 2","OPTATIVA 3","OPTATIVA 4","OPTATIVA 5"};
            String m="";
            if (globalVar.semestreAleatorio<4){    
            switch (globalVar.semestreAleatorio) {
                    case 1:
                        m=generarMaterias(sem1);
                        break;
                    case 2:
                        m=generarMaterias(sem2);
                        break;
                    case 3:
                        m=generarMaterias(sem3);  
                        break;
                    case 4:
                        m=generarMaterias(sem4);
                        break;
                    default:
                        break;
                }
            }else{
                switch (globalVar.semestreAleatorio) {
                    case 1:
                        m=generarMaterias(sem1);
                        break;
                    case 2:
                        m=generarMaterias(sem2);
                        break;
                    case 3:
                        m=generarMaterias(sem3);
                        break;
                    case 4:
                        m=generarMaterias(sem4);
                        break;
                    case 5:
                        m=generarMaterias(sem5);
                        break;
                    case 6:
                        m=generarMaterias(sem6);
                        break;
                    case 7:
                        m=generarMaterias(sem7);
                        break;
                    case 8:
                        m=generarMaterias(sem8);
                        break;
                    case 9:
                        m=generarMaterias(sem9);
                        break;
                    case 10:
                        m=generarMaterias(sem10);
                        break;
                    default:
                        break;
                }
            }
          return m; 
}
 /**
 * Funcion que muestra aletoriamente
 * materias que fueron aprabadas del 
 * semestre en curso. sin  repetir 
 * las materias
 * 
 * @param sem
 * @return materias
 *
 */  
    public static String generarMaterias(String sem[] ){
        ArrayList listaMaterias = new ArrayList(); 
        int f=(int)(Math.random()*5+1);
        int posicion=0;
        switch (f) {
            case 5:
                for ( posicion = 0; posicion < sem.length; posicion++) {
                    listaMaterias.add(sem[posicion]);    
                }   
            break;
            case 4:
                {  
                    int numMaterias = 4;
                    /*La clase Stack funciona como las pilas y básicamente tiene
                    los métodos push (apilar), pop (desapilar), peek (cima) y 
                    empty (esta vacia).*/
                    
                    //Integer: convierte un  tipo básico int en un objeto
                    Stack < Integer > pMaterias = new Stack < Integer > ();
                    for (int i = 0; i < numMaterias ; i++) {
                        posicion = (int) Math.floor(Math.random() * 5 );
                        /*Contains: es un método Java para verificar 
                        si String contiene otra subcadena o no. 
                        Devuelve un valor booleano para que pueda 
                        usarse directamente dentro de sentencias if.*/
                        while (pMaterias.contains(posicion)) {
                            posicion = (int) Math.floor(Math.random() * 5 );
                        }
                        pMaterias.push(posicion);
                        listaMaterias.add(sem[posicion]);
                    }       
            break;
                }
            case 3:
                {
                    int numMaterias = 3;
                    Stack < Integer > pMaterias = new Stack < Integer > ();
                    for (int i = 0; i < numMaterias ; i++) {
                        posicion = (int) Math.floor(Math.random() * 5 );
                        while (pMaterias.contains(posicion)) {
                            posicion = (int) Math.floor(Math.random() * 5 );
                        }
                        pMaterias.push(posicion);
                        listaMaterias.add(sem[posicion]);
                        
                    }       
            break;
                }
            case 2:
                {
                    int numMaterias = 2;
                    Stack < Integer > pMaterias = new Stack < Integer > ();
                    for (int i = 0; i < numMaterias ; i++) {
                        posicion = (int) Math.floor(Math.random() * 5 );
                      while (pMaterias.contains(posicion)) {
                            posicion = (int) Math.floor(Math.random() * 5 );
                      }
                        pMaterias.push(posicion);
                        listaMaterias.add(sem[posicion]);
                        
                        
                    }       
            break;
                }  
            case 1:
                posicion=(int)(Math.random()*5);
                listaMaterias.add(sem[posicion]);
                
            break;
            default:
            break;
        }
        String materias = "";
        for (int i = 0; i < listaMaterias.size(); i++) {
            materias+=" - "+listaMaterias.get(i);   
        }
 return materias;
}
/**
 * Funcion que permite leer un txt 
 * y mostrar el contenido en la pantalla de java
 * 
 *
 */     
    public static void direccion(){
        System.out.println("tipo_vial	nom_vial	tipo_v_e_1	nom_v_e_1"
                        + "	tipo_v_e_2	nom_v_e_2	tipo_v_e_3	nom_v_e_3	"
                        + "     numero_ext	letra_ext	edificio	edificio_e	"
                        + "     numero_int	letra_int	tipo_asent	nomb_asent	"
                        + "     cod_postal	entidad	municipio               localidad	"
                        + "     manzana 	telefono\n");
        String nombreFichero = "direcciones.txt";
        BufferedReader br = null;
        try {
           //Crear un objeto BufferedReader al que se le pasa 
           //un objeto FileReader con el nombre del fichero
           br = new BufferedReader(new FileReader(nombreFichero));
           //Leer la primera línea, guardando en un String
           String texto = br.readLine();
           int i=1;
           //Repetir mientras no se llegue al final del fichero
           while(texto != null)
           {
               System.out.print(i+". ");
               System.out.println(texto);
               //Leer la siguiente línea
               System.out.println("\n");
               texto = br.readLine();
               i+=1;
           } 
        }
        
        catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(br != null)
                    br.close();
            }
            catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }  
/**
 * Funcion que genera promedio aleatorio
 * 
 *
 * @return a
 */
    public static float promedios (){
    float a=(float)(Math.random()*(10-5+1)+5);
    a = Math.round(a * 100) / 100f;
    if (a>10){
        a=10;
    }
    return a;
    }
/**
 * Funcion que ordena el indicador
 * escolar del mayor al menor
 * y así asignar el numero de inscripcion
 * @param arreglo
 */    
    static void ordenarIndicador(int[] arreglo) {
        //iteramos sobre los elementos del arreglo
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int max = i;
            //buscamos el mayor número
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] > arreglo[max]) {
                    max = j;    //encontramos el mayor número
                }
            }
            if (i != max) {
                //permutamos los valores
                int aux = arreglo[i];
                arreglo[i] = arreglo[max];
                arreglo[max] = aux;
            }
        }
    }
 /**
 * Funcion que va a imprimir todos 
 * los registros generados, junto con las direcciones
 *
 */
     public static void imprimirTxt(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        String nombreFichero = "Direcciones.txt";
        BufferedReader br = null;
        try
        {
           br = new BufferedReader(new FileReader(nombreFichero));
           String texto = br.readLine();
           int i=0;
           fichero = new FileWriter("Datos y Direcciones Alumnos.txt");
           pw = new PrintWriter(fichero);
           while(texto != null)
           {
               if(i<listaAlumnos.size()){
               pw.println(listaAlumnos.get(i));
               }
               texto = br.readLine();
               pw.println("Direccion: "+texto);
               i+=1;
           }      
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}