package Telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioDeAdicaoDeProdutosTela extends BaseTela {

    public FormularioDeAdicaoDeProdutosTela(WebDriver app) {
       super(app);
    }



    public FormularioDeAdicaoDeProdutosTela preencherNomeProduto(String produtoNome) {
        app.findElement(By.id("com.lojinha:id/productName")).click();
        app.findElement(By.id("com.lojinha:id/productName")).findElement(By.id("com.lojinha:id/editText")).sendKeys(produtoNome);

        return this;

    }

    public FormularioDeAdicaoDeProdutosTela preencherValorProduto(String produtoValor) {
        app.findElement(By.id("com.lojinha:id/productValue")).click();
        app.findElement(By.id("com.lojinha:id/productValue")).findElement(By.id("com.lojinha:id/editText")).sendKeys(produtoValor);

        return this;

    }

    public FormularioDeAdicaoDeProdutosTela PreencherProdutoCores(String ProdutoCores) {
        app.findElement(By.id("com.lojinha:id/productColors")).click();
        app.findElement(By.id("com.lojinha:id/productColors")).findElement(By.id("com.lojinha:id/editText")).sendKeys(ProdutoCores);

        return this;

    }

    public FormularioDeAdicaoDeProdutosTela SubmissaoComErro() {
        app.findElement(By.id("com.lojinha:id/saveButton")).click();

        return this;
    }

    public String obterMensagemDeErro() {
      return capturarToast();


    }


}
