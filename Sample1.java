import java.io.*;

public class Sample1 {

	public static void main(String[] args) throws IOException
	{
		Human [] player = new Human [3];
		player [0] = new Hunter ();
		player [1] = new Warrior ();
		player [2] = new Mage ();
		
		String name1 = "";
		String name2 = "";
		String name3 = "";
		
		for (int i = 0 ; i < player.length ; i++) {
			
			System.out.println("請輸入玩家" + (i+1) + "的名字。");
			
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			String n1 = br.readLine();
			
			player [i].setName(n1);
			player [i].show();
			
			System.out.print("\n");
			
		}
		
		System.out.println("第一輪攻擊開始。");
		
		for (int i = 0 ; i <player.length ; i++) {
			
				
			switch (i){
				case 0:
					name1 = player [i].getName();
					name2 = player [i+1].getName();
					name3 = player [i+2].getName();
					break;
				case 1:
					name1 = player [i].getName();
					name2 = player [i+1].getName();
					name3 = player [i-1].getName();
					break;
				case 2:
					name1 = player [i].getName();
					name2 = player [i-1].getName();
					name3 = player [i-2].getName();
					break;
			}
			
			System.out.println("請" + name1 + "選擇要攻擊的人：" + name2 + "、" + name3);
			
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			String at1 = br.readLine();
			String at2;
			int at3;
						
			switch (i) {
				case 0:
					System.out.println("請" + name1 + "選擇武器：Fist按0, Default Blade按1, Fire Blade按2, Ice Blade按 3。");
					at2 = br.readLine();
					at3 = Integer.parseInt(at2);
					player[i].attack(at3, at1);
					boolean b1 = name2.equals(at1);
					boolean b2 = name3.equals(at1);
					if (b1 == true)
						player[i+1].BeAttacked(at3, at1);
					if (b2 == true)
						player[i+2].BeAttacked(at3, at1);
					break;
				case 1:
					System.out.println("請" + name1 + "選擇武器：Fist按0, Default Bow按4, Fire Bow按5, Ice Bow按6。");
					at2 = br.readLine();
					at3 = Integer.parseInt(at2);
					player[i].attack(at3, at1);
					boolean b3 = name2.equals(at1);
					boolean b4 = name3.equals(at1);
					if (b3 == true)
						player[i+1].BeAttacked(at3, at1);
					if (b4 == true)
						player[i-1].BeAttacked(at3, at1);
					break;
				case 2:
					System.out.println("請" + name1 + "選擇武器：Fist按0, Default Staff按7, Fire Staff按8, Ice Staff按9。");
					at2 = br.readLine();
					at3 = Integer.parseInt(at2);
					player[i].attack(at3, at1);
					boolean b5 = name2.equals(at1);
					boolean b6 = name3.equals(at1);
					if (b5 == true)
						player[i-1].BeAttacked(at3, at1);
					if (b6 == true)
						player[i-2].BeAttacked(at3, at1);
					break;
			}
					
		}
		
		System.out.println("第一輪攻擊結束。");
			
				
	}
	
}
