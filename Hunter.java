public class Hunter extends Human
{
	public final static int Default_Blade = 1 ;
	public final static int Fire_Blade = 2 ;
	public final static int Ice_Blade = 3 ;
	
	public Hunter() {
		
		Weapon = 1 ;
		
	}
	
	public void show () {
		
		System.out.println(name + "��¾�~�OHunter�C");
	}
	
	public void attack (int Weapon, String at ) {

		System.out.println(name + "��" + at +"�o�ʤF�����C");
		
		if (Weapon == 0) {
			super.attack(Weapon, at);
		}
		else {
		switch (Weapon) {
			
			case 1:
				System.out.println("Slash!");
				EXP += 15 ;
				System.out.println(name + "���g���+15!");
				super.ShowState();
				break;
			
			case 2:
				System.out.println("Fire Slash!");
				EXP += 20 ;
				System.out.println(name + "���g���+20! MP-10!");
				MP -= 10 ;
				super.ShowState();
				break;
				
			case 3:
				System.out.println("Ice Slash!");
				EXP += 30 ;
				System.out.println(name + "���g���+30! MP-20!");
				MP -= 20 ;
				super.ShowState();
				break;	
		}
		}
	
	}
	
}
