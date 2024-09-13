package br.com.devsuperior.desafio.injecao.dependencia;

import br.com.devsuperior.desafio.injecao.dependencia.entities.Order;
import br.com.devsuperior.desafio.injecao.dependencia.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(DependenciaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.00, 20.0);
		Order order2 = new Order(2282, 800.00, 10.0);
		Order order3 = new Order(1309, 95.90, 0.0);



		System.out.println("Pedido codigo " + order1.getCode());
		System.out.println("Valor Total R$: " + orderService.total(order1));

		System.out.println("Pedido codigo " + order2.getCode());
		System.out.println("Valor Total R$: " + orderService.total(order2));

		System.out.println("Pedido codigo " + order3.getCode());
		System.out.println("Valor Total R$: " + orderService.total(order3));


	}
}
