package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		boolean x = true;
		Stack<Character> chars = new Stack<Character>();
		int open = 0;
		int closed = 0;
		System.out.println(b.length());
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '{') {
				open++;
				System.out.println(b.charAt(i));
				chars.push(b.charAt(i));
			} else if (b.charAt(i) == '}') {
				if (chars.size() != 0) {
					closed++;
					chars.pop();
				} else {
					closed=100;
					x = false;
					
				}
			}
		}
		if (open > closed) {
			x = false;
		} else if (closed > open) {
			x = false;
		} else {
			 x=true;
		}
		return x;

	}
}
