import java.io.*;

public class HuiwenTest {
	public static void main(String[] args) {
		String str = new String();
		try {
			System.out.println("�������ַ��������س�������");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();
			System.out.print("��������ַ�����" + str);
		} catch (IOException e) {
			System.err.println("��������");
		}
		Huiwen htr = new Huiwen(str);
		if (htr.isHuiwen()) {
			System.out.println("�ǻ���");
		} else {
			System.out.println("���ǻ���");
			System.out.println("������Ļ�Ϊ" + htr.jiHuiwenize());
			System.out.println("��ż���Ļ�Ϊ" + htr.ouHuiwenize());
		}
	}
}
