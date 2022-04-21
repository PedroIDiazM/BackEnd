package semana3.practicas.practicaHarry;

class personajesConstructor{
    // Atributos
    public String casa, genero, nombre, boggart, patronus, output;

    // Constructor
    personajesConstructor (String casa, String genero, String nombre, String boggart, String patronus){
        this.casa = casa;
        this.genero = genero;
        this.nombre = nombre;
        this.boggart = boggart;
        this.patronus = patronus;

        output = "Casa: "+casa+" Genero: "+genero+" Nombre: "+nombre+
        " Boggart: "+boggart+" Patronus: "+patronus;
    }
}

class personajesSetGet{
    public String casa, genero, nombre, boggart, patronus;

    public String getCasa(){ return casa; }
    public String getGenero() { return genero; }
    public String getNombre() { return nombre; }
    public String getBoggart() { return boggart; }
    public String getPatronus() { return patronus; }

    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa = casa;
            return true;
        } else return false;
    }
    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        } else return false;
    }
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else return false;
    }
    public boolean setBoggart(String boggart) {
        if (!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        } else return false;
    }
    public boolean setPatronus(String patronus) {
        if (!patronus.isEmpty()) {
            this.patronus = patronus;
            return true;
        } else return false;
    }
}

public class personajes {
    public static void main(String[] args) {
        // Por constructor
        personajesConstructor snape = new personajesConstructor(
                "Slytherin",
                "Masculino",
                "Severus Snape",
                "Lord Voldemort",
                "Cierva"
        );
        personajesConstructor dean = new personajesConstructor(
                "Gryffindor",
                "Masculino",
                "Dean Thomas",
                "Mano mutilada deambulando por si sola",
                "???");
        personajesConstructor gellert = new personajesConstructor(
                "???",
                "Masculino",
                "Gellert Grindelwald",
                "???",
                "Incorpóreo"
        );
        personajesConstructor filius = new personajesConstructor(
                "Ravenclaw",
                "Masculino",
                "Filius Flitwick",
                "Lord Voldemort",
                "???"
        );
        personajesConstructor rolanda = new personajesConstructor(
                "???",
                "Femenino",
                "Rolanda Hooch",
                "Lord Voldemort",
                "No corporeo"
        );
        System.out.println("Personajes (Constructor):\n" +
                "\n1.- "+snape.output+
                "\n2.- "+dean.output+
                "\n3.- "+gellert.output+
                "\n4.- "+filius.output+
                "\n5.- "+rolanda.output
                );

        // Por Setters & Getters
        SetGetDef();
    }

    public static void SetGetDef() { // Setters & Getters
        personajesSetGet neville = new personajesSetGet();
        neville.setCasa("Gryffindor");
        neville.setGenero("Masculino");
        neville.setNombre("Neville Longbotton");
        neville.setBoggart("Severus Snape");
        neville.setPatronus("No corporeo");

        String finalNeville = "Casa: "+neville.getCasa()+
                " Genero: "+neville.getGenero()+
                " Nombre: "+neville.getNombre()+
                " Boggart "+neville.getBoggart()+
                " Patronus "+neville.getPatronus();

        personajesSetGet pomona = new personajesSetGet();
        pomona.setCasa("Hufflepuff");
        pomona.setGenero("Femenino");
        pomona.setNombre("Pomona Sprout");
        pomona.setBoggart("Lord Voldemort");
        pomona.setPatronus("Incorpóreo");

        String finalPomona = "Casa: "+pomona.getCasa()+
                " Genero: "+pomona.getGenero()+
                " Nombre: "+pomona.getNombre()+
                " Boggart "+pomona.getBoggart()+
                " Patronus "+pomona.getPatronus();

        personajesSetGet nicholas = new personajesSetGet();
        nicholas.setCasa("Gryffindor");
        nicholas.setGenero("Masculino");
        nicholas.setNombre("Nicholas de Mimsy Porpington");
        nicholas.setBoggart("???");
        nicholas.setPatronus("???");

        String finalNicholas = "Casa: "+nicholas.getCasa()+
                " Genero: "+nicholas.getGenero()+
                " Nombre: "+nicholas.getNombre()+
                " Boggart "+nicholas.getBoggart()+
                " Patronus "+nicholas.getPatronus();

        personajesSetGet hagrid = new personajesSetGet();
        hagrid.setCasa("Gryffindor");
        hagrid.setGenero("Masculino");
        hagrid.setNombre("Rubeus Hagrid");
        hagrid.setBoggart("???");
        hagrid.setPatronus("???");

        String finalHagrid = "Casa: "+hagrid.getCasa()+
                " Genero: "+hagrid.getGenero()+
                " Nombre: "+hagrid.getNombre()+
                " Boggart "+hagrid.getBoggart()+
                " Patronus "+hagrid.getPatronus();

        personajesSetGet ginevra = new personajesSetGet();
        ginevra.setCasa("Gryffindor");
        ginevra.setGenero("Femenino");
        ginevra.setNombre("Ginevra Potter");
        ginevra.setBoggart("Volver a ser controlada por Voldemort");
        ginevra.setPatronus("Caballo");

        String finalGinevra = "Casa: "+ginevra.getCasa()+
                " Genero: "+ginevra.getGenero()+
                " Nombre: "+ginevra.getNombre()+
                " Boggart "+ginevra.getBoggart()+
                " Patronus "+ginevra.getPatronus();

        System.out.println("\nPersonajes (Setters & Getters):" +
                "\n1.- "+finalNeville+
                "\n2.- "+finalPomona+
                "\n3.- "+finalNicholas+
                "\n4.- "+finalHagrid+
                "\n5.- "+finalGinevra
        );
    }
}
