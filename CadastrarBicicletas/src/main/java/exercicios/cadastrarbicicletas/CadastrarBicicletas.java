/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.cadastrarbicicletas;

/**
 *
 * @author allan
 */

public class CadastrarBicicletas {

    public static void main(String[] args) {
        Bicicleta Bike1= new Bicicleta ("Mountain Bike","Preta",29,24,2,"CANTILEVERS",2900.00);
        Bicicleta Bike2= new Bicicleta ("Ciclismo de pista","Laranja",29,30,2,"FREIOS A DISCO HIDRÁULICO",6500.00);
        Bicicleta Bike3= new Bicicleta ("Atração","Branca",19,1,0,"V-BRAKE",1500.00);
        Bicicleta Bike4= new Bicicleta ("Bicicross ou BMX","Vermelha",17,18,2,"FERRADURA",3600.00);
         
        System.out.println(Bike1.getBicicletas());
        System.out.println(Bike2.getBicicletas());
        System.out.println(Bike3.getBicicletas());
        System.out.println(Bike4.getBicicletas());
                

   }    
}
