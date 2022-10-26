import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { FotoPerfil } from '../model/foto-perfil';

@Injectable({
  providedIn: 'root'
})
export class SFotoPerfilService {
  expUrl='https://backendjm.herokuapp.com/fotoperfil/';


  constructor(private httpClient:HttpClient) { }

  public lista():Observable<FotoPerfil[]>{
    return this.httpClient.get<FotoPerfil[]>(this.expUrl+'lista');

  }

  public detail(id:number): Observable<FotoPerfil>{
    return this.httpClient.get<FotoPerfil>(this.expUrl+`detail/${id}`);
  }

  public save(fotoP: FotoPerfil):Observable<any>{
    return this.httpClient.post<any>(this.expUrl+'create',fotoP);
  }

  public update(id:number, fotoP:FotoPerfil):Observable<any>{
    return this.httpClient.put<any>(this.expUrl+`update/${id}`,fotoP);
  }

  public delete(id:number):Observable<any>{
    return this.httpClient.delete<any>(this.expUrl+`delete/${id}`);
  }
}
