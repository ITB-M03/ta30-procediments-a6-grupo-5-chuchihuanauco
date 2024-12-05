package utilities
import java.util.*

/**
 * ## Se abre el scanner broski
 * @author Angel Sardinha
 * @since 1-0
 * @return Se hace un return con el scanner inicializado
 */
fun operturaScanner() : Scanner {
    var scan = Scanner(System.`in`).useLocale(Locale.UK)

    return scan
}

/**
 * ## Se cierra el scanner broski
 * @author Angel Sardinha
 * @since 1-0
 * @param Scanner -> Se introduce el scan para cerrarlo
 */
fun cerrarScanner(scan : Scanner) {
    scan.close()
}

/**
 * ## Pedir Numerito
 * @author Angel Sardinha
 * @since 1-0
 * @param msg -> el msg es el mensaje que aparecera en pantalla para pedir el numero
 * @param scan -> el scan es el Scanner, que utilizaremos para obtener el numero
 * @param num -> El numero que obtendremos por pantalla
 * @return retornaremos el numero que hemos obtenido
 */
fun pedirNumerito(msg : String, scan : Scanner) : Int {
    var num : Int

    print(msg)
    num = scan.nextInt()

    return num
}

/**
 * ## Pedir Numerito Con Decimales
 * @author Angel Sardinha
 * @since 1-0
 * @param msg -> el msg es el mensaje que aparecera en pantalla para pedir el numero
 * @param scan -> el scan es el Scanner, que utilizaremos para obtener el numero
 * @param num -> El numero que obtendremos por pantalla
 * @return retornaremos el numero que hemos obtenido
 */
fun pedirNumeritoDouble(msg : String, scan : Scanner) : Double {
    var num : Double

    print(msg)
    num = scan.nextDouble()

    return num
}

/**
 * ## Pedir Strincito
 * @author Angel Sardinha
 * @since 1-0
 * @param msg -> el msg es el mensaje que aparecera en pantalla para pedir el numero
 * @param scan -> el scan es el Scanner, que utilizaremos para obtener el string
 * @param stringcito -> es el string que obtendremos por pantalla
 * @return retornaremos el string que hemos obtenido
 */
fun pedirStringcito(msg : String, scan : Scanner) : String {
    var stringcito : String

    print(msg)
    stringcito = scan.nextLine()

    return stringcito
}