package org.example.controllers.ej1
import controllers.reservaAsientos
import utilities.*
import java.text.DecimalFormat
import java.util.*


data class Punt (
    var x:Float,
    var y:Float,
)

/**
 * Función principal para ejecutar todas las funciones
 * @author Ainara Valdivieso
 * @since 09/12/2024
 *
 */

fun main() {
    val scan = operturaScanner()
    val xy = mostraPunto("Introduce el valor de x: ", scan, "Introduce el valor de Y: ", scan)
    mostrarPunto(xy)
    operacionTranslacion(xy, "Introduce el valor de a (desplazamiento x) y el de b (desplazamiento y) \npara la operación de translación: ", scan, scan)
    operacionEscalado(xy, "Introduce el valro de a para la operación de escalado: ", scan)
    puntosIguales(xy)
    cerrarScanner(scan)
}

/**
 * Función para añadir los valores del punto
 * @author Ainara Valdivieso
 * @since 09/12/2024
 *
 * @param msg mensaje para preguntar al usuario que valor quiere para x
 * @param scan para escribir el valor de x
 * @param msg2 mensaje para preguntar al usuario que valor quiere para y
 * @param scan2 para escribir el valor de y
 *
 * @return los valores del punto
 */

fun mostraPunto (msg: String, scan : Scanner, msg2:String, scan2 : Scanner) : Punt {
    print(msg)
    var x = scan.nextFloat()
    print(msg2)
    var y = scan2.nextFloat()
    var punto : Punt = Punt(x, y)
    return punto
}

/**
 * Función para sumar los puntos
 *  @author Ainara Valdivieso
 *  @since 09/12/2024
 *
 * @param punto los valores del punto (x, y)
 * @param msg mensaje para preguntar el valor para incrementar la x
 * @param scan valor para escribir el valor para incrementar la x
 * @param msg2 mensaje para preguntar el valor para incrementar la y
 * @param scan2 valor para escribir el valor para incrementar la y
 */
fun operacionTranslacion(punto : Punt, msg: String, scan : Scanner, scan2: Scanner) {
    val verde = "\u001b[32m"
    val reset = "\u001b[0m"
    print(msg)
    val a = scan.nextFloat()
    val b = scan2.nextFloat()
    println(verde + "(${punto.x + a}" + " ${punto.y + b})" + reset)
}

/**
 * Función para mostrar al usuario los valores del punto en el formato deseado
 * @author Ainara Valdivieso
 * @since 09/12/2024
 *
 * @param punto los valores del punto (x, y)
 */

fun mostrarPunto(punto : Punt) {
    val verde = "\u001b[32m"
    val reset = "\u001b[0m"
    val df = DecimalFormat("0.000000")
    println(verde + "(${df.format(punto.x)}" + " ${df.format(punto.y)})" + reset)
}

/**
 * Función para multiplicar los valores de x, y
 * @author Ainara Valdivieso
 * @since 09/12/2024
 *
 * @param punto los valores del punto (x, y)
 * @param msg mensaje para preguntar los valores
 * @param scan valor para escribir los valores
 *
 */

fun operacionEscalado(punto : Punt, msg: String, scan: Scanner) {
    val verde = "\u001b[32m"
    val reset = "\u001b[0m"

    print(msg)
    val a = scan.nextFloat()
    println(verde + "(${punto.x * a}" + " ${punto.y * a})" + reset)
}

/**
 * Función para comparar que la x y la y tengan el mismo valor
 * @author Ainara Valdivieso
 * @since 09/12/2024
 *
 * @param punto los valores del punto (x, y)
 */

fun puntosIguales(punto : Punt) {
    val verde = "\u001b[32m"
    val reset = "\u001b[0m"
    val result : Boolean
    if (punto.x == punto.y) result = true
    else result = false

    println("Los puntos son iguales: " + verde + result + reset)
}




