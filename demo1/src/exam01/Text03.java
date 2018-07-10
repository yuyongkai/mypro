package exam01;

/*
1. 定义方法，统计数组中出现次数为1的元素一共有多少个。(推荐-遍历数组，然后调用第一个方法，求出数组中每个元素在数组中出现的次数，如果只出现了一次，就统计) 
2. 在main方法中定义数组，如int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};。然后调用方法，统计只出现一次的元素有多少个。 
  打印结果：数组中只出现一次的元素有2个 (30分)
上传*/
public class Text03 {
	public static void main(String[] args) { 
		int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		sum(arr);
	} 
	public static void sum(int[] arr){
         /*遍历arr中每一个元素和它里面的其他元素进行比较*/
		int sum = 0;
		forname: for(int i=0;i<arr.length;i++){
			int b = arr[i];    
			for(int j=0;j<arr.length;j++){
				/*注意：先要排除j=i，因为i=j的话对应的值就相等了*/
				if(j != i){
					if(b == arr[j]){
						break forname;
					}	
				}else{
					continue;
				}		
			}
			sum++;
		}
		System.out.println(sum);
	}
	/*注意：break要跳出循环，但要跳出的是最外层循环*/
}
