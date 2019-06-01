package com.lambton;

public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println(LambtonStringTools.reverse("Lambton"));

        System.out.println(
                LambtonStringTools.binaryToDecimal("111112"));
        System.out.println(LambtonStringTools.binaryToDecimal("10001"));

        System.out.println(LambtonStringTools.initials("James tiBeriUs kiRK"));

        System.out.println(LambtonStringTools.mostFrequent("Helllloooo"));
        System.out.println(LambtonStringTools.mostFrequent("Hellllooo"));
        System.out.println(LambtonStringTools.replaceSubString("the dog jumped over the fence","the","that"));

    }
}
