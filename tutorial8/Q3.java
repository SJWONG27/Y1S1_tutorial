
package tutorial8;

public class Q3 {
    int x,y;
    public static void main(String[] args) {
        Q3 num01 = new Q3();
        num01.setCoordinate(5, 6);
        System.out.println("("+ num01.x + "," + num01.y + ")");
    }
    public Q3(){}
    
    public int getCoordinateX(){
        return x;
    }
    public int getCoordinateY(){
        return y;
    }
    public void setCoordinate(int x, int y){
        this.x=x;
        this.y=y;
    }
    
}
