import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.getSelectedRadio;
import static com.codeborne.selenide.Selenide.open;

public class OpenSearch {
    @Test
    void openSearchTest(){
         Selenide.open("https://ya.ru");
    }
}
