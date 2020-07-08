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


}