package fr.free.rsimonfabrice;

public class Piece {
	
	public final static int BLACK=0;
	public final static int WHITE=1;
	public final static int NOMBRETOTAL=3;
	
	private Case casepiece;
	private int number;
	private int color;

	public Piece(int number, int color) {
		super();
		this.number = number;
		this.color = color;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public Case getCasepiece() {
		return casepiece;
	}
	public void setCasepiece(Case casepiece) {
		if(casepiece.getPiececase()!=null){
			this.casepiece = casepiece;
		}
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int movePieceToLeft(){
		if(casepiece.getCol()>Case.MINCOL){
			Case newCase = new Case(casepiece.getCol()-1,casepiece.getRow());
			this.setCasepiece(newCase);
		}
		return 0;
	}
	public int movePieceToRight(){
		if(casepiece.getCol()<Case.MAXCOL){
			Case newCase = new Case(casepiece.getCol()+1,casepiece.getRow());
			this.setCasepiece(newCase);
		}
		return 0;
	}
	public int movePieceToUp(){
		if(casepiece.getCol()<Case.MAXROW){
			Case newCase = new Case(casepiece.getCol(),casepiece.getRow()+1);
			this.setCasepiece(newCase);
		}
		return 0;
	}
	public int movePieceToDown(){
		if(casepiece.getCol()>Case.MINROW){
			Case newCase = new Case(casepiece.getCol(),casepiece.getRow()-1);
			this.setCasepiece(newCase);
		}
		return 0;
	}
}
