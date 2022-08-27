package com.stringops;


import java.util.ArrayList;
import java.util.List;

public class StringCombinations{

    public static void main(String[] args) {
        String input="abcde";
        System.out.println(getCombinations(input));
    }

    static List<String> getCombinations(String input){
        List<String> list=new ArrayList<>();
        String str="";
        String str1="";
        String str2="";
        for (int i=0;i<input.length();i++){
            for (int j=i+1;j<input.length();j++){
                str=String.valueOf(input.charAt(i))+""+String.valueOf(input.charAt(j));
                if (!list.contains(str))
                    list.add(str);

                str1=input.substring(i,j);
                if (!list.contains(str1))
                    list.add(str1);

                str2=input.substring(i);
                if (!list.contains(str2))
                    list.add(str2);
            }
            // for boundary condition when i=last string character, since j=i+1 so inner loop will be
            // exit and last character will not be read, therefor, added this condition
            if (i==input.length()-1 && !list.contains(input.substring(input.length()-1)))
            {
                list.add(input.substring(input.length()-1));
            }
        }
        return list;
    }
}
