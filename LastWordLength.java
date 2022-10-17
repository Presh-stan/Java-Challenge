package javaChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastWordLength {
public static void main(String[] args) {
	

	String s="uffy is still joyboy";
String[] str=s.split(" ");
List<String> list=new ArrayList<String>(Arrays.asList(str));
String lastWord=list.get(list.size()-1);
int length=lastWord.length();
System.out.println("The length of the last word is " + length);
}
}
