import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//verilen isiq rengine gore svetoforun isleme prinsipini simulasiya edin,
//sari gelse "Hazirlasin",
//qirmizi gelse "Dayanin",
//yasil gelse "Hereket edin" cap olunsun

//        Scanner scanner = new Scanner(System.in);
//        String colours = scanner.nextLine();
//
//        switch(colours){
//            case "sari" -> System.out.println("Hazirlashin!");
//            case "qirmizi" -> System.out.println("Dayanin!");
//            case "yashil" -> System.out.println("Hereket edin!");
//        }

//Kicik bir proqram yazin, proqram sizden valyuta, hedef valyuta ve deyeri alsin
//verilen valyutadan hedef valyutaya cevirib deyeri cap etsin, Meselen:
//valyuta: USD  hedef valyuta: AZN  deyer: 100  olunacaq cavab: 170
//3 valyuta yazsaniz kifayetdir: USD, EUR, AZN

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hansi valyutani deyishmek isteyirsiniz?");
        String valyutadan = scanner.nextLine();

        System.out.println("Hansi valyutaya cevirme etmek isteyirsiniz?");
        String valyutaya = scanner.nextLine();

        System.out.println("Meblegi daxil edin:");
        double amount = scanner.nextDouble();
        System.out.println();

        switch (valyutadan) {
            case "AZN":

                switch (valyutaya) {
                    case "USD" -> System.out.println(amount * 0.59);
                    case "EUR" -> System.out.println(amount * 0.54);
                }
            break;

            case "USD":

                switch (valyutaya) {
                    case "AZN" -> System.out.println(amount * 1.70);
                    case "EUR" -> System.out.println(amount * 0.92);
                }
                break;

            case "EUR":

                switch (valyutaya) {
                    case "AZN" -> System.out.println(amount * 1.85);
                    case "USD" -> System.out.println(amount * 0.54);
                }
                break;
        }

    }
}