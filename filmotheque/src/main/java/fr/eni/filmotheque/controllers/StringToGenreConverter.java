package fr.eni.filmotheque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.filmotheque.bo.Genre;
import fr.eni.filmotheque.services.GenreServiceImpl;

@Component
public class StringToGenreConverter implements Converter<String, Genre>{
	
	private GenreServiceImpl service;
	
	@Autowired
	public void setGenreService (GenreServiceImpl service) {
		this.service = service;
	}
	
	@Override
	public Genre convert(String id) {
		Integer theid = Integer.parseInt(id);
		
		return service.getMapGenres().get(theid);
	}

}