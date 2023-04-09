package CRUD

import com.example.fitnessroutines.R
import models.Ejercicio
import models.Musculo

open class CRUD {

    fun getAllMusculos(): MutableList<Musculo> {
        return mutableListOf (
            Musculo(0,"Abdominales", R.drawable.abdominales, getAllEjerciciosAbdominales()),
            Musculo(1,"Biceps", R.drawable.biceps, getAllEjerciciosBiceps()),
//            Musculo(2,"TRICEPS", R.drawable.triceps, getAllEjerciciosTriceps()),
//            Musculo(3,"ESPALDA", R.drawable.espalda, getAllEjerciciosEspalda()),
//            Musculo(4,"PECHO", R.drawable.pecho, getAllEjerciciosPecho()),
//            Musculo(5,"PIERNAS", R.drawable.piernas, getAllEjerciciosPiernas()),
//            Musculo(6,"HOMBROS", R.drawable.hombros, getAllEjerciciosHombros()),
//            Musculo(7,"ANTEBRAZOS", R.drawable.antebrazo, getAllEjerciciosAntebrazos()),
//            Musculo(8,"GEMELOS", R.drawable.gemelos, getAllEjerciciosGemelos())
        )
    }
    fun getAllEjerciciosAbdominales(): MutableList<Ejercicio>{
        return mutableListOf (
            Ejercicio(0,"Sentadillas en Banco Inclinado", R.drawable.abdominales_1_1, getAllImagenesAbdominales_1(), "0.00", "0"),
            Ejercicio(1,"Levantamiento de Piernas desde Posición Colgada", R.drawable.abdominales_2_1, getAllImagenesAbdominales_2(), "0.00", "0"),
            Ejercicio(2,"Inclinaciones Laterales con Mancuernas", R.drawable.abdominales_3_1, getAllImagenesAbdominales_3(), "0.00", "0"),
            Ejercicio(3,"Abdominales", R.drawable.abdominales_4_1, getAllImagenesAbdominales_4(), "0.00", "0"),
            Ejercicio(4,"Puente Lateral", R.drawable.abdominales_5_1, getAllImagenesAbdominales_5(), "0.00", "0")
        )
    }
    fun getAllEjerciciosBiceps(): MutableList<Ejercicio>{
        return mutableListOf (
            Ejercicio(0,"Curl", R.drawable.biceps_1_1, getAllImagenesBiceps_1(), "0.00", "0"),
            Ejercicio(1,"Curl de Martillo", R.drawable.biceps_2_1, getAllImagenesBiceps_2(), "0.00", "0"),
            Ejercicio(2,"Curl Invertido", R.drawable.biceps_3_1, getAllImagenesBiceps_3(), "0.00", "0"),
            Ejercicio(3,"Curl del Predicador", R.drawable.biceps_4_1, getAllImagenesBiceps_4(), "0.00", "0"),
            Ejercicio(4,"Curl de Biceps con cable", R.drawable.biceps_5_1, getAllImagenesBiceps_5(), "0.00", "0")
        )
    }
//    fun getAllEjerciciosTriceps(): MutableList<Ejercicio>{
//        return mutableListOf (
//            Ejercicio(0,"Pushdowns", R.drawable.espalda),
//            Ejercicio(1,"Extensiones de Triceps", R.drawable.espalda),
//            Ejercicio(2,"Press de Banca con Agarre Cerrado", R.drawable.espalda),
//            Ejercicio(3,"Flexiones Diamante", R.drawable.espalda),
//            Ejercicio(4,"Fondos con Agarre Cerrado", R.drawable.espalda)
//        )
//    }
//    fun getAllEjerciciosEspalda(): MutableList<Ejercicio>{
//        return mutableListOf (
//            Ejercicio(0,"Dominadas", R.drawable.espalda),
//            Ejercicio(1,"Peso Muerto", R.drawable.espalda),
//            Ejercicio(2,"Jalones Laterales", R.drawable.espalda),
//            Ejercicio(3,"Remadas Sentado", R.drawable.espalda),
//            Ejercicio(4,"Extensiones de Espalda", R.drawable.espalda)
//        )
//    }
//    fun getAllEjerciciosPecho(): MutableList<Ejercicio>{
//        return mutableListOf (
//            Ejercicio(0,"Press de Banca", R.drawable.espalda),
//            Ejercicio(1,"Peso Inclinado", R.drawable.espalda),
//            Ejercicio(2,"Press con Mancuernas", R.drawable.espalda),
//            Ejercicio(3,"Fondos en Barra", R.drawable.espalda),
//            Ejercicio(4,"Crucifijo Cruzado con Cable", R.drawable.espalda)
//        )
//    }
//    fun getAllEjerciciosPiernas(): MutableList<Ejercicio>{
//        return mutableListOf (
//            Ejercicio(0,"Sentadillas", R.drawable.espalda),
//            Ejercicio(1,"Press de Pierna Inclinado", R.drawable.espalda),
//            Ejercicio(2,"Extensiones de Pierna", R.drawable.espalda),
//            Ejercicio(3,"Lunges con Mancuerna", R.drawable.espalda),
//            Ejercicio(4,"Sentadillas Hack", R.drawable.espalda)
//        )
//    }
//    fun getAllEjerciciosHombros(): MutableList<Ejercicio>{
//        return mutableListOf (
//            Ejercicio(0,"Press con Mancuernas Sentado", R.drawable.espalda),
//            Ejercicio(1,"Press Frontal Sentado con Barra", R.drawable.espalda),
//            Ejercicio(2,"Jalones Laterales", R.drawable.espalda),
//            Ejercicio(3,"Elevaciones Laterales con Polea Baja", R.drawable.espalda),
//            Ejercicio(4,"Elevaciones Pájaro con Mancuernas", R.drawable.espalda)
//        )
//    }
//    fun getAllEjerciciosAntebrazos(): MutableList<Ejercicio>{
//        return mutableListOf (
//            Ejercicio(0,"Curl de Muñeca con Barra", R.drawable.espalda),
//            Ejercicio(1,"Curl de Muñeca con Mancuerna", R.drawable.espalda),
//            Ejercicio(2,"Giro de Muñeca con Mancuerna", R.drawable.espalda),
//            Ejercicio(3,"Giro de Muñeca de Pie con Barra", R.drawable.espalda)
//        )
//    }
//    fun getAllEjerciciosGemelos(): MutableList<Ejercicio>{
//        return mutableListOf (
//            Ejercicio(0,"Elevación de Gemelos Sentado", R.drawable.espalda),
//            Ejercicio(1,"Elevaciones Dedos del Pie", R.drawable.espalda),
//            Ejercicio(2,"Elevaciones Dedos del Pie con Una Sola Pierna", R.drawable.espalda),
//            Ejercicio(3,"Saltos de Gemelos con Mancuernas", R.drawable.espalda)
//        )
//    }

    //-------------IMAGENES EJERCICIOS ABDOMINALES--------------------------------------------------
    fun getAllImagenesAbdominales_1(): MutableList<Int>{
        return mutableListOf(R.drawable.abdominales_6_1, R.drawable.abdominales_6_2,R.drawable.abdominales_6_3, R.drawable.abdominales_6_4)
    }
    fun getAllImagenesAbdominales_2(): MutableList<Int>{
        return mutableListOf(R.drawable.abdominales_2_1, R.drawable.abdominales_2_2)
    }
    fun getAllImagenesAbdominales_3(): MutableList<Int>{
        return mutableListOf(R.drawable.abdominales_3_1, R.drawable.abdominales_3_2, R.drawable.abdominales_3_3)
    }
    fun getAllImagenesAbdominales_4(): MutableList<Int>{
        return mutableListOf(R.drawable.abdominales_4_1, R.drawable.abdominales_4_2)
    }
    fun getAllImagenesAbdominales_5(): MutableList<Int>{
        return mutableListOf(R.drawable.abdominales_5_1, R.drawable.abdominales_5_2)
    }

    //------------------------IMAGENES EJERCICIOS BICEPS-------------------------------------------
    fun getAllImagenesBiceps_1(): MutableList<Int>{
        return mutableListOf(R.drawable.biceps_1_1, R.drawable.biceps_1_2, R.drawable.biceps_1_3)
    }
    fun getAllImagenesBiceps_2(): MutableList<Int>{
        return mutableListOf(R.drawable.biceps_2_1, R.drawable.biceps_2_2, R.drawable.biceps_2_3)
    }
    fun getAllImagenesBiceps_3(): MutableList<Int>{
        return mutableListOf(R.drawable.biceps_3_1, R.drawable.biceps_3_2, R.drawable.biceps_3_3)
    }
    fun getAllImagenesBiceps_4(): MutableList<Int>{
        return mutableListOf(R.drawable.biceps_4_1, R.drawable.biceps_4_2, R.drawable.biceps_4_3)
    }
    fun getAllImagenesBiceps_5(): MutableList<Int>{
        return mutableListOf(R.drawable.biceps_5_1, R.drawable.biceps_5_2)
    }
}