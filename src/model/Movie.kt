package model

/**
 * Esto señores, es una definición de Data Class
 * En la que la case de debe declarar bajo estas palabras: data class Nombre (valores a recibir y enviar)
 * Dato importante es que funcionan para el almacenamiento temporal de valores, lo justo y necesario para traer
 * datos de internet y almacenarlos en una base de datos
 * Al igual que los getters y setters de Kotlin, se le puede agregar validación de datos a estas clases
 * Un dato interesante es que las Data Class también pueden declararse dentro de documentos que albergan otras clases
 * como si se tratasen de funciones
 */

data class Movie (val title: String, val creator: String, val duration: Int)