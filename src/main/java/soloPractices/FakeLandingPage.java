package soloPractices;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;
import java.util.stream.Collectors;

public class FakeLandingPage extends PageObject {

    public String getTitleText() {
        return find(".et_pb_text_inner h1").getText().trim();
    }




}
