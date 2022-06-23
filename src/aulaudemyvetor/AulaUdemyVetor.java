/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaudemyvetor;

import entidades.quartos;
import java.util.Scanner;

/**
 *
 * @author balta
 */
public class AulaUdemyVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner leia = new Scanner(System.in);
        
        quartos[] vetor =new quartos [10];
        
        System.out.print("Quantos quartos serao alugados? ");
        int n = leia.nextInt();
        
        for(int i = 0;i<n;i++){
            System.out.println();
            System.out.println("Aluguel #" + i +":");
            System.out.print("Nome: ");
            leia.nextLine();
            String nome = leia.nextLine();
            System.out.print("Email:");
            String email = leia.nextLine();
            System.out.print("Quarto: ");
            int quarto = leia.nextInt();
            vetor [quarto] = new quartos(nome, email);
        }
        System.out.println();
        System.out.println("Quartos ocupados: ");
        for(int i=0;i<10;i++){
            if(vetor[i]!=null){
                System.out.println(i+": "+ vetor[i]);
            }
        }
        
        
    }
    
}
