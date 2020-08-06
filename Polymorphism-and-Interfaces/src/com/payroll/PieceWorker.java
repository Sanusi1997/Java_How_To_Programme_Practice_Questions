package com.payroll;

public class PieceWorker extends Employee {
    private double wagePerPiece;
    private double piece;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber,
                       Date birthDate, double wagePerPiece, double piece) {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if (wagePerPiece <= 0 ){
            throw new IllegalArgumentException("Wage per piece cannot be less than or equal to zero");
        }
        if (piece <= 0 ){
            throw new IllegalArgumentException("Piece produced cannot be less than or equal to zero");
        }
        this.wagePerPiece = wagePerPiece;
        this.piece = piece;
    }

    public void setWagePerPiece(double wagePerPiece) {
        this.wagePerPiece = wagePerPiece;
    }
    public double getWagePerPiece() {
        return wagePerPiece;
    }

    public double getPiece() {
        return piece;
    }

    public void setPiece(double piece) {
        this.piece = piece;
    }


    @Override
    public double earnings(){
        return getPiece() * getWagePerPiece();
    }
    @Override
    public String toString() {
        return String.format("%s%n%s: %.2f%n%s: $%.2f%n", super.toString(),"Piece produced", getPiece(),
                    "Wage per piece", getWagePerPiece());
        }
}
