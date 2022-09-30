package fr.eni.filmotheque.services;

import java.util.List;
import java.util.Map;

import fr.eni.filmotheque.bo.Genre;

public interface GenreService {
	
	public List<Genre> getListeGenres();
	
	public Map<Integer, Genre> getMapGenres();

}
