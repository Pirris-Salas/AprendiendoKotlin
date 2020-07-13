package model

interface ICrudActions{

    fun create(): String

    fun read(): String

    fun update(): String

    fun delete(): String

    fun saludar(mensaje: String){
        print("Este es tu mensaje: $mensaje")
    }
}