package com.exercices.exercice2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.exercices.exercice2.domain.Account;

@SpringBootTest
class Exercice2ApplicationTests {

	@Test
	void testfilterPositiveBalances() {
		List<Account> accounts = new ArrayList<>();
		Account accountOne = new Account(0, 100);
		Account accountTwo = new Account(1, -100);
		accounts.add(accountOne);
		accounts.add(accountTwo);
		List<Account> expected = new ArrayList<>();
		expected.add(accountOne);
		List<Account> filtered = Exercice2Application.filterPositiveBalances(accounts);
		assertEquals(expected.size(), filtered.size());
		assertTrue(expected.containsAll(filtered) && filtered.containsAll(expected));
	}

}
