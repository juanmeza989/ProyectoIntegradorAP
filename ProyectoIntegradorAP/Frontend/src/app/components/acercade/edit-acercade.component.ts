import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Personaa } from 'src/app/model/personaa';
import { SPersonaaService } from 'src/app/service/s-personaa.service';

@Component({
  selector: 'app-edit-acercade',
  templateUrl: './edit-acercade.component.html',
  styleUrls: ['./edit-acercade.component.css']
})
export class EditAcercadeComponent implements OnInit {
  personaa:Personaa=null;

  constructor(private sPersonaa: SPersonaaService,private activatedRouter: ActivatedRoute, private router:Router) { }

  ngOnInit(): void {
    const id= this.activatedRouter.snapshot.params['id'];
    this.sPersonaa.detail(id).subscribe(data=>{this.personaa=data},err=>{alert("Error al modificar persona"),this.router.navigate([''])})
  }

  onUpdate():void{
    const id= this.activatedRouter.snapshot.params['id'];
    this.sPersonaa.update(id,this.personaa).subscribe(data=>{this.router.navigate([''])},err =>{alert("Error al modificar persona");this.router.navigate([''])})
  }  
}