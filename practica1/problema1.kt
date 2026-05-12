// Un programa solicita al usuario ingresar el diametro de una tuberia, 
//no se permiyen valores negativos o cerO. El programa debe pedir el
//dato repetidamente hasta que el usuario ingrese un valor valido.

fun main() {
    var diametro: Int

    do {
        print("Ingresa el diámetro de la tubería: ")
        diametro = readln().toInt()

        if (diametro <= 0) {
            println("El diámetro no puede ser cero")
        }

    } while (diametro <= 0)

    println("valor ingresado: $diametro")
}