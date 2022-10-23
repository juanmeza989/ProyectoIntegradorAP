import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Acercade } from 'src/app/model/acercade';
import { SAcercadeService } from 'src/app/service/s-acercade.service';

@Component({
  selector: 'app-edit-acercade',
  templateUrl: './edit-acercade.component.html',
  styleUrls: ['./edit-acercade.component.css']
})
export class EditAcercadeComponent implements OnInit {

  acercadeM:Acercade=null;

  constructor(private AcercadeM: SAcercadeService,private activatedRouter: ActivatedRoute, private router:Router) { }

  ngOnInit(): void {
    const id= this.activatedRouter.snapshot.params['id'];
    this.AcercadeM.detail(id).subscribe(data=>{this.acercadeM=data},err=>{alert("Error al modificar descrpcion"),this.router.navigate([''])})
  }

  onUpdate():void{
    const id= this.activatedRouter.snapshot.params['id'];
    this.AcercadeM.update(id,this.acercadeM).subscribe(data=>{this.router.navigate([''])},err =>{alert("Error al modificar descripcion");this.router.navigate([''])})
  }  

}
