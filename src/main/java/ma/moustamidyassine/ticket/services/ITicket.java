package ma.moustamidyassine.ticket.services;


import ma.moustamidyassine.ticket.dto.TicketDto;
import ma.moustamidyassine.ticket.entities.Ticket;

public interface ITicket {
    public Ticket ajouterTicket(Long idMatch,  TicketDto ticketDto);
    public boolean modifierStatutTicket(Long idticket);
    public boolean supprimerTicket(Long idTicket);

}
