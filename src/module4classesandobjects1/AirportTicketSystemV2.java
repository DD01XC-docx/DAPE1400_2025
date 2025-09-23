package module4classesandobjects1;

public class AirportTicketSystemV2 {
    public static void main(String[] args) {
        // Vi oppretter en billett for Trym til Svalbard hvor han skal holde en KI workshop
        TicketV2 ticket1 = new TicketV2("Trym", "24019189765", "Svalbard");
        ticket1.printTicketInfo();

        // Trym blir syk så Kristian må vikariere
        // ticket1.name = "Kristian"; // Denne koden vil gi en error fordi name attributten er private
        // ticket1.setPassengerInfo("Kristian"); // Denne koden vil gi en error fordi setPassengerInfo
        // krever to input: name og personNr
        //ticket1.setPassengerInfo("Kristian"); // Denne koden vil printe en advarsel
        // og name og persoNr blir ikke endret
        ticket1.printTicketInfo();

        // Metoden setPassengerInfo er den eneste måten vi kan endre navn og personNr på
        // siden den krever både navn og personNr som input blir brukeren tvunget til å
        // endre begge på en gang.
        // Vi unngår dermed problemet med at noen kun endrer en av attributtene når passasjeren endres
        ticket1.setPassengerInfo("Kristian", "01107012345");
        ticket1.printTicketInfo();
    }
}
