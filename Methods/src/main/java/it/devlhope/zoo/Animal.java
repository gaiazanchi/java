package it.devlhope.zoo;

public class Animal {
    //variabile pubblica, non posso accedervi con il this
    public static String variable;
    //Variabili interne alla classe, ci accedo con this
    public String name;
    public String type;
    public boolean hasFur;

    //Metodo costruttore con (), viene chiamato quando io faccio l'istanza

    /**
     * Creates a new animal
     */
    public Animal(){
        System.out.println("A new animal was born!");
    }

    //Ho due possibilità instanzio e basta o instanzio con nome

    /**
     * Creates a new animal with name
     * @param name The name of the animal
     */
    public Animal(String name){
        System.out.println("A new animal was born! It is called " + name + "!");
        //Se non ci metto questa assegnazione ogni animale avrà name e type null e hasFur false, sono locali
        this.name = name;
        //assegno al name della classe (this) quello passato al metodo costruttore
    }

    /**
     * Creates a new animal with name and type
     * @param name The name of the animal
     * @param type The type of the animal
     */
    public Animal(String name, String type){
        System.out.println("A new" + type + "was born! It is called " + name + "!");
        this.name = name;
        this.type = type;
    }

    /**
     * Creates a new animal with fur or not
     * @param hasFur
     */
    public Animal(boolean hasFur){
        System.out.println("A new animal was born! Does it have fur? " + hasFur);
        this.hasFur = hasFur;
    }

}
