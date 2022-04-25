import java.awt.*;

public class chasm extends spider implements spiderCallbacks {

    public chasm(String nombre, String alias, String realidad, String genero, String origen) {
        super(nombre, alias, realidad, genero, origen);
    }

    public void info(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Calibri", 20, Color.BLACK);
        s.setBounds(40, 25, 720, 720);
    }

    @Override
    public void webShot(Screen s) {
        s.out(showAbility("\nAtaques: \nTelaraña\n"), "Calibri", 18, Colors.BLACK);
        s.showImage("default.png"); // no hay fotos con su traje
    }

    @Override
    public void martialArts(Screen s) {
        s.out(showAbility("\nArtes marciales\n"), "Calibri", 18, Colors.BLACK);
        s.showImage("cA2.png");
    }

    @Override
    public void Acrobatic(Screen s) {
        s.out(showAbility("\nAcróbatas\n"), "Calibri", 18, Colors.BLACK);
        s.showImage("default.png"); // no hay fotos con su traje
    }
}
