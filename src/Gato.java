import java.util.ArrayList;

public class Gato extends Animal implements Vacunable, Asegurable {

    private boolean esEsterilizado;
    private ArrayList<String> vacunas;

    public Gato(String nombre, int edad, String dueno, boolean esEsterilizado) {
        super(nombre, edad, dueno);
        this.esEsterilizado = esEsterilizado;
        this.vacunas = new ArrayList<>();
    }

    @Override
    public double calcularCostoConsulta() {
        return 38000;
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
        if (esEsterilizado) {
            return 120000;
        }
        return 200000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-GATO-" + nombre.toUpperCase();
    }

    public boolean isEsterilizado() {
        return esEsterilizado;
    }
}
