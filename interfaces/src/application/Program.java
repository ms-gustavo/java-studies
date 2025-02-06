package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;
import model.services.TaxService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.print("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), formatter);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), formatter);
		
		Vehicle vehicle = new Vehicle(carModel);
		CarRental carRental = new CarRental(start, finish, vehicle);
		
		System.out.print("Entre com o preço por hora");
		Double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia");
		Double pricePerDay = sc.nextDouble();
		
		TaxService taxService = new BrazilTaxService();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, taxService);
		rentalService.processInvoice(carRental);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento básico: " + carRental.getInvoice().getBasicPayment());
		System.out.println("Imposto: " + carRental.getInvoice().getTax());
		System.out.println("Pagamento Total: " + carRental.getInvoice().getTotalPayment());
		
		
		sc.close();
		

	}

}
