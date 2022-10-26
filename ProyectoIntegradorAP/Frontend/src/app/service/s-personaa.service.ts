import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Personaa } from '../model/personaa';

@Injectable({
  providedIn: 'root'
})
export class SPersonaaService {
  expUrl='https://backendjm.herokuapp.com/personaa/';


  constructor(private httpClient:HttpClient) { }

  public lista():Observable<Personaa[]>{
    return this.httpClient.get<Personaa[]>(this.expUrl+'lista');

  }

  public detail(id:number): Observable<Personaa>{
    return this.httpClient.get<Personaa>(this.expUrl+`detail/${id}`);
  }

  public update(id:number, personaa:Personaa):Observable<any>{
    return this.httpClient.put<any>(this.expUrl+`update/${id}`,personaa);
  }

  
}