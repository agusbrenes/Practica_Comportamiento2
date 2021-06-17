package practicacomportamiento2.parte2;

public class AdvanceCommand implements Command {

    private Cancion cancion;
    private int newTime;

    public AdvanceCommand(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public void execute() {
        this.newTime = this.cancion.getCurrentTime() + 5;
        this.cancion.setCurrentTime(this.newTime);
    }

}
