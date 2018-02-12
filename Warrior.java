public class Warrior extends Human
{
	public final static int Default_Bow = 4 ;
	public final static int Fire_Bow = 5 ;
	public final static int Ice_Bow = 6 ;
	
	public Warrior() {
		
		Weapon = 4 ;
		
	}
	
	public void show () {
		
		System.out.println(name + "的職業是Warrior。");
	}
	
	public void attack (int Weapon, String at) {

		System.out.println(name + "對" + at +"發動了攻擊。");
		
		if (Weapon == 0) {
			super.attack(Weapon, at);
		}
		else {
		switch (Weapon) {
			
			case 4:
				System.out.println("Arrow!");
				EXP += 15 ;
				System.out.println(name + "的經驗值+15!");
				super.ShowState();
				break;
			
			case 5:
				System.out.println("Fire Arrow!");
				EXP += 20 ;
				System.out.println(name + "的經驗值+20! MP-10!");
				MP -= 10 ;
				super.ShowState();
				break;
				
			case 6:
				System.out.println("Ice Arrow!");
				EXP += 30 ;
				System.out.println(name + "的經驗值+30! MP-20!");
				MP -= 20 ;
				super.ShowState();
				break;	
		}
		}
	
	}
}
