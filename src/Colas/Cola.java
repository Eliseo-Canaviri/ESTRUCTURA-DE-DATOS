
package Colas;

import javax.swing.JOptionPane;
        
/**
 * @author Eliseo Canaviri
 */
public class Cola {
    //Declaramos dos Nodos
    Nodo1 frente;
    Nodo1 fin;
    //------- Metodos de la Pila---------\\
    //constructor: crea cola vacia
    public Cola(){
        frente=null;
        fin=null;
    }
    //------ Verificamos si la pila esta vacia
    public boolean vacia(){
        return ((frente==null) && (fin == null));
    }
    // Fin del metodo
    //----- Eliminar todos los metodos de la cola
    public void limpiarCola(){
        frente = null;
        fin = null;
        JOptionPane.showMessageDialog(null, "[La cola se limpio]");
    }
    
    //--------Agrega un elemento a la cola
    public void encolar(String Dato){
        Nodo1 ptrNuevo;
        ptrNuevo=new Nodo1(Dato);
        if(vacia()){
            fin=ptrNuevo;
            frente=fin;
        } else{
            fin.sig=ptrNuevo;//fin fianliza
            fin=ptrNuevo;//se enlaza el ultimo nodo
        }
        JOptionPane.showMessageDialog(null, "[La cola se inserto]");
    }//fin del metodo

    
    //----- Agregar un Elemento a la cola
    /*public void encolar(Nodo n){
        if(vacia()){
            fin=n;
            frente=fin;
        }
        else{
            fin.sig=n;
            fin=n;
        }
    }*/// fin del metodo encolar
    //----- Eliminar un elemento  a la cola
    public void desencolar() {
        Nodo1 x=frente;
        if(!vacia()){
            JOptionPane.showMessageDialog(null, "Se borro el dato : "+frente.dato);
            //System.out.println("Se borro el Dato : "+frente.dato);
            frente = frente.sig;
        }
        else{
            JOptionPane.showMessageDialog(null, "[La cola esta vacia]");
            //System.out.println("La cola esta vacia!!!");
        }
    }// Fin del metodo 
    //----- Imprimir una lista de la cola
    public void MostrarCola(){
        Nodo1 p=frente;
        int cant=0;
        String men=" ";
        System.out.print("");
        if(vacia()){
            JOptionPane.showMessageDialog(null, "[ La cola esta vacia. ]");
            //System.out.println("[ La cola esta vacia. ]");
        }
        else{
            while(p!=null){
                men = men + "\n [ " + p.dato + " ] " + "\n";
                //System.out.print("["+p.dato+"]");
                //JOptionPane.showMessageDialog(null, men);
                p=p.sig;
                cant++;
            }
            System.out.print("");
            //System.out.print("Cantidad de Elementos: "+cant);
            JOptionPane.showMessageDialog(null, "Cantidad de cola: "+cant);
        }
        System.out.print("");
        
    } // Fin del metodo 
    //------ Obtener cantidad de Nodos 
    
    public void Visulaizar(){
        //Colas.Nodo n;
        Nodo1 r = frente;
        String men=" ";
         
        while (r != null) {
            men = men + "\n [ " + r.dato + " ] " + "\n";
            r = r.sig;
        }
        JOptionPane.showMessageDialog(null, men);
    }    
}
