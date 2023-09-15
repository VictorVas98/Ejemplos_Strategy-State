public class Hambriento implements Estado {
    private Mascota mascota;
    public Hambriento(){
    }
    @Override
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public void alimentar() {
        System.out.println("Delicioso!!");
        mascota.setEstado(new Aburrido());
    }

    @Override
    public void jugar() {
        System.out.println("No quiero jugar, tengo hambre");
    }

    @Override
    public void dormir() {
        System.out.println("No tengo sueño, tengo hambre");
    }

    @Override
    public void comoEstas() {
        System.out.println("Con hambre, quiero comer.");
    }
}
