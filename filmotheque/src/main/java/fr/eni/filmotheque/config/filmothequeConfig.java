package fr.eni.filmotheque.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import fr.eni.filmotheque.bo.Genre;
import fr.eni.filmotheque.services.GenreService;

@Configuration
public class filmothequeConfig {
	
	@Bean
	@ApplicationScope
	public List<Genre> genres(GenreService service) {
		return service.getListeGenres();
	}

}
