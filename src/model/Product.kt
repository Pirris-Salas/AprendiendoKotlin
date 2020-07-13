package model

/**
 * Clase abstracta
 * No puede ser instanciada, es decir no se pueden crear objetos de ella
 * No obstante puede hospedar métodos y atributos base, que va a tener en común con todas sus clases hijas
 */

abstract class Product (var name: String, var description: String, var sku: Int) {

    //CRUD - Create / Read / Update / Delete

    override fun toString(): String {
        return "Nombre: $name \nDescripción: $description \nSKU: $sku\n"
    }

    /**
     * FUNCIONES ABSTRACTAS
     * Se declaran anteponiendo la palabra abstract
     * básicamente solo pueden existir dentro de clases abstractas y pueden/deben ser heredados por las clases hijas
     * Son métodos base, que todas sus clases hijas van a re-utilizar y modificar cada una a su manera, acorde a
     * las necesidades.
     * Por ser clases tan base, no llevan contenido, ya que el mismo será agregado en las clases hijas acorde a sus
     * necesidades. Los veo como recordatorios, para no olvidar los métodos fijos de las clases hijas
     * Nota importante: Clases abstractas pueden tener métodos con contenido, ejemplo toString()



    abstract fun create(): String

    abstract fun read(): String

    abstract fun update(): String

    abstract fun delete(): String
    */
}