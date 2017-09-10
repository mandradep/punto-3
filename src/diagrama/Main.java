
package diagrama;

import java.util.Scanner;


public class Main {
    
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        CarModel modelNumber;
        int traveled, price,nCarros;
        Category category;
        String model, name, house, country, postCode,x;
        boolean confirmar;
        Car carros[]= new Car[20];
        CarModel molelo[]=new CarModel[20];
        Category categoria[]=new Category[20];
        
         System.out.println("deme direccion : ");
            house=in.nextLine();
            System.out.println("deme pais : ");
            country=in.nextLine();
            System.out.println("deme codigo postal : ");
            postCode=in.nextLine();
            Address address=new Address(house,country, postCode);
            Store store =new Store(address);
            System.out.println("");
            System.out.println("a continuacion se digitara la informacion de los 20 carros.");
            System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.println("");
            System.out.println("deme la catogoria del vehiculo: "+(i+1));
            name=in.nextLine();
            categoria[i]=new Category(name);
            System.out.println("deme el modelo del vehiculo: "+(i+1));
            model=in.nextLine();
            System.out.println("deme el precio del vehiculo: "+(i+1));
            price=in.nextInt();
            category=categoria[i];
            molelo[i]=new CarModel(category, model, price);
            System.out.println("deme el kilometraje del vehiculo: "+(i+1));
            traveled=in.nextInt();
            x=in.nextLine();
            modelNumber=molelo[i];
            carros[i]=new Car (modelNumber, traveled);
           
            confirmar=store.addCar(carros[i]);
            System.out.println(confirmar);
        }
            System.out.println("");
            System.out.println("");
            System.out.println("la informacion de los carros es: ");    
            store.getprintInformaciónCarros();
            
       
              
    }
            
    
}
