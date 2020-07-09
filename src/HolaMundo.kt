const val N = "Name" // Const siempre se declara como variables globales y nunca como variables locales
// Const se asigna en el proceso de compilación

var n = "n" // Esto es una mala práctica ya que var es una variable changeable, por lo que va en contra de los principios
// de la inmutabilidad en la programación funcional

val j = "n" // Esto es válido, ya que val es una variable unchangeable, por lo que no va en contra de los pricipios de
// la inmutabilidad. Val es se asigna en el proceso de ejecución del software. Val se utiliza más en variables locales
// de los métodos y no en variables globales como Const

//Funciones Puras
fun main(args: Array<String>){
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
    println("t es mayor que r. ${t>r}")

    /**
     * Esto es en tiempo de ejecución, ya que agregamos "Luis" como parámetro de args y el mismo es asignado hasta que se
     * ejecuta el programa.
     * Val: Tiempo de ejecución
     * Const: Tiempo de compilación
     */
    val name:String = args[0]
    println(name)

    println(N) // N es declarado como variable global, y con un valor preasignado en tiempo de compilación




    /**
     * Esto corresponde a la clase acerca de Strings y sus diferentes métodos
     */
    val nombre = "Luis"
    val apellido: String = "Salas" // Kotlin no es estrictamente tipado, no obstante es una buena práctica tipar las
                                  //variables
    val x: Int = 4                // Un ejemplo de tipado para las variables int

    println("Tu nombre es: " +nombre +" " + apellido)  // esto está permitido, siendo esta la forma de imprimir variables en Java
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
    val parrafo =  """Raw String: En Kotlin, además, tenemos cadenas sin procesar
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
    for (i in oneToFive){ //La Variable oneToFive recorre los valores de 1 al 5 y los agrega en i de manera ascendente
        println(i)
    }

    for (i in 5 downTo (1) ){ // Cuenta regresiva utilizando la funcion downTo(), no funciona con rangos
        println(i)

    }

    val aToE = 'A'..'E'
    for (letter in aToE){  //Imprime letras de manera secuencial en base al orden del abecedario

        println(letter)

    }


    /**
     * OPERADORES LÓGICOS / IF AND WHEN
     */

    val numero = 8
    if (numero.equals(5)){
        println("El número $numero es igual a 5")
    }else{

        println("El número: " + numero + " es diferente de 5")
    }

    //When, es similar a Switch y en el en todos los casos se utiliza con variables tipo rango
    /**
     * When, una vez que encuentra un caso válido entra en este y no continúa con el resto de las probabilidades
     * Básicamente toma el primero que encuentra y se ejecuta, no es necesario colocar el indicador break
     */
    when(numero){
        in 1..3 -> println("El número: $numero está dentro del rango de 1 a 3")
        in 4..6 -> println("El número: $numero está en el rango de números de 4 a 6")
        !in 10..11 -> println("El número $numero no es ni 10 o 11 ")
        else -> println("El número $numero es incontrolable e inmedible")
    }

    /**
     * Bucles While y doWhile en Kotlin
     * While: Primero valida y luego ejecuta
     * doWhile: Primero ejecuta y luego valida
     */
    var i = 1
    while (i <= 10){


        println("Estamos incrementando una variable tipo var, su valor es $i")
        i = i.inc() // incrementa la variable i en 1 cada ciclo, una forma alterna de i++, o de i += 1
    }

    i = 1


    // Primero ejecuta la sentencia y luego valida
    do{
        println("Estamos incrementando una variable tipo var, su valor es $i")
        i++
    }while (i <= 10)

}


