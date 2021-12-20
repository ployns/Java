
import java.util.GregorianCalendar;
public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    public Person(){
        
    }
    
    public Person(String name,String address,String phoneNumber, String emailAddress){
        this.setName(name);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
        this.setEmailAddress(emailAddress);
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", emailAddress=" + emailAddress + ", address=" + address + ", phoneNumber=" + phoneNumber + '}';
    }
    
}
