/*
crear un programa que permita calcular el area de 4 figuras utilizando
funciones para cada figura, mostrara un menu apara elegir la figura a 
calcular el area, pedira los valores necesariosy mostrara el resultad,
a continuacion mostrara nuevamente el menu termina al elegir opcion 5
 */

fun areaCuadrado(lado: Double): Double {
    return lado * lado
}

fun areaRectangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun areaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun areaCirculo(radio: Double): Double {
    return Math.PI * radio * radio
}

fun main() {

    var opcion: Int

    do {
        println("\nopciones")
        println("1.cuadrado")
        println("2.rectangulo")
        println("3.triangulo")
        println("4.circulo")
        println("5.Salir")
        print("Selecciona una opcion: ")

        opcion = readln().toInt()

        when (opcion) {

            1 -> {
                print("Ingresa el lado del cuadrado: ")
                val lado = readln().toDouble()
                val resultado = areaCuadrado(lado)
                println("El area del cuadrado es: $resultado")
            }

            2 -> {
                print("Ingresa la base del rectangulo: ")
                val base = readln().toDouble()
                print("Ingresa la altura del rectangulo: ")
                val altura = readln().toDouble()
                val resultado = areaRectangulo(base, altura)
                println("El area del rectangulo es: $resultado")
            }

            3 -> {
                print("Ingresw la base del triangulo: ")
                val base = readln().toDouble()
                print("Ingrese la altura del triangulo: ")
                val altura = readln().toDouble()
                val resultado = areaTriangulo(base, altura)
                println("El area del triangulo es: $resultado")
            }

            4 -> {
                print("Ingrese el radio del circulo: ")
                val radio = readln().toDouble()
                val resultado = areaCirculo(radio)
                println("El area del circulo es: $resultado")
            }

            5 -> {
                println("Terminado")
            }

            else -> {
                println("No valido")
            }
        }

    } while (opcion != 5)
}