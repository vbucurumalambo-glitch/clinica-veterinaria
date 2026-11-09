import java.util.Locale;

public abstract class Animal {

    // protected: las subclases los usan directo, pero no quedan expuestos a todo el mundo
    protected String nombre;
    protected int edad;
    protected String dueno;

    public Animal(String nombre, int edad, String dueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.dueno = dueno;
    }

    // Cada especie calcula su costo distinto, por eso aquí no se puede implementar
    public abstract double calcularCostoConsulta();

    // Igual para todos: solo cambia el costo, que se resuelve en cada subclase
    public void imprimirFicha() {
        System.out.println("Especie: " + getClass().getSimpleName());
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + (edad == 1 ? " año" : " años"));
        System.out.println("Dueño: " + dueno);
        System.out.println("Costo de consulta: " + formatearPesos(calcularCostoConsulta()));
        System.out.println("-----------------------------");
    }

    protected static String formatearPesos(double valor) {
        return String.format(Locale.forLanguageTag("es-CO"), "$%,.0f", valor);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDueno() {
        return dueno;
    }
}
