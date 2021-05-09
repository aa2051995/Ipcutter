package shop;

public class Home {

	public static void main(String[] args) {
		String myip = args[0];
		IPCutter cutter = new IPCutter();
		int subs[] = cutter.getSubs(myip);
		for(int sub :subs)
			System.out.println(sub);
	}

}
