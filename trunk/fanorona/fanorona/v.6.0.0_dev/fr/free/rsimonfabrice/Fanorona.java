package fr.free.rsimonfabrice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Fanorona {
	public static void main(String args[]){
		
		Collection<Piece> blackPiece = new ArrayList<Piece>();
		Collection<Piece> whitePiece = new ArrayList<Piece>();
		Collection<Case> listCase = new ArrayList<Case>();
		createCase(listCase);
		System.out.println(listCase.size());
		System.out.println("Liste des cases");
		Iterator it=listCase.iterator();
		while (it.hasNext())
		{
			Case caz =(Case)it.next();
			System.out.println(caz.getCol() + " " + caz.getRow());
		}
		createPiece(blackPiece, whitePiece);
		System.out.println("Liste des pieces");
		it=blackPiece.iterator();
		while (it.hasNext())
		{
			Piece pi =(Piece)it.next();
			System.out.println(pi.getNumber() + " " + pi.getColor());
		}
		it=whitePiece.iterator();
		while (it.hasNext())
		{
			Piece pi =(Piece)it.next();
			System.out.println(pi.getNumber() + " " + pi.getColor());
		}
		
	}
	
	public static void createCase(Collection<Case> listCase){
		for(int i=Case.MINCOL;i<=Case.MAXCOL;i++){
			for(int j=Case.MINROW;j<=Case.MAXROW;j++){
				listCase.add(new Case(i,j));
			}
		}
	}
	
	public static void createPiece(Collection<Piece> listBlackPiece,Collection<Piece> listWhitePiece){
		for(int i=0;i<Piece.NOMBRETOTAL;i++){
			listBlackPiece.add(new Piece(i,Piece.BLACK));
			listWhitePiece.add(new Piece(i,Piece.WHITE));
		}
	}
	
	public static void placePieceOnCase(Collection<Piece> blackPiece, Collection<Piece> whitePiece, Collection<Case> caz){
		Iterator it=blackPiece.iterator();
		while (it.hasNext())
		{
			Piece pi =(Piece)it.next();
			System.out.println(pi.getNumber() + " " + pi.getColor());
		}
	}
}
