/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1gdaw06
 */
public class Profesor {
    private int codigo;
    private String nombre;
    private int departamento;
    private Alumno alumno;
    
    public Profesor(){
        
    }
    
    public Profesor(int codigo, String nombre, int departamento){
        this.codigo =codigo;
        this.nombre= nombre;
        this.departamento=departamento;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo =codigo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void SetNombre(String nombre){
        this.nombre= nombre;
    }
    
    public int getdepartamento(){
         return this.departamento;
    }
    
    public void setdepartamento(int departamento){
        this.departamento =departamento;
    }
    public Alumno getAlumno(){
        return this.alumno;
    }
    public void setAlumno(Alumno alumno){
        this.alumno =alumno;
    }
}
