package practicacomportamiento2.parte2;

public class Cancion {

    private String nombre;
    private int duration;
    private float playbackSpeed;
    private int currentTime;    

    public Cancion(String nombre, int duration) {
        this.nombre = nombre;
        this.duration = duration;
        this.playbackSpeed = 1f;
        this.currentTime = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
        System.out.println(toString());
    }

    public float getPlaybackSpeed() {
        return playbackSpeed;
    }

    public void setPlaybackSpeed(float playbackSpeed) {
        this.playbackSpeed = playbackSpeed;
        System.out.println(toString());
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
        System.out.println(toString());
    }
    
    private String getTime(int time) {
        String res = "";
        int minutes = time/60;
        int seconds = time%60;
        return res + minutes + ":" + seconds;
    }
    
    @Override
    public String toString() {
        String res;
        res = "Cancion: " + this.nombre;
        res += "\nDuracion: " + getTime(this.duration);
        res += "\nTiempo actual: " + getTime(this.currentTime);
        res += "\nVelocidad de reproducción: x" + this.playbackSpeed;
        return res;
    }

}
