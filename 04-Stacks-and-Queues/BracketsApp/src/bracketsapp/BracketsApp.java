package bracketsapp;

public class BracketsApp {

    public static void main(String[] args) {
        BracketChecker br = new BracketChecker("([{}])");
        br.check();
    }
    
}
