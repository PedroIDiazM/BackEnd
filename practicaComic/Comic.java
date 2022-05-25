package semana3.practicas.practicaComic;

public class Comic {
    public static void main(String[] args) {
        showComic();
    }

    private static void showComic(){
        Screen pantalla = new Screen();
        Pages showPages = new Pages();

        Runnable comicRunnable = () -> {
            try{
                showPages.page1(pantalla);
                Thread.sleep(15000);
                showPages.page2(pantalla);
                Thread.sleep(15000);
                showPages.page3(pantalla);
                Thread.sleep(15000);
                showPages.page4(pantalla);
                Thread.sleep(15000);
                showPages.page5(pantalla);
                Thread.sleep(15000);
                showPages.page6(pantalla);
                Thread.sleep(15000);
                showPages.page7(pantalla);
                Thread.sleep(15000);
                showPages.page8(pantalla);
                Thread.sleep(15000);
                showPages.page9(pantalla);
            } catch (InterruptedException e) { e.printStackTrace(); }
        };
        Thread comicThread = new Thread(comicRunnable);
        comicThread.start();
    }
}