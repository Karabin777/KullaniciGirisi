import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;
        boolean isLoggedIn = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici Adiniz");
        userName = input.nextLine();
        System.out.println("Sifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris yaptiniz !");
            isLoggedIn = true;
        } else {
            System.out.println("Bilgileriniz Yanlis !");
            System.out.println("Sifrenizi sıfırlamak ister misiniz? (y/n)");
            String reset = input.nextLine();
            if (reset.equalsIgnoreCase("y")) {
                System.out.println("Lütfen yeni şifrenizi giriniz");
                newPassword = input.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("Yeni şifreniz, eski şifrenizle aynı olamaz!");
                } else {
                    System.out.println("Şifreniz başarıyla değiştirildi");
                    password = newPassword;
                    isLoggedIn = true;
                }
            }
        }

        if (isLoggedIn) {

        }
    }
}
