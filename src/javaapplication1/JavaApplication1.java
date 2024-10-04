
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author Torrev_204
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion, info;
        boolean salir = false;
        ArbolBinario arbolbinario = new ArbolBinario();
        
        while(!salir){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu."+"\n1. Añadir valor"+
                    "\n2. Mostrar"+"\n3. Salir"));
            switch(opcion){
                case 1:
                    info = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para añadir al arbol: "));
                    arbolbinario.insertar(info);
                    break;
                case 2:
                    int opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Menu."+"\n1. PreOrden"
                    +"\n2. InOrden"+"\n3. PostOrden"));
                    if(opcion2 == 1){
                        System.out.println("Arbol en PreOrden: ");
                        arbolbinario.preorden();
                    }
                    else if(opcion2 == 2){
                        System.out.println("Arbol en InOrden: ");
                        arbolbinario.inorden();
                    }
                    else if(opcion2 == 3){
                        System.out.println("Arbol en PostOrden: ");
                        arbolbinario.postorden();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Ingrese un valor dentro del menu");
                    }
                    break;
                case 3:
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Usted a salido");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion dentro del menu");
            }          
        }
    }
}
    

