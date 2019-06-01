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
        String FullName=s;
        int countspace=0;

        char space=' ';
        char[] Fullnamearray=FullName.toCharArray();
        for(int i=0;i<FullName.length();i++)
        {
            if (Fullnamearray[i]==space)
            {
                countspace++;
            }
        }
        if (countspace==2)
        {
            String FullNameLower=FullName.toLowerCase();
            String []names=FullNameLower.split(" ");
            String intials="";
            for (int i=0;i<names.length-1;i++)
            {
                String name=names[i];
                String nameinitial=(String.valueOf(name.charAt(0)));
                String nameinitial2=nameinitial.toUpperCase();
                intials=intials.concat(nameinitial2);
                intials=intials.concat(". ");

            }
            String name3=names[2];
            char [] name3array=name3.toCharArray();
            String firstalphabet=String.valueOf(name3array[0]);
            String firstalphabet2=firstalphabet.toUpperCase();
            String afterFirstAlphabet="";
            for(int i=1;i<name3array.length;i++)
            {
                afterFirstAlphabet=afterFirstAlphabet.concat(String.valueOf(name3array[i]));
            }
            String finalFullName="";
            finalFullName=finalFullName.concat(intials);
            finalFullName=finalFullName.concat(firstalphabet2);
            finalFullName=finalFullName.concat(afterFirstAlphabet);

            return finalFullName;

        }
        else return new String("null");


    }

    static char mostFrequent(String s)
    {
        char ss=' ';
        char[] stringarray = s.toCharArray();
        int count=1;
        int maximum=0;
        char maxChar=0;
        for(int i=1; i<stringarray.length; i++)
        {
            if(stringarray[i]==stringarray[i-1])
            {
                count++;
            }
            else
                {
                if(count>maximum)
                {
                    maximum=count;
                    maxChar=stringarray[i-1];
                }
                count = 1;
                }
        }
        if(count>=maximum)
        {
            maximum=count;
            maxChar=stringarray[stringarray.length-1];
        }
        return maxChar;
    }

    static String replaceSubString(String s1,String s2,String s3)
    {
        String ans=s1.replaceAll(s2,s3);
        System.out.println(s1);
        return  ans;
    }

}
