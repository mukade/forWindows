import java.io.*;

public class HuiwenTest {
	public static void main(String[] args) {
		String str = new String();
		try {
			System.out.println("请输入字符串并按回车结束：");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();
			System.out.print("你输入的字符串：" + str);
		} catch (IOException e) {
			System.err.println("输入有误");
		}
		Huiwen htr = new Huiwen(str);
		if (htr.isHuiwen()) {
			System.out.println("是回文");
		} else {
			System.out.println("不是回文");
			System.out.println("经奇回文化为" + htr.jiHuiwenize());
			System.out.println("经偶回文化为" + htr.ouHuiwenize());
		}
	}
}
