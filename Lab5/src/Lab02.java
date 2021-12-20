import java.util.Scanner;
public class Lab02 {
        public static void main(String[] args) {
        System.out.println("1. no-arg");
        System.out.println("2. RegularPolygon(n,side)");
        System.out.println("3. RegularPolygon(n,side,x,y)");
        System.out.print("choose:");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if(i==1)
        {
            RegularPolygon j = new RegularPolygon();
            System.out.println(String.format("parameter is :%.4f", j.getParameter()));
            System.out.println(String.format("area is :%.4f", j.getArea()));
        }
       if(i==2)
       {
           System.out.print("enter n:");
           int n = input.nextInt();
           System.out.print("enter side:");
           double side = input.nextDouble();
           RegularPolygon j = new RegularPolygon(n,side);
           System.out.println(String.format("parameter is :%.4f", j.getParameter()));
           System.out.println(String.format("area is :%.4f", j.getArea()));
       }
       if(i==3)
       {
           System.out.print("enter n:");
           int n = input.nextInt();
           System.out.print("enter side:");
           double side = input.nextDouble();
           System.out.print("enter x:");
           double x = input.nextDouble();
           System.out.print("enter y:");
           double y = input.nextDouble();
           RegularPolygon j = new RegularPolygon(n,side,x,y);
           System.out.println(String.format("parameter is :%.4f", j.getParameter()));
           System.out.println(String.format("area is :%.4f", j.getArea()));
       }
       if(i!=1 && i!=2 && i!=3)
       {
           System.out.println("Error");
       }
    }
}

class RegularPolygon {
    private int n=3;
    private double side=1.0;
    private double x = 0.0;
    private double y = 0.0;
    //1
    public RegularPolygon(){

    }
    //2
    public RegularPolygon(int n,double side){
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y =0;
    }
    //3
    public RegularPolygon(int n,double side,double x,double y)
    {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y =y;
    }
    public int getN(){
        return this.n;
    }
    public void setN(){
        this.n=n;
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(){
        this.side=side;
    }
    public double getX(){
        return this.x;
    }
    public void setX(){
        this.x=x;
    }
    public double getY(){
        return this.y;
    }
    public void setY(){
        this.y=y;
    }
    public double getParameter(){
        return this.n*this.side;
    }
     public double getArea()
    {
            return (this.n * this.side*this.side ) / (4 * Math.tan(Math.PI/this.n));
    }
     
}