public class Warrior extends Human
{
	public final static int Default_Bow = 4 ;
	public final static int Fire_Bow = 5 ;
	public final static int Ice_Bow = 6 ;
	
	public Warrior() {
		
		Weapon = 4 ;
		
	}
	
	public void show () {
		
		System.out.println(name + "��¾�~�OWarrior�C");
	}
	
	public void attack (int Weapon, String at) {

		System.out.println(name + "��" + at +"�o�ʤF�����C");
		
		if (Weapon == 0) {
			super.attack(Weapon, at);
		}
		else {
		switch (Weapon) {
			
			case 4:
				System.out.println("Arrow!");
				EXP += 15 ;
				System.out.println(name + "���g���+15!");
				super.ShowState();
				break;
			
			case 5:
				System.out.println("Fire Arrow!");
				EXP += 20 ;
				System.out.println(name + "���g���+20! MP-10!");
				MP -= 10 ;
				super.ShowState();
				break;
				
			case 6:
				System.out.println("Ice Arrow!");
				EXP += 30 ;
				System.out.println(name + "���g���+30! MP-20!");
				MP -= 20 ;
				super.ShowState();
				break;	
		}
		}
	
	}
}
