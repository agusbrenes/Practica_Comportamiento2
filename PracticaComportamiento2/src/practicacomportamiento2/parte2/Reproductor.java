package practicacomportamiento2.parte2;

public class Reproductor {

    private Command command;
    
    public Reproductor() {}

    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void executeCommand() {
        this.command.execute();
    }

}
