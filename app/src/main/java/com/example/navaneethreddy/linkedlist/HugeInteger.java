package com.example.navaneethreddy.linkedlist;

public class HugeInteger
{
    LinkedList ll;
    String s;

    public HugeInteger(String num)
    {
        ll = new LinkedList();
        s = num;

        for(int i = 0; i < num.length(); i++)
        {
            ll.addFront(Integer.parseInt("" + num.charAt(i)));
        }
    }

    public String toString()
    {
        return this.s;
    }

    public HugeInteger addition(HugeInteger x)
    {

        int xCount = x.ll.count();


        String result = "";

        for (int i=xCount-1;i>=0;i--)
        {

            result = result + String.valueOf(this.ll.getAtPos(i)+x.ll.getAtPos(i));

        }

        return new HugeInteger(result);
    }
}
