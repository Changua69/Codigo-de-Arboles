
package javaapplication1;

/**
 *
 * @author Torrev_204
 */
public class Nodo{
    int info;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(int valor) {
        this.info = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
    public int getValor(){
        return info;
    }
    public void setValor(int valor){
        this.info = valor;
    }
    public Nodo getIzquierdo(){
        return izquierdo;
    }
    public void setIzquierdo(Nodo izquierdo){
        this.izquierdo = izquierdo;
    }
    public Nodo getDerecho(){
        return derecho;
    }
    public void setDerecho(Nodo derecho){
        this.derecho = derecho;
    }
}
