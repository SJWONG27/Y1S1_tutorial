
package tutorial9;

public class Q1 {

    public static void main(String[] args) {
        Q1 k = new Q1();
        System.out.println(k.compareObject("luis", "alex") );
        System.out.println(k.isClass("JIt"));
    }
    
    public boolean compareObject(String s, String t){
        if(s.getClass() == t.getClass())
            return true;
        else
            return false;
    }
    public boolean isClass(String s){
        Q1 myObj = new Q1();
        return myObj instanceof Q1;
    }
    }


