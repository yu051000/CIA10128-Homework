package hw7;

public class RoleGameTest {  //實作
	
	public static void main(String[] args) {
		
		Hero[] hero = new Hero[2];
		hero[0] = new ArrowMan("亞拉岡", 1, 0);
		hero[1] = new SwordMan("勒苟拉斯", 1, 0);
		
		for (int j = 0; j < hero.length; j++) {
			hero[j].setFaceMove(new FaceMove2());
			hero[j].setFaceDefend(new FaceDefend2());
			System.out.println("技能列表：\n");
			hero[j].attack();
			hero[j].move();
			hero[j].defend();
			System.out.println("==========================");
		}
		
	}
}
