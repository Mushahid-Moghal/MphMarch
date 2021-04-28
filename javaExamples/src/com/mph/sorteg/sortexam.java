package com.mph.sorteg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortexam {

	public static void main(String[] args) {
		int[] intArr = {5,6,4,15,11};
		Arrays.sort(intArr);
		System.out.println("Sorted intArr : " + Arrays.toString(intArr));

		String[] strArr = {"Virat","Padikkal","Azharuddin","Devillers"};
		Arrays.sort(strArr);
		System.out.println("Sorted strArr : " + Arrays.toString(strArr));

		
		List<String> strList = new ArrayList<String>();
		strList.add("Shabaz");
		strList.add("Washi");
		strList.add("Chahal");
		strList.add("Zampa");
		
		System.out.println("StrList : " + strList);
		Collections.sort(strList);
		System.out.println("Sorted StrList : " + strList);
		
		Student[] stArray = new Student[3];
		stArray[0] = new Student(10,"Suyash",25,90);
		stArray[1] = new Student(30,"Patidar",23,80);
		stArray[2] = new Student(20,"Sachin baby",22,95);
		
		Arrays.sort(stArray);
		System.out.println("Sorted Student Array :" + Arrays.toString(stArray));
		
		Arrays.sort(stArray,Student.nameComparator);
		System.out.println("Sorted Student Array w.r.t Name :" + Arrays.toString(stArray));
		
		Arrays.sort(stArray,Student.marksComparator);
		System.out.println("Sorted Student Array w.r.t Marks :" + Arrays.toString(stArray));
		/*Arrays.sort(stArray,Student.idComparator);
		System.out.println("Sorted Student Array w.r.t Marks :" + Arrays.toString(stArray));*/
		
		
		
		
	}

}