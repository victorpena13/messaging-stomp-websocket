package com.example.messagingstompwebsocket;

public class HelloMessage {

  private String name;

  public HelloMessage() {
  }

  public HelloMessage(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  
  public static void main(String[] args) {
	  
	  HelloMessage exampleOne = new HelloMessage("victor");
	  System.out.println(exampleOne.getName());
  }
}