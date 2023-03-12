package Question6;

import java.util.ArrayList;

public class MusicController {

	public ArrayList<MusicVO> find() {
		MusicVO vo = new MusicVO();

		while (true) {
			ArrayList<MusicVO> list = new ArrayList<MusicVO>();
			String title = vo.getTitle();
			String singer = vo.getSinger();
			int playtime = vo.getPlayTime();
			vo = new MusicVO(title, singer, playtime);

			list.add(vo);
			return list;
		}

	}
}