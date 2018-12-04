/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1gdaw06
 */
public class Alumno {
    private int codigo;
    private String nombre;
    private float altura;
    private String direccion;
    private Profesor profesor;
    
    public Alumno(){
        
    }
    
    public Alumno(int codigo, String nombre, float altura, String direccion){
        this.codigo=codigo;
        this.nombre=nombre;
        this.altura=altura;
        this.direccion=direccion;
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
    
    public float getAltura(){
        return this.altura;
    }
    
    public void setAltura(float altura){
        this.altura =altura;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void SetDireccion(String direccion){
        this.direccion= direccion;
    }
    
    public Profesor getProfesor(){
        return this.profesor;
    }
    public void setProfesor (Profesor profesor){
        this.profesor =profesor;
    }
}
