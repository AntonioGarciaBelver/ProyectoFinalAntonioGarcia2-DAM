package activities

import CRUD.CRUD
import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.fitnessroutines.R
import models.Ejercicio
import models.Musculo
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem
import java.text.SimpleDateFormat
import java.util.*

class SliderActivity : AppCompatActivity() {

    private lateinit var musculos: MutableList<Musculo>
    val list = mutableListOf<CarouselItem>()
    private lateinit var ejercicios: MutableList<Ejercicio>
    private lateinit var imagenes: List<Int>
    var CRUD: CRUD = CRUD()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slider)

        val tvPeso = findViewById<TextView>(R.id.tvPeso)
        val tvRepeticiones = findViewById<TextView>(R.id.tvRepeticiones)
        val tvFecha = findViewById<TextView>(R.id.tvFechaElegida)
        val btnAñadir = findViewById<Button>(R.id.btnAñadir)
        val etPeso = findViewById<EditText>(R.id.editTextPeso)
        val etRepeticiones = findViewById<EditText>(R.id.editTextRepeticiones)
        val carousel: ImageCarousel = findViewById(R.id.carousel)

        var position = intent.getIntExtra("position", -1)
        var musculo = intent.getStringExtra("musculo")

        musculos = CRUD.getAllMusculos()
        ejercicios = obtenerEjercicios(musculo)
        imagenes = ejercicios[position].imagenes
        var ejercicioActual = ejercicios[position]

        tvPeso.text = ejercicios[position].peso
        tvRepeticiones.text = ejercicios[position].repeticiones

        for (imagen in imagenes){
            list.add(CarouselItem(imagen))
        }

        carousel.addData(list)

        val tvTitulo = findViewById<TextView>(R.id.tvNombreEjercicio)
        tvTitulo.text= ejercicios[position].nombre
        tvTitulo.isSelected = true

        tvFecha.text= obtenerFechaActual()
        val btnCalendario = findViewById<ImageView>(R.id.btnCalendario)

        btnCalendario.setOnClickListener {
            // Obtén la fecha actual
            val cal = Calendar.getInstance()

            // Crea un objeto DatePickerDialog y configúralo para que muestre la fecha actual
            val datePickerDialog = DatePickerDialog(
                this,
                { view, year, monthOfYear, dayOfMonth ->
                    val fechaSeleccionada = "$dayOfMonth/${monthOfYear + 1}/$year"
                    tvFecha.text = fechaSeleccionada
                },
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH)
            )
            datePickerDialog.show()
        }

        btnAñadir.setOnClickListener(){
            tvPeso.text= etPeso.text
            tvRepeticiones.text = etRepeticiones.text

            ejercicioActual.peso = tvPeso.text.toString()
            ejercicioActual.repeticiones = tvRepeticiones.text.toString()
            ejercicios[position] = ejercicioActual

        }
    }

    fun obtenerEjercicios(ejercicio: String?):MutableList<Ejercicio>{
        when (ejercicio) {
            "Abdominales" -> ejercicios = CRUD.getAllEjerciciosAbdominales()
            "Biceps" -> ejercicios = CRUD.getAllEjerciciosBiceps()
//            2-> ejercicios = CRUD.getAllEjerciciosTriceps()
//            3 -> ejercicios = CRUD.getAllEjerciciosEspalda()
//            4 -> ejercicios = CRUD.getAllEjerciciosPecho()
//            5 -> ejercicios = CRUD.getAllEjerciciosPiernas()
//            6 -> ejercicios = CRUD.getAllEjerciciosHombros()
//            7 -> ejercicios = CRUD.getAllEjerciciosAntebrazos()
//            8 -> ejercicios = CRUD.getAllEjerciciosGemelos()
        }
        return ejercicios
    }

    fun obtenerFechaActual(): String {
        // Obtiene la fecha y hora actual
        val cal = Calendar.getInstance()

        // Formatea la fecha y hora actual en un formato que te guste
        val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        val fechaActual = dateFormat.format(cal.time)

        // Retorna la fecha actual
        return fechaActual
    }



}
