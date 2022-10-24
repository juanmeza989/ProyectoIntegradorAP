export class Educacion {
    id?:number;
    nombreEdu:string;
    descripcionEdu:string;
    logoEdu:string;

    constructor(nombreEdu:string, descripcionEdu:string, logoEdu:string){
        this.nombreEdu=nombreEdu;
        this.descripcionEdu=descripcionEdu;
        this.logoEdu=logoEdu;
    }
}
