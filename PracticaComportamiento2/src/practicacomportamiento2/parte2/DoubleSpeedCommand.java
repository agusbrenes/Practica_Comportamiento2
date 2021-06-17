package practicacomportamiento2.parte2;

public class DoubleSpeedCommand implements Command {

    private Cancion cancion;
    private float playbackSpeed = 2f;

    public DoubleSpeedCommand(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public void execute() {
        this.cancion.setPlaybackSpeed(this.playbackSpeed);
    }

}
