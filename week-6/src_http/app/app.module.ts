import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { MenuComponent } from './menu/menu.component';
import { CartComponent } from './cart/cart.component';
import { RouterModule,Routes } from '@angular/router';
import { TestService } from './test.service';
import {HttpClientModule} from '@angular/common/http';


const routes:Routes=[{
  path:'',component:HomeComponent
},{
  path:'Cart',component:CartComponent
},{
  path:'Menu',component:MenuComponent
},{
  path:'**',component:HomeComponent
}
]


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    MenuComponent,
    CartComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(routes),
    HttpClientModule
  ],
  providers: [TestService],
  bootstrap: [AppComponent]
})
export class AppModule { }
