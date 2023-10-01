package Telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListagemDeProdutoTela extends BaseTela{

    public ListagemDeProdutoTela(WebDriver app) {
        super(app);

    }



    public FormularioDeAdicaoDeProdutosTela abrirTelaAdicaoProdutos() {
        app.findElement(By.id("com.lojinha:id/floatingActionButton")).click();

        return new FormularioDeAdicaoDeProdutosTela(app);
    }

}
