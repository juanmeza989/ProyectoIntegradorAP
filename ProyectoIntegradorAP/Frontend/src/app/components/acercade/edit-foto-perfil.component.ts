import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FotoPerfil } from 'src/app/model/foto-perfil';
import { SFotoPerfilService } from 'src/app/service/s-foto-perfil.service';

@Component({
  selector: 'app-edit-foto-perfil',
  templateUrl: './edit-foto-perfil.component.html',
  styleUrls: ['./edit-foto-perfil.component.css']
})
export class EditFotoPerfilComponent implements OnInit {

  fotoP:FotoPerfil=null;

  constructor(private sFotoP: SFotoPerfilService,private activatedRouter: ActivatedRoute, private router:Router) { }

  ngOnInit(): void {
    const id= this.activatedRouter.snapshot.params['id'];
    this.sFotoP.detail(id).subscribe(data=>{this.fotoP=data},err=>{alert("Error al modificar foto"),this.router.navigate([''])})
  }

  onUpdate():void{
    const id= this.activatedRouter.snapshot.params['id'];
    this.sFotoP.update(id,this.fotoP).subscribe(data=>{this.router.navigate([''])},err =>{alert("Error al modificar foto");this.router.navigate([''])})
  }  

}
