import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Acercade } from '../model/acercade';

@Injectable({
  providedIn: 'root'
})
export class SAcercadeService {
  expUrl='https://backendjm.herokuapp.com/acercade/';

  
  constructor(private httpClient:HttpClient) { }

  public lista():Observable<Acercade[]>{
    return this.httpClient.get<Acercade[]>(this.expUrl+'lista');

  }

  public detail(id:number): Observable<Acercade>{
    return this.httpClient.get<Acercade>(this.expUrl+`detail/${id}`);
  }

  public save(acercadeM: Acercade):Observable<any>{
    return this.httpClient.post<any>(this.expUrl+'create',acercadeM);
  }

  public update(id:number, acercadeM:Acercade):Observable<any>{
    return this.httpClient.put<any>(this.expUrl+`update/${id}`,acercadeM);
  }

  public delete(id:number):Observable<any>{
    return this.httpClient.delete<any>(this.expUrl+`delete/${id}`);
  }
}
