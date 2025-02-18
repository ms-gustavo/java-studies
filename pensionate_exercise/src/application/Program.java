package application;

import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rooms[] room = new Rooms[10];
		
		System.out.println("How many rooms will be rented? ");
		int roomsToRent = sc.nextInt();
		while (roomsToRent > 10 || roomsToRent < 0) {
			System.out.println("Max rooms availables: 10");
			roomsToRent = sc.nextInt();
		}
		for(int i = 0; i < roomsToRent; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i + 1));
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Desired room: ");
			int desiredRoom = sc.nextInt();
			
			room[desiredRoom] = new Rooms(name, email, true);
					
		}
		
		System.out.println("Busy Rooms:");
		for(int i = 0; i < room.length; i++) {
			if(room[i] != null && room[i].isRent()) {
				System.out.println("Room " + i +": "+ room[i].getName() + ", " + room[i].getEmail());
			}
		}
			
		sc.close();

	}

}
