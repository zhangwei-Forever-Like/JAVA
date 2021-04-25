package day05;

public class MusicianTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument i = new Instrument();
		Instrument e = new Erhu();
		Instrument p = new Piano();
		Instrument v = new Violin();
		Musician m = new Musician();
		m.play(i);
		m.play(e);
		m.play(p);
		m.play(v);
	}

}
