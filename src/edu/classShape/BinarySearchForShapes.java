package edu.classShape;

public class BinarySearchForShapes {
	public static void main(String[] args) {
		
		Shape t1 = new Triangle(2.0, 3.0);
		Shape t2 = new Triangle(2.0, 5.0);
		Shape t3 = new Triangle(2.0, 8.0);
		Shape r1 = new Rectangle(5.0, 4.0);
		Shape r2 = new Rectangle(8, 10);
		Shape r3 = new Rectangle(9, 20);
		Shape r4 = new Rectangle(10, 20);
		Shape[] arr = {t1, t2, t3, r1, r2, r3, r4};
		
		System.out.println(binarySearchShape(200, arr));;
		
		}
	
	
	
	 public static int binarySearchShape(double area, Shape[] arr){
			int lastIndex = arr.length-1;
			int midIndex = lastIndex/2;
			int curIndex = midIndex;
			int indexMatch = -1;
			if(area >= arr[0].getArea() && area <= arr[lastIndex].getArea()){
				for(int i =0; i <arr.length/2+1; i++){
					if (arr[curIndex].getArea() == area){
						indexMatch = curIndex;
						break;
					}
					if(arr[curIndex].getArea() < area){
						indexMatch = -1;
						curIndex = (midIndex + lastIndex+1)/2;
						midIndex = curIndex;
					}else{
						indexMatch = -1;
						curIndex = curIndex/2;
						lastIndex = lastIndex/2;
					}
					}}
			else{
				indexMatch = -1;
			}
				return indexMatch;
				
			 }
		 
}

