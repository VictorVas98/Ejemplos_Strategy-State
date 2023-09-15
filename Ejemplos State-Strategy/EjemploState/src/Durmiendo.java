
import java.util.Timer;
import java.util.TimerTask;
public class Durmiendo implements Estado {
    private Mascota mascota;
    public Durmiendo(){
    }
    @Override
    public void setMascota(Mascota mascota) {
    this.mascota = mascota;

    Timer timer = new Timer();
    timer.schedule(new TimerTask(){
        public void run(){
            Durmiendo.this.mascota.setEstado(new Hambriento());
            }
        }, 5000);
    }

    @Override
    public void alimentar() {
        System.out.println("Z Z Z Z");
    }

    @Override
    public void jugar() {
        System.out.println("Z Z Z Z");
    }

    @Override
    public void dormir() {
        System.out.println("Buenas noches");
        mascota.setEstado(new Durmiendo());
    }

    @Override
    public void comoEstas() {
        System.out.println("Z Z Z Z");
    }
}
