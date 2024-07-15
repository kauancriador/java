
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caio.alunos
 */
public class Exemplo05 {
    public static void main(String[] args) {
        
        // 1 passo - entrada - declarar as variavies 
        
        int numerodigitado, contador =0;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite o fim do intervalo: ");
        numerodigitado = sc.nextInt();
        // 2 passo - processamento
        while (contador <= numerodigitado ){
            System.out.println("numero: " + contador);
            contador++;
        }
        // 3 passo - saida
    }
}
