package fr.free.rsimonfabrice;

public class Case {
	public final static int MINCOL=0;
	public final static int MAXCOL=2;
	
	public final static int MINROW=0;
	public final static int MAXROW=2;
	
	private int col;
	private int row;
	private Piece piececase;
	
	public Case(){
		super();
	}
	public Case(Piece piececase) {
		super();
		this.piececase = piececase;
	}
	public Case(int col, int row) {
		super();
		this.col = col;
		this.row = row;
	}
	public Case(int col, int row, Piece piececase) {
		this.col = col;
		this.row = row;
		this.piececase = piececase;
	}
	public Piece getPiececase() {
		return piececase;
	}
	public void setPiececase(Piece piececase) {
		this.piececase = piececase;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	
}
