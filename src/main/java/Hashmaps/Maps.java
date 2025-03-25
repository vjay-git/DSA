package Hashmaps;

import java.util.HashMap;

public class Maps
{
    public static void main(String[] args) {
        HashMap<String,Integer> h1= new HashMap<>();
        HashMap<String,Integer> h2= new HashMap<>();
        h1.put("value",1);
        h2=h1;
        h2.put("value",100);
        System.out.println(h1);
        System.out.println(h2);
    }

}
