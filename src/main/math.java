package main;

public class math {
    public int multiplyBy10(int no) {
        int result = no*10;
        return result;

    }

    // napisz metodę obliczającą pole kwadratu
    public int squareField(int a) {
        int pole = a*a;
        return pole;
    }

    // napisz metodę obliczającą obwód kwadratu
    public int perimeterOfTheSquare(int a) {
        int obwod = a*4;
        return obwod;
    }

    // napisz metodę obilczającą wynik dzialania ( x dodać 5 ) razy y odjąć ( y do kwadratu dodać 8).
    public int equation(int x, float y) {
        int result = ((x+5)*(int)y )- (((int)y*(int)y) +8);
        return result;
    }
}