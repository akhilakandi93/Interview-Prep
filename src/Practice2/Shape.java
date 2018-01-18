package Practice2;

public class Shape {
    int sides=0;
    String color;
    Shape(){
    	color="";
    }
    public  void setColor(String col){
    	color=col;
    }
    public String getColor(){
    	return color;
    }
    public int getSides(){
    	return sides;
    }
    public static void main(String args[]){
    	Triangle t=new Triangle();
    	System.out.println(t.sides);
    	t.setColor("Orange");
    	System.out.println(t.getSides()+" "+t.getColor());
    }
    
}
//color, get color, get sides, set sides
class Triangle extends Shape{
	int sides=3;
	Triangle(){
		super.sides=3;
	}
}

class Rectangle extends Shape{
	int sides=4;
	Rectangle(){
		super.sides=4;
	}
}
