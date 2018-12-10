/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 1gdaw06
 */
public class Coche {
    private int codigo;
    private String marca;
    private Taller taller;
    
    public Coche(){
        
    }
    public Coche(int codigo, String marca){
        this.codigo=codigo;
        this.marca=marca;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Taller getTaller() {
        return this.taller;
    }

    public void setTaller(Taller taller) {
        this.taller = taller;
    }
}

