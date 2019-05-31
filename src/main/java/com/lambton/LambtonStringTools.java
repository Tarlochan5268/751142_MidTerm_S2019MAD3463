package com.lambton;

public class LambtonStringTools
{
    static String reverse(String s)
    {
        String reverse="";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse+=s.charAt(i);
        }
        return reverse;
    }




    static int binaryToDecimal(String s)
    {
        String binary=s;
        boolean bin=true;
        for(int i=0;i<s.length();i++)
        {
            if(Integer.parseInt(String.valueOf(s.charAt(i)))>1)
            {
                bin=false;
                break;
            }
            else
            {
                bin=true;
            }
        }
        if(bin==false)
        {

            return -1;
        }
        else
        {
            int decimal=Integer.parseInt(s,2);
            return decimal;
        }

    }
    static String initials(String s)
    {
        String FullName=s;        int countspace=0;
        for(int i=0;i<FullName.length();i++)
        {

            char space=' ';
            char[] Fullnamearray=FullName.toCharArray();
            if (Fullnamearray[i]==space)
            {
                countspace++;
            }
        }

        String []names=s.split(" ");
        return s;
    }

}
