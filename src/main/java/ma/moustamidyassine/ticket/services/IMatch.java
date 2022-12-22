package ma.moustamidyassine.ticket.services;


import ma.moustamidyassine.ticket.dto.MatchDto;
import ma.moustamidyassine.ticket.dto.MatchTicketInfoDto;
import ma.moustamidyassine.ticket.entities.Match;

import java.util.List;

public interface IMatch {
    public Match ajouterMatch(MatchDto matchDto);

    public boolean supprimerMatch(Long id);
    public int nbrTicketRestant(Long idMatch);
    public int nbrTicketReserver(Long idMatch);

    public MatchTicketInfoDto getInfosMatch(Long idMatch);

    public List<Match> getAllMatchPlein();
}
