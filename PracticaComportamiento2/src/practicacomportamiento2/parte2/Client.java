package practicacomportamiento2.parte2;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Cancion cancion = new Cancion("Botella tras botella", 197);
        Reproductor reproductor = new Reproductor();
        Command command;
        
        int option = 1;
        Scanner scan = new Scanner(System.in);
        while (option != 0) {
            System.out.println("Digite su opción:\n"
                    + "0. Salir\n"
                    + "1. Poner x2 de velocidad\n" 
                    + "2. Reiniciar canción\n"
                    + "3. Adelantar 5 segundos\n"
                    + "4. Retroceder 5 segundos");
            option = scan.nextInt();
            switch (option) {
                case 0:
                    command = null;
                    break;
                case 1:
                    command = new DoubleSpeedCommand(cancion);
                    break;
                case 2:
                    command = new RestartCommand(cancion);
                    break;
                case 3:
                    command = new AdvanceCommand(cancion);
                    break;
                case 4:
                    command = new BackCommand(cancion);
                    break;
                default:
                    command = null;
                    break;
            }
            
            if (command != null) {
                reproductor.setCommand(command);
                reproductor.executeCommand();
            }
        }
    }

}
