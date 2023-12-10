import { Component } from '@angular/core';
import { Players } from 'src/app/Model/Players';
import { PlayersService } from 'src/app/Services/players.service';

@Component({
  selector: 'app-players',
  templateUrl: './players.component.html',
  styleUrls: ['./players.component.css']
})
export class PlayersComponent {
response:any;

  constructor(private admService: PlayersService) {}



getAll(){

  console.log("In getAll");
  let response = this.admService.get();
  

    response.subscribe((responseData: any) => {
      console.log(responseData);


      if (typeof responseData === 'string') {
        this.response = JSON.parse(responseData); 
        console.log('Response Data:', this.response);
      } else {
        console.log('Unexpected response type:', responseData);
        
      }
    });

}

byName(){
  console.log("By Name");
  let response = this.admService.orderByName();
  

    response.subscribe((responseData: any) => {
      console.log(responseData);


      if (typeof responseData === 'string') {
        this.response = JSON.parse(responseData); 
        console.log('Response Data:', this.response);
      } else {
        console.log('Unexpected response type:', responseData);
       
      }
    });

}




insert(data:Players){
    
  this.admService.insert(data)
  .subscribe(
    (adm)=>{console.log('Added Admin is: '+adm);}
    );
}

isshowFormVisible: boolean = false;
  showForm() {
    this.isshowFormVisible = !this.isshowFormVisible;
  }

  

}
