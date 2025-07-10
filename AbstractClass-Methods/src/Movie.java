abstract class Movie {
    String title;

    Movie(String title) {
        this.title = title;
    }

    // Abstract methods
    public abstract void play();
    public abstract void pause();
    public abstract void stop();
}

class RomComMovie extends Movie {
    RomComMovie(String title) {
        super(title);
    }

    @Override
    public void play() {
        System.out.println("Playing romantic comedy: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Pausing romantic comedy: " + title);
    }

    @Override
    public void stop() {
        System.out.println("Stopping romantic comedy: " + title);
    }
}

class ThrillerMovie extends Movie {
    ThrillerMovie(String title) {
        super(title);
    }

    @Override
    public void play() {
        System.out.println("Playing thriller: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Pausing thriller: " + title);
    }

    @Override
    public void stop() {
        System.out.println("Stopping thriller: " + title);
    }
}

