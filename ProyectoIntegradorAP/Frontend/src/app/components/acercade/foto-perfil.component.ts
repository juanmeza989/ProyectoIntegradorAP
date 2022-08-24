import { Component, OnInit } from '@angular/core';
import { FotoPerfil } from 'src/app/model/foto-perfil';
import { SFotoPerfilService } from 'src/app/service/s-foto-perfil.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-foto-perfil',
  templateUrl: './foto-perfil.component.html',
  styleUrls: ['./foto-perfil.component.css']
})
export class FotoPerfilComponent implements OnInit {

  fotoP:FotoPerfil[]=[];
  constructor(private sFotoP: SFotoPerfilService, private tokenService:TokenService) { }

  isLogged=false;
  ngOnInit(): void {
    this.cargarFotoP();
    if(this.tokenService.getToken()){ 
      this.isLogged=true;
    }else{
      this.isLogged=false;
    }
  }

  cargarFotoP():void{
    this.sFotoP.lista().subscribe(data=>{this.fotoP=data})
  }
}
