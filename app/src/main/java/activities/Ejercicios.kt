package activities

import CRUD.CRUD
import adapters.EjerciciosAdapter
import adapters.OnItemClickListener
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnessroutines.R
import models.Ejercicio
import models.Musculo

class Ejercicios : AppCompatActivity() {
    private lateinit var musculos: MutableList<Musculo>
    private lateinit var ejercicios: MutableList<Ejercicio>
    private lateinit var mAdapter: RecyclerView.Adapter<EjerciciosAdapter.ViewHolder>
    private lateinit var mLayoutManager: RecyclerView.LayoutManager
    var CRUD: CRUD = CRUD()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicios)

        var positionActual = intent.getIntExtra("position", -1)
        var ejercicio = intent.getStringExtra("musculo")
        musculos = CRUD.getAllMusculos()
        ejercicios = obtenerEjercicios(positionActual)

        val tvTitulo = findViewById<TextView>(R.id.tvEjercicios)
        tvTitulo.text= ejercicio
        val mRecyclerView: RecyclerView = findViewById(R.id.recyclerViewEjercicios)
        mLayoutManager = LinearLayoutManager(this)
        mAdapter = EjerciciosAdapter(ejercicios, object : OnItemClickListener {
            override fun OnItemClick(vista: View, position: Int) {

            }

        })
        mRecyclerView.adapter = mAdapter
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.itemAnimator = DefaultItemAnimator()
        mRecyclerView.layoutManager = mLayoutManager


    }
    fun obtenerEjercicios(positionActual:Int):MutableList<Ejercicio>{
        when (positionActual) {
            0 -> ejercicios = CRUD.getAllEjerciciosAbdominales()
            1 -> ejercicios = CRUD.getAllEjerciciosBiceps()
            2-> ejercicios = CRUD.getAllEjerciciosTriceps()
            3 -> ejercicios = CRUD.getAllEjerciciosEspalda()
            4 -> ejercicios = CRUD.getAllEjerciciosPecho()
            5 -> ejercicios = CRUD.getAllEjerciciosPiernas()
            6 -> ejercicios = CRUD.getAllEjerciciosHombros()
            7 -> ejercicios = CRUD.getAllEjerciciosAntebrazos()
            8 -> ejercicios = CRUD.getAllEjerciciosGemelos()
        }
        return ejercicios
    }
}