import { Component } from '@angular/core';
import { TestService } from '../test.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent {
  constructor(public ts:TestService){}
  
  addMobile(){
    this.ts.mobiles.push('Nokia');
  }
}
