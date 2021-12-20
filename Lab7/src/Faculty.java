
public class Faculty extends Employee{
    private String officeHours;
    private String rank;
    
    public Faculty(){
        
    }

    public Faculty(String name, String address, String phoneNumber, String emailAddress,double salary,String office,int year,int month,int dateOfMonth) {
        super(name, address, phoneNumber, emailAddress,salary,office,year,month,dateOfMonth);
        this.setOfficeHours(officeHours);
        this.setRank(rank);
    }

    public String getOfficeHours() {
        return officeHours;
    }
    public String getRank() {
        return rank;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + "Faculty{" + "officeHours=" + officeHours + ", rank=" + rank + '}';
    }
    
    
}

