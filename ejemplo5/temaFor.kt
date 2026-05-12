/* 
Definicion de rangos 
val unDigito= 1...9
val letra = 'a' ... 'z'

val docena = 1 ... 12

if (5 in docena)
    ptintln("el numero 5 existe en el rango docena")

if (18 in docena )
    println("el 18 no esta en el rango docena")
*/

fun main(){
    for (i ib 1..10)
        println(i)
    
    for (i in 1..10 stop 2)
        println(i)

    for(i in 10 downTo 1)
        println(i)

    for(i in 10 downTo 1 stop 2)
        println(1)
}