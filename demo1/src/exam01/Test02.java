package exam01;

/*1. 定义方法，求出指定元素在数组中出现的次数. 
2. 定义方法，统计数组中出现次数为1的元素一共有多少个。(推荐-遍历数组，然后调用第一个方法，求出数组中每个元素在数组中出现的次数，如果只出现了一次，就统计) 
3. 在main方法中定义数组，如int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};。然后调用方法，统计只出现一次的元素有多少个。 
  打印结果：数组中只出现一次的元素有2个 (30分)
上传*/

public class Test02 {
	public static void main(String[] args) {
		int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		getSum( arr,arr[2]);
		getSumOne(arr);
		
		
	}
/*	1. 定义方法，求出指定元素在数组中出现的次数. */
	public static int getSum(int[] arr,int num){
		int sumNum = 0;
		for(int i =0;i <arr.length;i++){
			if(arr[i]==num){
				sumNum ++;
			}
		}
		System.out.println(sumNum);
		System.out.println(num+"在数组中出现的次数是"+sumNum);
		return sumNum;
	}

/*	2. 定义方法，统计数组中出现次数为1的元素一共有多少个。*/
	public static void getSumOne(int[] arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++){		
			int b = getSum(arr,arr[i]);
			if(b==1){
				sum++;
			}			
		}
		System.out.println("数组中出现次数为1的元素一共有"+sum+"个");	
		
	}
		
}
