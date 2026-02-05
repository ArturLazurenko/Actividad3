package Actividad3;

import java.util.Scanner;

public class Actividades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Libro libro = new Libro("Diario de Greg", "Greg", 5, 2);

        int opcion; 

        do {
            System.out.println("\n=== MENÚ BIBLIOTECA ===");
            System.out.println("1. Ver información del libro");
            System.out.println("2. Pedir prestado un libro");
            System.out.println("3. Devolver un libro");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = sc.nextInt(); 
            sc.nextLine();

            switch (opcion) {
                case 1:
                    libro.mostrarInfo();
                    break;

                case 2:
                    if (libro.prestar()) {
                        System.out.println("Se ha prestado correctamente");
                    } else {
                        System.out.println("No hay ejemplares disponibles");
                    }
                    break;

                case 3:
                    if (libro.devolver()) {
                        System.out.println("Se ha devuelto correctamente");
                    } else {
                        System.out.println("No hay libros prestados");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        sc.close(); 
    }
}



class Libro {


    private String titulo;
    private String autor;
    private int totalEjemplares;
    private int ejemplaresPrestados;

    public Libro(String titulo, String autor, int totalEjemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalEjemplares = totalEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalEjemplares() {
        return totalEjemplares;
    }

    public void setTotalEjemplares(int totalEjemplares) {
        this.totalEjemplares = totalEjemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    // Método prestar
    public boolean prestar() {
        if (totalEjemplares - ejemplaresPrestados > 0) {
            ejemplaresPrestados++;
            return true;
        }
        return false;
    }

    // Método devolver
    public boolean devolver() {
        if (ejemplaresPrestados > 0) {
            ejemplaresPrestados--;
            return true;
        }
        return false;
    }

    // Método mostrarInfo
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de ejemplares: " + totalEjemplares);
        System.out.println("Ejemplares prestados: " + ejemplaresPrestados);
        System.out.println("Ejemplares disponibles: " + 
                           (totalEjemplares - ejemplaresPrestados));
    } 
} 
