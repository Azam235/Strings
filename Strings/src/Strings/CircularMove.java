package Strings;

public class CircularMove {
	
	public static boolean isCircular(String str) {
		int x=0,y=0;
		char dir='N';
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)) {
				case 'M':
					if(dir=='N') {
						y++;
					}
					else if(dir=='W') {
						x--;
					}
					else if(dir=='S') {
						y--;
					}
					else if(dir=='E') {
						x++;
					}
					break;
				case 'R':
					if(dir=='N') {
						dir='E';
					}
					else if(dir=='E') {
						dir='S';
					}
					else if(dir=='S') {
						dir='W';
					}
					else if(dir=='W') {
						dir='N';
					}
					break;
				case  'L':
					if(dir=='N') {
						dir='W';
					}
					else if(dir=='W') {
						dir='S';
					}
					else if(dir=='S') {
						dir='E';
					}
					else if(dir=='E') {
						dir='N';
					}
					break;
			}
		}
		return (x==0 && y==0);
	}
	
	public static void main(String[] s) {
		String str="MMRMMRMMRMM";
		if(isCircular(str)) {
			System.out.println("the moves are circular");
		}
		else {
			System.out.println("the moves are not circular");
		}
	}
}
