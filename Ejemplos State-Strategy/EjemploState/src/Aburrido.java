public class Aburrido implements Estado {
    private Mascota mascota;

    @Override
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    @Override
    public void alimentar() {
        System.out.println("No quiero comer, estoy aburrido.");
    }

    @Override
    public void jugar() {
        System.out.println("Que divertido!");
        mascota.setEstado(new Cansado());
    }

    @Override
    public void dormir() {
        System.out.println("No quiero dormir, juguemos.");
    }

    @Override
    public void comoEstas() {
        System.out.println("Estoy aburrido, quiero jugar");
    }
}
