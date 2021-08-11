import java.util.Scanner;
class Student
	{
    static int roll=m1();
	static String name=m2();
	static float marks=m3();
    public static void main(String[] args) 
	{
		System.out.println("Student Roll Number :"+roll);
		System.out.println("Student Name :"+name);
		System.out.println("subject marks of student :"+marks);
    }
    public static int m1()
    {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll Number");
		int roll = sc.nextInt();
        return roll;
    }
	public static String m2()
		{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = sc.nextLine();
		return name;
		}
	public static float m3()
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		float marks = sc.nextFloat();
		return marks;
		}

    }