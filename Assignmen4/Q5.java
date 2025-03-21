package Assignmen4;
import java.util.Random;
class ex{
	private int intValue;
	private double doubleValue;
	 ex() {
		// TODO Auto-generated constructor stub
		 this.intValue = 0;
		 this.doubleValue = 0.0;
	}
	 void setData(int i , double d) {
		 this.intValue = i;
		 this.doubleValue = d;
	 }
	 void updateIntValue(int i) {
		 this.intValue = i;
	 }
	 void updateDoubleValue(double d) {
		 this.doubleValue = d;
	 }
	 void printData() {
		 System.out.println("Integer Value: "+intValue);
		 System.out.println("Double value: "+doubleValue);
	 }
}
public class Q5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex obj1 = new ex();
		obj1.setData(5, 55.6);
		obj1.printData();
		ex obj2 = new ex();
		obj2.setData(99, 24.36);
		obj2.printData();
		obj1 =  null;
		obj2 = null;
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Total memory before garbage collection: "+runtime.totalMemory());
		System.out.println("Free Memory before garbage collection: "+runtime.freeMemory());
		runtime.gc();
		System.out.println("Total Memory: "+runtime.totalMemory());
		System.out.println("Free Memory: "+runtime.freeMemory());
		System.out.println("Used Memory: "+(runtime.totalMemory()-runtime.freeMemory()));
		
	}

}
