public class Principal {
    public static void main(String[] args) {
        BancoDeDados bd = new BancoDeDados();

        bd.inserirJogador(new Jogador("Jogador1", "Atacante", "TimeA", "Diamante"));
        bd.inserirJogador(new Jogador("Jogador2", "Defensor", "TimeB", "Ouro"));
        bd.inserirJogador(new Jogador("Jogador3", "Suporte", "TimeC", "Platina"));

        for (Jogador jogador : bd.getJogadores()) {
            jogador.imprimirDados();
        }
    }
}
