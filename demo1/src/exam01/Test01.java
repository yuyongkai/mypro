package exam01;

/*����main��������һ������int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}; 
Ҫ�����£� 
1. ���巽���������е�0ʹ��1-10֮���������滻��(ÿһ��0��Ҫ��һ���µ�������滻)����ͳ���滻�˶��ٸ��� 
2. �������涨��ķ������滻��0��ͳ�ƽ�� 
3. �Բ����������ʹ�������ʽ���б������鿴��� (30��)
�ϴ�*/

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
		System.out.println("�滻��"+sum+"��");
	}

}
