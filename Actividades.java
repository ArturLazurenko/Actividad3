package Actividad3;

import java.util.Scanner;

public class Actividades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Articulo[] articulos = new Articulo[5];
        int opcion;

        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Agregar artículo");
            System.out.println("2. Mostrar artículos");
            System.out.println("3. Vender artículo");
            System.out.println("4. Reabastecer artículo");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Opción inválida.");
                opcion = 0;
            }

            switch (opcion) {

                case 1: 
                    int posLibre = -1;
                    for (int i = 0; i < articulos.length; i++) {
                        if (articulos[i] == null) {
                            posLibre = i;
                            break;
                        }
                    }

                    if (posLibre == -1) {
                        System.out.println("No hay espacio para más artículos.");
                        break;
                    }

                    try {
                        System.out.print("Código: ");
                        String codigo = sc.nextLine();

                        System.out.print("Descripción: ");
                        String descripcion = sc.nextLine();

                        System.out.print("Precio: ");
                        double precio = Double.parseDouble(sc.nextLine());

                        System.out.print("Existencia: ");
                        int existencia = Integer.parseInt(sc.nextLine());

                        articulos[posLibre] = new Articulo(codigo, descripcion, precio, existencia);
                        System.out.println("Artículo agregado correctamente.");

                    } catch (Exception e) {
                        System.out.println("Error en los datos ingresados.");
                    }
                    break;

                case 2: 
                    System.out.println("\n--- ARTÍCULOS ---");
                    for (Articulo a : articulos) {
                        if (a != null) {
                            a.mostrar();
                        }
                    }
                    break;

                case 3: 
                    System.out.print("Código del artículo: ");
                    String codVenta = sc.nextLine();

                    System.out.print("Cantidad a vender: ");
                    try {
                        int cant = Integer.parseInt(sc.nextLine());
                        boolean encontrado = false;

                        for (Articulo a : articulos) {
                            if (a != null && a.getCodigo().equals(codVenta)) {
                                encontrado = true;
                                if (a.actualizarExistencia(-cant)) {
                                    System.out.println("Venta realizada. Nueva existencia: " + a.getExistencia());
                                }
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Artículo no encontrado.");
                        }

                    } catch (Exception e) {
                        System.out.println("Cantidad inválida.");
                    }
                    break;

                case 4: 
                    System.out.print("Código del artículo: ");
                    String codRestock = sc.nextLine();

                    System.out.print("Cantidad a agregar: ");
                    try {
                        int cant = Integer.parseInt(sc.nextLine());
                        boolean encontrado = false;

                        for (Articulo a : articulos) {
                            if (a != null && a.getCodigo().equals(codRestock)) {
                                encontrado = true;
                                a.actualizarExistencia(cant);
                                System.out.println("Reabastecimiento realizado. Nueva existencia: " + a.getExistencia());
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Artículo no encontrado.");
                        }

                    } catch (Exception e) {
                        System.out.println("Cantidad inválida.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
        sc.close();
    }
}

class Articulo{

    private String codigo;
    private String descripcion;
    private double precio;
    private int existencia;


    public Articulo(String codigo, String descripcion, double precio, int existencia) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencia = existencia;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }


    public void mostrar() {
        System.out.println("Código: " + codigo +
                ", Descripción: " + descripcion +
                ", Precio: " + precio +
                ", Existencia: " + existencia);
    }


    public boolean actualizarExistencia(int cantidad) {
        if (existencia + cantidad < 0) {
            System.out.println("No hay suficiente existencia para realizar la operación.");
            return false;
        }
        existencia += cantidad;
        return true;
    }
}
