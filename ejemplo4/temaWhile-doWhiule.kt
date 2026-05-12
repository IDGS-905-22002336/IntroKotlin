

fun main(){
//do-while

var cant = 0
var suma = 0
do{
    println("Ingrese in valor (0 para finalizar):")
    val valor = readln().toInt();
    if (valor !=0){
        suma+=valor
        cant++
    }
}while(valor !=0)
    if(cant !=0){
        val promedio = suma /cant
        print("El promedio es: $promedio")
    }else
    println("No se ingresaron valores")
}