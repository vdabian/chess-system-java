package boardgame;

public class Position {

	private int rool;
	private int column;
	
	public Position (int rool, int column) {
		this.rool = rool;
		this.column = column;
	}
	
	public int getRool() {
		return rool; 
	}
	
	public void setRool(int rool) {
		this.rool = rool;
	}

	public int getColumn() {
		return column;
	}
	
	public void setColumn(int column) {
		this.rool = column;
	}
		
	@Override
	public String toString() {
		return rool 
		+ ", "
		+ column;
	}	
}