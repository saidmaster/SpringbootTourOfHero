package org.hero.test.controller;

import java.util.List;


import org.hero.test.models.Hero;
import org.hero.test.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {

	@Autowired
	private HeroService heroService;
	
	@CrossOrigin
	@RequestMapping(value = "/heroes" , method = RequestMethod.GET)
	public List<Hero> getHeroesFromController(){
		return heroService.getHeroes();
	}
	
	@CrossOrigin
	@RequestMapping(value = "/hero" , method = RequestMethod.GET)
	public Hero getHeroFromController(@RequestParam("id") String id){
		return heroService.getHeroById(Integer.parseInt(id));
	}
	
	@CrossOrigin
	@RequestMapping (value = "/hero" , method = RequestMethod.POST)
	public void addHero(@RequestBody Hero hero) {
		heroService.addHero(hero);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/hero" , method = RequestMethod.DELETE )
	public void deleteVille(@RequestParam("id") String id) {
		heroService.deleteHero(Integer.parseInt(id));
	}
	
	@CrossOrigin
	@RequestMapping(value = "/hero" , method = RequestMethod.PUT )
	public void updateHero(@RequestBody Hero hero) {
		heroService.updateHero(hero);
	}

	@CrossOrigin
	@RequestMapping(value = "/herosearch" , method = RequestMethod.GET)
	public List<Hero> getHeroesSearch(@RequestParam("name") String name){
		return heroService.getHeroByName((name));
	}
}
