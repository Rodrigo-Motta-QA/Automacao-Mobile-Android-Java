package Telas;

import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTela extends BaseTela {

    public LoginTela(WebDriver app){
        super(app);
    }

    public LoginTela preencherUsiario(String usuario) {
        app.findElement(By.id("com.lojinha:id/user")).click();
        app.findElement(By.id("com.lojinha:id/user")).findElement(By.id("com.lojinha:id/editText")).sendKeys(usuario);

        return this;

    }

    public LoginTela preencherSenha(String senha) {
        app.findElement(By.id("com.lojinha:id/user")).click();
        app.findElement(By.id("com.lojinha:id/password")).findElement(By.id("com.lojinha:id/editText")).sendKeys(senha);

        return this;

    }

    public ListagemDeProdutoTela submeterLogin() {
        app.findElement(By.id("com.lojinha:id/loginButton")).click();

        return new ListagemDeProdutoTela(app);

    }
}
