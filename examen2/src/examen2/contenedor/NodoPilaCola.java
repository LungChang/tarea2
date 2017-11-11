/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2.contenedor;

/**
 *
 * @author Keng
 */
public class NodoPilaCola<V> {
    private NodoPilaCola next;
    private V values;
    
    public NodoPilaCola(V values){
        this.values = values;
        this.next = null;
    }

    public NodoPilaCola getNext() {
        return next;
    }

    public void setNext(NodoPilaCola next) {
        this.next = next;
    }

    public V getValues() {
        return values;
    }

    
}
