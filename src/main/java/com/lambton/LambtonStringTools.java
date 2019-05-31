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
            //System.out.println("Fullname array "+Fullnamearray[i]);
            if (Fullnamearray[i]==space)
            {
                countspace++;
            }
            //System.out.println("spacecount : "+countspace);
        }
        //System.out.println("space count outside : "+countspace);
        if (countspace==2)
        {
            String FullNameLower=FullName.toLowerCase();
            //System.out.println("fullanem lower : "+FullNameLower);
            String []names=FullNameLower.split(" ");
            for (String ss:names
                 ) {
                //System.out.println("Split String "+ss);

            }
            String intials="";
            //System.out.println("names length : "+names.length);
            for (int i=0;i<names.length-1;i++)
            {
                String name=names[i];
                //System.out.println("names inside : "+name);
               //System.out.println("char at 0 "+name.charAt(0));
                //System.out.println("value : "+String.valueOf(name.charAt(0)));
                String nameinitial=(String.valueOf(name.charAt(0)));
                String nameinitial2=nameinitial.toUpperCase();
                //System.out.println("to upper case "+nameinitial2);
                intials=intials.concat(nameinitial2);
                //System.out.println("initials before: "+intials);
                intials=intials.concat(". ");

                //System.out.println("initials before: "+intials);
            }
            String name3=names[2];
            //System.out.println("name3 "+name3);
            char [] name3array=name3.toCharArray();
            String firstalphabet=String.valueOf(name3array[0]);
            //System.out.println(" firstalphabet "+firstalphabet);
            String firstalphabet2=firstalphabet.toUpperCase();
            //System.out.println("firstalphabet2 "+firstalphabet2);
            String afterFirstAlphabet="";
            for(int i=1;i<name3array.length;i++)
            {
                afterFirstAlphabet=afterFirstAlphabet.concat(String.valueOf(name3array[i]));
                //System.out.println(" afterFirstAlphabet "+afterFirstAlphabet);
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
        char []chararray=s.toCharArray();

        return ss;
    }

    static String replaceSubString(String s1,String s2,String s3)
    {
        String ans=" ";
        return  ans;
    }

}
