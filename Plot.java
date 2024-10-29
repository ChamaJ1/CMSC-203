public class Plot {
	private int x;
	private int y;
	private int depth;
	private int width;

//constructors
	public Plot(Plot plot) {
		x = plot.getX();
		y = plot.getY();
		width = plot.getWidth();
		depth = plot.getDepth();
	}
	
	public Plot(int xPosition, int yPosition, int propertyWidth, int propertyDepth) {
		x = xPosition;
		y = yPosition;
		depth = propertyDepth;
		width = propertyWidth;
	}
	
//getter/setter methods
	
	public int getX() {
		return x;
	}
	
	
	
	public int getY() {
		return y;
	}
	
	
	
	public int getWidth() {
		return width;
	}
	
	
	public int getDepth() {
		return depth;
	}
	
//overlaps method
	public boolean overlaps(Plot plot) {
		int x2 = plot.getX();
		int y2 = plot.getY();
		int depth2 = plot.getDepth();
		int width2 = plot.getWidth();
		boolean isOverlaping = false;
		
		if((x < x2) && (x2 < (x+width))) {
			if(((y < y2) && (y2 < (y+depth))) || ( (y < (y2+depth2)) && ((y2+depth2) < (y+depth)))) {
				isOverlaping = true;
			}
		}
		if((x < (x2+width2)) && ((x2+width2) < (x+width))) {
			if(((y < y2) && (y2 < (y+depth))) || ( (y < (y2+depth2)) && ((y2+depth2) < (y+depth)))) {
				isOverlaping = true;
			}
		}
		
		if((x2 < x) && (x < (x2+width2))) {
			if(((y2 < y) && (y < (y2+depth2))) || ( (y2 < (y+depth)) && ((y+depth) < (y2+depth2)))) {
				isOverlaping = true;
			}
		}
		if((x2 < (x+width)) && ((x+width) < (x2+width2))) {
			if(((y2 < y) && (y < (y2+depth2))) || ( (y2 < (y+depth)) && ((y+depth) < (y2+depth2)))) {
				isOverlaping = true;
			}
		}
		
		if(encompasses(plot)) {
			isOverlaping = true;
		}
		
		return isOverlaping;
	}
	
	//encompass method
	public boolean encompasses(Plot plot) {
		int x2 = plot.getX();
		int y2 = plot.getY();
		int depth2 = plot.getDepth();
		int width2 = plot.getWidth();
		
		if((x <= x2) && (x2 <= (x+width))) 
		{
			if((y <= y2) && (y2 <= (y+depth))) 
			{
				if((x <= (x2+width2)) && ((x2+width2) <= (x+width))) 
				{
					if((y <= (y2+depth2)) && ((y2+depth2) <= (y+depth))) 
					{
						return true;
					}
				}
			}
			
		}
		
		return false; //returns false if current plot doesnt contain plot instance
	}
	
	//toString method
	public String toString() {
		String plotString;
		plotString = x + "," + y + "," + width + "," + depth;
		return plotString;
	}
	
	
}