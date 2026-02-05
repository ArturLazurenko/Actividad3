package Actividad3;

import java.util.Scanner;

public class Actividades {
    
    public static int buscarElemento(int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == x) {
            return i;
        }
    }
    return -1; 
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuántos números deseas ingresar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int j = 0; j < n; j++) {
            System.out.print("Ingresa el número " + (j + 1) + ": ");
            numeros[j] = sc.nextInt();
        }


        System.out.print("que numero desea buscar? ");
        int busqueda = sc.nextInt();

        int indice = buscarElemento(numeros, busqueda);
        if (indice == -1){
            System.out.println("No se encontro el numero");
        } else {
            System.out.println("el numero " + busqueda + " se encontro en el indice "+ indice);
        }


        sc.close();
    }
}
