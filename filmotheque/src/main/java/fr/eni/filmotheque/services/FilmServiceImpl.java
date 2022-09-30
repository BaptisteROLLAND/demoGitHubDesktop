package fr.eni.filmotheque.services;

import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Film;

@Service
public class FilmServiceImpl {

	public Film getFilmById(int id) {
		
		Film film = new Film();
		
		return film;
	}
}
