package Actividad3;

import java.util.Scanner;

public class ActividadMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;

        do {
            try {
                System.out.print("¿Cuántos productos va a capturar? (1 a 5): ");
                n = sc.nextInt();

                if (n < 1 || n > 5) {
                    System.out.println("Debe ser un número entre 1 y 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida.");
            }
        } while (n < 1 || n > 5);

        Producto[] productos = new Producto[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.println("\nProducto " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            double costo = 0;
            double impuesto = 0;

            while (true) {
                try {
                    System.out.print("Costo: ");
                    costo = sc.nextInt();
                    if (costo < 0) throw new NumberFormatException();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Costo inválido.");
                }
            }

            while (true) {
                try {
                    System.out.print("Impuesto (%): ");
                    impuesto = sc.nextDouble();
                    if (impuesto < 0) throw new NumberFormatException();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Impuesto inválido.");
                }
            }

            productos[i] = new Producto(nombre, costo, impuesto);
        }

        double porcentajeUtilidad = 0;
        while (true) {
            try {
                System.out.print("\nPorcentaje de utilidad general: ");
                porcentajeUtilidad = sc.nextDouble();
                if (porcentajeUtilidad < 0) throw new NumberFormatException();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Porcentaje inválido.");
            }
        }

        // Tabla de resultados
        System.out.println("----------------------------------------------------");
        System.out.println("Nombre, Costo, Impuesto, Precio Final");
        System.out.println("----------------------------------------------------");


        for (Producto p : productos) {
            double utilidad = p.getCosto() * (porcentajeUtilidad / 100);
            double precioFinal = p.calcularPrecio(utilidad);

            System.out.println(
            p.getNombre() + ", " +
            p.getCosto() + ", " +
            p.getImpuesto() + ", " +
            precioFinal
            );
        }

        System.out.println("--------------------------------------------------------");

        sc.close();
    }
}


           
class Producto {

    private String nombre;
    private double costo;
    private double impuesto; // porcentaje

    public Producto(String nombre, double costo, double impuesto) {
        this.nombre = nombre;
        this.costo = costo;
        this.impuesto = impuesto;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    // Calcula el precio final
    public double calcularPrecio(double utilidad) {
        double subtotal = costo + utilidad;
        double montoImpuesto = subtotal * (impuesto / 100);
        return subtotal + montoImpuesto;
    }
}
