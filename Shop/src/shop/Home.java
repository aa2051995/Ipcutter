package shop;

public class Home extends Thread {
  @Override
public void run() {

	super.run();
}
	public static void main(String[] args) {
		
		String hh = new String("hello");
		if(hh.equals( "hello"))
			System.out.println("hello");
		String myip = args[0];
		IPCutter cutter = new IPCutter();
		int subs[] = cutter.getSubs(myip);
		for(int sub :subs)
			System.out.println(sub);
//		Home home = new Home();
//		home.run();
	}

}
