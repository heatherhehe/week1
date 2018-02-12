public class Human {

	protected String name ;
	protected int HP ;
	protected int MP ;
	protected int EXP ;
	protected int LV ;
	protected int Weapon ;
	
	public Human () {
		
		HP = 100 ;
		MP = 100 ;
		EXP = 0 ;
		LV = 1 ;
		Weapon = 0 ;
		
	}
		
	public void setName (String n1) {
		
		name = n1;
		System.out.println("歡迎" + name + "加入這個遊戲!");
	}
	
	public String getName() {
		return name;
	}
	public void show () {
		
	}
	
	public void attack (int Weapon, String at) {

		if (Weapon == 0) {
			System.out.println("Fist Attack!");
			EXP += 10 ;
			System.out.println(name + "的經驗值+10!");
			ShowState();
			System.out.print("\n");
		}
	}
	
	public void BeAttacked (int Weapon, String at) {
		System.out.println(at + "遭受攻擊。");
		switch (Weapon) {
			case 0:
				HP -= 10;
				System.out.println(at + "的HP-10!");
				ShowState();
				System.out.print("\n");
				break;
			case 1:
			case 4:
			case 7:
				HP -= 20;
				System.out.println(at + "的HP-20!");
				ShowState();
				System.out.print("\n");
				break;
			case 2:
			case 5:
			case 8:
				HP -= 30;
				System.out.println(at + "的HP-30!");
				ShowState();
				System.out.print("\n");
				break;
			case 3:
			case 6:
			case 9:
				HP -= 35;
				System.out.println(at + "的HP-35!");
				ShowState();
				System.out.print("\n");
				break;
				
		}
	}
	
	public void dead () {
		System.out.print(name + "死亡，結束遊戲。");
	}
	
	public void UpGrade () {
		if (EXP >= 50) {
			LV++ ;
			System.out.println(name + "升等為第" + LV + "級");
			EXP = 0 ;
			HP += 100 ;
			MP += 50;
		}
	}
	
	public void ShowState() {
		System.out.println(name + "目前HP為" + HP + ", MP為" + MP + ", 經驗值為" + EXP + ", 等級為" + LV + "。\n");
	}
	
}


