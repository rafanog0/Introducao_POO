public class Principal {
    public static void main(String[] args) {
        BancoDeDados bd = new BancoDeDados();

        bd.inserirJogador(new Jogador("Jogador1", "Atacante", "TimeA", "Diamante"));
        bd.inserirJogador(new Jogador("Jogador2", "Defensor", "TimeB", "Ouro"));
        bd.inserirJogador(new Jogador("Jogador3", "Suporte", "TimeC", "Platina"));

        for (Jogador jogador : bd.getJogadores()) {
            jogador.imprimirDados();
        }
        try {
            Jogador jogador = bd.buscarPorId(7); // Exemplo de busca por ID
            System.out.println("Jogador encontrado: " + jogador.getNome());
        } catch (JogadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
