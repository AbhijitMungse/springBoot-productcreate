package com.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@SpringBootApplication
public class ProductcreateupdatedeleteApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductcreateupdatedeleteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product p1=new Product("Hp",30000);
		Product p2=new Product("Dell",45000);
		Product p3=new Product("Sony",35000);
		Product p4=new Product("Acer",40000);
		
		System.out.println("All saved");
		
		
		
	}


}
