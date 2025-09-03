package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchCarTests extends TestBase{

@Test
    public void searchCurrentMonthSuccess(){
    app.getHelperCar().searchCurrentMonth("Haifa","9/10/2025","9/26/2025");
    app.getHelperCar().submit();
    //Assert.assertTrue(app.getHelperCar().isListOfCarsAppeared());
}

}
