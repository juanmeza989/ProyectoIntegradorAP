import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Educacion } from '../model/educacion';

@Injectable({
  providedIn: 'root'
})
export class SEducacionService {
  expUrl='http://localhost:8080/educat/';

  constructor(private httpClient:HttpClient) { }

  public lista():Observable<Educacion[]>{
    return this.httpClient.get<Educacion[]>(this.expUrl+'lista');

  }

  public detail(id:number): Observable<Educacion>{
    return this.httpClient.get<Educacion>(this.expUrl+`detail/${id}`);
  }

  public save(educacion: Educacion):Observable<any>{
    return this.httpClient.post<any>(this.expUrl+'create',educacion);
  }

  public update(id:number, educacion:Educacion):Observable<any>{
    return this.httpClient.put<any>(this.expUrl+`update/${id}`,educacion);
  }

  public delete(id:number):Observable<any>{
    return this.httpClient.delete<any>(this.expUrl+`delete/${id}`);
  }
}
