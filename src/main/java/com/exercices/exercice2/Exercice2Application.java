package com.exercices.exercice2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exercices.exercice2.domain.Account;

@SpringBootApplication
public class Exercice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercice2Application.class, args);
		List<Account> accountList = new ArrayList<>();
		accountList.add(new Account(0, 100));
		accountList.add(new Account(1, -100));
		accountList.add(new Account(2, -200));
		accountList.add(new Account(3, 1000));
		accountList.add(new Account(4, -1000));
		accountList.add(new Account(5, 500));
		accountList.add(new Account(6, -500));

		List<Account> filteredAccounts = filterPositiveBalances(accountList);
		filteredAccounts.forEach((a)-> System.out.println(a.getId()));

	}

	public static List<Account> filterPositiveBalances(List<Account> accounts) {
		return accounts.stream().filter((a) -> a.getBalance() > 0).collect(Collectors.toList());
	}

}
