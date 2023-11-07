package application;
import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        /*Esse exercício POO lê 3 caracteristicas de um produto e faz
          o controle de estoque, adicionando ou removendo unidades
          e mostrando os dados atualizados.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        System.out.println();
        System.out.println("Product data: "+ product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");

        int quantity = sc.nextInt();
        product.addProduct(quantity);
        System.out.println();
        System.out.println("Updated product data: "+ product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated product data: "+ product);

        sc.close();
    }
}
