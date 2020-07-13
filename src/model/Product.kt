package model

open class Product (var name: String, var description: String, var sku: Int) {

    //CRUD - Create / Read / Update / Delete

    override fun toString(): String {
        return "Nombre: $name \nDescripción: $description \nSKU: $sku\n"
    }

    open fun create(): String{

        return "Create"
    }

    open fun read(): String{

        return "Read"
    }

    open fun update(): String{

        return "Update"
    }

    open fun delete(): String{

        return "Delete"
    }
}