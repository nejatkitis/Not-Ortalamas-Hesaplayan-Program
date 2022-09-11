import java.util.Scanner;

public class Not {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int ma,fi,ki,tu,ta,mu,score,limit ;
    limit = 60;

        System.out.println("Lütfen Matematik Notunu Giriniz : ");
        ma = input.nextInt();

        System.out.println("Lütfen Fizik Notunu Giriniz : ");
        fi = input.nextInt();

        System.out.println("Lütfen Kimya Notunu Giriniz : ");
        ki = input.nextInt();

        System.out.println("Lütfen Türkçe Notunu Giriniz : ");
        tu = input.nextInt();

        System.out.println("Lütfen Tarih Notunu Giriniz : ");
        ta = input.nextInt();

        System.out.println("Lütfen Müzik Notunu Giriniz : ");
        mu = input.nextInt();

        score = (ma+fi+ki+tu+ta+mu)/6;

        System.out.print("Not Ortalamanız : ");
        System.out.println(score);

        String end = (score>=limit)?"Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(end);
    }
}
