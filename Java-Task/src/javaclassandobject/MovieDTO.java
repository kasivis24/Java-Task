package javaclassandobject;

public class MovieDTO {
    private int movieId;
    private String title;
    private String genre;
    private String director;
    private int releaseYear;
    private double duration;
    private int rating;
    private String language;
    private String productionCompany;

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

    public static void main(String[] args) {
        MovieDTO movie = new MovieDTO();

        movie.setMovieId(6543);
        System.out.println("Movie ID : "+ movie.getMovieId());

        movie.setTitle("Mangatha");
        System.out.println("Title : "+ movie.getTitle());

        movie.setGenre("Fight");
        System.out.println("Genre : "+ movie.getGenre());

        movie.setDirector("VenkatPrabhu");
        System.out.println("Director : "+ movie.getDirector());

        movie.setReleaseYear(2012);
        System.out.println("Release Year : "+ movie.getReleaseYear());

        movie.setDuration(120.30);
        System.out.println("Duration : "+ movie.getDuration());

        movie.setLanguage("Tamil");
        System.out.println("Language : "+ movie.getLanguage());

        movie.setProductionCompany("AGS");
        System.out.println("Production Company : "+ movie.getProductionCompany());

        movie.setRating(10);
        System.out.println("Rating : "+ movie.getRating());
    }
}