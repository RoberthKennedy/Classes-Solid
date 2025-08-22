
public class SistemaDeMensagens {
    private SaudacaoService saudacaoService;
    
    public SistemaDeMensagens() {
        this.saudacaoService = new SaudacaoService();
    }
    public void processarMensagem() {
        String mensagem = saudacaoService.gerarSaudacao();
        System.out.println(mensagem);
    }
}
