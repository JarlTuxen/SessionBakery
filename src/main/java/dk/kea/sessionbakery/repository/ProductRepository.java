package dk.kea.sessionbakery.repository;

import dk.kea.sessionbakery.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductRepository {
    /*This is a test-repository*/

    public List<Product> getAllProducts(){
        return new ArrayList<Product>(
                Arrays.asList(
                        new Product(1,"Chocolate", 30),
                        new Product(2,"Oatmeal", 15),
                        new Product(3,"Tofu", 20),
                        new Product(4,"Macaroon", 50)
                )
        );
    }

    public Product getProductById(int id){
        Product productToReturn = null;
        switch(id){
            case 1 :
                productToReturn = new Product(1,"Chocolate", 30);
                break;
            case 2 :
                productToReturn = new Product(2,"Oatmeal", 15);
                break;
            case 3 :
                productToReturn = new Product(3,"Tofu", 20);
                break;
            case 4 :
                productToReturn = new Product(4,"Macaroon", 50);
                break;
        }
        return productToReturn;
    }
}
