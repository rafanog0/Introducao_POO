import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private List<Jogador> jogadores;

    public BancoDeDados() {
        jogadores = new ArrayList<>();
    }

    public void inserirJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }
    public Jogador buscarPorId(int id) throws JogadorNaoEncontradoException {
        Optional<Jogador> resultado = jogadores.stream()
        .filter(jogador -> jogador.getId() == id)
        .findFirst();

        if (resultado.isPresent()) {
            return resultado.get();
        } else {
            throw new JogadorNaoEncontradoException("Jogador com ID " + id + " não foi encontrado.");
        }
    }
}
