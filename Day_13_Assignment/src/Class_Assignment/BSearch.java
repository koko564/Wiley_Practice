package Class_Assignment;

public class BSearch {

	public static void main(String[] args) {
		int []a= {1, 4, 7, 19, 45, 78};
		int searchElement=19;
		int index=binarySearch(a,searchElement);
		int index2=binarySearchRecursive(a,0,a.length-1,searchElement);
		if(index==-1 || index2==-1)
			System.out.println("Element not found.");
		else {
		System.out.println("Element found using Iterative approach, at index "+index+" position "+(index+1)+"th.");
		System.out.println("Element found using Recursive approach, at index "+index2+" position "+(index2+1)+"th.");}
	}

	private static int binarySearch(int[] a, int searchElement) {
		int length=a.length;
		int h=length-1;
		int l=0;
		while(l<=h) {
			int mid=l+(h-l)/2;
			if(a[mid]==searchElement)
				return mid;
			else if(a[mid]>searchElement) {
				h=mid-1;
			}
			else 
				l=mid+1;
		}
		return -1;
	}
	public static int binarySearchRecursive(int[]a,int l,int h,int searchElement) {
		if(l>h)
			return -1;
		int mid=l+(h-l)/2;
		if(a[mid]==searchElement)
			return mid;
		if(a[mid]>searchElement)
			return binarySearchRecursive(a, l, mid-1, searchElement);
		else 
			return binarySearchRecursive(a,mid+1,h,searchElement);
	}

}