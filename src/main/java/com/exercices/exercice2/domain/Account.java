package com.exercices.exercice2.domain;

public class Account {
	private int id ;
	private double balance ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
}
