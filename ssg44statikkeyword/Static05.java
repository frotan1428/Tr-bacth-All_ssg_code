package Stattic;// A java program to demonstrate use of
// static keyword with methods and variables


// Student class
class Static05 {
	String isim;
	int id;
	// static variable
	static String okulIsimi;

	// static counter to set unique roll no
	static int counter = 0;


	public int setId() {
		counter++;
		return counter;
	}

	public Static05(String name)
	{
		this.isim = name;

		this.id = setId();
	}

	// getting unique rollNo
	// through static variable(counter)


	// static method
	public static void setOkulIsimi(String isim) {
		okulIsimi = isim;
	}

	// instance method
	public void getStudentInfo()
	{
		System.out.println("OgrenciId : " + id);
		System.out.println("OgrenciIsim : " + isim);


		// accessing static variable
		System.out.println("OkulIsimi : " + okulIsimi);
	}



	public static void main(String[] args)
	{
		// calling static method
		// without instantiating Student class
		Static05.setOkulIsimi("Yildiz okulu");

		Static05 s1 = new Static05("Fatih");
		Static05 s2 = new Static05("elif");
		Static05 s3 = new Static05("Karim");

		s1.getStudentInfo();
		s2.getStudentInfo();
		s3.getStudentInfo();
	}
}
