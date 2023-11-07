package bar;

import bar.entities.Bill;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bill bill = new Bill();

        System.out.print("Sexo: ");
        bill.gender = input.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        bill.beer = input.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        bill.softDrink = input.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        bill.barbecue = input.nextInt();

        System.out.println(bill);

        input.close();
    }
}
