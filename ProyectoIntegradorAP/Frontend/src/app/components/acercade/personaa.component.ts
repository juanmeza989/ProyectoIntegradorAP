/*import { Component, OnInit } from '@angular/core';
import { Personaa } from 'src/app/model/personaa';
import { SPersonaaService } from 'src/app/service/s-personaa.service';
import { TokenService } from 'src/app/service/token.service';


@Component({
  selector: 'app-personaa',
  templateUrl: './personaa.component.html',
  styleUrls: ['./personaa.component.css']
})
export class PersonaaComponent implements OnInit {
  persona:Personaa[]=[];
  constructor(private sPersonaa: SPersonaaService, private tokenService:TokenService) { }

  isLogged=false;
  ngOnInit(): void {
    this.cargarPersonaa();
    if(this.tokenService.getToken()){ 
      this.isLogged=true;
    }else{
      this.isLogged=false;
    }
  }

  cargarPersonaa():void{
    this.sPersonaa.lista().subscribe(data=>{this.persona=data})
  }


} */

import { Component, OnInit } from '@angular/core';
import { Personaa } from 'src/app/model/personaa';
import { SPersonaaService } from 'src/app/service/s-personaa.service';
import { TokenService } from 'src/app/service/token.service';


@Component({
  selector: 'app-personaa',
  templateUrl: './personaa.component.html',
  styleUrls: ['./personaa.component.css']
})
export class PersonaaComponent implements OnInit {
  persona:Personaa[]=[];
  constructor(private sPersonaa: SPersonaaService, private tokenService:TokenService) { }

  isLogged=false;
  ngOnInit(): void {
    this.cargarPersonaa();
    if(this.tokenService.getToken()){ 
      this.isLogged=true;
    }else{
      this.isLogged=false;
    }
  }

  cargarPersonaa():void{
    this.sPersonaa.lista().subscribe(data=>{this.persona=data})
  }

  
  

}
