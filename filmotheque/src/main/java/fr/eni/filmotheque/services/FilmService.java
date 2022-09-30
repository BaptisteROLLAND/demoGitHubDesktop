package fr.eni.filmotheque.services;

import java.util.List;

import fr.eni.filmotheque.bo.Film;

public interface FilmService {
	
	public Film getFilmById(int id);	
	
	public List<Film> getListeFilms();

}
