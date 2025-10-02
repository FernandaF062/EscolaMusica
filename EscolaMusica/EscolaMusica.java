/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.escolamusica;


public class EscolaMusica {
    public static void main(String[] args) {
        // Criando a orquestra
        InstrumentoMusical[] orquestra = new InstrumentoMusical[4];

      
        orquestra[0] = new Piano();
        orquestra[1] = new Violao();
        orquestra[2] = new Saxofone();
        orquestra[3] = new Bateria();

        
        System.out.println("Informações dos instrumentos:");
        for (InstrumentoMusical instrumento : orquestra) {
            instrumento.mostrarInfo();
        }

     
        System.out.println("\nAfinando os instrumentos...");
        for (InstrumentoMusical instrumento : orquestra) {
            instrumento.afinar();
        }

        
        System.out.println("\nA orquestra começa a tocar!");
        for (InstrumentoMusical instrumento : orquestra) {
            instrumento.tocar();
        }
    }
}

