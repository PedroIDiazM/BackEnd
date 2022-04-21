package semana3.practicas.practicaMona;

class Mona{
    void desc(){
        System.out.println("Mona es un octagato y le encanta hacer muchas actividades.\nComo por ejemplo:\n");
    }
}
class privM extends Mona{ // privateinvestocat
    @Override
    void desc() { System.out.println("Ser investigador Privado"); }
}

class grimM extends Mona{ // grim-repo
    @Override
    void desc() { System.out.println("Ser la parca"); }
}

class nyanM extends Mona{ // nyantocat
    @Override
    void desc() { System.out.println("Ser Nyan cat (un meme)"); }
}

class pusheenM extends Mona{ // pusheencat
    @Override
    void desc() { System.out.println("Ser pusheen"); }
}

class chellM extends Mona{ // chellocat
    @Override
    void desc() { System.out.println("Ser Chell (de Portal)"); }
}

class bouncerM extends Mona{ // bouncer
    @Override
    void desc() { System.out.println("Ser bouncer"); }
}

public class poliMona {
    public static void main(String[] args) {
        Mona mona;

        mona = new Mona();
        mona.desc();

        mona = new privM();
        mona.desc();

        mona = new grimM();
        mona.desc();

        mona = new nyanM();
        mona.desc();

        mona = new pusheenM();
        mona.desc();

        mona = new chellM();
        mona.desc();

        mona = new bouncerM();
        mona.desc();
    }
}