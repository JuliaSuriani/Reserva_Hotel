package reserva_hotel;

/**
 *
 * @author Julia
 */
public class Reserva {
    String nomeDoHotel;
    int numeroDoQuarto;
    String dataCheckIn;
    String dataCheckOut;

    public Reserva(String nomeDoHotel, int numeroDoQuarto, String dataCheckIn, String dataCheckOut) {
        this.nomeDoHotel = nomeDoHotel;
        this.numeroDoQuarto = numeroDoQuarto;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "nomeDoHotel='" + nomeDoHotel + '\'' +
                ", numeroDoQuarto=" + numeroDoQuarto +
                ", dataCheckIn='" + dataCheckIn + '\'' +
                ", dataCheckOut='" + dataCheckOut + '\'' +
                '}';
    }
}