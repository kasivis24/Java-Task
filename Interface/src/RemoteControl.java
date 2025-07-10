interface RemoteControl {
    void pressPowerButton();
    void pressVolumeUp();
    void pressVolumeDown();
}

class TV implements RemoteControl {
    private boolean isOn = false;
    private int volume = 10;

    @Override
    public void pressPowerButton() {
        isOn = !isOn;
        System.out.println(isOn ? "TV is now ON." : "TV is now OFF.");
    }

    @Override
    public void pressVolumeUp() {
        if (isOn && volume < 100) {
            volume++;
            System.out.println("TV Volume: " + volume);
        } else {
            System.out.println("TV is OFF or volume is at maximum.");
        }
    }

    @Override
    public void pressVolumeDown() {
        if (isOn && volume > 0) {
            volume--;
            System.out.println("TV Volume: " + volume);
        } else {
            System.out.println("TV is OFF or volume is at minimum.");
        }
    }
}

class Fan implements RemoteControl {
    private boolean isOn = false;

    @Override
    public void pressPowerButton() {
        isOn = !isOn;
        System.out.println(isOn ? "Fan is now ON." : "Fan is now OFF.");
    }

    @Override
    public void pressVolumeUp() {
        System.out.println("Fan doesn't have volume control.");
    }

    @Override
    public void pressVolumeDown() {
        System.out.println("Fan doesn't have volume control.");
    }
}