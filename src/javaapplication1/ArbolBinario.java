
package javaapplication1;

/**
 *
 * @author Torrev_204
 */
class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario(){
        raiz = null;
    }
    public void insertar(int valor){
        raiz = insertarRecursivo(raiz, valor);
    }
    private Nodo insertarRecursivo(Nodo raiz, int valor){
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        if (valor < raiz.getValor()){
            raiz.setIzquierdo(insertarRecursivo(raiz.getIzquierdo(), valor));
        } 
        else if (valor > raiz.getValor()){
            raiz.setDerecho(insertarRecursivo(raiz.getDerecho(), valor));
        }

        return raiz;
    }
    public void preorden(){
        preordenRecursivo(raiz);
    }
    private void preordenRecursivo(Nodo nodo){
        if (nodo != null){
            System.out.print(nodo.getValor() + " ");
            preordenRecursivo(nodo.getIzquierdo());
            preordenRecursivo(nodo.getDerecho());
        }
    }
    public void inorden(){
        inordenRecursivo(raiz);
    }
    private void inordenRecursivo(Nodo nodo){
        if (nodo != null) {
            inordenRecursivo(nodo.getIzquierdo());
            System.out.print(nodo.getValor() + " ");
            inordenRecursivo(nodo.getDerecho());
        }
    }
    public void postorden(){
        postordenRecursivo(raiz);
    }
    private void postordenRecursivo(Nodo nodo){
        if (nodo != null){
            postordenRecursivo(nodo.getIzquierdo());
            postordenRecursivo(nodo.getDerecho());
            System.out.print(nodo.getValor() + " ");
        }
    }
}
