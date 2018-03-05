import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  static heroesUrl = 'http://localhost:8080/';
  title = 'Tour of Heroes';
}
