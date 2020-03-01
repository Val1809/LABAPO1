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
						if(pos>s1.length()) {
							System.out.println("Character in position "+pos+" at String 1: Invalid position");
						}
						else {
							System.out.println("Character in position "+pos+" at String 1: "+s1.charAt(pos));
						}
						if(pos>s2.length()) {
							System.out.println("Character in position "+pos+" at String 2: Invalid position");
						}
						else {
							System.out.println("Character in position "+pos+" at String 2: "+s2.charAt(pos));
						}
						if(pos>s2.length()) {
							System.out.println("Character in position "+pos+" at String 3: Invalid position");
						}
						else {
							System.out.println("Character in position "+pos+" at String 3: "+s3.charAt(pos));
						}
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
					System.out.println("\nOptions:\n(1.) Show arrays.\n(2.) Show average value of an array.\n(3.) Show biggest value of an array.\n(4.) Generate new array with a given operation (addition, subtraction, multiplication)\n(5.) Generate new array with the union of the three arrays.\n(6.) Generate new array with the union of the three arrays (Without repeating).\n(7.) Generate new array with the interception of the three arrays.\n(8.) Move n positions the values of an array.\n(9.) Sort ascendingly the array.\n(10.) Go back.");
					int selection2 = scInt.nextInt();
					if(selection2==1) {
						System.out.println(Arrays.toString(nums1));
                        System.out.println(Arrays.toString(nums2));
                        System.out.println(Arrays.toString(nums3));
					}
					else if(selection2==2) {
						System.out.println("Select an array:\n(1.) "+Arrays.toString(nums1)+"\n(2.) "+Arrays.toString(nums2)+"\n(3.) "+Arrays.toString(nums3));
						int arrayNum = scInt.nextInt();
						if (arrayNum==1) {
							System.out.println("The average value of the array1 is: "+averageValueOfAnArray(nums1));
						}
						else if (arrayNum==2) {
							System.out.println("The average value of the array2 is: "+averageValueOfAnArray(nums2));
						}
						else if (arrayNum==3) {
							System.out.println("The average value of the array3 is: "+averageValueOfAnArray(nums3));
						}
						else {
							System.out.println("Invalid option.");
						}
					}
					else if(selection2==3) {
						System.out.println("Select an array:\n(1.) "+Arrays.toString(nums1)+"\n(2.) "+Arrays.toString(nums2)+"\n(3.) "+Arrays.toString(nums3));
						int arrayNum = scInt.nextInt();
						if (arrayNum==1) {
							System.out.println("The biggest value in array1 is: "+biggestValueInAnArray(nums1));
						}
						else if (arrayNum==2) {
							System.out.println("The biggest value in array2 is: "+biggestValueInAnArray(nums2));
						}
						else if (arrayNum==3) {
							System.out.println("The biggest value in array3 is: "+biggestValueInAnArray(nums3));
						}
						else {
							System.out.println("Invalid option.");
						}
					}
					else if(selection2==4) {
						System.out.println("Select two arrays:\n(1.) "+Arrays.toString(nums1)+"\n(2.) "+Arrays.toString(nums2)+"\n(3.) "+Arrays.toString(nums3));
						System.out.print("Selection 1: ");
						int arr1 = scInt.nextInt();
						System.out.print("Selection 2: ");
						int arr2 = scInt.nextInt();
						System.out.println("\nOptions:\n(1.) Addition\n(2.) Subtraction.\n(3.) Multiplication.");
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
						int[] newArray = new int[nums1.length+nums2.length+nums3.length];
						System.arraycopy(nums1, 0, newArray, 0, nums1.length);
						System.arraycopy(nums2, 0, newArray, nums1.length, nums2.length);
					    System.arraycopy(nums3, 0, newArray, nums1.length+nums2.length, nums3.length);
					    System.out.println("New array: "+Arrays.toString(newArray));
					}
					else if(selection2==6) {
						System.out.println("New array: "+Arrays.toString(unionArrays(nums1, nums2, nums3)));
					}
					else if(selection2==7) {
						int[] newArray = interceptionArrays(nums1, nums2, nums3);
						if (newArray.length==0) {
							System.out.println("There are no values in the interception of the three arrays.");
						}
						else {
							System.out.println("New array: "+Arrays.toString(newArray));
						}
					}
					else if(selection2==8) {
						System.out.println("Select an array:\n(1.) "+Arrays.toString(nums1)+"\n(2.) "+Arrays.toString(nums2)+"\n(3.) "+Arrays.toString(nums3));
						int arrayNum = scInt.nextInt();
						System.out.println("How many positions do you want to move it?");
						int n = scInt.nextInt();
						if (arrayNum==1) {
							System.out.println("Array1 moved "+n+" positions: "+Arrays.toString(moveArrayValues(nums1, n)));
						}
						else if (arrayNum==2) {
							System.out.println("Array2 moved "+n+" positions: "+Arrays.toString(moveArrayValues(nums2, n)));
						}
						else if (arrayNum==3) {
							System.out.println("Array3 moved "+n+" positions: "+Arrays.toString(moveArrayValues(nums3, n)));
						}
						else {
							System.out.println("Invalid option.");
						}
					}
					else if(selection2==9) {
						System.out.println("Select an array:\n(1.) "+Arrays.toString(nums1)+"\n(2.) "+Arrays.toString(nums2)+"\n(3.) "+Arrays.toString(nums3));
						int arrayNum = scInt.nextInt();
						if (arrayNum==1) {
							System.out.println("Array1 ascendingly sorted: "+Arrays.toString(bubbleSort(nums1)));
						}
						else if (arrayNum==2) {
							System.out.println("Array2 ascendingly sorted: "+Arrays.toString(bubbleSort(nums2)));
						}
						else if (arrayNum==3) {
							System.out.println("Array3 ascendingly sorted: "+Arrays.toString(bubbleSort(nums3)));
						}
						else {
							System.out.println("Invalid option.");
						}
					}
					else if(selection2==10) {
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
	
	/**
	 Calcula el promedio de los valores dentro de un arreglo <br>
	 <b>pre: </b> <br>
	 <b>post: </b> Se calcula el promedio de los valores del arreglo
	 @param arr Arreglo de números arr!=null
	 @return average Entero que indica el valor promedio de los elementos del arreglo
	 */
	public static int averageValueOfAnArray(int[] arr) {
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		int average = total/arr.length;
		return average;
	}
	
	/**
	 Calcula el número mayor dentro de un arreglo <br>
	 <b>pre: </b> <br>
	 <b>post: </b> Se calcula el número mayor dentro del arreglo
	 @param arr Arreglo de números arr!=null
	 @return Entero que indica el número mayor dentro del arreglo
	 */
	public static int biggestValueInAnArray(int[] arr) {
		int biggest = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>biggest) {
				biggest = arr[i];
			}
		}
		return biggest;
	}
	
	/**
	 Genera un nuevo arreglo a partir de una operación indicada sobre otros dos arreglos <br>
	 <b>pre: </b> <br>
	 <b>post: </b> Se genera un nuevo arreglo a partir de la operación indicada
	 @param arr1 Arreglo de números enteros arr1!=null
	 @param arr2 Arreglo de números enteros arr2!=null
	 @param op String que indica la operación a realizar sobre los otros dos arreglos
	 @return newArray Arreglo de enteros generado a partir de la operación con los dos arreglos
	 */
	public static int[] newArrayWithOperation(int[] arr1, int[] arr2, String op) {
		int[] newArray;
		if(arr1.length>arr2.length) {
			newArray = new int[arr1.length];
			if (op.equals("1")) {
				for(int i=0; i<arr1.length; i++) {
					if (i>=arr2.length) {
						newArray[i] = arr1[i];
					}
					else {
						newArray[i] = arr1[i]+arr2[i];
					}
				}
			}
			else if(op.equals("2")) {
				for(int i=0; i<arr1.length; i++) {
					if (i>=arr2.length) {
						newArray[i] = arr1[i];
					}
					else {
						newArray[i] = arr1[i]-arr2[i];
					}
				}
			}
			else if(op.equals("3")) {
				for(int i=0; i<arr1.length; i++) {
					if (i>=arr2.length) {
						newArray[i] = arr1[i];
					}
					else {
						newArray[i] = arr1[i]*arr2[i];
					}
				}
			}	
		}
		else {
			newArray = new int[arr2.length];
			if (op.equals("1")) {
				for(int i=0; i<arr2.length; i++) {
					if (i>=arr1.length) {
						newArray[i] = arr2[i];
					}
					else {
						newArray[i] = arr1[i]+arr2[i];
					}
				}
			}
			else if(op.equals("2")) {
				for(int i=0; i<arr2.length; i++) {
					if (i>=arr1.length) {
						newArray[i] = arr2[i];
					}
					else {
						newArray[i] = arr1[i]-arr2[i];
					}
				}
			}
			else if(op.equals("3")) {
				for(int i=0; i<arr2.length; i++) {
					if (i>=arr1.length) {
						newArray[i] = arr2[i];
					}
					else {
						newArray[i] = arr1[i]*arr2[i];
					}
				}
			}
		}
		return newArray;
	}
	
	/**
	 Indica si un elemento se encuentra dentro de un arreglo <br>
	 <b>pre: </b> <br>
	 <b>post: </b> Se sabe si el elemento se encuentra dentro del arreglo o no
	 @param arr Arreglo de números enteros arr!=null
	 @param element Entero a buscar dentro del arreglo
	 @return exist Booleano que indica si el elemento se encuentra dentro del arreglo o no
	 */
	public static boolean exist (int[] arr, int element) {
		boolean exist = false;
		for(int i=0; i<arr.length; i++) {
			if (arr[i]==element) {
				exist = true;
			}
		}
		return exist;
	}
	
	/**
	 Genera un nuevo arreglo a partir de la union de tres arreglos (Sin repeticiones) <br>
	 <b>pre: </b> <br>
	 <b>post: </b> Se genera un nuevo arreglo a partir de la union de los tres arreglos
	 @param arr1 Arreglo de números enteros arr1!=null
	 @param arr2 Arreglo de números enteros arr2!=null
	 @param arr3 Arreglo de números enteros arr3!=null
	 @return unionEnd Arreglo de enteros generado a partir de la union de los tres arreglos
	 */
	public static int[] unionArrays (int[] arr1, int[] arr2, int[] arr3) {
		// Union del arreglo 1 con el arreglo 2
		int[] unionStart = new int[arr1.length+arr2.length];
		for(int i=0; i<arr1.length; i++) {
			unionStart[i] = arr1[i];
		}
		int repeated = 0;
		int cont = 0;
		for(int i=0; i<arr2.length; i++) {
			if (exist(arr1, arr2[i])==false) {
				unionStart[arr1.length+cont] = arr2[i];
				cont++;
			}
			else {
				repeated++;
			}
		}
		int[] temp = unionStart;
		unionStart = new int[temp.length-repeated];
		for(int i=0; i<unionStart.length; i++) {
			unionStart[i] = temp[i];
		}
		// Union de los arreglos 1 y 2 con el arreglo 3
		int[] unionEnd = new int[unionStart.length+arr3.length];
		for(int i=0; i<unionStart.length; i++) {
			unionEnd[i] = unionStart[i];
		}
		repeated = 0;
		cont = 0;
		for(int i=0; i<arr3.length; i++) {
			if (exist(unionStart, arr3[i])==false) {
				unionEnd[unionStart.length+cont] = arr3[i];
				cont++;
			}
			else {
				repeated++;
			}
		}
		temp = unionEnd;
		unionEnd = new int[temp.length-repeated];
		for(int i=0; i<unionEnd.length; i++) {
			unionEnd[i] = temp[i];
		}
		return unionEnd;
	}

	/**
	 Genera un nuevo arreglo a partir de la intersección de tres arreglos <br>
	 <b>pre: </b> <br>
	 <b>post: </b> Se genera un nuevo arreglo a partir de la intersección de los tres arreglos
	 @param arr1 Arreglo de números enteros arr1!=null
	 @param arr2 Arreglo de números enteros arr2!=null
	 @param arr3 Arreglo de números enteros arr3!=null
	 @return result Arreglo de enteros generado a partir de la intersección de los tres arreglos
	 */
	public static int[] interceptionArrays (int[] arr1, int[] arr2, int[] arr3) {
		int repeatedIn2 = 0;
		int repeatedIn3 = 0;
		int[] repeated1_2 = new int[arr1.length+arr2.length];
		int[] repeated1_3 = new int[arr1.length+arr3.length];
		int cont = 0;
		for(int i=0; i<arr2.length; i++) {
			if (exist(arr1, arr2[i])) {
				repeated1_2[cont] = arr2[i];
				repeatedIn2++;
				cont++;
			}
		}
		cont = 0;
		for (int i=0; i<arr3.length; i++) {
			if (exist(arr1, arr3[i])) {
				repeated1_3[cont] = arr3[i];
				repeatedIn3++;
				cont++;
			}
		}
		int[] temp = repeated1_2;
		repeated1_2 = new int[repeatedIn2];
		for (int i=0; i<repeated1_2.length; i++) {
			repeated1_2[i] = temp[i];
		}
		temp = repeated1_3;
		repeated1_3 = new int[repeatedIn3];
		for (int i=0; i<repeated1_3.length; i++) {
			repeated1_3[i] = temp[i];
		}
		int[] result = new int[repeatedIn2+repeatedIn3];
		int repeatedInAll = 0;
		cont = 0;
		for(int i=0; i<repeated1_3.length; i++) {
			if (exist(repeated1_2, repeated1_3[i])) {
				result[cont] = repeated1_3[i];
				repeatedInAll++;
				cont++;
			}
		}
		temp = result;
		result = new int[repeatedInAll];
		for (int i=0; i<result.length; i++) {
			result[i] = temp[i];
		}
		return result;
	}
	
	/**
	 Mueve los valores de un arreglo n posiciones a la derecha <br>
	 <b>pre: </b> <br>
	 <b>post: </b> Se genera un nuevo arreglo con sus valores movidos n posiciones
	 @param arr Arreglo de números enteros arr!=null
	 @param n Entero que indica la cantidad de posiciones a mover los valores del arreglo
	 @return newArray Arreglo de enteros orginal movido n posiciones
	 */
	public static int[] moveArrayValues(int[] arr, int n) {
		int[] newArray = new int[arr.length];
		System.arraycopy(arr, 0, newArray, 0, arr.length);
		for (int i=0; i<n; i++) {
			int last = newArray[newArray.length-1];
			for (int j=newArray.length-2; j>=0; j--) {
				newArray[j+1] = newArray[j];
			}
			newArray[0] = last;
		}
		return newArray;
	}
	
	/**
	 Ordena ascendentemente los elementos de un arreglo de enteros utilizando el algoritmo burbuja <br>
	 <b>pre: </b> <br>
	 <b>post: </b> Se genera un nuevo arreglo ordenado
	 @param arr Arreglo de números enteros arr!=null
	 @return arraySorted Arreglo de enteros ordenado
	 */
	public static int[] bubbleSort (int[] arr) {
		int[] arraySorted = new int[arr.length];
		System.arraycopy(arr, 0, arraySorted, 0, arr.length);
		for (int i=arraySorted.length; i>0; i--) {
			for (int j=0; j<i-1; j++) {
				if (arraySorted[j]>arraySorted[j+1]) {
					int temp = arraySorted[j];
					arraySorted[j] = arraySorted[j+1];
					arraySorted[j+1] = temp;
				}
			}
		}
		return arraySorted;
	}
}