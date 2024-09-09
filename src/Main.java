import controller.TelaVotacaoCtrl;
import model.EnqueteSimples;
import view.TelaResultado;
import view.TelaResultadoPercentual;
import view.TelaVotacao;

public class Main {
    public static void main(String[] args) {

        EnqueteSimples enquete = new EnqueteSimples();
        enquete.addOpcao("League Of Legends");
        enquete.addOpcao("Dota");
        enquete.addOpcao("Valorant");
        enquete.addOpcao("Minecraft");
        enquete.addOpcao("Roblox");

        TelaResultado telaResultado = new TelaResultado();
        TelaResultadoPercentual telaPercentual = new TelaResultadoPercentual();
        TelaVotacaoCtrl controller = new TelaVotacaoCtrl(enquete);
        
        enquete.addEnqueteListener(telaResultado);
        enquete.addEnqueteListener(telaPercentual);

        TelaVotacao telaVotacao = new TelaVotacao(enquete, controller);

        telaResultado.setVisible(true);
        telaPercentual.setVisible(true);
        telaVotacao.setVisible(true);
    }
}
