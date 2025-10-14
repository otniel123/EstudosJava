package ExercicioFixacao.application;

import ExercicioFixacao.entities.ImportedProduct;
import ExercicioFixacao.entities.Product;
import ExercicioFixacao.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProductApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            double caseImported;
            String caseUsed;

            System.out.println("Product #" + i + " data");
            System.out.print("Common, used or imported(c/u/i)?");
            sc.nextLine();
            String cui = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();

            switch (cui){
                case "i":
                    System.out.println("Customs fee: ");
                    caseImported = sc.nextDouble();
                    list.add(new ImportedProduct(name, price, caseImported));
                    break;
                case "u":
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    caseUsed = sc.next();
                    LocalDate date = LocalDate.parse(caseUsed, fmt1);
                    list.add(new UsedProduct(name, price, date));
                    break;
                case "c":
                    list.add(new Product(name, price));
                    break;
            }
        }

        System.out.println("Price TAGS:");
        for (Product p : list){
            System.out.println(p.priceTag());
        }
    }
}
