/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2.contenedor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/**
 *
 * @author lung
 */
public class miMapa<K, V> {
    private int size;
    private Nodo<K,V> cabeza;
   Collection<V> collec = new ArrayList<>();
    
    public miMapa(){
        this.size=0;
        this.cabeza = null;
    }
    /***
     * <h1>Size</h1>
     * <p>Regresa el tamaño del mapa</p>
     * @return 
     */
    public int size(){
        return size;
    }
    /***
     * <h1>Vacia</h1>
     * <p>Regresa true si al inicio o cabeza esta vacia y si no regresa false</p>
     * @return 
     */
    public boolean isEmpty(){
        return cabeza == null;
    }
    
 
    /***
     * <h1>put</h1>
     * <p>Agrega cualquier tipo de dato al miMapa</p>
     * @param clave
     * @param valor 
     */
    
    public void put(K clave, V valor){
        Nodo<K,V> nNuevo = new Nodo<>(clave, valor);
        
        if(isEmpty()){
            cabeza = nNuevo;
        }else{
            if(containsKey(clave)){
                System.out.print("Existe una llave repetida");
            }else{
                Nodo aux = cabeza;
                while (aux.getNext() != null) {
                    aux = aux.getNext();
                }
                aux.setNext(nNuevo);
            }
        }
        size++;
    }
    
    /***
     * <h1>containsKey</h1>
     * <p>Recorre todo miMapa hasta encontrar un key que concida con el key pasado por parametro, regresa true si encuentra un key con el mismo valos y false si no lo encuentra</p>
     * @param clave
     * @return 
     */
    public boolean containsKey (K clave){
        boolean bandera = false;
        if(!isEmpty()){
            Nodo aux = cabeza;
            while(aux != null){
                if(aux.getKey().equals(clave)){
                    bandera = true;
                    break;
                }
                aux = aux.getNext();
            }
        }
        return bandera;
    }
    
    /***
     * <h1>get</h1>
     * <p>Recorre todo miMapa hasta encontrar un key que concida con el key pasado por parametro, regresa el valor que contega esa key si es lo encuentra y si no regresa null si no existe el key</p>
     * @param clave
     * @return 
     */
    public V get(K clave){
        V miValue = null;
        if(!isEmpty()){
            Nodo aux = cabeza;
            while(aux != null){
                if(aux.getKey().equals(clave)){
                    miValue = (V)aux.getValue();
                    break;
                }
                aux = aux.getNext();
            }
        }
        return miValue;
    }
    /***
     * <h1>clear</h1>
     * <p>Se pone a la cabeza y le pone igual a null para borrar todos los datos que habia miMapa y el size le pone 0</p>
     */
    
    public void clear() {
       cabeza = null;
       size = 0;
    }
    
    /***
     * <h1></h1>
     * <p>Recorre miMapa hasta encontrar la misma key que se le paso por parametro, si la encuentra la borra, sin perder todos los datos de miMapa</p>
     * @param clave 
     */
    public void remove(K clave) {
        if (!isEmpty()) {
            Nodo aux = cabeza;
            for (int x = 0; x < indexKey(clave) - 1; x++) {
                aux = aux.getNext();
            }
            if (aux.getValue().equals(cabeza.getValue())) {
                cabeza = cabeza.getNext();
            } else {
                Nodo siguiente = aux.getNext();
                aux.setNext(siguiente.getNext());
            }

            size--;
        }
    }
    
    /***
     * <h1>indexKey</h1>
     * <p>Recorre miMapa hasta encontrar la misma key que se le paso por parametro y a la vez hace un conteo para devolver la posicion donde se encuentra esa key</p>
     * @param clave
     * @return 
     */
    public int indexKey(K clave){
        int index = 0;
        if(!isEmpty()){
            Nodo aux = cabeza;
            for(int x=0;x<size-1;x++){
                if(aux.getKey().equals(clave)){
                    index = x;
                    break;
                }else{
                    aux = aux.getNext();
                }
            }
        }
        return index;
    }
    
    /***
     * <h1>Recorre miMapa hasta encontrar el mismo dato que se le paso por parametro y devuelve true si hay un dato que lo contiene y false si no lo hay </h1>
     * <p></p>
     * @param value
     * @return 
     */
    public boolean containsValue(V value){
        boolean bandera = false;
        if(!isEmpty()){
            Nodo aux = cabeza;
            while(aux != null){
                if(aux.getValue().equals(value)){
                    bandera = true;
                    break;
                }
                aux = aux.getNext();
            }
        }
        return bandera;
    }

    /***
     * <h1>values</h1>
     * <p>Regresa un Collection de miMapa y a la vez va agregando a un ArrayList</p>
     * @return 
     */
    public Collection<V> values() {
       if(!isEmpty()){
           Nodo aux = cabeza;
           String value;
           while(aux != null){
               value =aux.getKey()+" "+(V)aux.getValue();
               collec.add((V)value);
               aux = aux.getNext();
           }
       }
       return collec;
    }

    /***
     * <h1>miPila</h1>
     * <p>Devuele una Pila con los datos del metodo values</p>
     * @return 
     */
    public pila miPila(){
        pila Pila = new pila();
        
        Iterator<V> miIterator = collec.iterator();
        while(miIterator.hasNext()){
            Pila.push(miIterator.next());
        }
        return Pila;
    }
    
    /***
     * <h1>miCola</h1>
     * <p>Devuelve una Cola con los datos del metod values</p>
     * @return 
     */
    public cola miCola(){
        cola Cola = new cola();
        
        Iterator<V> miIterator = collec.iterator();
        while(miIterator.hasNext()){
            Cola.pushCola(miIterator.next());
        }
        return Cola;
    }
}
