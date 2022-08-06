package facadePattern;

public class ShapeMaker {

	public Shape circle;
	public Shape rectangle;
	public Shape square;

	public ShapeMaker(){
		circle = new Circle();
		rectangle = new Rectange();
		square = new Square();
	}

	public void drawCircle(){
		circle.draw();
	}

	public void drawRectangle(){
		rectangle.draw();
	}

	public void drawSquare(){
		square.draw();
	}
}
