package TicTacToe.models;

import TicTacToe.models.CellState;
import TicTacToe.models.Symbol;

public class Cell {
    private int row;
    private int col;
    private CellState cellState;
    private Symbol symbol;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
        this.cellState = CellState.EMPTY;
        this.symbol = null;
    }
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public void printCell(){
        if(this.cellState.equals(CellState.EMPTY)){
            System.out.print("| - |");
        } else if (this.cellState.equals(CellState.FILLED)){
            System.out.print("| " + this.symbol.getSym() + " |");
        }
    }
}