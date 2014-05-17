

//import com.pTricKg.drawings.Drawing;
import com.pTricKg.drawings.DrawingWide;
import com.pTricKg.frames.ArtFrame;

class ShowFrame {
	
	public static void main(String args[]) {
		ArtFrame artFrame = new ArtFrame(new DrawingWide());
		
		artFrame.setSize(200, 100);
		artFrame.setVisible(true);
		}
}
