package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;


/*22����Ŀ��Ŀ¼���Ѵ����ļ�player.txt���ļ��д����Ա����� �洢��ʽ����(ԭʼ��Ա����Ӳ��ó���¼�룬���ֶ����ļ������ļ���¼������)�� 
��Ա,��ӣ��м��ã��ָ������磺 
������,��ʿ�� 
����,������ 
����,��ʿ�� 
ʯ����,���˶� 
�Ʊ�,���˶� 
2.  ��������ʱ����ʾ�û�������Ա��  ������Ա���ҵ�����Ӧ����� 
2.1 ����¼����Ա�� 
     2.2 ��player.txt�л�ȡ��Ա����������ӣ���֤����¼�����Ա�Ƿ���� 
       �ǣ�����̨����Ա�����������Ϣ��ӡ 
       �񣺿���̨��ʾ�������ڸ���Ա������������ 
   ����  ����ʾ¼����Ա���� ������Ӧ��� 
          ¼��  ���� 
          չʾ�� ���� ���� ��ʿ��  ����ɹ��� 
          ����Ҳ��� ������Ӧ����ʾ*/
public class Test02 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
			BufferedReader br = new BufferedReader(new FileReader("player.txt"));
			HashMap<String, String> map = new HashMap<>();
			System.out.println("��������Ա��");
			String name = sc.nextLine();
			String len ;
			while((len = br.readLine()) != null){
				String[] split = len.split(",");
				map.put(split[0], split[1]);
			}
			
			br.close();
			if(map.containsKey(name)){
				System.out.println("��Ա����  "+name+"���������"+map.get(name));
			}else{
				System.out.println("��Ա������");
				return;
			}
		}

}
