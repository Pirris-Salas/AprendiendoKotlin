package model

/**
 * Al colocar los parentesis damos inicio a un método constructor primario y dentro del mismo podemos
 * inicializar las variables. Kotlin automáticamente nos habilitará los setters y getters por default de
 * dichas variables
 */
class Shoe (name: String, description: String, sku: Int, val brand: String) :
        Product(name, description, sku){ // Herencia () : Product(){}, CONSTRUCTOR PRIMARIO DE LA CLASE PADRE HEREDADO

   //EN LA HERENCIA AL HABER UN MÉTODO CONSTRUCTOR PADRE Y UNO HIJO LOS MISMOS DEBEN DE SER COMBINADOS EN LA CLASE HIJA


// METODOS TRAIDOS A TRAVÉS DE LA HERENCIA ASIGNADA CON LA CLASE PRODUCT
//EN LOS METODOS DE LA CLASE PRODUCT DEBEN DE IR ANTECEDIDOS POR LA PALABRA OPEN
// PARA EJECUTAR UN MÉTODO Y SU RESULTADO DENTRO DE LA CLASE HIJA, SE DEBE ESCRIBIR LA PALABRA SUPER.nombre de la clase()
    override fun create(): String {
        return "CreateShoe"
    }

    override fun read(): String {
        return "ReadShoe"
    }

    override fun update(): String {
        return "UpdateShoe"
    }

    override fun delete(): String {
        return "DeleteShoe"
    }


    override fun toString(): String {
        // return super.toString() LA PALABRA SUPER DA A ENTENDER EL NIVEL DE ACCESO QUE TIENE ESTE MÉTODO, SOBRE TODAS
        // LAS CLASES
        return super.toString() + "SKU ID: $sku \nMarca: $brand \nModelo: $model \nSize: $size \nColor: $color "

        //ACÁ AGREGAMOS LAS PALABRAS SUPER.nombre de la clase, de forma que combinamos el método toString()
        // de la clase padre Product() y de la clase hijo Show(). Se combina mediante concatenación +
    }

    /**
     * Herencia y Polimorfismo
     * Herencia, se utiliza mediante la colocación de : "dos puntos" después del método constructor primario de la
     * clase
     * Clase Any() - Conocida como superclase, en Kotlin es la clase padre de todo el código por defecto
     * Polimorfismo, básicamente se basa en reutilizar métodos de la clase padre.
     * En este ejemplo tomamos el método toString() de la clase Any() y lo editamos a nuestro placer
     * Algo curioso es que este método fué capaz de tomar los datos de todas las variables sin importar el scope
     * del método. Para llamar un método de la clase padre utilizamos la palabra override
     */


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Método Constructor Secundario
     * Se inicializa con la palabra init{}, y solamente se inicializa si el método constructor primario ya se ha
     * activado, es decir cuando haya recibido los parámetros solicitados en el constructor primario
     * Dentro de init, podemos agregar cuálquier sentencia siempre y cuando sea relacionado a las variables declaradas
     * en el constructor primario o dentro del constructor secundario
     */
    init {
        println("Su SKU ID es: $sku")
        println("La marca es: $brand")

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