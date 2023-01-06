package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author carlo
 */
public class Palindromo {

    public static void main(String[] args) {
        // String palabraNormal = "RECONOCER";
        String palabraNormal = args[0];
        String palabraReversa = invertirCadena(palabraNormal);

        if (palabraNormal.toUpperCase().equals(palabraReversa.toUpperCase())) {
            System.out.println("Palabra normal : " + palabraNormal);
            System.out.println("Palabra reversa : " + palabraReversa);
            System.out.println("Es un palíndromo");

        }else{
            System.out.println("Palabra normal : " + palabraNormal);
            System.out.println("Palabra reversa : " + palabraReversa);
            System.out.println("No es un palíndromo");
        }

    }

    private static String invertirCadena(String texto) {
        String nuevoTexto = new StringBuilder(texto).reverse().toString();
        return nuevoTexto;
    }
}
