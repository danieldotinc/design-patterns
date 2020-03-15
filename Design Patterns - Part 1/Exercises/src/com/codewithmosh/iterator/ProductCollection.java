package com.codewithmosh.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void push(Product product) {
    products.add(product);
  }

  public Product pop(){
    int lastIndex = products.size() - 1;
    Product lastProduct = products.get(lastIndex);
    products.remove(lastIndex);

    return lastProduct;
  }

  public Iterator createIterator(){
    return new ProductList(this);
  }

  public class ProductList implements Iterator{
    private int index = 0;
    private ProductCollection collection;

    public ProductList(ProductCollection collection) {
      this.collection = collection;
    }

    @Override
    public void next() {
       index++;
    }

    @Override
    public Product current() {
      return collection.products.get(index);
    }

    @Override
    public boolean hasNext() {
      return index < collection.products.size();
    }
  }

}

