public class AreaCirculo implements IArea {
    private final float radio;

    public AreaCirculo(float radio){
        this.radio = radio;
    }

    @Override
    public float calculaArea() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    @Override
    public String getResultado() {
        return "El área del circulo es " + calculaArea();
    }
}
