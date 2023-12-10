import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Players } from '../Model/Players';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlayersService {

  constructor(private http:HttpClient) { }

  baseURL:string = 'http://localhost:9191/api/players/';

  insert(body:Players):Observable<Players>{

    console.log(body);

      return this.http.post<Players>(this.baseURL+"add",body);

  }
  get():Observable<Players>{

    console.log(' Get of players');

      return this.http.get<Players>(this.baseURL+"all",{responseType:'text' as 'json'});

  }
  orderByName():Observable<Players>{

    console.log(' Order  of playersname');

      return this.http.get<Players>(this.baseURL+"orderByName",{responseType:'text' as 'json'});

  }
  
}
