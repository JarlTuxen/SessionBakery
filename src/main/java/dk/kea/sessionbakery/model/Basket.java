package dk.kea.sessionbakery.model;

import java.util.List;

public class Basket {
    private List<Product> productList;

    public Basket(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
