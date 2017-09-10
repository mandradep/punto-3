/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama;

/**
 *
 * @author Giova
 */
public class Store {
   private Address addreess;
   private Car  carros[]=new Car[20];
   private int carrosGuardados=0;

    public Store(Address addreess) {
        this.addreess = addreess;
    }

    public Address getAddreess() {
        return addreess;
    }
   
   public boolean addCar(Car car){
           boolean exito=false;
          
    if(this.carrosGuardados<20){
        this.carros[this.carrosGuardados]=car;
        this.carrosGuardados ++;
        exito=true;
   
}
return exito;
}
    public void getprintInformaciónCarros(){
        
        for(int i=0; i<20; ++i){
            System.out.println("vehiculo "+(i+1));
            System.out.println("categoria: "+this.carros[i].getCarModel().getCategory().getName());
            System.out.println("modelo: "+this.carros[i].getCarModel().getModelNumber());
            System.out.println("kilometraje: "+this.carros[i].getTraveled());
            System.out.println("precio: "+this.carros[i].getCarModel().getPrice());
            System.out.println('\n');
        }
    }
}