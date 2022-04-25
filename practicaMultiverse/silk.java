import java.awt.*;

public class silk extends spider implements spiderCallbacks {

    public silk(String nombre, String alias, String realidad, String genero, String origen) {
        super(nombre, alias, realidad, genero, origen);
    }

    public void info(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Calibri", 20, Color.BLACK);
        s.setBounds(20, 25, 720, 720);
    }

    @Override
    public void webShot(Screen s) {
        s.out(showAbility("\nAtaques: \nTelaraña\n"), "Calibri", 18, Colors.BLACK);
        s.showImage("skA1.png");
    }

    @Override
    public void martialArts(Screen s) {
        s.out(showAbility("\nArtes marciales\n"), "Calibri", 18, Colors.BLACK);
        s.showImage("skA2.png");
    }

    @Override
    public void Acrobatic(Screen s) {
        s.out(showAbility("\nAcróbatas\n"), "Calibri", 18, Colors.BLACK);
        s.showImage("skA3.png");
    }
}

