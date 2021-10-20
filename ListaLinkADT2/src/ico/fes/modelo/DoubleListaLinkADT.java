/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.modelo;

/**
 *
 * @author joser
 */
public class DoubleListaLinkADT {

    public int getSize() {
        return size;
    }
    
    private class Nododoble<T>{
        T data;
        Nododoble next;
        Nododoble prev;
        

        public Nododoble() {
        }

        public Nododoble(T data, Nododoble next, Nododoble prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
            
        }
        
    
    }
    
    private Nododoble head;
    private Nododoble tail;
    private int size;

    public DoubleListaLinkADT() {
        head = null;
        tail = null;
        this.size = 0;
        
    }
    
    public boolean isEmpty(){
        return this.head == null;
    
    }
    
    public void append( Object valor){
        if( this.tail == null){
            this.tail = new Nododoble( valor, null, null);
            this.head = this.tail;
        }else{
            this.tail.next = new Nododoble( valor, null, this.tail);
            this.tail = this.tail.next;
        }
        this.size++;
    }
    
    public void transversal(){
        Nododoble currNode = this.head;
        while( currNode != null ){
            System.out.println(currNode.data + "-->");
            currNode = currNode.next;
        
        }
        System.out.println("");
    }
    
    public Nododoble removeFromHead(Object valor){
        Nododoble currNode = this.head;
        while(currNode != valor || currNode == null){
            
        
        }
    
    }
    
}
