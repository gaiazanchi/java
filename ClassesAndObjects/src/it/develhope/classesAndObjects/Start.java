package it.develhope.classesAndObjects;

public class Start {
    public static void main(String[] args){

        //Preferences preferences = new Preferences();
        //mi da' errore non lo posso instanziare

        //così posso accedere alle variabili di setting senza poterle modificare
        Preferences preferences = Preferences.getInstance();
        System.out.println(preferences.maxPlacesInGarage + " - " + preferences.garageName);

        Preferences preferences2 = Preferences.getInstance();
        System.out.println(preferences2.maxPlacesInGarage + " - " + preferences2.garageName);

        //attraverso incapsulamento proteggo le variabili ma le riesco a toccare
        preferences.garageName = "My super garage";
        System.out.println(preferences.maxPlacesInGarage + " - " + preferences.garageName);

        Preferences preferences3 = Preferences.getInstance();
        System.out.println(preferences3.maxPlacesInGarage + " - " + preferences3.garageName);

        System.out.println("Start - main");
        Car Mini = new Car();
        Mini.color = "white";
        Mini.model = "Mini Cooper D";
        Mini.isCabrio = false;
        Mini.wheelsNumber = 4;

        //BUG DELLE PORTE E CLASSI DENTRO CLASSI

        /*
        Door MiniDoor = new Door();
        MiniDoor.isElectricDoor = true;
        MiniDoor.color = "red";
        MiniDoor.isElectricWindow = true;
        MiniDoor.hasKeyAccess = true;

        Mini.frontDoorLeft = MiniDoor;
        Mini.frontDoorRight = MiniDoor;
        Mini.rearDoorLeft = MiniDoor;
        Mini.rearDoorRight = MiniDoor;

        //dietro solo le porte sono elettriche, le finestre no
        Mini.rearDoorRight.color= "blue";
        Mini.rearDoorLeft.color = "blue";
        //Le porte sono diventate tutte blue perchè le porte sono tutte nello stesso spazio di memoria, è lo stesso dato
        //Java non ha duplicato la porta, ha usato sempre lo stesso valore --> modifico uno, modifico tutte
        */

        //COME RISORVERE IL BUG DELLE PORTE

        //Dichiaro tutte le porte e loro caratteristiche separatamente
        Door door1 = new Door();
        door1.isElectricDoor = true;
        door1.color = "red";
        door1.isElectricWindow = true;
        door1.hasKeyAccess = true;

        Door door2 = new Door();
        door2.isElectricDoor = true;
        door2.color = "blue";
        door2.isElectricWindow = true;
        door2.hasKeyAccess = true;

        //se elimino queste ridico la quantità di RAM usata
        /*Door door3 = new Door();
        door3.isElectricDoor = true;
        door3.color = "red";
        door3.isElectricWindow = true;
        door3.hasKeyAccess = true;

        Door door4 = new Door();
        door4.isElectricDoor = true;
        door4.color = "red";
        door4.isElectricWindow = true;
        door4.hasKeyAccess = true;*/

        //Assegno nuovi oggetti creati a oggetti dichiarati in Car, ora sono 4 porte separate anche nella memoria
        //Hanno 4 caselle di memoria separate non una per tutte (prima usavo puntatori a memoria)
        Mini.frontDoorLeft = door1; //passo puntatore a memoria dove c'è door1, controllo quanta memoria uso
        Mini.frontDoorRight = door1;
        Mini.rearDoorLeft = door2;
        Mini.rearDoorRight = door2;
        //porte frontali uguali tra loro e anche quelle dietro sono uguali tra loro, top!

        //Riassegno il color di questo oggetto, quindi anche chi ci punta (rearDoorLeft.color) verrà cambiato
        //door3.color = "blue";

        //Ora la riassegnazione viene fatta all'oggetto singolo, agisco dentro all'oggetto
        Mini.rearDoorRight.color= "blue";
        Mini.rearDoorLeft.color = "blue";

        System.out.println("-----------------");

        System.out.println("Mini " + Mini.print());
        Mini.frontDoorLeft.print();
        //Errore se tolgo l'assegnazione di frontDoorLeft, se non lo assegno è null quindi
        //non può richiamare il metodo print
        //door1 e door2 definite ma non associate a Mini, oggetti separati
        Mini.frontDoorRight.print();
        Mini.rearDoorLeft.print();
        Mini.rearDoorRight.print();

        System.out.println("-----------------");


        //GARAGE, STATIC VARIABLES E STAMPA OGGETTI

        /*Car Audi = new Car();
        Audi.color = "black";
        Audi.model = "A3";
        Audi.isCabrio = true;
        Audi.wheelsNumber = 4;

        System.out.println(Garage.maxCarNumber);

        System.out.println(Mini.print());
        System.out.println(Audi.print());

        //System.out.println("Mini" + " - " + Mini.color + " - " + Mini.model + " - " + Mini.isCabrio + " - " + Mini.wheelsNumber);
        //System.out.println("Audi" + " - " + Audi.color + " - " + Audi.model + " - " + Audi.isCabrio + " - " + Audi.wheelsNumber);

        //System.out.println("------------------");

        Audi.model = "A6";
        //System.out.println("Audi" + " - " + Audi.color + " - " + Audi.model + " - " + Audi.isCabrio + " - " + Audi.wheelsNumber);

        CarStatic fiat = new CarStatic();
        CarStatic.power = 56;

        CarStatic toyota = new CarStatic();
        CarStatic.power = 67; //posso riassegnarlo

        Garage.maxCarNumber = 667;

        System.out.println(Garage.maxCarNumber);
    */
    }
}
