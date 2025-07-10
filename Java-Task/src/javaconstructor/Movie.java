package javaconstructor;

public class Movie {
    private int movieId;
    private String title;
    private String genre;
    private String director;
    private int releaseYear;
    private double duration;
    private int rating;
    private String language;
    private String productionCompany;

    public Movie(int movieId,String title, String genre,String director,int releaseYear,double duration,int rating,String language,String productionCompany){
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.rating = rating;
        this.language = language;
        this.productionCompany = productionCompany;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    @Override
    public String toString(){

        return "Movie[movieId = " + movieId + ", title = " + title + ", genre = " + genre + ", director = "
        + director + ", releaseYear = " + releaseYear + ", duration = " + duration + ", rating = "
        + rating + ", language = " + language + ", productionCompany = " + productionCompany + "]";
    }
}