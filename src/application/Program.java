package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		/*
		 * Lambda - consumer
		 */

		// Remove da lista price maior igual a 100
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// usando classe PriceUpate
		// que implementa interface consumer
		/*
		list.forEach(new PriceUpdate());
		list.forEach(System.out::println);
		*/
		
		// ou usando metodo static
		/*
		list.forEach(Product::staticPriceUpdate);
		list.forEach(System.out::println);
		*/

		//ou usando metodo nao static
		/*
		list.forEach(Product::nonStaticPriceUpdate);
		list.forEach(System.out::println);
		 */
		
		//ou expressao lambda declarada
		/*
		double factor = 1.1;
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * factor);
		};		
		list.forEach(cons);
		list.forEach(System.out::println);
		*/
		
		// ou Expressao lambda inline
		
		list.forEach(p -> p.setPrice( p.getPrice() * 1.1 ) );
		list.forEach(System.out::println);
		
	}

}
