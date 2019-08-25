/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyect;

public class Usuario {
    String nombre;
    String apellido;
    int edad;
    String correo;
    String cotraseña;
    String nrocel;
    int codigo;

    public Usuario(String nombre, String apellido, int edad, String correo, String cotraseña, String nrocel, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.cotraseña = cotraseña;
        this.nrocel = nrocel;
        this.codigo = codigo;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCotraseña() {
        return cotraseña;
    }

    public void setCotraseña(String cotraseña) {
        this.cotraseña = cotraseña;
    }

    public String getNrocel() {
        return nrocel;
    }

    public void setNrocel(String nrocel) {
        this.nrocel = nrocel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return nombre + "," + apellido + "," + edad + "," + correo + "," + cotraseña + "," + nrocel + "," + codigo;
    }
    
}
