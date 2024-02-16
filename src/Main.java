import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, sifreyenileme = null;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adını Giriniz: ");
        username = input.nextLine();

        System.out.println("Şifre giriniz: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız");
        } else if (!password.equals("java123")) {
            System.out.println("Şifreniz Yanlış. Şifrenizi sıfırlamak ister misiniz? evet/hayır");
            sifreyenileme = input.nextLine();
            {
                switch (sifreyenileme) {
                    case "hayır":
                        System.out.println("Şifreniz değiştirilmedi");
                        break;
                    case "evet":
                        System.out.println("Yeni Şifrenizi Giriniz: ");
                        password = input.nextLine();
                        if (password.equals("java123")) {
                            System.out.println("Daha önceden kullanılan şifre girildiği için, işlem iptal edildi.");
                        } else {
                            System.out.println("Şifre oluşturuldu");
                            break;
                        }

                }
            }
        } else {
            System.out.println("Bilgileriniz Yanlış");
        }


    }
}