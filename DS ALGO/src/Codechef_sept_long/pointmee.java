package Codechef_sept_long;
import java.util.*;

public class pointmee {
	static int maxx = 0;
	static int maxy = 0;
	
	//check for the case to be used
	public static int check(int xx, int yy, int kk, int step) {
		
		
		if(xx < maxx && yy == maxy) {
			xx = xx + kk;
			step += 1;
			return 1;
			
		}
		else if(xx == maxx && yy < maxy) {
			yy = yy + kk;
			step += 1;
			return 2;
			
			
		}
		else if(xx < maxx && yy < maxy) {
			xx = xx + kk;
			yy = yy + kk;
			step += 1;
			return 3;
			
		}
		else if(xx < maxx && yy > maxy) {
			xx = xx + kk;
			yy = yy + kk; // coz if maxx - y will give a negative integer, then adding that to y will give maxx.
			step += 1;
			return 4;
			
		}
		else {
			return 0;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int step = 0;
		try {
			int t = ob.nextInt();
			while(t-- > 0) {
				List<Integer> xlist = new ArrayList<>();
				List<Integer> ylist = new ArrayList<>();
				
				int N = ob.nextInt();
				for(int i = 0; i < N; i++)
				{
					xlist.add(ob.nextInt());	
				}
				for(int i = 0; i < N; i++)
				{
					ylist.add(ob.nextInt());	
				}
				for(int i = 0; i < N; i++)
				{
					if(xlist.get(i) == ylist.get(i)) 
					{
						maxx = xlist.get(i);
						maxy = ylist.get(i);
					}
				}
				//System.out.println(maxx + " "+ maxy);
				int k = 0;
				for(int i = 0; i < N; i++)
				{
					int x = xlist.get(i);
					int y = ylist.get(i);
					k = maxx - x;
					while(x == maxx && y == maxy) {
						step = check(x, y, k, step);
						
					}
				
				}
				
				System.out.println(step);
			}
			
		}catch(Exception E) {
			return;
		}
		
	}

}
