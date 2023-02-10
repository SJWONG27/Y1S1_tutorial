
package tutorial10;
import java.util.Arrays;
class Person implements Comparable <Person> {
	private String name;

	public Person(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String toString(){
		return "Name : " + name;
	}
 
	@Override
        public int compareTo(Person o) {
           return name.compareToIgnoreCase(o.getName());
        }
}
public class Q3{

	public static void main(String [] args){
		Person [] p = new Person[5];
		p[0] = new Person("Zen") {};
                p[1] = new Person("Lim Teng Teng");
                p[2] = new Person("Abu Bakar");
                p[3] = new Person("Siti Fahtimah");
                p[4] = new Person("Mutu");
                

            System.out.println("List of person: ");
            for(int i = 0; i<p.length; i++)
                    System.out.println(p[i]);
            System.out.println("");

            /*for(int pass =1; pass< p.length; pass++){
            for(int i=0; i< p.length-1; i++){
                    if(p[i].compareTo(p[i+1]) > 0){
                        Person temp = p[i];
                        p[i] = p[i+1];
                        p[i+1] = p[i];	
                    }
            }*/
            Arrays.sort(p);
            

            System.out.println("List of person in ascending order: ");
            for(int i = 0; i<p.length; i++)
                    System.out.println(p[i]);
                    }
            }
