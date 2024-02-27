package test;

import org.testng.annotations.Test;

import baseurl.NurseryliveBaseurl;
import page.AddToCart;
import page.Cart;
import page.CreateAccount;
import page.HomePage;
import page.Login;
import page.Searchfield;
import utilities.Excelutilities;

public class NurseryliveTest extends NurseryliveBaseurl {
	
	@Test(enabled=false)
	public void test()
	{
		CreateAccount ob1=new CreateAccount(driver);
		ob1.CreateAcc();
	}

	@Test(enabled=false)
	public void test1()
	{
		Login ob1=new Login(driver);
		ob1.login();
		String file=("C:\\Users\\Sarima\\Downloads\\Nuserylivelogin.xlsx");
		String sheet=("Sheet1");
		
		
		
		int rowCount=	Excelutilities.getRowCount(file,sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String username=Excelutilities.getCellValue(file, sheet, i, 0);
			String pswd=Excelutilities.getCellValue(file, sheet, i, 1);
		
			ob1.SetValues(username,pswd);
			ob1.loginclick();
		}
	}
	
	
	@Test(enabled=false)
	public void test2()
	{
		HomePage ob=new HomePage(driver);
		ob.Catagories();
		ob.Scrolldown1();
		ob.Scrolldownoffers();
		Searchfield ob1=new Searchfield(driver);
		ob1.CategoriesDropdown();
		
		String file=("C:\\Users\\Sarima\\Downloads\\Nuserylivesearch.xlsx");
		String sheet=("Sheet1");
		
		
		
		int rowCount=	Excelutilities.getRowCount(file,sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String inputs=Excelutilities.getCellValue(file, sheet, i, 0);
			
		
			ob1.Search(inputs);
			ob1.Searchicon();
		}
	}
	
	@Test
	public void test3()
	{
		AddToCart ob=new AddToCart(driver);
		//ob.VegPlants();
		ob.Seed();
		ob.FloweringPlants();
		Cart ob1=new Cart(driver);
		ob1.Cartitems();
		
		
	}
	
	
}
