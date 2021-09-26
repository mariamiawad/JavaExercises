package hackerRank;

public class Comparator {
	class Player {
		String name;
		int score;

		Player(String name, int score) {
			this.name = name;
			this.score = score;
		}
	}

	class Checker implements java.util.Comparator<Player> {
		// complete this method
		public int compare(Player a, Player b) {
			if (a.score < b.score) {
				return 1;
			}

			else if (a.score > b.score) {
				return -1;
			} else {
				if (a.name.charAt(0) > b.name.charAt(0)) {
					return 1;
				} else if (a.name.charAt(0) < b.name.charAt(0)) {
					return -1;
				} else {
					return 0;
				}
			}
		}
	}
}
