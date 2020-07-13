package model

import kotlin.time.measureTimedValue

class Shoe{

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