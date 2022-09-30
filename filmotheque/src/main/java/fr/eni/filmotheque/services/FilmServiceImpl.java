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
		System.out.println(listeFilms);
		
		for(Film film: listeFilms) {
			System.out.println(id + "dif");
			if (film.getId() == id) {
				System.out.println(id);
				return film;
			}
		}
		
		return null;
	}
	
	public List<Film> getListeFilms(){
		return listeFilms;
	}
	
	public void addInListeFilms(Film film) {
		System.out.println("service" + film.getSynopsis());
		listeFilms.add(film);
	}

	public Film getFilm() {
		return new Film();
	}

}
