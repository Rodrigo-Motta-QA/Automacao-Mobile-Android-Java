package Modulos.Produtos;

import Telas.LoginTela;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

@DisplayName("Teste mobile módulo de produto")
public class ProdutoTest {

    private WebDriver app;

    @BeforeEach
    public void beforeEach() throws MalformedURLException {
        DesiredCapabilities capacidades = new DesiredCapabilities();
        capacidades.setCapability("appium:deviceName","Google Pixel 3_1");
        capacidades.setCapability("appium:platformName","Android");
        capacidades.setCapability("appium:udid","192.168.100.102:5555");
        capacidades.setCapability("appium:appPackage","com.lojinha");
        capacidades.setCapability("appium:appActivity","com.lojinha.ui.MainActivity");
        capacidades.setCapability("appium:app","E:\\Ambiente\\Lojinha+Android+Nativa\\lojinha-nativa.apk");

        this.app = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capacidades);
        this.app.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

    }

    @DisplayName("Validação de valor de produto não permitido")
    @Test
    public void testvalidacaoDoValorDeProdutoNaoPermitido() {
        // Abrir o app
        String mensagemApresentada = new LoginTela(app)
                .preencherUsiario("admin")
                .preencherSenha("admin")
                .submeterLogin()
                .abrirTelaAdicaoProdutos()
                .preencherNomeProduto("BlackStar PEN")
                .preencherValorProduto("000")
                .PreencherProdutoCores("God Aid")
                .SubmissaoComErro()
                .obterMensagemDeErro();

        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00",mensagemApresentada);
    }
    @AfterEach
    public void afterEach() {
        app.quit();
    }
}
// Fazer Logim 1º

// vou definir um tempo para carregamento 2º

// Abrir o formulário de novo produto 3º

//Cadastrar um produto com valor inválido 4º

// validar que a mensagem de valor invalido foi apresentada 5º
