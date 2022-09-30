package fr.eni.filmotheque.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Film;

@Service
public class FilmServiceImpl implements FilmService{

	private List<Film> listeFilms;
	
	public FilmServiceImpl() {
		listeFilms = new ArrayList<>();
//		Film film = new Film(1, "nom 1", 1991, 1, "synopsis 1");
//		listeFilms.add(film);
	}
	
	public Film getFilmById(int id) {
		
		for(Film film: listeFilms) {
			if (film.getId() == id) {
				return film;
			}
		}
		
		return null;
	}
	
	public List<Film> getListeFilms(){
		return new ArrayList<Film>();
	}
}
