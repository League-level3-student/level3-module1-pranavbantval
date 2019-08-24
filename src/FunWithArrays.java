
public class FunWithArrays {
	
public static void main(String[] args) {
int[] a= {1,2,3};
int[] b = {4,5,6};

printArray(a);

	printArray(b);
	a=b;
	printArray(a);
	printArray(b);
	a[1]=9;
	printArray(a);
	printArray(b);
}

static void printArray(int[] c) {
	for (int i = 0; i < c.length; i++) {
		System.out.print(c[i]);
	}
	System.out.println();
}
}
