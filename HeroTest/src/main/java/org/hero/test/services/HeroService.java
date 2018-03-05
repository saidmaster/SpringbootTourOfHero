package org.hero.test.services;

import java.util.List;


import org.hero.test.models.Hero;
import org.hero.test.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroService {
	
	
	@Autowired
	private HeroRepository heroRepository;
	
	
	public Hero getHeroById(int idHero) {
		return heroRepository.findOne(idHero);
	}
	
	public List<Hero> getHeroByName(String heroName) {
		return heroRepository.findHeroByName(heroName);
	}
	
	public List<Hero> getHeroes (){
		
		return (List<Hero>) heroRepository.findAll();
	}

	public void addHero(Hero hero) {
		
		heroRepository.save(hero);
	}
	public void deleteHero(Integer id) {
		heroRepository.delete(getHeroById(id));
	}
	
	public void updateHero(Hero hero) {
		
		Hero updatedHero = getHeroById(hero.getId());
		updatedHero.setName(hero.getName());
		heroRepository.save(updatedHero);
	}
	
}
