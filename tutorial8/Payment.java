
package tutorial8;

public class Payment {
    int cashAmount;
    int chequeAmount, chequeNumber;
    int CCamount, expirationDate, validationCode;
    String CCholder, cardType;
    
    public static void main(String[] args) {
        Payment pay = new Payment();
        pay.setCashPayment(1000);
        pay.setChequePayment(5000,521343);
        pay.setCreditCardPayment(10000, "ALEX GOH", "VISA", 20220519, 781543);
        System.out.println("CASH PAYMENT");
        System.out.println("cash: " + pay.getCashPayment() );
        System.out.println("");
        
        System.out.println("CHEQUE PAYMENT");
        System.out.println("Amount: " + pay.getChequePayment01());
        System.out.println("cheque number: " + pay.getChequePayment02());
        System.out.println("");
        
        System.out.println("CREDIT CARD PAYMENT");
        System.out.println("Amount: " + pay.getCreditCardPayment01());
        System.out.println("Card holder: " + pay.getCreditCardPayment02());
        System.out.println("Card type: " + pay.getCreditCardPayment03());
        System.out.println("expiration date: " + pay.getCreditCardPayment04());
        System.out.println("validation code: " + pay.getCreditCardPayment05());
    }
    public Payment(){}
    public int getCashPayment(){
        return cashAmount;
    }
    public void setCashPayment(int x){
        cashAmount = x;
    }
    public int getChequePayment01(){
        return chequeAmount;
    }
    public int getChequePayment02(){
        return chequeNumber;
    }
    public void setChequePayment(int y, int z){
        chequeAmount = y;
        chequeNumber = z;
    }
    public int getCreditCardPayment01(){
        return CCamount;
    }
    public int getCreditCardPayment02(){
        return expirationDate;
    }
    public int getCreditCardPayment03(){
        return validationCode;
    }
    public String getCreditCardPayment04(){
        return CCholder;
    }
    public String getCreditCardPayment05(){
        return cardType;
    }
    public void setCreditCardPayment(int a, String n, String k, int e, int v){
        CCamount = a;
        CCholder = n;
        cardType = k;
        expirationDate = e;
        validationCode = v;
    }
    
    
}
