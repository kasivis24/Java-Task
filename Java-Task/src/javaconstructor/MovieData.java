package javaconstructor;

import javaconstructor.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieData {
    private List<Movie> movie;

    public MovieData(){
        this.movie = new ArrayList<>();
    }

    public void addMovies(Movie movies){
        movie.add(movies);
    }

    public void displayMovie(){
        if(movie.isEmpty()){
            System.out.println("There is No Such Movie");
        }
        else{
            for (Movie movies : movie){
                System.out.println(movies);
            }
        }
    }

    public static void main(String[] args) {

        MovieData moviesData = new MovieData();

        moviesData.addMovies(new Movie(9889,"Mangatha","Fight","VenkatPrabhu",
                2011,120.00,10,"Tamil","SUN PICTURES"));

        moviesData.addMovies(new Movie(9756,"MaanKarate","Comedy","Krish Thirukumaran",
                2014,140.00,8,"Tamil","AGS"));

        moviesData.displayMovie();
    }
}