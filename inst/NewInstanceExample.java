package inst;

public class NewInstanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class clazz = Class.forName("inst.SendAction");
			
			Action action = (Action)clazz.newInstance();
			action.execute();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (InstantiationException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
