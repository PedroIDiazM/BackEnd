public class spider {
    private final String nombre, alias, realidad, genero, origen;

    public spider(String nombre, String alias, String realidad, String genero, String origen){
        this.nombre = nombre;
        this.alias = alias;
        this.realidad = realidad;
        this.genero = genero;
        this.origen = origen;
    }

    public String showMessage(){
        return "Nombre: "+nombre+"\nAlias: "+alias+"\nRealidad: "+realidad+"\nGenero: "+genero+"\nOrigen: "+origen+"\n";
    }

    public String showAbility(String ability){
       return ability;
    }
}

