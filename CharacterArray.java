package javalab;

public class CharacterArray {
	char arr[]={'a','d','t','c','z','k','c','d','t','a'};
	int num;
	char count;
	
public void chararray()
{
	num=arr.length;
	for (int i = 0; i < num; i++) {
		
	}
	char[] ch = new char[arr.length];
	for (int i = 0; i < num; i++) {
		ch[i] = (char) arr.length;
		int find = 0;
		for (int j = 0; j <= i; j++) {
			if (arr.length == ch[j])
				find++;
		}

		if (find == 1) {
			System.out.println("Number of Occurrence of " + arr.length + " letter is:" );
		}
}
}
}
