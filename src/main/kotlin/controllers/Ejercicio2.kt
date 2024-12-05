package controllers
import utilities.*
import java.util.*

/**
 * ## La poderosa fun mian el maestro de la orquesta
 * @author Angel Sardinha
 * @since 1 - 0
 */
fun main() {
    var scan = operturaScanner()

    var asientosCine = salaVacia()

    bucle(asientosCine, scan)

    cerrarScanner(scan)
}

/**
 * ## La poderosa funcion definir una matriz vacia con **"_"**
 * @author Angel Sardinha
 * @since 1 - 0
 * @return Retorna una matriz llena de **"_"**
 */
fun salaVacia() : Array<Array<String>> {
    //Definimos los valores del tamanyo de la matriz
    val veinte = 20
    val quince = 15

    //Inicializamos una matriz llena de "_"
    var asientosCine = Array(veinte) { Array<String>(quince) { " _ " } }

    return asientosCine
}

/**
 * ## La poderosa funcion de visualizar la disponibilidad de la matriz
 * @author Angel Sardinha
 * @since 1 - 0
 * @param asiesntosCine -> La matriz de la que queremos saber la disponibilidad
 */
fun visualizarDisponibilidad(asiesntosCine : Array<Array<String>>) {
    for(i in 0 until 20) {
        for(j in 0 until 15) {
            print("${asiesntosCine[i][j]} ")
        }
        println(" ")
    }
}

/**
 * ## La poderosa funcion de mostrar un mensaje por pantalla
 * @author Angel Sardinha
 * @since 1 - 0
 * @param num1 -> Es la fila de la matriz
 * @param num2 -> Es la columna de la matriz
 * @param asiesntosCine -> Es la matriz
 * @return Retorna la matriz con la coordenada que se le da cambiada por una **"X"**
 */
fun reservaAsientos(num1 : Int, num2 : Int, asiesntosCine: Array<Array<String>>) : Array<Array<String>> {
    val red = "\u001b[31m"
    val white = "\u001b[0m"
    try {
        if(asiesntosCine[num1][num2] == " X "){
            println(red + "Este asiento está ocupado" + white)
            println(" ")
        }
        else{
            asiesntosCine[num1][num2] = " X "
            println("Se ha realizado correctamente la reserva del asiento")
            println(" ")
        }
    }catch ( e : ArrayIndexOutOfBoundsException) {
        println(red + "No es posible este asiento no exite" + white)
        println(" ")
    }

    return asiesntosCine
}

/**
 * ## La poderosa funcion de mostrar un mensaje por pantalla
 * @author Angel Sardinha
 * @since 1 - 0
 * @param msg -> El mensaje que se mostrara en pantalla
 * @param scan -> El teclado
 * @return Retorna la opción elegida
 */
fun menu(msg : String, scan : Scanner) : Int{
    var opcion : Int

    print("¿Qué te gustaría hacer? (Coloca el número de la opción) \n" +
            "Opción 1 : Visualizar la disponibilidad \n" +
            "Opción 2 : Reservar asiento \n" +
            "Opción 3 : Vaciar la sala \n" +
            "Opción 4 : Finalizar el programa \n" +
            " ")

    print(msg)
    opcion = scan.nextInt()

    return opcion
}

/**
 * ## La poderosa funcion de mostrar un mensaje por pantalla
 * @author Angel Sardinha
 * @since 1 - 0
 * @param asientosCine -> La matriz que vamos a utilizar
 * @param scan -> Esto es el teclado para que el usuario introduzca los datos pedidos
 */
fun bucle(asientosCine: Array<Array<String>>, scan: Scanner) {
    var opcion = 0
    var asientos = asientosCine

    val red = "\u001b[31m"
    val white = "\u001b[0m"

    val uno = 1
    val dos = 2
    val tres = 3
    val cuatro = 4

    while(opcion != cuatro){
        opcion = menu("Digame su opción: ", scan)
        if(opcion == uno){
            visualizarDisponibilidad(asientos)
        }
        else if(opcion == dos){
            var num1 = pedirNumerito("Me gustaría que me dijeses en que fila te gustaría: ", scan) - uno
            var num2 = pedirNumerito("Me gustaría que ahora me dijeses la columna: ", scan) - uno
            reservaAsientos(num1, num2, asientos)
        }
        else if(opcion == tres){
            asientos = salaVacia()
        }
        else if(opcion == cuatro){
            mostrarUnMensaje("Gracias por utilizar el programa.")
        }
        else {
            mostrarUnMensaje(red + "El numero seleccionado no es válido" + white)
        }
    }
}

/**
 * ## La poderosa funcion de mostrar un mensaje por pantalla
 * @author Angel Sardinha
 * @since 1 - 0
 * @param msg -> El mensaje que saldra por pantalla
 */
fun mostrarUnMensaje(msg : String){
    println(msg)
}