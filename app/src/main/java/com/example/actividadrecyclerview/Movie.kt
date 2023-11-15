package com.example.actividadrecyclerview

import android.media.Image

class Movie(val name: String, val image: String) {
    companion object{
        fun CreateMovieList(numMovies: Int) : ArrayList<Movie> {
            val MovieList = ArrayList<Movie>();
            for (i in 1..numMovies) {
                MovieList.add(Movie("Spiderman ", "@tools:sample/avatars[0]"));
                MovieList.add(Movie("Avatar ", "@tools:sample/avatars[0]"));

            }
            return MovieList;
        }
    }
}
