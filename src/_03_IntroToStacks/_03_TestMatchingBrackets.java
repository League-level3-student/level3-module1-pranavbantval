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
		int open = 0;
		int closed = 0;
		Stack<Character> chars = new Stack<Character>();
		for (int i = 0; i < b.length() - 1; i++) {
			chars.push(b.charAt(i));
		}
		for (int i = 0; i < chars.size(); i++) {
			char c = chars.pop();
			if (c == '{') {
				open++;
			} else if (c == '}') {
				closed++;
			}
			if (closed > open) {
				x=false;
				return x;
			}
			else if (open > closed) {
				x= false;
				return x;
			} else {
				x= true;
			}
			}
		if(x!=true) {
			return true;
		}
		else {
			return true;
		}
		}}

	

