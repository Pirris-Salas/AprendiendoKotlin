package model

import kotlin.time.measureTimedValue

/**
 * Al colocar los parentesis damos inicio a un método constructor primario y dentro del mismo podemos
 * inicializar las variables. Kotlin automáticamente nos habilitará los setters y getters por default de
 * dichas variables
 */
class Shoe (val sku: Int, val marca: String){

    /**
     * Método Constructor Secundario
     * Se inicializa con la palabra init{}, y solamente se inicializa si el método constructor primario ya se ha
     * activado, es decir cuando haya recibido los parámetros solicitados en el constructor primario
     * Dentro de init, podemos agregar cuálquier sentencia siempre y cuando sea relacionado a las variables declaradas
     * en el constructor primario o dentro del constructor secundario
     */
    init {
        println("Su SKU ID es: $sku")
        println("La marca es: $marca")

    }


    var size: Int = 34 // TALLA MÍNIMA ES 34 - SET POR DEFECTO DE KOTLIN + VALIDACIÓN DE DATO
    set(value) {
        if(value >= 34){
            field = value
        }else{
            field = 34
        }
    }


    var color: String = "White" //ACEPTAMOS CUALQUIER COLOR, LA VARIABLE FIELD ES EL REEMPLAZO DE THIS. PARA LOS
                                //SETTERS Y GETTERS POR DEFECTO DE KOTLIN
    set(value) {
        field = value
    }

    var model: String = "Bots"
    set(value) {
        if (value.equals("Tenis")){
            field = "Bots"
        }else{
            field = value
        }

    }


}