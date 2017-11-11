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
public class cola<V> {
    private NodoPilaCola<V> cabeza;
    private int size;
    
    public cola(){
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
      * <h1></h1>
      * <p>Regresa el tamaño de la cola</p>
      * @return 
      */
    public int size(){
        return size;
    }
    
    /***
     * <h1>pushCola</h1>
     * <p>Agrega el value pasado por parametro por atras de la cola hacia adelante</p>
     * @param values 
     */
    public void pushCola(V values){
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
     * <h1>imprimir<h1>
     * <p>Recorre toda la cola hasta sacar todos los values por adelante</p>
     */
    public void imprimir(){
        NodoPilaCola aux = cabeza;
         System.out.print("\n");
        while(aux != null){
            System.out.print(aux.getValues()+",");
            aux = aux.getNext();
        }
    }
    
    
}
