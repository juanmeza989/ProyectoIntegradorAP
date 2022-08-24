import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Banner } from '../model/banner';

@Injectable({
  providedIn: 'root'
})
export class SBannerService {
  expUrl='http://localhost:8080/banner/';


  constructor(private httpClient:HttpClient) { }

  public lista():Observable<Banner[]>{
    return this.httpClient.get<Banner[]>(this.expUrl+'lista');

  }

  public detail(id:number): Observable<Banner>{
    return this.httpClient.get<Banner>(this.expUrl+`detail/${id}`);
  }

  public save(experiencia: Banner):Observable<any>{
    return this.httpClient.post<any>(this.expUrl+'create',experiencia);
  }

  public update(id:number, experiencia:Banner):Observable<any>{
    return this.httpClient.put<any>(this.expUrl+`update/${id}`,experiencia);
  }

  public delete(id:number):Observable<any>{
    return this.httpClient.delete<any>(this.expUrl+`delete/${id}`);
  }
}
