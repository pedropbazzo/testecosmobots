/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecosmobots;

import java.util.Scanner;
/**
 *
 * @pedropbazzo
 */
public class Testecosmobots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String entrada = leitor.next();
        String saida = "";
        
        for(int i = entrada.length() - 1; i >=0; i--){
            saida = saida + entrada.charAt(i);
        }
        System.out.println(saida);
        // TODO code application logic here
    }
    
}
