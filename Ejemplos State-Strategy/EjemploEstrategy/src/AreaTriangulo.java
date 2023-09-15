public class AreaTriangulo implements IArea{

    private final float base;
    private final float altura;

    public AreaTriangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float calculaArea() {
        return (base * altura) / 2;
    }

    @Override
    public String getResultado() {

        return "El área del triángulo es "+calculaArea();
    }
}
