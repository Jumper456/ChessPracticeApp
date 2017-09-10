

// klasa reprezentująca figurę
public abstract class Piece {
    private boolean isAlive; // czy figura jest w grze
    private Player owner; //właściciel bierki
    private Position position; //pozycja figury
    /* TODO pozycja może powinna być cechą boarda, bo jest różnie określana dla różnych boardów,
        ale z drugiej strony jest jednak jest związana z figurą, więc można ją trzymać tu
     */

    //przesuń bierkę na polu gry
    public abstract boolean move(Position whereTo); //przesuń figurę na pozycję whereTo

    // pokaż bierkę na polu gry
    public abstract void paint();

    //usuń bierkę z pola gry
    public void remove(){
        //TODO implementacja polegająca na usunięciu figury - raczej nie może się wymazać, więc chyba tylko ustawienie
        //że isAlive = false i na tej podstawie pole gry przerysowując się wywoła metodę Paint a ta nie narysuje bierki
        //bo będzie miała ustawione, że jest nieżywa
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

}
