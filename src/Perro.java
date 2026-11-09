import java.util.ArrayList;

public class Perro extends Animal implements Vacunable, Asegurable {

    private String raza;
    private ArrayList<String> vacunas;

    public Perro(String nombre, int edad, String dueno, String raza) {
        super(nombre, edad, dueno);
        this.raza = raza;
        this.vacunas = new ArrayList<>();
    }

    @Override
    public double calcularCostoConsulta() {
        return 45000 + (3000 * edad);
    }

    @Override
    public void registrarVacuna(String nombre) {
        vacunas.add(nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80000 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-PERRO-" + nombre.toUpperCase();
    }

    public String getRaza() {
        return raza;
    }
}
