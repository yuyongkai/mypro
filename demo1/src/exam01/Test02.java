package exam01;

/*1. ���巽�������ָ��Ԫ���������г��ֵĴ���. 
2. ���巽����ͳ�������г��ִ���Ϊ1��Ԫ��һ���ж��ٸ���(�Ƽ�-�������飬Ȼ����õ�һ�����������������ÿ��Ԫ���������г��ֵĴ��������ֻ������һ�Σ���ͳ��) 
3. ��main�����ж������飬��int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};��Ȼ����÷�����ͳ��ֻ����һ�ε�Ԫ���ж��ٸ��� 
  ��ӡ�����������ֻ����һ�ε�Ԫ����2�� (30��)
�ϴ�*/

public class Test02 {
	public static void main(String[] args) {
		int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		getSum( arr,arr[2]);
		getSumOne(arr);
		
		
	}
/*	1. ���巽�������ָ��Ԫ���������г��ֵĴ���. */
	public static int getSum(int[] arr,int num){
		int sumNum = 0;
		for(int i =0;i <arr.length;i++){
			if(arr[i]==num){
				sumNum ++;
			}
		}
		System.out.println(sumNum);
		System.out.println(num+"�������г��ֵĴ�����"+sumNum);
		return sumNum;
	}

/*	2. ���巽����ͳ�������г��ִ���Ϊ1��Ԫ��һ���ж��ٸ���*/
	public static void getSumOne(int[] arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++){		
			int b = getSum(arr,arr[i]);
			if(b==1){
				sum++;
			}			
		}
		System.out.println("�����г��ִ���Ϊ1��Ԫ��һ����"+sum+"��");	
		
	}
		
}
