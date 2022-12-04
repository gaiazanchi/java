package it.develhope.overrideDefaultMethods;

public class Start {

    public static void main(String...args) {

        System.out.println("------------Start");

        Animal giraffe = new Animal();
        giraffe.name = "Anna";
        giraffe.type = "Giraffe";

        System.out.println("Printing the giraffe " + giraffe);
        //non funziona, java non sa cosa stampare se non c'è il ToString

        Animal giraffe2 = new Animal();
        giraffe2.name = "Anna";
        giraffe2.type = "Giraffe";

        Animal zebra = new Animal();
        zebra.name = "Pino";
        zebra.type = "Zebra";

        System.out.println("Printing the zebra " + zebra);

        //tratto la zebra come fosse una stringa, le posso concatenare
        //human readable
        System.out.println("Printing the | " + zebra +" | and the | " + giraffe);

        boolean out = zebra.equals(giraffe);
        //boolean out = zebra == giraffe;
        System.out.println("Is Zebra equal to Giraffe? " + out);

        boolean out2 = giraffe.equals(giraffe2);
        //se giraffe = null avrò null point reception, se invece giraffe2 = null avrò semplicemente false
        //boolean out2= giraffe == giraffe2;
        //false, sono in due spazi diversi di memoria, java non è in grado di capire se due oggetti sono uguali
        //perchè non può confrontarne tutti i valori
        System.out.println("Is Giraffe2 equal to Giraffe? " + out2);

        //Animal cloneGiraffe = giraffe.clone();
        //cloneGiraffe.name = "Dolly";
        //stanno in due diversi spazi di memoria
        //System.out.println("------ORIGINAL: " + giraffe);
        //System.out.println("------CLONED: " + cloneGiraffe);

        try{
            Animal clonedGiraffe = giraffe.clone();
            clonedGiraffe.name = "Dolly";
            System.out.println("------ORIGINAL: " + giraffe);
            System.out.println("------CLONED: " + clonedGiraffe);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }
    }

}
