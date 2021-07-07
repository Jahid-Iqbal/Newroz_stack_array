package stack.maven;

import java.util.ArrayList;



public class Stack_array<T> {

	
			ArrayList<T> A;

			
			int top = -1;
			int size;

			// Constructor of this class
			// To initialize stack
			Stack_array(int size)
			{
				
				this.size = size;
				// Creating array of Size = size
				this.A = new ArrayList<T>(size);
			}

			// Method 1
			// To push generic element into stack
			void push(T X)
			{
				// Checking if array is full
				if (top + 1 == size) {

				
					System.out.println("Stack Overflow");
				}
				else {


					top = top + 1;

					// Over-writing existing element
					if (A.size() > top)
						A.set(top, X);

					else

						// Creating new element
						A.add(X);
				}
			}

			// To return topmost element of stack
			T top()
			{

				if (top == -1) {

					System.out.println("Stack Underflow");

					return null;
				}
				// return the topmost element
				else
					return A.get(top);
			}


			// To delete last element of stack
			void pop()
			{

				if (top == -1) {

					System.out.println("Stack Underflow");
				}

				else

					top--;
			}

			boolean empty() { return top == -1; }

			// @Override
			public String toString()
			{

				String Ans = "";

				for (int i = 0; i < top; i++) {
					Ans += String.valueOf(A.get(i)) + "->";
				}

				Ans += String.valueOf(A.get(top));

				return Ans;
			}

		}

