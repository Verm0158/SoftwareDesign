package app;

public class Main {

    public static void main(String[] args) {
        watchMovieFacade watchMovie = new watchMovieFacade();
        watchMovie.playMovie();
        watchMovie.stopMovie();

        listenToMusic listenTo = new listenToMusic();
        listenTo.startListening();
        listenTo.stopListening();

        listenToRadio listenToR = new listenToRadio();
        listenToR.startListeningR();
        listenToR.stopListeningR();
    }
}
