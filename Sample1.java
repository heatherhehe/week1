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
			
			System.out.println("�п�J���a" + (i+1) + "���W�r�C");
			
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			String n1 = br.readLine();
			
			player [i].setName(n1);
			player [i].show();
			
			System.out.print("\n");
			
		}
		
		System.out.println("�Ĥ@�������}�l�C");
		
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
			
			System.out.println("��" + name1 + "��ܭn�������H�G" + name2 + "�B" + name3);
			
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			String at1 = br.readLine();
			String at2;
			int at3;
						
			switch (i) {
				case 0:
					System.out.println("��" + name1 + "��ܪZ���GFist��0, Default Blade��1, Fire Blade��2, Ice Blade�� 3�C");
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
					System.out.println("��" + name1 + "��ܪZ���GFist��0, Default Bow��4, Fire Bow��5, Ice Bow��6�C");
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
					System.out.println("��" + name1 + "��ܪZ���GFist��0, Default Staff��7, Fire Staff��8, Ice Staff��9�C");
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
		
		System.out.println("�Ĥ@�����������C");
			
				
	}
	
}
