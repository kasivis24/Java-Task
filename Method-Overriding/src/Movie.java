class Movie {
    String title;

    Movie(String title) {
        this.title = title;
    }

    public void play() {
        System.out.println("Playing movie: " + title);
    }
}

class RomComMovie extends Movie {
    RomComMovie(String title) {
        super(title);
    }

    @Override
    public void play() {
        System.out.println("Playing a romantic comedy: " + title);
    }
}

class ThrillerMovie extends Movie {
    ThrillerMovie(String title) {
        super(title);
    }

    @Override
    public void play() {
        System.out.println("Playing a thriller movie: " + title);
    }
}
