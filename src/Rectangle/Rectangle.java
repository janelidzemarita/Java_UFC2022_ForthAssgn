package Rectangle;

public class Rectangle implements IRectangle {
	private static final double MAX_LENGTH ;
	private static final double MAX_HEIGHT ;
	private static final double DEF_VALUE ;
	
	static {
		MAX_LENGTH = 200;
		MAX_HEIGHT = 200;
		DEF_VALUE = 100;
	}
	
	private double length;
	private double height;
	/* I did not delete the setters. If I did then the constructor would look like this:
	 
	 	public Rectangle(double length) {
		if(length < MAX_LENGTH) {
			this.length = length;
		}else this.length = MAX_LENGTH;
	}
	
	public Rectangle(double length, double height) {
		if(length < MAX_LENGTH) {
			this.length = length;
		}else this.length = MAX_LENGTH;
		
		if(height < MAX_HEIGHT) {
			this.height = height;
		}else this.height = MAX_HEIGHT;
	}
	
	Constructor without parameters does not change. 
	Using the setter methods is better because I don't have to copy the same logic to multiple functions 
	(Constructors in this case)
	 */
	public Rectangle(double length) {
		setLength(length);
	}
	
	public Rectangle(double length, double height) {
		setHeight(height);
		setLength(length);
	}
	
	public Rectangle() {
		this(DEF_VALUE);
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		if(length < MAX_LENGTH) {
			this.length = length;
		}else this.length = MAX_LENGTH;
	}
	
	public double getHigth() {
		return height;
	}
	
	public void setHeight(double height) {
		if(height < MAX_HEIGHT) {
			this.height = height;
		}else this.height = MAX_HEIGHT;
		
	}
	
	protected double getPerimeter () {
		return  this.length *2 + this.height * 2;
	}
	
	protected double getArea() {
		return this.length * this.height;
	}

	public int Compare(Rectangle rec) {
		if(rec.getArea() > this.getArea()) {
			return 1;
		}else if (rec.getArea() < this.getArea()) {
			return -1;
		}else
		return 0;
	}
	public static Rectangle getMaxAreaRectangle(Rectangle[] array ) { //Here we had to return the Object with max area
		double max = array[0].getArea();
		Rectangle result = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i].getArea() > max) {
				max = array[i].getArea();
				result = array[i];
			}
		}
		return result; 
	}
}

