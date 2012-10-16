package fr.free.rsimonfabrice;

import java.util.Collection;

public class Board {
	Collection<Case> listCase;
	Collection<Piece> listPiece;
	public Collection<Case> getListCase() {
		return listCase;
	}
	public void setListCase(Collection<Case> listCase) {
		this.listCase = listCase;
	}
	public Collection<Piece> getListPiece() {
		return listPiece;
	}
	public void setListPiece(Collection<Piece> listPiece) {
		this.listPiece = listPiece;
	}
}
