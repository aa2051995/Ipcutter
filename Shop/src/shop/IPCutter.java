package shop;

public class IPCutter {

	public int [] getSubs(String IP) {
		String [] subs = IP.split("\\.");
		int subs_data [] = new int[subs.length];
		for(int i=0; i<subs.length;i++ ) {
			subs_data[i] = Integer.parseInt(subs[i]);
		}
		return subs_data;
				
	}
}
