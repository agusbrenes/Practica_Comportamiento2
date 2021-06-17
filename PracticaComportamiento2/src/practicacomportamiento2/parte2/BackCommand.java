package practicacomportamiento2.parte2;

public class BackCommand implements Command {
    
    private Cancion cancion;
    private int newTime;

    public BackCommand(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public void execute() {
        this.newTime = this.cancion.getCurrentTime() - 5;
        this.cancion.setCurrentTime(this.newTime);
    }

}
