import { Component, OnInit } from '@angular/core';
import { Hero } from '../../models/model.hero';
import { HeroService } from '../../services/hero.service';

@Component({
  selector: 'app-hero',
  templateUrl: './hero.component.html',
  styleUrls: ['./hero.component.css']
})
export class HeroComponent implements OnInit {
  hero: Hero = new Hero();
  // declaration of the variables



  heroes: Hero[];

  constructor(private heroService: HeroService) { }

  ngOnInit() {
    this.getHeroes();

  }


  getHeroes(): void {
    this.heroService.getHeroes().subscribe(heroes => this.heroes = heroes);
  }


  addHero() {
    this.heroService.addHero(this.hero).subscribe(hero => {
      this.heroes.push(this.hero);

    });
  }
  delete(hero: Hero): void {
    this.heroes = this.heroes.filter(h => h !== hero);
    this.heroService.deleteHero(hero).subscribe();
  }

}
