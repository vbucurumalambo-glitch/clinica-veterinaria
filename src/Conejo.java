public class Conejo extends Animal {

    public Conejo(String nombre, int edad, String dueno) {
        super(nombre, edad, dueno);
    }

    @Override
    public double calcularCostoConsulta() {
        return 35000;
    }
}
