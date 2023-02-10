
package tutorial8.Q1;

class Student {
    String contactNumber;
    public static void main(String[] args) {
        Student myObj01 = new Student();
        myObj01.setContactNumber("0102700927");
    }
    public Student(){}
    public String Student(){
        return null;
    }
    public Student(String contactNumber){
        this.contactNumber = contactNumber;
    }
    public String getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(String x){
        contactNumber = x;
    }
    public void printContactNumber(String x){
        System.out.println(x);
    }
}

