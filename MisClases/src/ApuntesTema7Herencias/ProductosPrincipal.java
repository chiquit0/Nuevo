package ApuntesTema7Herencias;

import java.time.LocalDate;

public class ProductosPrincipal {

	public static void main(String[] args) {
	
		ProductosFrescos manzanas = new ProductosFrescos("Manzanas", LocalDate.now().plusDays(15), 3523, LocalDate.parse("2022-04-21"), "Asia");

		System.out.println(manzanas);
	}

}
