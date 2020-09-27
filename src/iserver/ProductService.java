package iserver;

import iserver.IService;
import sanpham.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IService<Product> {
    static List<Product> products;
    static {
        products = new ArrayList<>();
        products.add(new Product(1,"May Bay","Chat luong 4 sao"));
        products.add(new Product(2,"Tau Thuyen","Chat luong 3 sao"));
        products.add(new Product(3,"Xe dien","Chat luong 2 sao"));
        products.add(new Product(4,"Xe dap","Chat luong 5 sao"));
    }

    @Override
    public void add(Product object) {
        boolean flag = true;
        for (int i = 0; i< products.size();i++){
            if (object.getId() == products.get(i).getId()){
                flag=false;
                break;
            }
        }
        if(flag)
            products.add(object);
    }

    @Override
    public void update(Integer id, Product newObject) {
        for (int i = 0; i <  products.size();i++){
            if (id == products.get(i).getId()){
                products.set(i,newObject);
                break;
            }
        }

    }

    @Override
    public void delete(Integer id) {
        for (int i = 0; i<products.size();i++){
            if (id == products.get(i).getId()){
                products.remove(i);
                break;
            }
        }

    }

    @Override
    public Product findByID(Integer id) {
        Product outputProduct = null;
        for (int i = 0; i<products.size();i++){
            if (id == products.get(i).getId()){
                outputProduct = products.get(i);
            }

        }
        return outputProduct;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> outputProduct = new ArrayList<>();
        for (Product product : products){
            if (product.getName().equals(name)){
                outputProduct.add(product);
            }
        }
        return outputProduct;
    }

    @Override
    public List<Product> findAll() {
        return products;
    }
}
