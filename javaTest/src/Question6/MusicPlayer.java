package Question6;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MusicVO vo = new MusicVO();
		System.out.println("==== 뮤직 플레이어 ====");
		while (true) {
			System.out.print("1.등록 2.목록 3.삭제 4.전체삭제 5.종료 ");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("==== 등록 ====");
				System.out.print("제목 : ");
				String title = sc.next();
				vo.setTitle(title);
				System.out.print("가수 : ");
				String singer = sc.next();
				vo.setSinger(singer);
				System.out.print("시간 : ");
				int time = sc.nextInt();
				vo.setPlayTime(time);
			} else if (select == 2) {
				System.out.println("==== 노래 목록 ====");
				MusicController cn = new MusicController();
				ArrayList<MusicVO> list = cn.find();
				System.out.println(list.size());
				for (int i = 0; i < list.size(); i++) {
					System.out.print(i + 1 + ". 제목 : " + list.get(i).getTitle() + "\t");
					System.out.print("가수 : " + list.get(i).getSinger() + "\t");
					System.out.println("시간 : " + list.get(i).getPlayTime());
				}
			} else if (select == 3) {
				System.out.println("==== 노래 목록 ====");
				MusicController cn = new MusicController();
				ArrayList<MusicVO> list = cn.find();
				for (int i = 0; i < list.size(); i++) {
					System.out.print(i + 1 + ". 제목 : " + list.get(i).getTitle() + "\t");
					System.out.print("가수 : " + list.get(i).getSinger() + " \t");
					System.out.println("시간 : " + list.get(i).getPlayTime());
				}
				System.out.println("==== 노래 삭제 ====");
				System.out.print("삭제하고 싶은 노래 번호 입력 : ");
				int num = sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
					if (num == i + 1) {
						list.remove(i);
						System.out.println(list.get(i).getTitle() + " 노래를 삭제합니다.");
					}

				}
			} else if (select == 4) {
				System.out.println("==== 전체 노래 삭제 ====");
				MusicController cn = new MusicController();
				ArrayList<MusicVO> list = new ArrayList<MusicVO>();
				list.clear();
				System.out.println("전체 노래가 삭제되었습니다.");
			} else if (select == 5) {
				System.out.println("종료 되었습니다.");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요");
			}
		}

	}
	
	
}
