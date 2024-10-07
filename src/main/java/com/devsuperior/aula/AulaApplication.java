package com.devsuperior.aula;

import com.devsuperior.aula.entities.Order;
import com.devsuperior.aula.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	@Autowired
    private OrderService orderService;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	Scanner sc = new Scanner(System.in);

	Integer code = sc.nextInt();
	Double basic = sc.nextDouble();
	Double discount = sc.nextDouble();
	Order order = new Order(code,basic,discount);

	System.out.println("Pedido código " + order.getCode());
	System.out.println("Valor Total: R$ " + String.format("%.2f", orderService.total(order)));
	}
}
