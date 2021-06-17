package practicacomportamiento2.parte2;

public class RestartCommand implements Command {
    
    private Cancion cancion;
    private int currentTime = 0;

    public RestartCommand(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public void execute() {
        this.cancion.setCurrentTime(this.currentTime);
    }

}
