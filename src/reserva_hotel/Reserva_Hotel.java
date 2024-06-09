package reserva_hotel;
/**
 *
 * @author Júlia Suriani
 */
public class Reserva_Hotel {
    public static void main(String[] args) {
        SistemaReservas sistemaReservas = new SistemaReservas();

        Reserva reserva1 = new Reserva("Hotel A", 101, "2024-06-10", "2024-06-15");
        sistemaReservas.adicionarReserva("ID123", reserva1);

        Reserva reserva2 = new Reserva("Hotel B", 202, "2024-06-20", "2024-06-25");
        sistemaReservas.adicionarReserva("ID456", reserva2);

        System.out.println(sistemaReservas.obterReserva("ID123"));
        System.out.println(sistemaReservas.obterReserva("ID456"));

        sistemaReservas.removerReserva("ID123");
    }
    
}
