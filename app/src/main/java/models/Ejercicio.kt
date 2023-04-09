package models

import java.io.Serializable

class Ejercicio (val id: Int, val nombre: String ,val imagen:Int, val imagenes: List<Int>,var peso: String ,var repeticiones:String):
    Serializable { //
}