package fr.eni.filmotheque.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Genre;

@Service
public class GenreServiceImpl implements GenreService{
	
	private List<Genre> listeGenres;
	private Map<Integer, Genre> mapGenres;
	
	public GenreServiceImpl() {
		listeGenres = new ArrayList<>();
		listeGenres.add(new Genre(1, "Action"));
		listeGenres.add(new Genre(2, "Aventure"));;
		listeGenres.add(new Genre(3, "Dramatique"));
		
		mapGenres = new HashMap<Integer, Genre>();
		listeGenres.forEach(m -> mapGenres.put(m.getId(), m));
	}
	
	public List<Genre> getListeGenres(){
		return listeGenres;
	}
	
	public Map<Integer, Genre> getMapGenres(){
		return mapGenres;
	}

}
