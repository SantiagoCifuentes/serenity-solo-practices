package soloPractices;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;
import java.util.stream.Collectors;

public class FakeLandingPage extends PageObject {

    public String getTitleText() {
        return find(".et_pb_text_inner h1").getText().trim();
    }

//    public String getFirstTitle() {
//        return find(".et_pb_text_inner h1").getText();
//    }

//    public List<String> getAllTitles() {
//        return findAll(".et_pb_text_inner h1")
//                .stream()
//                .map(WebElementFacade::getText)
//                .collect(Collectors.toList());
//    }



//List<WebElementFacade> elements = findAll(".et_pb_text_inner h1");
//for (WebElementFacade element: elements) {
//        System.out.println("Título: " + element.getText());
//    }

}
