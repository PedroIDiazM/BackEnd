public class spiderVerse {
    public static void main(String[] args)/* throws InterruptedException */{
        // abre 4 ventanas | imagen "default.png" por si no encuentro las fotos
        testSP(); // ventana spider-man (original)
        testSk(); // ventana silk
        testSt(); // ventana Scarlet
        testC(); // ventana Chasm
    }

    private static void testSP() {
        Screen screen = new Screen();
        spiderMan SM = new spiderMan(
            "Peter Parker",
            "Spider-Man",
            "Tierra-616",
            "Masculino",
            "Mordido por una araña radioactiva"
        );
        SM.info(screen);
        SM.webShot(screen);
        SM.martialArts(screen);
        SM.Acrobatic(screen);
    }
    private static void testSk() {
        Screen screen = new Screen();
        silk Sk = new silk(
            "Cindy Moon",
            "Silk",
            "Tierra-616",
            "Femenino",
            "Mordida por una araña radioactiva"
        );
        Sk.info(screen);
        Sk.webShot(screen);
        Sk.martialArts(screen);
        Sk.Acrobatic(screen);
    }
    private static void testSt() {
        Screen screen = new Screen();
        scarlet St = new scarlet(
            "Kaine Parker",
            "Scarlet Spider",
            "Tierra-616",
            "Masculino",
            "Mutación, clon de Peter Parker"
        );
        St.info(screen);
        St.webShot(screen);
        St.martialArts(screen);
        St.Acrobatic(screen);
    }
    private static void testC() {
        Screen screen = new Screen();
        chasm C = new chasm(
            "Benjamin Reilly",
            "Chasm",
            "Tierra-616",
            "Masculino",
            "Mutación, clon de Peter Parker"
        );
        C.info(screen);
        C.webShot(screen);
        C.martialArts(screen);
        C.Acrobatic(screen);
    }
}
