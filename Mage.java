public class Mage extends Human
{
	public final static int Default_Staff = 7 ;
	public final static int Fire_Staff = 8 ;
	public final static int Ice_Staff = 9 ;

	
	public Mage() {
		
		Weapon = 7 ;
		
	}
	
	public void show () {
		
		System.out.println(name + "��¾�~�OMage�C");
	}
	
	public void attack (int Weapon, String at) {

		System.out.println(name + "��" + at +"�o�ʤF�����C");
		
		if (Weapon == 0) {
			super.attack(Weapon, at);
		}
		else {
		switch (Weapon) {
			
			case 7:
				System.out.println("Arcane Missiles!");
				EXP += 15 ;
				System.out.println(name + "���g���+15!");
				super.ShowState();
				break;
			
			case 8:
				System.out.println("Fireball!");
				EXP += 20 ;
				System.out.println(name + "���g���+20! MP-10!");
				MP -= 10 ;
				super.ShowState();
				break;
				
			case 9:
				System.out.println("Frostbolt!");
				EXP += 30 ;
				System.out.println(name + "���g���+30! MP-20!");
				MP -= 20 ;
				super.ShowState();
				break;	
		}
		}
	
	}
	
}