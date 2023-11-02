package retangulo;

import retangulo.entities.Rectangle;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Entre com a largura e altura do retângulo: ");
        rectangle.width = input.nextDouble();
        rectangle.height = input.nextDouble();

        System.out.println(rectangle);

        input.close();
    }
}
