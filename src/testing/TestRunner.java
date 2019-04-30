package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


class TestRunner {

	public static void main(String[] args) {
		//Test cardZone
		Result cardZoneResult = JUnitCore.runClasses(cardZoneTest.class);
		for(Failure failure : cardZoneResult.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(cardZoneResult.wasSuccessful());

		//Test Crazy8s
		Result Crazy8sResult = JUnitCore.runClasses(Crazy8sTest.class);
		for(Failure failure : Crazy8sResult.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(Crazy8sResult.wasSuccessful());


		//Test Deck
		Result DeckResult = JUnitCore.runClasses(DeckTest.class);
		for(Failure failure : DeckResult.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(DeckResult.wasSuccessful());
		
		//Test Player
		Result PlayerResult = JUnitCore.runClasses(PlayerTest.class);
		for(Failure failure : PlayerResult.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(PlayerResult.wasSuccessful());
	}

}
