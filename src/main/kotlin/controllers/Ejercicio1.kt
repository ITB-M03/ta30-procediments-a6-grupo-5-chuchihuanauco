package org.example.controllers.ej1
import utilities.*
import java.text.DecimalFormat
import java.util.*


data class Punt (
    var x:Float,
    var y:Float,
)

fun main() {
    val scan = operturaScanner()
    val xy = mostraPunt("Introduce el valor de x: ", scan, "Introduce el valor de Y: ", scan)
    mostrarResultado(xy)

    cerrarScanner(scan)
}

fun mostraPunt (msg: String, scan : Scanner, msg2:String, scan2 : Scanner) : Punt  {
    print(msg)
    var x = scan.nextFloat()
    print(msg2)
    var y = scan2.nextFloat()
    var punto : Punt = Punt(x, y)
    return punto
}

fun operacionTranslacion(puntos : Punt, msg: String, scan : Scanner, scan2: Scanner) : Punt {
    print(msg)
    val a = scan.nextFloat()
    val b = scan2.nextFloat()

    val punto : Punt = Punt(puntos[] + a, puntos[] + b)

}

fun mostrarResultado(punto : Punt) {
    val df = DecimalFormat("0.000000")
    println("(${df.format(punto.x)}" + " ${df.format(punto.y)})")
}








/*
import java.util.*

//Creamos la clase de los productos
data class producto (
    var nom_producto : String,
    var precio : Float
)

fun main() {
    val scan: Scanner = Scanner(System.`in`).useLocale(Locale.UK)

    val cant_productos : Int = scan.nextInt()


    var carrito : MutableList<producto> = mutableListOf<producto>()
    repeat(cant_productos){
        //Preguntamos por los valores
        var nombre = scan.next()
        var precio = scan.nextFloat()
        //Los añadimos
        carrito.add(producto(nombre, precio))
    }

    var buscado = scan.nextInt()


    carrito.sortByDescending { it.precio }


    var masCaro = carrito[0]

    var masBarato = carrito[cant_productos -1]

    var productoBuscado = carrito[buscado-1]


    println("EL MES CAR: ${masCaro.nom_producto} ${masCaro.precio}")
    println("EL MES BARAT: ${masBarato.nom_producto} ${masBarato.precio}")
    println("EL BUSCAT: ${productoBuscado.nom_producto} ${productoBuscado.precio}")
}
 */

