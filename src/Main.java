import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // 1 · Fichas con referencia polimórfica
        System.out.println("===== 1. FICHAS =====");
        Animal[] animales = {
                new Perro("Tarzan", 4, "Carlos Pérez", "Labrador"),
                new Gato("Salem", 3, "Laura Gómez", true),
                new Ave("Blue", 2, "Andrés Rojas", 450),
                new Conejo("Copito", 1, "Sofía Torres") // 4 · única línea agregada para el Conejo
        };

        for (Animal a : animales) {
            a.imprimirFicha();
        }

        // 2 · Vacunar los que aplican (tipo concreto para poder llamar registrarVacuna)
        System.out.println("\n===== 2. VACUNACIÓN =====");
        Perro perro = new Perro("   Tarzan", 4, "Carlos Pérez", "Labrador");
        Gato gato = new Gato("Salem", 3, "Laura Gómez", true);

        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("Parvovirus");
        gato.registrarVacuna("Triple felina");

        System.out.println(perro.getNombre() + " lleva " + perro.getVacunasAplicadas() + " vacunas");
        System.out.println(gato.getNombre() + " lleva " + gato.getVacunasAplicadas() + " vacuna");

        // Esto no compila porque Ave no implementa Vacunable:
        // Ave ave = new Ave("Kiwi", 2, "Andrés Rojas", 450);
        // ave.registrarVacuna("Newcastle");

        // 3 · Pólizas
        System.out.println("\n===== 3. PÓLIZAS =====");
        Clinica clinica = new Clinica("VetCare", "Calle 80 # 15-20, Bogotá");

        Asegurable[] asegurables = {perro, gato, clinica};

        for (Asegurable a : asegurables) {
            System.out.println("Póliza: " + a.obtenerNumeroPoliza()
                    + " | Prima anual: " + pesos(a.calcularPrimaSeguro()));
        }
    }

    private static String pesos(double valor) {
        return String.format(Locale.forLanguageTag("es-CO"), "$%,.0f", valor);
    }
}
