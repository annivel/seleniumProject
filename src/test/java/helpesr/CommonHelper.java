package helpesr;

import pages.BasePage;

import java.io.IOException;

public class CommonHelper extends BasePage {
    public void appStop() {
        driver.quit();
    }
    public void takeScreenShot()  {
        driver.takeSnapShot();
    }
}
