public class Huiwen {
	private String str = new String();

	public Huiwen() {
	}

	public Huiwen(String str) {
		this.str = str;
	}

	public boolean isHuiwen() {
		char[] ch = str.toCharArray();
		int n = ch.length / 2;
		for (int i = 1; i <= n; i++) {
			if (ch[i - 1] != ch[ch.length - i])
				return false;
		}
		return true;
	}

	public String ouHuiwenize() {
		String rts = str;
		int n = str.length();
		char[] ch = str.toCharArray();
		for (int i = 1; i <= n; i++) {
			rts = rts + ch[n - i];
		}
		return rts;
	}
	public String jiHuiwenize() {
		String rts = str;
		int n = str.length();
		char[] ch = str.toCharArray();
		for (int i = 1; i <= n-1; i++) {
			rts = rts + ch[n - i-1];
		}
		return rts;
	}
}
