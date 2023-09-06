import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Vui long nhap ten cua ban: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Xin chao " + name);
    }
}
