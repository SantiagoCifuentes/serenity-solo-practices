package soloPractices;

import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import java.util.List;

public class CoursesListPageObject extends PageObject {

    public List<String> titles() {

        return  findAll(By.className("et_pb_module_header")).textContents();
    }

}
