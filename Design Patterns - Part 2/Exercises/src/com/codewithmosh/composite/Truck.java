package com.codewithmosh.composite;

public class Truck implements Resource{
  @Override
  public void deploy() {
    System.out.println("Deploying a truck");
  }
}
