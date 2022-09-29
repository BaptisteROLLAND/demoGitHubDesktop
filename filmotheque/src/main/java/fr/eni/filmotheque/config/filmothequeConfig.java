package fr.eni.filmotheque.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.eni.filmotheque.bo.Film;

@Configuration
public class filmothequeConfig {
	
	@Bean
	public List<Film> listeFilms() {
		return new ArrayList<Film>();
	}

}
