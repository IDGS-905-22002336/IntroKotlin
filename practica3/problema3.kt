//Un controlador PLC bloquea el acceso despues de 3 intentos
// fallidos de ingresar una clave de seguridad.

fun main() {
    val claveC = "1234"
    var intentos = 0
    var claveI: String

    while (intentos < 3) {

        print("Ingresa la clave de seguridad: ")
        claveI = readln()

        if (claveI == claveC) {
            println("Acceso permitido")
            return
        } else {
            intentos++
            println("Clave incorrecta")
        }
    }

    println("bloqueado por intentos fallidos")
}