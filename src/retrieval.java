package Bank;

//Retrieving Bank Information
public class retrieval extends read {
    public String name;
    public float checkingAcct;
    public float savingsAcct;

    public void setName(String n) {
        this.name = n;
    }
    public void setCheckingAcct(float f) {
        this.checkingAcct = f;
    }
    public void setSavingsAcct(float s) {
        this.savingsAcct = s;
    }
    public String getName() {
        return readName();
    }
    public float getChecking() {
        return checkingAcct;
    }
    public float getSavings() {
        return savingsAcct;
    }
}
