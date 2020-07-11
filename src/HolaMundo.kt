const val N = "Name" // Const siempre se declara como variables globales y nunca como variables locales
// Const se asigna en el proceso de compilación

var n = "n" // Esto es una mala práctica ya que var es una variable changeable, por lo que va en contra de los principios
// de la inmutabilidad en la programación funcional

val j = "n" // Esto es válido, ya que val es una variable unchangeable, por lo que no va en contra de los pricipios de
// la inmutabilidad. Val es se asigna en el proceso de ejecución del software. Val se utiliza más en variables locales
// de los métodos y no en variables globales como Const

//Funciones Puras
fun main(args: Array<String>) {
    println("Hola Mundo")

    val a = 4
    val b = 6

    /**
     * Aca asignamos operadores básicos de Kotlin. En Kotlin todo son objetos
     * Por lo que podemos declarar variables y ver métodos como suma
     * resta, multiplicación y división
     */

    println(a.plus(b)) //suma
    println(a.minus(b)) //resta
    println(a.times(b)) //multiplicación
    println(a.div(b)) // división

    /**
     * Devuelve un valor negativo y unaryPlus devuelve un valor positivo
     */
    var z = -2
    var y = z.unaryMinus()
    println("y: $y")

    /**
     * Valores boolean
     */
    var f = true
    var s = f.not()
    println("s: $s")

    val t = -12
    val r = 12
    println("t es mayor que r. ${t > r}")

    /**
     * Esto es en tiempo de ejecución, ya que agregamos "Luis" como parámetro de args y el mismo es asignado hasta que se
     * ejecuta el programa.
     * Val: Tiempo de ejecución
     * Const: Tiempo de compilación
     */
    val name: String = args[0]
    println(name)

    println(N) // N es declarado como variable global, y con un valor preasignado en tiempo de compilación


    /**
     * Esto corresponde a la clase acerca de Strings y sus diferentes métodos
     */
    val nombre = "Luis"
    val apellido: String = "Salas" // Kotlin no es estrictamente tipado, no obstante es una buena práctica tipar las
    //variables
    val x: Int = 4                // Un ejemplo de tipado para las variables int

    println("Tu nombre es: " + nombre + " " + apellido)  // esto está permitido, siendo esta la forma de imprimir variables en Java
    println("Tu nombre es: $nombre $apellido") // esta es la forma predilecta de imprimir datos en Kotlin, la cual es
    // muy similar a PHP, no obstante ambas son válidas

    val ejemplo1 = "Luis\t- Tabula"
    val ejemplo2 = "Luis\bRetrocede el cursor de texto 1 carácter"
    val ejemplo3 = "Luis\nCrea un salto de linea"
    val ejemplo4 = "Luis\rMueve el cursor de texto al inicio de la linea en la que está"
    val ejemplo5 = "Luis\'puedo usar comilla simple"
    val ejemplo6 = "Luis\"puedo usar comillas"
    val ejemplo7 = "Luis\\puedo usar slash"
    val ejemplo8 = "Luis\$puedo usar el símbolo de dolar"

    println(ejemplo1)
    println(ejemplo2)
    println(ejemplo3)
    println(ejemplo4)
    println(ejemplo5)
    println(ejemplo6)
    println(ejemplo7)
    println(ejemplo8)


    // Raw String
    val parrafo = """Raw String: En Kotlin, además, tenemos cadenas sin procesar
                      de tres comillas que pueden contener caracteres especiales sin 
                      la necesidad de escapar de ellas. 
                      .trimIndent(): Detecta una sangría mínima común de todas las 
                      líneas de entrada, la elimina de cada línea y también elimina 
                      la primera y la última si están en blanco.
                      .trimMargin(): Recorta los caracteres de espacio en blanco iniciales 
                      seguidos de un marginPrefix de cada línea de una cadena de origen y 
                      elimina la primera y la última línea si están en blanco.""".trimIndent()

    println(parrafo)

    val parrafo2 = """** Raw String: En Kotlin, además, tenemos cadenas sin procesar
                      ** de tres comillas que pueden contener caracteres especiales sin
                      ** la necesidad de escapar de ellas. 
                      ** .trimIndent(): Detecta una sangría mínima común de todas las 
                      ** líneas de entrada, la elimina de cada línea y también elimina 
                      ** la primera y la última si están en blanco.
                      ** .trimMargin(): Recorta los caracteres de espacio en blanco iniciales 
                      ** seguidos de un marginPrefix de cada línea de una cadena de origen y 
                      ** elimina la primera y la última línea si están en blanco.""".trimMargin(marginPrefix = "** ")
    // con marginPrefix filtramos los caracteres que deseamos remover de la impresión

    println(parrafo2)

    /**
     * Clase acerca de rangos en Kotlin
     */
    val oneToFive = 1..5
    for (i in oneToFive) { //La Variable oneToFive recorre los valores de 1 al 5 y los agrega en i de manera ascendente
        println(i)
    }

    for (i in 5 downTo (1)) { // Cuenta regresiva utilizando la funcion downTo(), no funciona con rangos
        println(i)

    }

    val aToE = 'A'..'E'
    for (letter in aToE) {  //Imprime letras de manera secuencial en base al orden del abecedario

        println(letter)

    }

    /**
     * OPERADORES LÓGICOS / IF AND WHEN
     */

    val numero = 8
    if (numero.equals(5)) {
        println("El número $numero es igual a 5")
    } else {

        println("El número: " + numero + " es diferente de 5")
    }

    //When, es similar a Switch y en el en todos los casos se utiliza con variables tipo rango
    /**
     * When, una vez que encuentra un caso válido entra en este y no continúa con el resto de las probabilidades
     * Básicamente toma el primero que encuentra y se ejecuta, no es necesario colocar el indicador break
     */
    when (numero) {
        in 1..3 -> println("El número: $numero está dentro del rango de 1 a 3")
        in 4..6 -> println("El número: $numero está en el rango de números de 4 a 6")
        !in 10..11 -> println("El número $numero no es ni 10 o 11 ")
        else -> println("El número $numero es incontrolable e inmedible")
    }

    /**
     * for and foreach
     *
     */
    var daysOfWeek = listOf("Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado")

    for (i in daysOfWeek) {
        println(i)
    }

    /**
     * Imprimiendo for con índices
     * Al parecer los paréntesis nos ayudan a declarar varias variables dentro de un for
     * Al parecer los índices siempre van a ir primero, de izquierda a derecha, por esa razón el orden de las variables
     * declaradas
     */
    for ((index, day) in daysOfWeek.withIndex()) {
        println("$index :$day")
    }

    /**
     * For each, una manera más simplificada de for, no obstante es mas lenta
     * Revisar las distintas variaciones posibles encontradas
     * IT es una variable tipo objeto receptora de los valores por default en foreach
     */
    daysOfWeek.forEach {
        println(it)
    }

    daysOfWeek.forEach {
        println("Index: ${daysOfWeek.indexOf(it)} - $it")
    }

    daysOfWeek.withIndex().forEach {
        println("${it.index} => ${it.value}")
    }

    /**
     * CLASE DE BREAK, CONTINUE Y LABELS EN KOTLIN
     */
    //BREAK - Acá podemos ver 2 for anidados, i recorre 3 valores (1,2 y 3), mientras que j debería de recorrer 5, no
    //obstante se declara un if que al llegar j al valor de 3 se detenga e imprima los valores de las variables i y j
    for (i in 1..3) {
        println("\ni: $i")
        for (j in 1..5) {
            if (j.equals(3)) break
            println("j: $j")
        }
    }

    //CONTINUE - En este caso se declara un if en la que si la variable j es igual a 3 debe de continuar, lo que hace que
    //el print de 3 se omita y continue con los valores 4 y 5
    for (i in 1..3) {
        println("\ni: $i")
        for (j in 1..5) {

            if (j.equals(3)) continue
            println("j: $j")
        }
    }

    //LABELS - Se utilizan para definir en que ciclo continuar una vez que un ciclo se detiene, es decir cuál será el
    //siguiente ciclo al que saltará. Siempre irá acompañado por brak o continue

    //BREAK Y LABEL -- En este caso se termina el ciclo donde inicia y termina el label @terminarTodoCiclo
    terminarTodoCiclo@ for (i in 1..3) {
        println("\ni: $i")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) break@terminarTodoCiclo
                println("k: $k")
            }
        }
    }

    //CONTINUE UTILIZANDO LABEL-- hace saltar o escapar una iteración entera que en este caso es J.
    //
    println()
    terminar@ for (i in 1..3) {
        println("\ni: $i")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) continue@terminar
                println("k: $k")
            }
        }
    }

    /**
     * Null and DoubleBang
     */
    val nula: Int? // SE DECLARA UNA VARIABLE NULA DE FORMA QUE KOTLIN NO ARROJA UN NullPointerException

    //var msg: String?
    //msg = null
    //println(msg!!.length) // Double bang !!, es para ejecutar la excepción, no obstante no es una buena práctica


    /**
     * Ejemplos de variables con valores null, combinando double bang y el operador elvis
     * Siendo  estas algunas formas de un buen manejo de variables null
     */
    try {
        var computer: String? = null // SE DECLARA UNA VARIABLE NULA DE FORMA QUE KOTLIN NO ARROJA UN NullPointerException
        println(computer!!.length) // Double bang !!, es para ejecutar la excepción, no obstante no es una buena práctica
    } catch (e: NullPointerException) {
        println("En esta aplicación no se admiten valores nulos")
    }

    /**
     * Usando el simbolo de pregunta al declarar la variable nula y al imprimirla antes de llamar el método .length
     * Llamada segura
     */
    var compute: String? = null
    var longitud: Int? = compute?.length // De esta forma podemos imprimir valores nulos sin arrojar la excepción
    println("Longitud: $longitud")


    /**
     * Operador Elvis
     */
    var teclado: String? = null
    var longitudTeclado: Int = teclado?.length ?: 0 //Acá utilizamos el operador elvis para reemplazar el valor null por
    // el valor 0. Elvis es muy similar a un operador ternario, solo que de nulls. Nótese que en ningún momento se
    // declaró como null la variable longitudTeclado
    println("Longitud del teclado: $longitudTeclado")

    /**
     * Ejercicio utilizando listas con valores nulos y realizar el filtrado respectivo
     */
    val listWithNulls: List<Int?> = listOf<Int?>(7, null, null, 6) // Nótese como se declara un array que acepte valores
    //nulos, mediante Int?
    println(listWithNulls)

    //REALIZANDO EL FILTRO PARA REMOVER LOS VALORES NULL
    val listWithoutNulls: List<Int?> = listWithNulls.filterNotNull()
    println(listWithoutNulls)


    /**
     * CLASE ACERCA DE ARRAYS
     * LOS ARRAYS SIEMPRE SERÁN EN PLURAL
     */

    //ESTE ES UN ARRAY QUE SOPORTA OBJETOS
    val countries: Array<String> = arrayOf("India", "Mexico", "Colombia", "Argentina", "Chile", "Costa Rica")

    //ESTE ES UN ARRAY QUE SOPORTA OBJETOS
    val days: Array<String> = arrayOf<String>("Lunes", "Martes", "Miercoles")

    //ESTE ES UN ARRAY QUE SOPORTA DATOS PRIMITIVOS Y POR ESO NOS PERMITE USAR OPERADORES PRIMITIVOS
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 45, 34, 10, 15, 13)

    //Imprimiendo un array de una manera sencilla
    for (day in days) {
        println("Días: $day")
    }

    //Promedio de los numeros
    var suma =0
    for(num in numbers){

        suma += num // Se suma cada uno de los números contemplados en el array, recorridos a través del for
    }
    val promedio = suma / numbers.size // Se divide el resultado de la sumatoria de los valores entre la cantidad de
                                       // de valores contemplado a través  del arreglo. Dicho valor se obtiene a través
                                       // del método .size
    println("El promedio del arreglo numbers es: $promedio")

    /**
     * En esta clase, veremos como convertir un array de objectos a primitivo y a su vez utilizar funciones asignadas
     * a los array de objetos en Kotlin
     */

    var arrayObject :Array<Int> = arrayOf(1,2,3)  // Array de objetos
    var arrayPrimitive :IntArray = arrayObject.toIntArray() // Declaramos un array primitivo y convertimos el array
                                                            // de objetos a un array primitivo

    //METODOS DE ARRAY DE OBJETOS

    var sum = arrayObject.sum()
    println("La suma del array de objetos es: $sum") // METODO SUMA DE ARRAYS

    // MEDIANTE ESTE MÉTODO PODEMOS AGREGAR VALORES A LOS ARREGLOS .plus()
    arrayObject = arrayObject.plus(4)
    for (a in arrayObject){
        println("Array: $a")
    }

    //CON EL MÉTODO .reversedArray() invertimos todos los números dentro del arreglo de manera permanete hasta que con
    //otra sentencia se restaure el orden de los valores
    arrayObject = arrayObject.reversedArray()
    for (a in arrayObject){
        println("Array en orden reverso: $a")
    }

    //CON ESTE MÉTODO COLOCAMOS UN REVERSE AL PREVIO REVERSE DEJANDO EL ORDEN DE LOS DATOS A COMO ESTABAN AL PRINCIPIO
    // MUY IMPORTANTE TENER NOCIÓN DE ESTE COMANDO Y EL ORDEN ACTUAL DE LOS VALORES
    arrayObject.reverse()
    for (a in arrayObject){
        println("Array en orden original: $a")
    }


    /**
     * EN ESTA CLASE APRENDEREMOS ACERCA DE LAS EXPRESIONES Y LOS VALORES
     * $ CON ESTE SÍMBOLO PODEMOS IMPRIMIR EL VALOR DE UNA OPERACIÓN
     * ${} CON ESTA EXPRESIÓN PODEMOS REALIZAR OPERACIONES DENTRO DE LA FUNCIÓN DE IMPRESIÓN DE KOTLIN
     */

    var w = 5
    println("w es igual a 5? ${w==5}") // DEBE DE DEVOLVER TRUE

    var mensaje = "El valor de w es $w"
    w = w.inc()
    println("${mensaje.replace("es", "fue")}, el valor de w ahora es de $w")
    // METODO .replace(), cambia en valor de un char a otro, con ${} podemos ejecutar hasta funciones dentro de las
    //mismas

    /**
     * CLASE ACERCA DE FUNCIONES
     * ASÍ SE INVOCA UNA FUNCIÓN O AL MENOS ES UN EJEMPLO DE  LAS MUCHAS FORMAS QUE HAY
     * A SU VEZ, ESTAMOS UTILIZANDO LA EXPRESION ${} PARA PASARLE LOS DATOS A UNA FUNCION Y TRAERLOS
     * EXISTEN 2 FUNCIONES EN KOTLIN, FUNCIONES POR DEFECTO DE KOTLIN Y LAS QUE CREAMOS, UN EJEMPLO DE
     * FUNCION POR DEFECTO ES .MATH()
     */

    val numeros: IntArray = intArrayOf(2,3,4,7)
    println("El promedio del arreglo es: ${promedioNumeros(numeros, 2)}")

}

/**
 * Esta funcion determina el promedio de un arreglo de numeros y le suma un número al final
 * @param numeros Arreglo de números, o array
 * @param n Variable que será sumada al promedio
 * @return devuelve el promedio más un numero a elección
 * En las funciones es importante declarar los tipos de variables dentro de los parentesis
 * Y también es importante el tipo de dato a devolver, en este caso es (): Int, y se declara entre los parentesis
 * y las llaves {}
 */
fun promedioNumeros (numeros: IntArray, n: Int): Int{

    //Promedio de numeros
    var sum = 0
    for(a in numeros){
        sum += a
    }
    return (sum / numeros.size) + n
}



