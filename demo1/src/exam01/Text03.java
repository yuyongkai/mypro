package exam01;

/*
1. ���巽����ͳ�������г��ִ���Ϊ1��Ԫ��һ���ж��ٸ���(�Ƽ�-�������飬Ȼ����õ�һ�����������������ÿ��Ԫ���������г��ֵĴ��������ֻ������һ�Σ���ͳ��) 
2. ��main�����ж������飬��int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};��Ȼ����÷�����ͳ��ֻ����һ�ε�Ԫ���ж��ٸ��� 
  ��ӡ�����������ֻ����һ�ε�Ԫ����2�� (30��)
�ϴ�*/
public class Text03 {
	public static void main(String[] args) { 
		int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		sum(arr);
	} 
	public static void sum(int[] arr){
         /*����arr��ÿһ��Ԫ�غ������������Ԫ�ؽ��бȽ�*/
		int sum = 0;
		forname: for(int i=0;i<arr.length;i++){
			int b = arr[i];    
			for(int j=0;j<arr.length;j++){
				/*ע�⣺��Ҫ�ų�j=i����Ϊi=j�Ļ���Ӧ��ֵ�������*/
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
	/*ע�⣺breakҪ����ѭ������Ҫ�������������ѭ��*/
}
