/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2.contenedor;

/**
 *
 * @author lung
 */
public class pila<V> {
    private NodoPilaCola<V> cabeza;
    private int size;
    
    public pila(){
        this.cabeza = null;
        this.size = 0;
    }
    /***
     * <h1>isEmpty</h1>
     * <p>Regresa true si al inicio o cabeza esta vacia y si no regresa false</p>
     * @return 
     */
    public boolean isEmpty(){
        return cabeza == null;
    }
    
    /***
     * <h1>szie</h1>
     * <p>Regresa el tamaño de la pila</p>
     * @return 
     */
    public int size(){
        return size;
    }
    
    /***
     * <h1>push</h1>
     * <p>Agrega el value pasado por parametro por arriba de la cola, se agrega de arriba para abajo</p>
     * @param values 
     */
    public void push(V values){
        NodoPilaCola<V> nNuevo = new NodoPilaCola<>(values);
        
        if(isEmpty()){
            cabeza = nNuevo;
        }else{
            nNuevo.setNext(cabeza);
            cabeza = nNuevo;
        }
        size++;
    }
    
     /***
      * <h1>imprimir</h1>
      * <p>Recorre toda la pila hasta sacar todos los values</p>
      */ 
    public void imprimir(){
        NodoPilaCola aux = cabeza;
        while(aux != null){
            System.out.print(aux.getValues()+",");
            aux = aux.getNext();
        }
    }
    
}
