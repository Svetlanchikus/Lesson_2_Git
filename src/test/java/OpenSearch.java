import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class OpenSearch {
    @Test
    void openSearchTest(){
        open("https://google.com");

    }
}
