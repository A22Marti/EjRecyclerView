package com.example.actividadrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val mMovies: List<Movie>) :
    RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView: View = inflater.inflate(R.layout.activity_movie, parent, false)
        return ViewHolder(contactView)
    }

    override fun getItemCount(): Int {
        return mMovies.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = mMovies[position]
        val textView = holder.textNameView
        textView.text = movie.name
        val image = holder.movieImage;
        image.setImageResource(R.drawable.ic_launcher_background)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textNameView: TextView = itemView.findViewById(R.id.movieText)
        var movieImage: ImageView = itemView.findViewById(R.id.movieImage)
    }
}