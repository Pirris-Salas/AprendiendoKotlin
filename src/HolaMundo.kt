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

}