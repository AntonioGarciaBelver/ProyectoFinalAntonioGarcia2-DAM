package models

class Musculo(val id: Int, val nombre: String, val imagen: Int, val ejercicios: List<Ejercicio> ) {

    override fun toString(): String {
        return nombre
    }
}