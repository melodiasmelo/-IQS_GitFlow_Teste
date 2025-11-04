public class LoginFeature {

    public void login() {
        System.out.println("Usuário autenticado com sucesso!");
    }

    public static void main(String[] args) {
        LoginFeature feature = new LoginFeature();
        feature.login();
    }
}