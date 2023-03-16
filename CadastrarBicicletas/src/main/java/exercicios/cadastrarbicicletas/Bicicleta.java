/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.cadastrarbicicletas;

/**
 *
 * @author allan
 */
//Criar uma Classe Bicicleta com 3 Atributos públicos e 4 Atributos privados; criar 2 métodos para cadastrar os atributos privados; Criar um construtor para atribuir 2 atributos; 
public class Bicicleta {
    
    private double valor;
    private int aro;
    private int marchas;
    private String freio;
    int rodas;        
    String cor;
    String modelo;
    
    public Bicicleta(String ofreio, String ocor, int oaro, int omarchas, int orodas, String omodelo, double ovalor){
      valor=ovalor;
      aro=oaro;
      marchas=omarchas;
      freio=ofreio;
      rodas=orodas;
      cor=ocor;
      modelo=omodelo;
    }
    public String getBicicletas(){
        return " Moledo da Bike: " +modelo+ "Cor : " +cor+ "Aro : " +aro+ "Quantidade de Rodas: " +rodas+ "Quantidade de Marchas:" +marchas+ "Tipo de Freio:" +freio+ "Valor R$:" +valor;
    }
}



