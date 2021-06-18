package src.board;
public class Panel {
    private final int rows=8;
    private final int columns=8;
    public Panel() {
        //vacio
    }
    public void printBoard() {
        for (int i=0; i<rows; i++) {  //row
            for (int j=0; j<columns; j++){ //column
                if(i%2==0){ //par row
                    if(j%2==0){ //par column
                        Box b = new Box();
                        System.out.print(b.getCell());
                    }else{ //odd column
                        Box c = new Box();
                        System.out.print(c.getSpace());
                    }

                }else{ //odd row
                    if(j%2==0){ //par column
                        Box b = new Box();
                        System.out.print(b.getSpace());
                    }else{ //odd column
                        Box c = new Box();
                        System.out.print(c.getCell());
                    }
                }
            }System.out.println(" ");

        }
    }
}
