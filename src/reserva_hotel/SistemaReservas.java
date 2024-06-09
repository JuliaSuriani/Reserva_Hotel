package reserva_hotel;
import java.util.*;

/**
 *
 * @author Julia
 */
public class SistemaReservas {
    private Map<String, Reserva> reservas = new HashMap<>();
    private Map<String, Queue<Reserva>> filasDeEspera = new HashMap<>();
    
    public void adicionarReserva(String id, Reserva reserva) {
        if (reservas.containsKey(id)) {
            Queue<Reserva> filaDeEspera = filasDeEspera.getOrDefault(id, new LinkedList<>());
            filaDeEspera.add(reserva);
            filasDeEspera.put(id, filaDeEspera);
        } else {
            reservas.put(id, reserva);
        }
    }

    public Reserva obterReserva(String id) {
        return reservas.get(id);
    }

    public void removerReserva(String id) {
        if (filasDeEspera.containsKey(id) && !filasDeEspera.get(id).isEmpty()) {
            reservas.put(id, filasDeEspera.get(id).poll());
            if (filasDeEspera.get(id).isEmpty()) {
                filasDeEspera.remove(id);
            }
        } else {
            reservas.remove(id);
        }
    }
}
