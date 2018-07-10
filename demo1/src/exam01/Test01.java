package exam01;

/*现在main方法中有一个数组int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}; 
要求如下： 
1. 定义方法将数组中的0使用1-10之间的随机数替换掉(每一个0都要用一个新的随机数替换)，并统计替换了多少个。 
2. 调用上面定义的方法，替换掉0并统计结果 
3. 对操作后的数组使用任意格式进行遍历，查看结果 (30分)
上传*/

import java.util.Random;
public class Test01 {

	public static void main(String[] args) {	
		int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}; 
		 getNum(arr);
		 for(int i=1;i<arr.length;i++){
			 System.out.println(arr[i]);
		 }
	}
	public static void getNum(int[] arr) {
		Random ra = new Random();
		int sum = 0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]==0){
				 sum++;
				 int num = ra.nextInt(10)+1;
				 arr[i]=num;
			}
		}
		System.out.println("替换了"+sum+"个");
	}

}
