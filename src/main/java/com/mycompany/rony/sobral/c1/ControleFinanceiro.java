/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rony.sobral.c1;

import java.util.Scanner;

/**
 *
 * @author rony.sobral@VALEMOBI.CORP
 */
public class ControleFinanceiro {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Bem-Vindo jovem! Realize o controle de suas economias:");
        System.out.println("Valor guardado:");
        Double valorGuardado = leitor.nextDouble();
    
        System.out.println("Meta de economia (%)");
        Double meta = leitor.nextDouble();
        
        Double valorEconomizar = (meta * 100) / valorGuardado ;
        
        String fraseMeta = String.format(
                "\nPara atingir a meta, você precisa economizar R$ %.2f !",
                valorEconomizar);
        
        System.out.println(fraseMeta);
        
        
        int finalizar = 0;
        
        while(finalizar < 1) 
        {
            
        System.out.println("\nEscolha os proximos passos"
                            + "\n 1 - Gastar"
                            + "\n 2 - Sair");  
        Integer valorDigitado = leitor.nextInt();
        
        switch(valorDigitado){
            case 2:
                System.out.println("Até logo");
                finalizar++;
                break;
            default:
                System.out.println("Número Inválido");
                break;
            case 1:
                System.out.println("");
        }

        
        
        if (valorDigitado == 1) {
            
        int contador = 0;
        
            while(contador < 1) {
                
                System.out.println("\nDigite o valor que deseja retirar do cofrinho virtual:");
                Double valorRetirada = leitor.nextDouble();
            
                if(valorRetirada < valorGuardado) {

                   
                    for(int retiradas = 1; retiradas <= valorRetirada; retiradas++  ) 
                    {
                    
                        String fraseRetirada = String.format("Retirando R$1,00 pela %d° vez",
                                retiradas);
                        
                        valorGuardado = valorGuardado - 1;
                        System.out.println(fraseRetirada);
                        
                    }
                    
                    String fraseFinal = String.format("\nVocê acabou de retirar R$%.2f!\n"
                                        + "Saldo atual %.2f\n"
                                        + "Meta de econômia: %.2f", 
                                        valorRetirada, valorGuardado, valorEconomizar);
                    
                    System.out.println(fraseFinal);
                    
                contador++;
 
            } else {
                
                String fraseInvalido = String.format("\nInfelizmente você não possui"
                        + " saldo suficiente para o valor digitado. Saldo Disponivel: %.2f",
                        valorGuardado);
                
                    System.out.println(fraseInvalido);
                
            }
                  
        }
            
         
        }
            
        }
        
        
        

    
    }
    
}
