import { Component, OnInit } from '@angular/core';
import { Acercade } from 'src/app/model/acercade';
import { SAcercadeService } from 'src/app/service/s-acercade.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-acercade',
  templateUrl: './acercade.component.html',
  styleUrls: ['./acercade.component.css']
})
export class AcercadeComponent implements OnInit {
  acercadeM:Acercade[]=[];
  constructor(private AcercadeM: SAcercadeService, private tokenService:TokenService) { }

  isLogged=false;
  ngOnInit(): void {
    this.cargarAcercadeM();
    if(this.tokenService.getToken()){ 
      this.isLogged=true;
    }else{
      this.isLogged=false;
    }
  }

  cargarAcercadeM():void{
    this.AcercadeM.lista().subscribe(data=>{this.acercadeM=data})
  }
}
