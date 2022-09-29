package fr.eni.filmotheque.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.filmotheque.bo.Film;

@Controller
@SessionAttributes("films")
public class filmothequeController {

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
	public String detail(Model modele) {
		return "detail";
	}

}
