import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		String s = "abbc";
		int n=s.length();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		
		for(int i=0;i<n;i++){
		    Character key = s.charAt(i);
		    if(map.containsKey(key)){
		        int val = map.get(key);
		        val++;
		        map.put(key,val);
		    }else{
		        map.put(key,1);
		    }
		}
		Collection<Character> keys = map.keySet();
		for(Character i: keys)
		{
		    System.out.println(i+": "+map.get(i));
		}
		
	}
}
