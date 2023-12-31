package com.example.actividadrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val movieAdapter: ArrayList<Movie> = Movie.CreateMovieList(10)
        recyclerView.adapter = MovieAdapter(movieAdapter)
        recyclerView.layoutManager = GridLayoutManager(this, 3)
    }
}
