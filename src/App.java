import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadProductos = 0;
        double totalPagar = 0.0;
        double precio;

        System.out.println("🛒 Bienvenido al carrito de supermercado.");
        System.out.println("Ingrese el precio de cada producto. Ingrese 0 para finalizar.");

        while (true) {
            System.out.print("Ingrese el precio del producto #" + (cantidadProductos + 1) + ": ");
            precio = sc.nextDouble();

            if (precio == 0) {
                break;
            }

            if (precio < 0) {
                System.out.println("⚠️ El precio no puede ser negativo. Intente nuevamente.");
                continue;
            }

            cantidadProductos++;
            totalPagar += precio;
        }

        System.out.println("\nResumen de compras:");
        System.out.println("Cantidad total de productos: " + cantidadProductos);
        System.out.printf("Total a pagar: $%.2f\n", totalPagar);
    }
}
