/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sada;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class asds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=s.nextInt();
		System.out.println("enter the elements");
		int n[]=new int[size];
		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			n[i]=Integer.parseInt(s.next());
			
		}
	    for(int i=0;i<size-1;i++)
	    {
	    	if(n[i]>n[i+1])
	    	{
	    		flag=true;
	    		break;
	    	}
	    }
	    if(!flag)
	    {
	    	System.out.println(" sorted order");
	    }
	    else
	    {
	    	System.out.println(" not in the sorted order");
	    }

    }
}
