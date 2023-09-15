public class AreaRectangulo implements IArea{
    private String nombre;
    private final float base;
    private final float altura;

    public AreaRectangulo(float base, float altura){
        nombre = "rectangulo";
        if (base == altura){
            nombre = "cuadrado";
        }
        this.base = base;
        this.altura = altura;
    }
    @Override
    public float calculaArea() {
        return (base * altura);
    }

    @Override
    public String getResultado() {
        return "El area del " + nombre+" es " +calculaArea();
    }
}
