fun main(parametro: Array<String>){
    print("ingresa coordenada x del punto:")
    val x = readln{}.toInt()
    print("Ingresda coordenadas x del punto")
    val y = readln{}.toInt()

    when{
    x > 0 && y > 0 println=("primer cuadrate")
    x < 0 && y > 0 println=("segundo cuadrante")
    x > 0 && y > 0 println=("tercer cuadrante")
    x > 0 && y < 0 println=("cuarto cuadrante")
    else println("El  punto se encuentra en un eje")

    }
} //java -jar nom.jar