package biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {

        Libro libroInvalido = new Libro("", "Autor Anónimo", "0000000000000", 1, 15000.0);
        System.out.println("Título usado: " + libroInvalido.getTitulo());

        System.out.println();

        Libro libro1 = new Libro("Clean Code", "Robert C. Martin", "9780132350884", 1, 15000.0);

        boolean aceptado = libro1.setPrecioReposicion(-100.0);
        System.out.println("¿Se aceptó el precio -100.0? " + aceptado + " (se mantiene el precio anterior: $" + libro1.getPrecioReposicion() + ")");

        System.out.println();

        Libro libro2 = new Libro("Efectivo con Java", "Ana Restrepo", "9781234567897");
        libro2.setPrecioReposicion(22000.0);

        Libro libro3 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "9780307474728", 2, 18500.0);

        System.out.println();

        libro1.mostrarFicha();
        libro2.mostrarFicha();
        libro3.mostrarFicha();

        System.out.println();

        libro1.prestar();
        libro1.prestar();
        libro1.devolver();

        System.out.println();

        libro1.setPrecioReposicion(18000.0);
    }
}
