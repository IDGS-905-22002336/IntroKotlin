/*
--- Suma de dos matrices 3x3 en Kotlin ---

Programa que permite al usuario ingresar por teclado
los valores de dos matrices de tamaño 3x3 y posteriormente
realiza la suma de ambas matrices, mostrando el resultado
en pantalla.

--- Explicación del programa ---
Se crean tres matrices:
- matriz1 para almacenar la primera matriz.
- matriz2 para almacenar la segunda matriz.
- resultado para guardar la suma.

El programa:
1. Lee los valores de la primera matriz.
2. Lee los valores de la segunda matriz.
3. Suma ambas matrices.
4. Muestra la matriz resultante.
*/

fun main() {

    val matriz1 = Array(3) { 
        IntArray(3) 
    }
    val matriz2 = Array(3) { 
        IntArray(3) 
    }
    val resultado = Array(3) { 
        IntArray(3) 
    }


    println("Ingrese los valores de la primera matriz:")

    for (i in 0..2) {
        for (j in 0..2) {
            print("Posición [$i][$j]: ")
            matriz1[i][j] = readln().toInt()
        }
    }

    println("\nIngrese los valores de la segunda matriz:")

    for (i in 0..2) {
        for (j in 0..2) {
            print("Posición [$i][$j]: ")
            matriz2[i][j] = readln().toInt()
        }
    }

    for (i in 0..2) {
        for (j in 0..2) {
            resultado[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    println("\nLa suma de las matrices es:")

    for (i in 0..2) {
        for (j in 0..2) {
            print("${resultado[i][j]} ")
        }
        println()
    }
}