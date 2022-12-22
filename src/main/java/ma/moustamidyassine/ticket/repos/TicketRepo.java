package ma.moustamidyassine.ticket.repos;

import ma.moustamidyassine.ticket.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepo extends JpaRepository<Ticket,Long> {
    List<Ticket> findByMatch_Id(Long idMatch);
}
