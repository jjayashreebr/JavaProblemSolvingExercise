package problems;

public class Box {
	
	int width;
	int height;
	int depth;

	Box(int width, int height, int depth){
		this.width=width;
		this.height=height;
	    this.depth=depth;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box myBox = new Box(10,20,30);
		System.out.println("volume "+myBox.getVolume());

	}
	
	public int getVolume() {
		return width*height*depth;
	}

}
