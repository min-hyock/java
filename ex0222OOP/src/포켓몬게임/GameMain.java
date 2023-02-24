package 포켓몬게임;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 실행하는 공간

		Pokemon pika = new Pokemon("피카츄", "전기", "백만볼트", 2500, 250);

		Pokemon kkobuk = new Pokemon("꼬부기", "물", "물대포", 1000, 150);

		while (true) {

			System.out.println("포켓몬을 선택하세요");
			System.out.print("[1]피카츄 [2]꼬부기 >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				// 사용자가 피카츄를 선택
				// 피카츄가 꼬부기를 공격
				System.out.println();
				System.out.println("공격을 선택하세요");
				System.out.print("[1]일반 공격 [2]스킬 >>");
				int choiceAtk = sc.nextInt();
				// 1. 일반 공격을 선택했다면, 꼬부기의 hp를 피카츄의 atk만큼 감소
				// 2. 두마리 포켓몬의 hp 출력
				if (choiceAtk == 1) {
					kkobuk.setHp(kkobuk.getHp() - pika.getAtk());
					System.out.println("꼬부기 HP : " + kkobuk.getHp() + "\n" + "피카츄 HP : " + pika.getHp());
					System.out.println();
				} else if (choiceAtk == 2) {
					// 3. 스킬을 선택했다면, 꼬부기의 hp를 피카츄의 atk * 1.5 만큼 감소
					// 4. 피카츄의 스킬 출력
					// 5. 두마리 포켓몬의 hp 출력
					kkobuk.setHp(kkobuk.getHp() - (int) (pika.getAtk() * 1.5));
					System.out.println("⚡⚡⚡ " + pika.getSkill() + " ⚡⚡⚡");
					System.out.println("꼬부기 HP : " + kkobuk.getHp() + "\n" + "피카츄 HP : " + pika.getHp());
					System.out.println();
				}

			} else if (choice == 2) {
				// 사용자가 꼬부기를 선택
				// 꼬부기가 피카츄를 공격
				System.out.println();
				System.out.println("공격을 선택하세요");
				System.out.print("[1]일반 공격 [2]스킬 >>");
				int choiceAtk = sc.nextInt();
				if (choiceAtk == 1) {
					// 1. 일반 공격을 선택했다면, 피카츄의 hp를 꼬부기의 atk만큼 감소
					// 2. 두마리 포켓몬의 hp 출력
					pika.setHp(pika.getHp() - kkobuk.getAtk());
					System.out.println("꼬부기 HP : " + kkobuk.getHp() + "\n" + "피카츄 HP : " + pika.getHp());
					System.out.println();
				} else if (choiceAtk == 2) {
					// 3. 스킬을 선택했다면, 피카츄의 hp를 꼬부기의 atk * 1.5 만큼 감소
					// 4. 꼬부기의 스킬 출력
					// 5. 두마리 포켓몬의 hp 출력
					pika.setHp(pika.getHp() - (int) (kkobuk.getAtk() * 1.5));
					System.out.println("💦💦💦 " + kkobuk.getSkill() + " 💦💦💦");
					System.out.println("꼬부기 HP : " + kkobuk.getHp() + "\n" + "피카츄 HP : " + pika.getHp());
					System.out.println();
				}

			} else {
				System.out.println("잘못된 숫자를 입력하셨습니다.");
				System.out.println();
			}
			// 6. 둘중 한마리의 hp가 0보다 작거나 같았을 때 프로그램 종료 !
			// 7. 승자가 누구인지 출력
			if (pika.getHp() <= 0) {
				System.out.println();
				System.out.println(" ★ WINNER ★ >>  꼬부기 🐢");
				break;
			} else if (kkobuk.getHp() <= 0) {
				System.out.println();
				System.out.println(" ★ WINNER ★ >>  피카츄 🐭");
				break;
			}
		}

	}

}
