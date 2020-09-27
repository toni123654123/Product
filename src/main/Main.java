package main;

import iserver.ProductService;
import sanpham.Product;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void disPlay(List<Product> list){
        Iterator iterator = list.iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        ProductService productService = new ProductService();
        List<Product> products;


        System.out.println("========Add=========");
        productService.add(new Product(6,"Xe may","Chat luong 3 sao"));
        products=productService.findAll();
        disPlay(products);


        System.out.println("=====update=====");
        productService.update(2,new Product(3,"Xe dien","chat luong 2 sao"));
        products=productService.findAll();
        disPlay(products);


        System.out.println("======Delete========");
        System.out.println("Input id: ");
        Scanner scanner = new Scanner(System.in);
        Integer id = scanner.nextInt();
        productService.delete(id);
        System.out.println("==== Befor Delete ====");
        disPlay(productService.findAll());


        System.out.println("===========find by id=========");
        System.out.println(productService.findByID(3));


        System.out.println("====find====");
        disPlay(productService.findByName("Xe may"));

        System.out.println("=====Sort=====");
    }
}
