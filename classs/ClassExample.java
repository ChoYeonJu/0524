package classs;

public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("현대", "조연주");
		
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		try {
			Class class2 = Class.forName("classs.Car");
			System.out.println(class2.getName());
			System.out.println(class2.getSimpleName());
			System.out.println(class2.getPackage().getName());
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
