package app;

public class listenToMusic {
    Amplifier amp = new Amplifier("Top-O-Line Amplifier");
    Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
    DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
    CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
    Projector projector = new Projector("Top-O-Line Projector", dvd);
    TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    Screen screen = new Screen("Theater Screen");
    PopcornPopper popper = new PopcornPopper("Popcorn Popper");

    public void startListening() {
        lights.on();
        amp.on();
        amp.setVolume(5);
        cd.insert();
        amp.setStereoSound();
        cd.on();
        cd.play("Michael Jackson");
    }

    public void stopListening() {
        amp.off();
        amp.setCd(this.cd);
        cd.eject();
        cd.off();
    }
}
