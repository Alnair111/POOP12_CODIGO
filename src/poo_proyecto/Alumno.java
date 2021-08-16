/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_proyecto;

/**
 *@author Alna
 * Clase Alumno
 */
public class Alumno {
    /**
     * Atributos de la Clase alumno
     * 
     */
    String nombre;
    String apellido;
    String apellido2;
    String numCuenta;
    int edad,id,semestre;
    float promedio;
    String materias;

    public Alumno() {//Constructor vacio de la clase Alumno
    }

    /**
     * Se crea constructor con los atributos que va a guardar de cada alumno
     * @param id
     * @param nombre
     * @param apellido
     * @param apellido2
     * @param numCuenta
     * @param edad
     * @param promedio
     * @param semestre
     * @param materias
     */
    public Alumno(int id,String nombre, String apellido,String apellido2, String numCuenta, int edad, float promedio, int semestre,String materias) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.promedio = promedio;
        this.semestre = semestre;
        this.materias = materias;   
    }
    //GETTERS AND SETTERS DE TODOS LOS ATRIBUTOS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }
    

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    /**
    *
    * Se crea el "toString" para que 
    * retorne los atributos de cada 
    * alumno
     * @return 
    */
    @Override
    public String toString() {
        
       return "\n\n"+id+"."+" "+nombre+" " + apellido+" " + apellido2+ 
               "\nNumero de Cuenta: " + numCuenta + 
               "\nEdad: " + edad + 
               "\nPromedio: " + promedio +
               "\nSemestre: " + semestre+"°"+
               "\nMaterias Aprobas del semestre: " +materias;  
    } 
}
