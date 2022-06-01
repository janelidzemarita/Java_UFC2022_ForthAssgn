package Rectangle;

public class Main {
	public static void main (String[] args){
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(20);
		Rectangle rectangle3 = new Rectangle(30, 40);
		Rectangle rectangle4 = new Rectangle(20, 40);
		Rectangle rectangle5 = new Rectangle(10, 100);
		
		System.out.println("No Parameter: " + rectangle1.getLength() + " height: "+ rectangle1.getHigth());
		System.out.println("Length Parameter: " + rectangle2.getLength() + " height: "+ rectangle2.getHigth());
		System.out.println("Both Parameters: " + rectangle3.getLength() + " height: "+ rectangle3.getHigth());
		// Create array of Rectangles
		Rectangle[] arr = {rectangle1, rectangle2, rectangle3, rectangle5, rectangle4};
		System.out.println("Max Area: " + Rectangle.getMaxAreaRectangle(arr));
		
	}
}
