package manager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HelperCar extends HelperBase {
    public HelperCar(WebDriver wd) {
        super(wd);
    }

    public void submit() {
        click(By.xpath("//*[@type='submit']"));
    }

    public void searchCurrentMonth(String city, String dateFrom, String dateTo) {
        typeCity(city);
        click(By.id("dates"));
        //"9/10/2025","9/26/2025"
        click(By.xpath("//span[text()='10']"));
        click(By.xpath("//span[text()='26']"));
    }

    private void typeCity(String city) {
        type(By.id("city"), city);
        click(By.id("city-suggestions"));
    }
}


