import java.sql.Struct;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.println("Date d'arrivée : ");
        String sDateArrivee = scanner.nextLine();

        System.out.println("Date depart : ");
        String sDateDepart = scanner.nextLine();

        System.out.println("Heure d'arrivée : ");
        String sHeureArrivee = scanner.nextLine();

        System.out.println("Heure depart : ");
        String sHeureDepart = scanner.nextLine();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        LocalDate dateArrive = LocalDate.parse(sDateArrivee,dateFormatter);
        LocalDate dateDepart = LocalDate.parse(sDateDepart,dateFormatter);

        LocalTime heureArrivee = LocalTime.parse(sHeureArrivee,timeFormatter);
        LocalTime heureDepart = LocalTime.parse(sHeureDepart,timeFormatter);

        Reservation reservation = new Reservation(
        nom, dateArrive, dateDepart, heureArrivee, heureDepart);

        System.out.println(reservation.calculerDureeJournee());
        System.out.println(reservation.calculerDureeSejour());
        System.out.println(reservation.estValide());
        System.out.println(reservation.afficherReservation());



    }
}