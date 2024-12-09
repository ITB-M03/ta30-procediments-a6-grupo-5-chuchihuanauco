package org.example.controllers.ej1
import controllers.reservaAsientos
import utilities.*
import java.text.DecimalFormat
import java.util.*


data class Punt (
    var x:Float,
    var y:Float,
)

fun main() {
    val scan = operturaScanner()
    val xy = mostraPunto("Introduce el valor de x: ", scan, "Introduce el valor de Y: ", scan)
    mostrarPunto(xy)
    operacionTranslacion(xy, "Introduce el valor de a (desplazamiento x) y el de b (desplazamiento y) \npara la operación de translación: ", scan, scan)
    operacionEscalado(xy, "Introduce el valro de a para la operación de escalado: ", scan)
    puntosIguales(xy)
    cerrarScanner(scan)
}

fun mostraPunto (msg: String, scan : Scanner, msg2:String, scan2 : Scanner) : Punt {
    print(msg)
    var x = scan.nextFloat()
    print(msg2)
    var y = scan2.nextFloat()
    var punto : Punt = Punt(x, y)
    return punto
}

fun operacionTranslacion(punto : Punt, msg: String, scan : Scanner, scan2: Scanner) {
    val verde = "\u001b[32m"
    val reset = "\u001b[0m"
    print(msg)
    val a = scan.nextFloat()
    val b = scan2.nextFloat()
    println(verde + "(${punto.x + a}" + " ${punto.y + b})" + reset)
}

fun mostrarPunto(punto : Punt) {
    val verde = "\u001b[32m"
    val reset = "\u001b[0m"
    val df = DecimalFormat("0.000000")
    println(verde + "(${df.format(punto.x)}" + " ${df.format(punto.y)})" + reset)
}

fun operacionEscalado(punto : Punt, msg: String, scan: Scanner) {
    val verde = "\u001b[32m"
    val reset = "\u001b[0m"

    print(msg)
    val a = scan.nextFloat()
    println(verde + "(${punto.x * a}" + " ${punto.y * a})" + reset)
}

fun puntosIguales(punto : Punt) {
    val verde = "\u001b[32m"
    val reset = "\u001b[0m"
    val result : Boolean
    if (punto.x == punto.y) result = true
    else result = false

    println("Los puntos son iguales: " + verde + result + reset)
}




