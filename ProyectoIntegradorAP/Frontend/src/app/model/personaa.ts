export class Personaa {
    id?: number;
    nombrePersonaa: string;
    apellidoPersonaa: string;
    tituloPersonaa:string;

    constructor(nombrePersonaa: string, apellidoPersonaa: string, tituloPersonaa:string) {
        this.nombrePersonaa = nombrePersonaa;
        this.apellidoPersonaa = apellidoPersonaa;
        this.tituloPersonaa = tituloPersonaa;
    }
}
