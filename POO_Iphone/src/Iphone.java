public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void ligar (String numero) {
        System.out.println("Ligando para " + numero + "..." );
    };
    public void atender (String numero) {
        System.out.println("Atendendo chamada de " + numero + "...");
    };
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz..");
    };


    public void exibirPagina() {
        System.out.println("Exibindo página: " + url);
    };
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    };
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    };


    public void tocar() {
        System.out.println("Tocando música...");
    };
    public void pausar() {
        System.out.println("Música pausada.");
    };
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada " + musica);
    };
    
}