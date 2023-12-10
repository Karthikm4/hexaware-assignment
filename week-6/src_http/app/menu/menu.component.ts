import { Component } from '@angular/core';
import { TestService } from '../test.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent {
  constructor(public ts:TestService){}
}
