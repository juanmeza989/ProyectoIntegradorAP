import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditPersonaaComponent } from './components/acercade/edit-personaa.component';
import { EditFotoPerfilComponent } from './components/acercade/edit-foto-perfil.component';
import { EditBannerComponent } from './components/banner/edit-banner.component';
import { EditEducacionComponent } from './components/educacion/edit-educacion.component';
import { NewEducacionComponent } from './components/educacion/new-educacion.component';
import { EditExperienciaComponent } from './components/experiencia/edit-experiencia.component';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { EditAcercadeComponent } from './components/acercade/edit-acercade.component';

const routes: Routes = [
  {path:'',component: HomeComponent},
  {path:'login',component: LoginComponent},
  {path:'nuevaexp',component: NewExperienciaComponent},
  {path:'editexp/:id',component: EditExperienciaComponent},
  {path:'nuevaedu',component:NewEducacionComponent},
  {path:'editedu/:id',component:EditEducacionComponent},
  {path:'editpersonaa/:id',component:EditPersonaaComponent},
  {path:'editbanner/:id',component:EditBannerComponent},
  {path:'editfotoperfil/:id',component:EditFotoPerfilComponent},
  {path:'editacercade/:id',component:EditAcercadeComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
