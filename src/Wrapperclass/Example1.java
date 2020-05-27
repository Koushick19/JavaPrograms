package Wrapperclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 
{
public static void main(String[] args) {
	
Pattern p = Pattern.compile("a+");
Matcher m = p.matcher("abaabaaab");
while(m.find())
{
	
	System.out.println(m.start()+ "___" + m.group());
}

}
}

