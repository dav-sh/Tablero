package src.executable;

public class Principal{
    public static void main(String[] args){
        Principal m = new Principal();
    }
    private Menu menu = new Menu();
    public Principal(){
        menu.start();
    }
}