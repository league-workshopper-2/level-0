import java.net.URI;

import javax.swing.JOptionPane;

public class soundtrack {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What is your mood", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "Sad", "Pissed off" }, null);

		// 2. Their answer is stored in the userMood variable. Print it out.
		System.out.println(userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a
		// calming song from YouTube.
		if (userMood == 2) {
			playVideo("https://www.youtube.com/watch?v=CcsUYu0PVxY");
		}
		// 4. Play different songs for other moods.
if(userMood==1) {
	playVideo("https://www.youtube.com/watch?v=vVTP0DOL_2Q");
	}
if(userMood==0) {playVideo("https://www.youtube.com/watch?v=bM7SZ5SBzyY");}
		// If you are seeing ads at the beginning of your videos, install
		// Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * If you can’t think of any, here are some you can use...
 * bit.ly/video-for-happy bit.ly/video-for-sad bit.ly/video-for-angry
 **/
