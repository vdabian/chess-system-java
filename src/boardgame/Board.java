package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	public int getRows() {
		return rows;
	}
	
	public void setRows(int Rows) {
		this.rows = rows;
	}
	
	public int getColumns() {
		return columns;
	}
	
	public void setColumns(int Columns) {
		this.columns = columns;
	}
	
	
	
}
