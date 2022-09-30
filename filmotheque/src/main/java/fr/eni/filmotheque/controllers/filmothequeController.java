package fr.eni.filmotheque.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.services.FilmService;

@Controller
@SessionAttributes("films")
public class filmothequeController {
	
	private FilmService service;
	
	public filmothequeController(FilmService service) {
		this.service = service;
	}

	@ModelAttribute("films")
	public List<Film> getFilms() {
		return new ArrayList<Film>();
	}

	@GetMapping({ "", "/", "/index", "/accueil" })
	public String accueil(Model modele) {
		modele.addAttribute("film", new Film(1, "nom 1", 1991, 1, "synopsis 1"));
		return "accueil";
	}

	@PostMapping({ "", "/", "/index", "/accueil" })
	public String traitFormulaire(@ModelAttribute("film") Film film, 
			@ModelAttribute("films") List<Film> listeFilms) {
		listeFilms.add(film);
		return "accueil";
	}

	@RequestMapping("/filmotheque")
	public String filmotheque(Model modele) {
		return "filmotheque";
	}

	@RequestMapping("/detail")
	public String detail(@ModelAttribute("film") Film film, Model modele) {
		modele.addAttribute("film", film);
		return "detail";
	}

	@GetMapping("/detail")
	public String detailFilm(@RequestParam int id, Model model) {
		Film film = service.getFilmById(id);
		model.addAttribute(film);
		return "detail";
	}

}
