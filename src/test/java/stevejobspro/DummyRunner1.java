package stevejobspro;

public class DummyRunner1 {

	public static void main(String[] args)
	{
		//create object to interface using concrete class
		Dummy obj=new Dummy()
		{
			public void display()
			{
				System.out.println("hi");
			}

		};
        obj.display();
	}

}
