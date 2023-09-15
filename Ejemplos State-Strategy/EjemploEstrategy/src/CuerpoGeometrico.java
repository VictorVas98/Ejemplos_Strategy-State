public class CuerpoGeometrico {

    private IArea figura;

    public CuerpoGeometrico(float radio, int lados, float base, float altura) {
        if (lados == 0 && radio > 0) {
            figura = new AreaCirculo(radio);
        } else if (lados == 3) {
            figura = new AreaTriangulo(base, altura);
        } else if (lados == 4) {
            figura = new AreaRectangulo(base, altura);
        } else {
            System.out.println("Figura no reconocida.");
            figura = null;
        }
    }

    public IArea getFigura() {
        return figura;
    }
}
