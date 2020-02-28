package ui;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		while(true) {
			Scanner scInt = new Scanner(System.in);
			Scanner scStr = new Scanner(System.in);
			System.out.println("\nMenu Lab1:\n(1.) Enter three Strings of characters.\n(2.) Enter two real numbers greater than zero.\n(3.) Enter three Integer numbers arrays.\n(4.) Exit.");
			int selection1 = scInt.nextInt();
			if (selection1==1) {
				System.out.print("String 1: ");
				String s1 = scStr.nextLine();
				System.out.print("String 2: ");
				String s2 = scStr.nextLine();
				System.out.print("String 3: ");
				String s3 = scStr.nextLine();
				while(true) {
					System.out.println("\nOptions:\n(1.) Show the length of each String.\n(2.) Concatenate the Strings and show.\n(3.) Show the character of a given position for each String.\n(4.) Go back.");
					int selection2 = scInt.nextInt();
					if(selection2==1) {
						System.out.println("String 1 length: "+s1.length());
						System.out.println("String 2 length: "+s2.length());
						System.out.println("String 3 length: "+s3.length());
					}
					else if(selection2==2) {
						System.out.println("Concatenation: "+s1+s2+s3);
					}
					else if(selection2==3) {
						System.out.print("Position: ");
						int pos = scInt.nextInt();
						//showCharAtGivenPosition(s1, s2, s3, pos);
					}
					else if(selection2==4) {
						break;
					}
					else {
						System.out.println("Invalid option.");
					}
				}
			}
			else if(selection1==2) {
				System.out.print("Number 1: ");
				int num1 = scInt.nextInt();
				System.out.print("Number 2: ");
				int num2 = scInt.nextInt();
				while(true) {
					System.out.println("\nOptions:\n(1.) Show division of both numbers.\n(2.) Show division and remainder of the integer part of both numbers.\n(3.) Go back.");
					int selection2 = scInt.nextInt();
					if(selection2==1) {
						double division1 = Double.valueOf(num1)/Double.valueOf(num2);
						double division2 = Double.valueOf(num2)/Double.valueOf(num1);
						System.out.println(num1+"/"+num2+" = "+division1);
						System.out.println(num2+"/"+num1+" = "+division2);
					}
					else if(selection2==2) {
						System.out.println(num1+"/"+num2+" = "+(num1/num2)+" | Reminder = "+(num1%num2));
						System.out.println(num2+"/"+num1+" = "+(num2/num1)+" | Reminder = "+(num2%num1));
					}
					else if(selection2==3) {
						break;
					}
					else {
						System.out.println("Invalid option.");
					}
				}
			}
			else if(selection1==3) {
				System.out.print("Length for array1: ");
				int len1 = scInt.nextInt();
				int[] nums1 = new int[len1];
				for (int i=0; i<len1; i++) {
					System.out.print("Number "+(i+1)+": ");
					nums1[i] = scInt.nextInt();
				}
				System.out.print("Length for array2: ");
				int len2 = scInt.nextInt();
				int[] nums2 = new int[len2];
				for (int i=0; i<len2; i++) {
					System.out.print("Number "+(i+1)+": ");
					nums2[i] = scInt.nextInt();
				}
				System.out.print("Length for array3: ");
				int len3 = scInt.nextInt();
				int[] nums3 = new int[len3];
				for (int i=0; i<len3; i++) {
					System.out.print("Number "+(i+1)+": ");
					nums3[i] = scInt.nextInt();
				}
				while(true) {
					System.out.println("\nOptions:\n(1.) Show arrays.\n(2.) Show average value of an array.\n(3.) Show biggest value of an array.\n(4.) Generate new array with a given operation (addition, subtraction, multiplication)\n(5.) Generate new array with the union of the three arrays.\n(6.) Generate new array with the interception of the three arrays.\n(7.) Move n positions the values of an array.\n(8.) Sort ascendingly the array.\n(9.) Go back.");
					int selection2 = scInt.nextInt();
					if(selection2==1) {
						
					}
					else if(selection2==2) {
						System.out.println("Select an array:\n(1.) "+Arrays.toString(nums1)+"\n(2.) "+Arrays.toString(nums2)+"\n(3.) "+Arrays.toString(nums3));
						int arrayNum = scInt.nextInt();
						if (arrayNum==1) {
							System.out.println("The average value of the array 1 is: "+averageValueOfAnArray(nums1));
						}
						else if (arrayNum==2) {
							System.out.println("The average value of the array 2 is: "+averageValueOfAnArray(nums2));
						}
						else if (arrayNum==3) {
							System.out.println("The average value of the array 3 is: "+averageValueOfAnArray(nums3));
						}
						else {
							System.out.println("Invalid option.");
						}
					}
					else if(selection2==3) {
						System.out.println("Select an array:\n(1.) "+Arrays.toString(nums1)+"\n(2.) "+Arrays.toString(nums2)+"\n(3.) "+Arrays.toString(nums3));
						int arrayNum = scInt.nextInt();
						if (arrayNum==1) {
							System.out.println("The biggest value in array 1 is: "+biggestValueInAnArray(nums1));
						}
						else if (arrayNum==2) {
							System.out.println("The biggest value in array 2 is: "+biggestValueInAnArray(nums2));
						}
						else if (arrayNum==3) {
							System.out.println("The biggest value in array 3 is: "+biggestValueInAnArray(nums3));
						}
						else {
							System.out.println("Invalid option.");
						}
					}
					else if(selection2==4) {
						System.out.println("Please select two arrays:"+Arrays.toString(nums1)+"\n(2.) "+Arrays.toString(nums2)+"\n(3.) "+Arrays.toString(nums3));
						System.out.print("Selection 1:");
						int arr1 = scInt.nextInt();
						System.out.print("Selection 2:");
						int arr2 = scInt.nextInt();
						System.out.println("Options:\n(1.) Addition\n(2.) Subtraction.\n(3.) Multiplication.");
						String operation = scStr.nextLine();
						if(arr1==1 && arr2==2) {
							System.out.println("New array: "+Arrays.toString(newArrayWithOperation(nums1, nums2, operation)));
						}
						else if(arr1==1 && arr2==3) {
							System.out.println("New array: "+Arrays.toString(newArrayWithOperation(nums1, nums3, operation)));
						}
						else if(arr1==2 && arr2==1) {
							System.out.println("New array: "+Arrays.toString(newArrayWithOperation(nums2, nums1, operation)));
						}
						else if(arr1==2 && arr2==3) {
							System.out.println("New array: "+Arrays.toString(newArrayWithOperation(nums2, nums3, operation)));
						}
						else if(arr1==3 && arr2==1) {
							System.out.println("New array: "+Arrays.toString(newArrayWithOperation(nums3, nums1, operation)));
						}
						else if(arr1==3 && arr2==2) {
							System.out.println("New array: "+Arrays.toString(newArrayWithOperation(nums3, nums2, operation)));
						}
						else {
							System.out.println("Invalid selection.");
						}
					}
					else if(selection2==5) {
						
					}
					else if(selection2==6) {
						
					}
					else if(selection2==7) {
						
					}
					else if(selection2==8) {
						
					}
					else if(selection2==9) {
						break;
					}
					else {
						System.out.println("Invalid option.");
					}
				}
			}
			else if(selection1==4) {
				break;
			}
			else {
				System.out.println("Invalid option.");
			}
		}
	}
	
	public static int averageValueOfAnArray(int[] arr) {
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		int average = total/arr.length;
		return average;
	}
	
	public static int biggestValueInAnArray(int[] arr) {
		int biggest = arr[0];
		for (int i=1; i<arr.length; i++) {
			if(arr[i]>biggest) {
				biggest = arr[i];
			}
		}
		return biggest;
	}
	
	public static int[] newArrayWithOperation(int[] arr1, int[] arr2, String op) {
		int[] newArray = new int[arr1.length];
		return newArray;
	}
}