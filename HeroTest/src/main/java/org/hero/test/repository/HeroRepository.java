package org.hero.test.repository;

import java.util.List;

import org.hero.test.models.Hero;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface HeroRepository extends JpaRepository<Hero, Integer> {
	  @Query("select h from Hero h where h.name like %:name%")
	  public List<Hero> findHeroByName(@Param("name") String name);
}
