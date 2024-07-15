/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caio.alunos
 */
public class Exemplo3 {
    public static void main(String[] args) {
        System.out.println("Exemplo de Break com While");
        
        int contador = 0;
        
        while (contador <= 10){
            if (contador == 8){
                break;
            }
            System.out.println("contador: " + contador);
            contador++;
        }
    }
}
