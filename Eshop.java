package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Eshop {
    private List<Product> products;
    private List<Customer> customers;

    public Eshop() {
        this.products = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addProduct(Product product) {
         products.add(product);
    }

    public void removeProduct(int productId) {
        products.removeIf(product -> product.getId() == productId);
    }

    public Product findProduct(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null; // Product not found
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(int customerId) {
        customers.removeIf(customer -> customer.getId() == customerId);
    }

    public Customer findCustomer(int customerId) {
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                return customer;
            }
        }
        return null;
    }

    public List<Product> listAllProducts() {
        return products;
    }

    public List<Customer> listAllCustomers() {
        return customers;
    }

    public List<Product> findProductsByName(String searchTerm)
    {
        List<Product> foundProducts = new ArrayList<Product>();
        if (searchTerm == "") {
            return products;
        }
        else {
            for (Product i : products) {
                if (i.getName() == searchTerm) {
                    foundProducts.add(i);
                }
                else
                {
                    if (i.getName().contains(searchTerm))
                    {
                        foundProducts.add(i);
                    }
                }
            }
        }
        return foundProducts;
    }

    public List<Customer> findCustomersByEmailDomain(String domain) {
        List<Customer> foundCustomers = new ArrayList<Customer>();
        if (domain == "") {
            return customers;
        } else
        {
            for(Customer i:customers)
            {
                if(i.getEmail().contains(domain))
                {
                    foundCustomers.add(i);
                }
            }
        }
        return foundCustomers;
    }

}