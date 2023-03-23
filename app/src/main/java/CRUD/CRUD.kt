package CRUD

import com.example.fitnessroutines.R
import models.Ejercicio
import models.Musculo

open class CRUD {

    fun getAllMusculos(): MutableList<Musculo> {
        return mutableListOf (
            Musculo(0,"Abdominales", R.drawable.abdominales, getAllEjerciciosAbdominales()),
            Musculo(1,"BICEPS", R.drawable.biceps, getAllEjerciciosBiceps()),
            Musculo(2,"TRICEPS", R.drawable.triceps, getAllEjerciciosTriceps()),
            Musculo(3,"ESPALDA", R.drawable.espalda, getAllEjerciciosEspalda()),
            Musculo(4,"PECHO", R.drawable.pecho, getAllEjerciciosPecho()),
            Musculo(5,"PIERNAS", R.drawable.piernas, getAllEjerciciosPiernas()),
            Musculo(6,"HOMBROS", R.drawable.hombros, getAllEjerciciosHombros()),
            Musculo(7,"ANTEBRAZOS", R.drawable.antebrazo, getAllEjerciciosAntebrazos()),
            Musculo(8,"GEMELOS", R.drawable.gemelos, getAllEjerciciosGemelos())
        )
    }
    fun getAllEjerciciosAbdominales(): MutableList<Ejercicio>{
        return mutableListOf (
            Ejercicio(0,"Sentadillas en Banco Inclinado", R.drawable.sentadilla_banco_inclinado_1),
            Ejercicio(1,"Levantamiento de Piernas desde Posición Colgada", R.drawable.espalda),
            Ejercicio(2,"Inclinaciones Laterales con Mancuernas", R.drawable.espalda),
            Ejercicio(3,"Abdominales", R.drawable.espalda),
            Ejercicio(4,"Puente Lateral", R.drawable.espalda)
        )
    }
    fun getAllEjerciciosBiceps(): MutableList<Ejercicio>{
        return mutableListOf (
            Ejercicio(0,"Curl", R.drawable.espalda),
            Ejercicio(1,"Curl de Martillo", R.drawable.espalda),
            Ejercicio(2,"Curl Invertido", R.drawable.espalda),
            Ejercicio(3,"Curl del Predicador", R.drawable.espalda),
            Ejercicio(4,"Curl de Biceps con cable", R.drawable.espalda)
        )
    }
    fun getAllEjerciciosTriceps(): MutableList<Ejercicio>{
        return mutableListOf (
            Ejercicio(0,"Pushdowns", R.drawable.espalda),
            Ejercicio(1,"Extensiones de Triceps", R.drawable.espalda),
            Ejercicio(2,"Press de Banca con Agarre Cerrado", R.drawable.espalda),
            Ejercicio(3,"Flexiones Diamante", R.drawable.espalda),
            Ejercicio(4,"Fondos con Agarre Cerrado", R.drawable.espalda)
        )
    }
    fun getAllEjerciciosEspalda(): MutableList<Ejercicio>{
        return mutableListOf (
            Ejercicio(0,"Dominadas", R.drawable.espalda),
            Ejercicio(1,"Peso Muerto", R.drawable.espalda),
            Ejercicio(2,"Jalones Laterales", R.drawable.espalda),
            Ejercicio(3,"Remadas Sentado", R.drawable.espalda),
            Ejercicio(4,"Extensiones de Espalda", R.drawable.espalda)
        )
    }
    fun getAllEjerciciosPecho(): MutableList<Ejercicio>{
        return mutableListOf (
            Ejercicio(0,"Press de Banca", R.drawable.espalda),
            Ejercicio(1,"Peso Inclinado", R.drawable.espalda),
            Ejercicio(2,"Press con Mancuernas", R.drawable.espalda),
            Ejercicio(3,"Fondos en Barra", R.drawable.espalda),
            Ejercicio(4,"Crucifijo Cruzado con Cable", R.drawable.espalda)
        )
    }
    fun getAllEjerciciosPiernas(): MutableList<Ejercicio>{
        return mutableListOf (
            Ejercicio(0,"Sentadillas", R.drawable.espalda),
            Ejercicio(1,"Press de Pierna Inclinado", R.drawable.espalda),
            Ejercicio(2,"Extensiones de Pierna", R.drawable.espalda),
            Ejercicio(3,"Lunges con Mancuerna", R.drawable.espalda),
            Ejercicio(4,"Sentadillas Hack", R.drawable.espalda)
        )
    }
    fun getAllEjerciciosHombros(): MutableList<Ejercicio>{
        return mutableListOf (
            Ejercicio(0,"Press con Mancuernas Sentado", R.drawable.espalda),
            Ejercicio(1,"Press Frontal Sentado con Barra", R.drawable.espalda),
            Ejercicio(2,"Jalones Laterales", R.drawable.espalda),
            Ejercicio(3,"Elevaciones Laterales con Polea Baja", R.drawable.espalda),
            Ejercicio(4,"Elevaciones Pájaro con Mancuernas", R.drawable.espalda)
        )
    }
    fun getAllEjerciciosAntebrazos(): MutableList<Ejercicio>{
        return mutableListOf (
            Ejercicio(0,"Curl de Muñeca con Barra", R.drawable.espalda),
            Ejercicio(1,"Curl de Muñeca con Mancuerna", R.drawable.espalda),
            Ejercicio(2,"Giro de Muñeca con Mancuerna", R.drawable.espalda),
            Ejercicio(3,"Giro de Muñeca de Pie con Barra", R.drawable.espalda)
        )
    }
    fun getAllEjerciciosGemelos(): MutableList<Ejercicio>{
        return mutableListOf (
            Ejercicio(0,"Elevación de Gemelos Sentado", R.drawable.espalda),
            Ejercicio(1,"Elevaciones Dedos del Pie", R.drawable.espalda),
            Ejercicio(2,"Elevaciones Dedos del Pie con Una Sola Pierna", R.drawable.espalda),
            Ejercicio(3,"Saltos de Gemelos con Mancuernas", R.drawable.espalda)
        )
    }
}