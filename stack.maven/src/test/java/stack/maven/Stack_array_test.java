package stack.maven;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.Test;



class Stack_array_test {

	@Test
	void test() {
		Stack_array<Integer> s= new Stack_array<>(3);
		
		s.push(2);
		s.push(5);
		assertEquals(5,s.top());
		
		
		
	}
	
	
	

}
