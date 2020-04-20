package com.codewithmosh.flyweight;

public class Cell {
  private final int row;
  private final int column;
  private String content;
  private CellFormat cellFormat;

  public Cell(int row, int column, CellFormat cellFormat) {
    this.row = row;
    this.column = column;
    this.cellFormat = cellFormat;
  }

  public CellFormat getCellFormat() {
    return cellFormat;
  }

  public void setCellFormat(CellFormat cellFormat) {
    this.cellFormat = cellFormat;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void render() {
    System.out.printf("(%d, %d): %s [%s]\n", row, column, content, cellFormat.getFontFamily());
  }
}
