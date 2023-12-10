package com.hexaware.challenge.service;

import java.util.List;



import com.hexaware.challenge.dto.PlayersDTO;
import com.hexaware.challenge.entity.Players;



public interface IPlayersService {
	
	
	Players addPlayers(PlayersDTO playersDTO);
	//PlayersDTO getById(int playerID);
	List<Players> getAllPlayers();
	//Players updatePlayers(PlayersDTO playersDTO);
	//String deleteById(int playerID);
	List<Players> findPlayersByTotalMatchesOrderedByName();
}
