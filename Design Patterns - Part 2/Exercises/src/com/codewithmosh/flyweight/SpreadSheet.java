package com.codewithmosh.flyweight;

public class SpreadSheet {
  private final int MAX_ROWS = 3;
  private final int MAX_COLS = 3;


  private Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];
  private CellFormatFactory formatFactory;

  public SpreadSheet(CellFormatFactory formatFactory) {
    this.formatFactory = formatFactory;
    generateCells();
  }

  public void setContent(int row, int col, String content) {
    ensureCellExists(row, col);

    cells[row][col].setContent(content);
  }

  public void setFontFamily(int row, int col, String fontFamily) {
    ensureCellExists(row, col);

    var cell = cells[row][col];
    CellFormat currentCellFormat = cell.getCellFormat();
    CellFormat cellFormat = formatFactory.getCellFormat(fontFamily, currentCellFormat.getFontSize(),currentCellFormat.isBold());
    cells[row][col].setCellFormat(cellFormat);
  }

  private void ensureCellExists(int row, int col) {
    if (row < 0 || row >= MAX_ROWS)
      throw new IllegalArgumentException();

    if (col < 0 || col >= MAX_COLS)
      throw new IllegalArgumentException();
  }

  private void generateCells() {
    for (var row = 0; row < MAX_ROWS; row++)
      for (var col = 0; col < MAX_COLS; col++) {
        var cell = new Cell(row, col, defaultCellFormat());
        cells[row][col] = cell;
      }
  }

  private CellFormat defaultCellFormat(){
    // In a real app, these values should not be hardcoded here.
    // They should be read from a configuration file.
    String fontFamily = "Times New Roman";
    int fontSize = 12;
    boolean isBold = false;
    return new CellFormat(fontFamily,fontSize,isBold);
  }

  public void render() {
    for (var row = 0; row < MAX_ROWS; row++)
      for (var col = 0; col < MAX_COLS; col++)
        cells[row][col].render();
  }
}
