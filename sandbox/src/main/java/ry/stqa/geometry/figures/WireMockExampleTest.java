import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WireMockExampleTest {

    private WireMockServer wireMockServer;

    @BeforeEach
    public void setUp() {
        wireMockServer = new WireMockServer(8080); // Запускаем сервер на порту 8080
        wireMockServer.start();

        configureFor("localhost", 8080);
    }

    @AfterEach
    public void tearDown() {
        wireMockServer.stop();
    }

    @Test
    public void testWireMock() {
        // Настраиваем мок
        stubFor(get(urlEqualTo("/api/test"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{ \"message\": \"Hello, WireMock!\" }")));

        // Отправляем запрос на мок-сервер
        String response = RequestHelper.sendGet("http://localhost:8080/api/test");

        // Проверяем ответ
        assertEquals("{ \"message\": \"Hello, WireMock!\" }", response);
    }
}
