package BookCatalog;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;


public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();

		bc.printAllBooks();
		//get price of book called Tom Jones in EUR
		Optional.ofNullable(bc.findBookByName("Tom Jones")).ifPresent(book -> {
			System.out.println(book.getPrice().convert("EUR"));
		});
		BookReadOnly book = bc.findBookByName("Tom Jones");

		bc.printAllBooks();
		
	}
}
