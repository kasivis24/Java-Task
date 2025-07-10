interface Playable {
    void play();
    void pause();
    void stop();
}

class MP3Player implements Playable {
    @Override
    public void play() {
        System.out.println("MP3 Player is playing music...");
    }

    @Override
    public void pause() {
        System.out.println("MP3 Player paused.");
    }

    @Override
    public void stop() {
        System.out.println("MP3 Player stopped.");
    }
}

class CDPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("CD Player is playing music...");
    }

    @Override
    public void pause() {
        System.out.println("CD Player paused.");
    }

    @Override
    public void stop() {
        System.out.println("CD Player stopped.");
    }
}

class StreamingPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Streaming Player is playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Streaming Player paused.");
    }

    @Override
    public void stop() {
        System.out.println("Streaming Player stopped.");
    }
}
