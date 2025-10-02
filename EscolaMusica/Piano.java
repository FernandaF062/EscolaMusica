/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusica;

public class Piano extends InstrumentoMusical {

    private int numeroTeclas;

    public Piano(String nome, String material, int numeroTeclas) {
        super(nome, material);
        this.numeroTeclas = numeroTeclas;
    }

    @Override
    public void tocar() {
        System.out.println("Soando uma bela melodia no " + nome + " com " + numeroTeclas + " teclas...");
        System.out.println("Executando uma sonata clássica.");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando a tensão das cordas internas do piano.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Número de teclas: " + numeroTeclas);
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }
}
