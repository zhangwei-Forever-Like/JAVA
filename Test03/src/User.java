
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("用户选择了GIF格式");
		ImageSaver saver = TypeChooser.getSaver("GIF");
		saver.save();
		System.out.println("用户选择了JPEG格式");
		saver = TypeChooser.getSaver("JPEG");
		saver.save();
		System.out.println("用户选择了PNG格式");
		saver = TypeChooser.getSaver("PNG");
		saver.save();
	}

}
