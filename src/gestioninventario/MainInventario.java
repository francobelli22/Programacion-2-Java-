package gestioninventario;

public class MainInventario {
    public static void main(String[] args) {
        
        Producto productoUno = new Producto();
        productoUno.nombre = "Teclado mecánico";
        productoUno.codigo = "P-001";
        productoUno.precio = 45000.0;
        productoUno.stock = 12;

        Producto productoDos = new Producto();
        productoDos.nombre = "Mouse inalámbrico";
        productoDos.codigo = "P-002";
        productoDos.precio = 18000.0;
        productoDos.stock = 30;

        Producto productoTres = new Producto();
        productoTres.nombre = "Monitor 24 pulgadas";
        productoTres.codigo = "P-003";
        productoTres.precio = 120000.0;
        productoTres.stock = 5;

       
        productoUno.mostrarFicha();
        productoUno.venderUnidades(3);
        productoUno.venderUnidades(50);
        productoUno.reponerStock(20);
        productoUno.actualizarPrecio(39900.0);

        System.out.println();
        System.out.println("Verificando independencia de objetos:");
        productoDos.venderUnidades(5);
        System.out.println("Stock de productoUno (no debería cambiar): " + productoUno.stock);
        System.out.println("Stock de productoTres (no debería cambiar): " + productoTres.stock);

        System.out.println();
        Producto copia = productoUno;
        copia.stock = 29;
        System.out.println("Stock de productoUno tras modificar copia: " + productoUno.stock + " (mismo objeto en el Heap)");

        System.out.println();
        System.out.println("Recorriendo arreglo de productos:");
        Producto[] productos = { productoUno, productoDos, productoTres };
        for (Producto p : productos) {
            p.mostrarFicha();
        }
    }
}
