# 15 ejercicios integrados de Java (niveles mixtos)

Incluyen: tipos de datos, operadores, condicionales, estructuras repetitivas, arreglos, métodos, clases/objetos y manejo básico de errores.

---

## 1. Suma simple con validación de entrada (fácil)

**Enunciado**  
Escribe un programa que pida al usuario dos números enteros, valide que realmente sean enteros usando manejo de errores, y luego muestre la suma de ambos.

**Codigo**  
```java
package Actividad3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividades {
    //parte 1
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;  
        boolean valido = false;
        
        while (!valido) {
            try {
                System.out.print("Ingresa el primer número entero: ");
                num1 = sc.nextInt();

                System.out.print("Ingresa el segundo número entero: ");
                num2 = sc.nextInt();

                valido = true; 

            } catch (InputMismatchException e) {
                System.out.println("Error: debes ingresar números enteros.");
                sc.nextLine(); 
            }
        }

        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);

        sc.close();
    }

}

```

**Salida esperada**  
`Ingresa el primer número entero: 6
Ingresa el segundo número entero: 7
La suma es: 13`

---

## 2. Clasificación de edad con mensaje personalizado (fácil)

**Enunciado**  
Pide el nombre y la edad del usuario.  
Usa condicionales para mostrar:  
- Menos de 13: "Hola <nombre>, eres un niño."  
- 13 a 17: "Hola <nombre>, eres un adolescente."  
- 18 a 64: "Hola <nombre>, eres un adulto."  
- 65 o más: "Hola <nombre>, eres un adulto mayor."

**Codigo**  
```java
package Actividad3;

import java.util.Scanner;

public class Actividades {
    //parte 1
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad <= 13) {
            System.out.println("Hola "+ nombre + " eres eres un niño.");
        } else if (edad >= 13 & edad <= 17) {
            System.out.println("Hola "+ nombre + " eres un adolescente.");
        } else if (edad >= 18 & edad <= 64) {
            System.out.println("Hola "+ nombre + " eres un adulto.");
        } else if (edad >= 65) {
            System.out.println("Hola "+ nombre + " eres un adulto mayor.");
        sc.close();
        }
    }

}


```

**Salida esperada**  
`Ingrese su nombre: 
Artur
Ingrese su edad: 
19
Hola Artur eres un adulto.`

---

## 3. Tabla de multiplicar con `for` (fácil)

**Enunciado**  
Pide un número entero entre 1 y 10.  
Muestra su tabla de multiplicar del 1 al 10 usando un ciclo `for`.  
Si el usuario ingresa algo no entero, usa manejo de errores para pedir el dato de nuevo.


**Codigo**  
```java

**Codigo**  
```java
package Actividad3;

import java.util.Scanner;

public class Actividades {
    //parte 1
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad <= 13) {
            System.out.println("Hola "+ nombre + " eres eres un niño.");
        } else if (edad >= 13 & edad <= 17) {
            System.out.println("Hola "+ nombre + " eres un adolescente.");
        } else if (edad >= 18 & edad <= 64) {
            System.out.println("Hola "+ nombre + " eres un adulto.");
        } else if (edad >= 65) {
            System.out.println("Hola "+ nombre + " eres un adulto mayor.");
        sc.close();
        }
    }

}


```

**Salida esperada**  
`Ingrese un numero (1-10): 
a
Error: debes ingresar un numero entero.
Ingrese un numero (1-10): 
6
6 x 0 = 0
6 x 1 = 6
6 x 2 = 12
6 x 3 = 18
6 x 4 = 24
6 x 5 = 30
6 x 6 = 36
6 x 7 = 42
6 x 8 = 48
6 x 9 = 54
6 x 10 = 60`


## 4. Arreglo de calificaciones y promedio (fácil–medio)

**Enunciado**  
Pide al usuario cuántas calificaciones desea capturar (máximo 10).  
Luego pide cada calificación (double) y guárdalas en un arreglo.  
Calcula y muestra:  

- El promedio.  
- Cuántas calificaciones son mayores o iguales a 70 (aprobadas).  
- Cuántas son menores a 70 (reprobadas).

**Entrada (ejemplo)**  
- `n = 5`  
- `Calificaciones: 100 80 60 70 50`

**Salida esperada**  
```text
Promedio: 72.0
Aprobadas: 3
Reprobadas: 2
```

---

## 5. Contador de vocales y consonantes en una palabra (medio)

**Enunciado**  
Pide al usuario una palabra (sin espacios).  
Convierte la palabra a minúsculas y recórrela carácter por carácter.  
Cuenta cuántas vocales (a, e, i, o, u) y cuántas consonantes (letras que no son vocales).  
Ignora caracteres que no sean letras.

**Entrada (ejemplo)**  
- `Palabra: Programacion`

**Salida esperada**  
```text
Vocales: 5
Consonantes: 7
```

---

## 6. Verificar si un arreglo está ordenado (medio)

**Enunciado**  
Pide n números enteros y guárdalos en un arreglo.  
Escribe un método estático que reciba el arreglo y regrese true si está ordenado de forma ascendente (cada elemento >= anterior), o false en caso contrario.  
Desde main, muestra un mensaje indicando si el arreglo está ordenado.

**Entrada (ejemplo 1)**  
- `Arreglo: 1 2 2 5 9`

**Salida esperada**  
`El arreglo está ordenado.`

**Entrada (ejemplo 2)**  
- `Arreglo: 3 1 4 2`

**Salida esperada**  
`El arreglo NO está ordenado.`

---

## 7. Clase Rectangulo con métodos de área y perímetro (medio)

**Enunciado**  

Crea una clase `Rectangulo` con atributos privados ancho y alto (double).  
Incluye:  

- Constructor que reciba ancho y alto.  
- Getters y setters.  
- Método `calcularArea()` que regrese el área.  
- Método `calcularPerimetro()` que regrese el perímetro.  

En main:  

- Pide al usuario ancho y alto (con manejo de errores).  
- Crea un objeto Rectangulo.  
- Muestra su área y perímetro.

**Entrada (ejemplo)**  

- `Ancho: 5`  
- `Alto: 3`

**Salida esperada**  

```text
Área: 15.0
Perímetro: 16.0
```

---

## 8. Buscar un número en un arreglo (medio)

**Enunciado**  
Pide n enteros y guárdalos en un arreglo.  
Luego pide un número x a buscar.  
Usa un método estático buscarElemento(int[] arr, int x) que regrese el índice donde se encuentra la primera ocurrencia de x, o -1 si no existe.  
En main, muestra un mensaje adecuado.

**Entrada (ejemplo)**  

- `n = 6`  
- `Arreglo: 4 7 2 7 9 1`  
- `x = 7`

**Salida esperada**  
`El número 7 se encontró en el índice: 1`

---

## 9. Sistema simple de biblioteca con clase Libro (medio–alto)

**Enunciado**  
Crea una clase Libro con:  

Atributos privados: titulo (String), autor (String), totalEjemplares (int), ejemplaresPrestados (int).  

Getters y setters.  

Método prestar() que:  

Si hay ejemplares disponibles (totalEjemplares - ejemplaresPrestados > 0), aumente ejemplaresPrestados y regrese true.  

En otro caso regrese false.  

Método devolver() que:  

Si ejemplaresPrestados > 0, lo disminuye y regresa true.  

En otro caso regresa false.  

Método mostrarInfo() que muestre todos los datos.  

En main:  

Crea un objeto Libro con datos fijos.  

Muestra un menú con while o do-while para:  

- Ver información del libro.  
- Prestar un ejemplar.  
- Devolver un ejemplar.  
- Salir.

**Entrada (ejemplo de flujo)**  

- `Ver info`  
- `Prestar`  
- `Prestar`  
- `Prestar`  
- `Prestar` (cuando ya no haya)  
- `Ver info`  
- `Salir`

**Salida esperada (resumen)**  

- Mensajes de préstamo exitoso hasta que se acaben los ejemplares.  
- Mensaje "No hay ejemplares disponibles" cuando ya no queden.  
- Información con totales y disponibles actualizados.

---

## 10. Calculadora con menú usando switch (medio)

**Enunciado**  
Crea un programa que muestre un menú:  

- Sumar  
- Restar  
- Multiplicar  
- Dividir  
- Salir  

Cada opción pide dos números y muestra el resultado.  
En la opción de división, valida que el divisor no sea 0 y maneja el error (mensaje y volver a pedir divisor válido).  
Usa do-while para repetir el menú hasta que el usuario elija salir.

**Entrada (ejemplo)**  

- `Opción 1, números: 10 y 5`  
- `Opción 4, números: 8 y 0` (debe pedir otro divisor)  
- `Opción 5`

**Salida esperada (resumen)**  

```text
Suma: 15
Error: no se puede dividir entre cero. Ingresa otro divisor.
División: 8 / 2 = 4
```

---

## 11. Arreglo de productos con precio final (medio–alto)

**Enunciado**  
Crea una clase Producto con atributos privados: nombre (String), costo (double), impuesto (double, %).  
Incluye getters, setters y un método calcularPrecio(double utilidad) que regrese el precio final (costo + utilidad + impuesto).  
En main:  

Pide al usuario cuántos productos va a capturar (máximo 5).  

Usa un arreglo de Producto para almacenarlos.  

Para cada producto, pide nombre, costo, impuesto, con manejo de errores en los números.  

Luego pide un porcentaje de utilidad general para todos.  

Muestra una tabla con: nombre, costo, impuesto, precio final.

**Entrada (ejemplo)**  

- `n = 2`  
- `Producto 1: "Mouse", costo 100, impuesto 16`  
- `Producto 2: "Teclado", costo 200, impuesto 16`  
- `utilidad = 20`

**Salida esperada (resumen)**  

```text
Producto: Mouse  | Costo: 100.0 | Impuesto: 16.0 | Precio final: 139.2
Producto: Teclado| Costo: 200.0 | Impuesto: 16.0 | Precio final: 278.4
```

---

## 12. Verificar si una frase es palíndromo (medio–alto)

**Enunciado**  
Pide una frase al usuario.  
Remueve espacios y conviértela a minúsculas.  
Luego, verifica si se lee igual de izquierda a derecha y de derecha a izquierda (palíndromo).  
No uses métodos de librerías que ya lo hagan directo: trabaja con índices o un arreglo de caracteres y un ciclo for o while.

**Entrada (ejemplo)**  
- `Frase: Anita lava la tina`

**Salida esperada**  
`La frase es un palíndromo.`

---

## 13. Matriz de notas (medio–alto)

**Enunciado**  
Un grupo tiene f estudiantes y cada uno tiene c materias.  
Pide f y c (por ejemplo máximo 5x5).  
Crea una matriz double[f][c] con las calificaciones.  
Luego:  

Calcula y muestra el promedio de cada estudiante.  

Calcula y muestra el promedio de cada materia.

**Entrada (ejemplo)**  

- `f = 2, c = 3`  
- `Notas:`  
- `Estudiante 0: 80 90 100`  
- `Estudiante 1: 70 60 50`

**Salida esperada**  

```text
Promedio estudiante 0: 90.0
Promedio estudiante 1: 60.0
Promedio materia 0: 75.0
Promedio materia 1: 75.0
Promedio materia 2: 75.0
```

---

## 14. Sistema simple de login con intentos limitados (medio–alto)

**Enunciado**  
Define, en el código, un usuario y contraseña correctos (por ejemplo, "admin" y "1234").  
Pide al usuario que ingrese usuario y contraseña, y valida con equals.  
Permite máximo 3 intentos.  
Si los datos son correctos, muestra "Acceso concedido" y termina.  
Si se alcanzan 3 intentos fallidos, muestra "Cuenta bloqueada" y termina.  
Usa un ciclo while o for para contar intentos.

**Entrada (ejemplo)**  

- `Intento 1: user admin, pass 1111`  
- `Intento 2: user Admin, pass 1234` (no debe aceptar si comparas con equals sensible a mayúsculas)  
- `Intento 3: user admin, pass 1234`

**Salida esperada**  

```text
Datos incorrectos. Te quedan 2 intentos.
Datos incorrectos. Te quedan 1 intentos.
Acceso concedido.
```
(O termina en "Cuenta bloqueada" si los tres fallan.)

---

## 15. Gestión de inventario con clase y menú (difícil)

**Enunciado**  
Crea una clase Articulo con:  

Atributos privados: codigo (String), descripcion (String), precio (double), existencia (int).  

Getters y setters.  

Método mostrar() que imprima todos los datos.  

Método actualizarExistencia(int cantidad) que sume la cantidad a existencia (puede ser negativa para "vender").  

Si la operación dejaría existencia negativa, no la hagas y avisa con un mensaje.  

En main:  

Define un arreglo de Articulo de tamaño fijo (por ejemplo 5).  

Crea un menú con do-while y switch:  

- Agregar artículo (en la primera posición libre del arreglo).  
- Mostrar todos los artículos (solo los no nulos).  
- Vender artículo: pide código y cantidad, busca el artículo en el arreglo, y usa actualizarExistencia(-cantidad) validando que haya suficiente.  
- Reabastecer artículo: similar a vender, pero suma existencias.  
- Salir.

Usa manejo de errores para lectura numérica (precio, existencia, cantidad).

**Entrada (ejemplo, flujo reducido)**  

- `Opción 1: agregar artículo código A1, desc "Lapicero", precio 10, existencia 100`  
- `Opción 2: mostrar artículos`  
- `Opción 3: vender código A1, cantidad 30`  
- `Opción 3: vender código A1, cantidad 100` (debe decir que no hay suficiente)  
- `Opción 2: mostrar artículos`  
- `Opción 5: salir`

**Salida esperada (resumen)**  

```text
Artículo agregado correctamente.
Código: A1, Descripción: Lapicero, Precio: 10.0, Existencia: 100
Venta realizada. Nueva existencia: 70
No hay suficiente existencia para vender esa cantidad.
Código: A1, Descripción: Lapicero, Precio: 10.0, Existencia: 70
```
