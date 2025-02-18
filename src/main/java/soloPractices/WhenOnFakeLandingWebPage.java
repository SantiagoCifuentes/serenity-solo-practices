package soloPractices;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.assertj.core.api.Assertions.assertThat;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenOnFakeLandingWebPage {

    @Managed
    WebDriver webDriver;



    FakeLandingPage fakeLandingPage;

    @Test
    public void titleIsDisplayingAsExpected(){


        webDriver.get("https://ultimateqa.com/fake-landing-page#");

        Serenity.reportThat("The title is displaying with the correct value",
                () -> assertThat(fakeLandingPage.getTitleText())
                        .isEqualToIgnoringCase("Learn to Code Websites, Apps & Games"));
    }

}
