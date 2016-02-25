package org.istvanbohm.algorithms;

/*
 * Playing a little with the word MEME
 */
public class Meme {
	public static void main(String[] args) {
		String word="MEME";
		int size = word.length();
		int direction = 1;
		for(int line=0;line<size;++line){
			int poz = line;
			for(int i=0;i<size;++i) {
				char c = word.charAt((poz+size)%size);
				System.out.print(c);
				poz+=direction;
			}
			System.out.println("");
			direction *= -1;
		}
	}
}
