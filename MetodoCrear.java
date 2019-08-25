/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class MetodoCrear {
    ArrayList <Usuario> user;
    public MetodoCrear(){
        user=new ArrayList <Usuario>();
        cargar();
    }
    public void aumentar(Usuario U){
        user.add(U);
    }
    int tamaño(){
       return user.size();
    }
    Usuario Obtener(int pos){
        return user.get(pos);
    }
    Usuario buscar(int cod){
        for(int i=0;i<tamaño();i++){
            if(user.get(i).getCodigo()==cod){
                return user.get(i);
            }
        }
        return null;
    }
    public void cargar(){
        try{
            File archivo=new File("Archivo.txt");
            if(archivo.exists()){
                BufferedReader br=new BufferedReader(new FileReader("Archivo.txt"));
                String linea;
                while((linea=br.readLine())!=null){
                    StringTokenizer st=new StringTokenizer(linea,",");
                    String nom=st.nextToken().trim();
                    String ape=st.nextToken().trim();
                    int edad=Integer.parseInt(st.nextToken().trim());
                    String corre=st.nextToken().trim();
                    String cont=st.nextToken().trim();
                    String nro=st.nextToken().trim();
                    int cod=Integer.parseInt(st.nextToken().trim());
                    Usuario x=new Usuario(nom, ape, edad, corre, cont, nro, cod);
                    aumentar(x);
                }
                br.close();
            }else{
                JOptionPane.showMessageDialog(null, "El archivo.txt no existe");
            }
            
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Se producio un error1 ="+x);
        }
    }
    void grabar(){
        try{
            PrintWriter pw=new PrintWriter(new FileWriter("Archivo.txt"));
            for(int i=0;i<tamaño();i++){
                pw.println(Obtener(i).toString());
            }
            pw.close();
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Se produjo un error2 ="+x);
        }
    }
}
