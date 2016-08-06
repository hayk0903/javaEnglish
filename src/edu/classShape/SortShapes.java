package edu.classShape;


public class SortShapes {

	public static void main(String[] args) {
		Shape c1 = new Circle(1);
		Shape c2 = new Circle(4);
		Shape c3 = new Circle(9);
		Shape t1 = new Triangle(2.0, 3.0);
		Shape t2 = new Triangle(4.0, 5.0);
		Shape t3 = new Triangle(6.0, 8.0);
		Shape r1 = new Rectangle(3.5, 4.5);
		Shape r2 = new Rectangle(8, 10);
		Shape r3 = new Rectangle(4, 6);
		Shape r4 = new Rectangle(5, 5.5);
		Shape[] arr = {c1, c2, c3, t1, t2, t3, r1, r2, r3, r4};
		
		sortByArea(arr);
		for(Shape i:arr){
			System.out.println(i.getArea());
		}
		

	}
	static void sortByArea(Shape[] array){
        boolean sorted = false;
        for(int j = 0; j < array.length-1; j++){
            for(int i = 0; i < array.length-1; i++){
                if(array[i].getArea() > array[i+1].getArea()){
                    Shape x;
                    x = array[i];
                    array[i]=array[i+1];
                    array[i+1] = x;
                    sorted = true;
                }else if(sorted == false){
                    continue;
                }
            }
        }
        
    }
	
}
