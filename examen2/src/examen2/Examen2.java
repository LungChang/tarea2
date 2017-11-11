/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;


import examen2.contenedor.Nodo;
import examen2.contenedor.miMapa;
import examen2.contenedor.pila;
import java.util.Iterator;

/**
 *
 * @author lung
 */
public class Examen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        miMapa mapa = new miMapa();
        
        //agregar keys y datos a miMapa
        mapa.put(1, "ola");//0
        mapa.put(2, false);//1
        mapa.put(3, 15.777);//2
        mapa.put('a', "putos");//3
        mapa.put(true, 15);//4
        mapa.put("hola",true);//5
        
        //muestra el tamaño de miMapa
        System.out.print(mapa.size()+"\n");
        
        //muestra true o false si miMapa esta Vacia
        System.out.print(mapa.isEmpty()+"\n");
        
        //muestra el dato que contiene el key 
        System.out.println(mapa.get('a'));
        
        //borra todo lso datos de miMapa
        //mapa.clear();    
        
        //borra un dato especifico
        mapa.remove(1);
        
        //muestra true o false si miMapa contiene el key pasado por parametro 
        System.out.print(mapa.containsKey("putos")+"\n");
        
        //muestra true o false si miMapa contiene el value pasado por parametro
        System.out.print(mapa.containsValue(15)+"\n");
        
        //muestra una coleccion de miMapa
        System.out.println(mapa.values());
        
        //muestra la pila y a la vez la imprime
        mapa.miPila().imprimir();
        
        //muestra la cola y a la vez la imprime
        mapa.miCola().imprimir();
    
    }
    
}
