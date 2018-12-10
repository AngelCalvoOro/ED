/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 1gdaw06
 */
public class Taller {
    private int codigo;
    private String nombre;
    private Coche[] coche;
    
    public Taller(){
        
    }
    public Taller(int codigo, String nombre){
        
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Coche[] getCoche() {
        return this.coche;
    }

    public void setCoche(Coche[] coche) {
        this.coche = coche;
    }
    
}
