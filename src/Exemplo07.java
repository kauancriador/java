
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caio.alunos
 */
public class Exemplo07 {
    public static void main(String[] args) {
        
        int numerodigitado, contador = 0;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Fim do intervalo");
        numerodigitado = sc.nextInt();
        
        do{
           System.out.println("numero: " + contador);
           contador++;
        }
        
        while(contador <= numerodigitado);
        System.out.println("fim do programa...");
        
    }
}
