
public class Staff extends Employee{
    private String title;
    
    public Staff(){
        
    }

    public Staff(String name, String address, String phoneNumber, String emailAddress,double salary,String office,int year,int month,int dateOfMonth) {
        super(name, address, phoneNumber, emailAddress,salary,office,year,month,dateOfMonth);
        this.setTitle(title);
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + "Staff{" + "title=" + title + '}';
    }
    
}

