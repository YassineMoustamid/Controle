package ma.moustamidyassine.ticket.controllers;

import lombok.AllArgsConstructor;
import ma.moustamidyassine.ticket.dto.MatchDto;
import ma.moustamidyassine.ticket.dto.MatchTicketInfoDto;
import ma.moustamidyassine.ticket.dto.TicketDto;
import ma.moustamidyassine.ticket.entities.Match;
import ma.moustamidyassine.ticket.entities.Ticket;
import ma.moustamidyassine.ticket.services.MatchService;
import ma.moustamidyassine.ticket.services.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(produces = "application/json",path = "controle")
public class MyAppController {
    MatchService matchService;
    TicketService ticketService;

    @GetMapping("allMatchs")
    public List<Match> getAllMatchs(){
        return matchService.getAllMatchs();
    }
    @GetMapping("allMatchPlein")
    public List<Match> getAllMatchPlein(){
        return matchService.getAllMatchPlein();
    }
    @PostMapping("/ajouterMatch")
    public Match addMatch(@RequestBody MatchDto matchDto){
        return matchService.ajouterMatch(matchDto);
    }
    @DeleteMapping("/supprmierMatch/{idMatch}")
    public boolean deleteMatch(@PathVariable Long idMatch){
        return matchService.supprimerMatch(idMatch);
    }
    @GetMapping("/getNbrTicketRestant/{idMatch}")
    public int getNbrTicketRestant(@PathVariable Long idMatch){
        return matchService.nbrTicketRestant(idMatch);
    }
    @GetMapping("/getNbrTicketReserver/{idMatch}")
    public int getNbrTicketReserver(@PathVariable Long idMatch){
        return matchService.nbrTicketReserver(idMatch);
    }
    @PostMapping("/ajouterTicket/{idMatch}")
    public Ticket addTicket(@PathVariable Long idMatch, @RequestBody TicketDto ticketDto){return ticketService.ajouterTicket(idMatch, ticketDto);}
    @PutMapping("changementStatutTicket/{idTicket}")
    public boolean updateTicket(@PathVariable Long idTicket){
        return ticketService.modifierStatutTicket(idTicket);
    }
    @GetMapping("matchInfos/{idMatch}")
    public MatchTicketInfoDto getInfosMatch(Long idMatch){
        return matchService.getInfosMatch(idMatch);
    }
    @DeleteMapping("/supprimerTicket/{idTicket}")
    public boolean deleteTicket(@PathVariable Long idTicket){return ticketService.supprimerTicket(idTicket);}


}
