/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiloTragones;


/**
 *
 * @author THE CHAVI’S
 */
public class UtensilioComida {
    private boolean[] tenedores;
     
    public UtensilioComida(int numTenedores){
        this.tenedores = new boolean[numTenedores];
    }
     
    public int tenedorIzquierda(int numeroComensal, String estado){
        if("Tomado".equals(estado)){
           System.out.println("El filosofo " + (numeroComensal+1) + " toma el tenedor izquierdo numero: " +
                (numeroComensal+1));
        }
        if("Soltado".equals(estado)){
            System.out.println("El filosofo " + (numeroComensal+1) + " suelta el tenedor izquierdo numero: " +
                (numeroComensal+1));
        }
        return numeroComensal;
    }
     
    public int tenedorDerecha(int numeroComensal, String estado){
        if(numeroComensal == 0){
            if("Tomado".equals(estado)){
                System.out.println("El filosofo " + (numeroComensal+1) + " toma el tenedor derecho numero: " +
                    (this.tenedores.length));
            }
            if("Soltado".equals(estado)){
                System.out.println("El filosofo " + (numeroComensal+1) + " suelta el tenedor derecho numero: " +
                    (this.tenedores.length));
            }
            return this.tenedores.length - 1;
        }else{
            if("Tomado".equals(estado)){
                System.out.println("El filosofo " + (numeroComensal+1) + " toma el tenedor derecho numero: " +
                    (numeroComensal));
            }   
             if("Soltado".equals(estado)){
                System.out.println("El filosofo " + (numeroComensal+1) + " solta el tenedor derecho numero: " +
                    (numeroComensal));
            }   
            return numeroComensal - 1;
        }
    }
     
    public synchronized void tomarTenedores(int numeroComensal){
        while(tenedores[tenedorIzquierda(numeroComensal,"Espera")] || tenedores[tenedorDerecha(numeroComensal, "Espera")]){
            try {   
                wait();
            } catch (InterruptedException ex) {
                ex.getStackTrace();
            }
        }   
        tenedores[tenedorIzquierda(numeroComensal, "Tomado")] = true;

        tenedores[tenedorDerecha(numeroComensal, "Tomado")] = true;
    }
     
    public synchronized void soltarTenedores(int numerocomensal){
        tenedores[tenedorIzquierda(numerocomensal, "Soltado")] = false;
        tenedores[tenedorDerecha(numerocomensal, "Soltado")] = false;
        notifyAll();
    }
}
