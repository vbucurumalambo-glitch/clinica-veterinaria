public class Ave extends Animal {

    private double pesoGramos;

    public Ave(String nombre, int edad, String dueno, double pesoGramos) {
        super(nombre, edad, dueno);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public double calcularCostoConsulta() {
        return 28000 + (100 * pesoGramos);
    }

    public double getPesoGramos() {
        return pesoGramos;
    }
}
