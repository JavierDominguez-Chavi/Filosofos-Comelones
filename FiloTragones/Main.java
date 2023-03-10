/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiloTragones;


/**
 *
 * @author THE CHAVI’S
 */
public class Main {
       
    public static void main(String[] args){
        UtensilioComida utensilioComida = new UtensilioComida(5);
        int contador = 1;
        while (contador <= 5) {
            Filosofo filosofo = new Filosofo(utensilioComida, contador);
            filosofo.comensalFilosofo.start();
            contador++;
        }
    }
}
