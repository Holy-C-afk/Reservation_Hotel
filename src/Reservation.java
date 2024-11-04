import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private String NomClient;
    private LocalDate dateArrive;
    private LocalDate dateDepart;
    private LocalTime heureArrive;
    private LocalTime heureDepart;

    public Reservation(String NomClient,LocalDate dateArrive,LocalDate dateDepart,LocalTime heureArrive,LocalTime heureDepart){
        this.NomClient = NomClient;
        this.dateArrive = dateArrive;
        this.dateDepart = dateDepart;
        this.heureArrive = heureArrive;
        this.heureDepart = heureDepart;
    }

    public Period calculerDureeSejour(){
        return Period.between(dateDepart,dateArrive);
    }
    public Duration calculerDureeJournee(){
        return Duration.between(heureArrive,heureDepart);
    }

    public boolean estValide(){
        return dateArrive.isBefore(dateDepart) && heureDepart.isAfter(heureArrive);
    }

    public String afficherReservation(){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");



        String  DA= String.valueOf(dateArrive);
        String  DP= String.valueOf(dateDepart);
        String  HA= String.valueOf(heureArrive);
        String  HD= String.valueOf(heureDepart);
        return "Date d'arrivee : " + DA + "Date depart : " + DP + "Heure arrivee : " + HA + "Heure depart : " + HD;
    }



}
