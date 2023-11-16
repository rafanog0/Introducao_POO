import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

class SiteWeb implements Serializable {
    private static final long serialVersionUID = 1L;
    private String descricao;
    private String url;
    private String dataCadastro;

    public SiteWeb(String descricao, String url, String dataCadastro) {
        this.descricao = descricao;
        this.url = url;
        this.dataCadastro = dataCadastro;
    }

}

class GerenciadorSiteWeb {
    private int proximoId = 1;
    private String diretorioDados;

    public GerenciadorSiteWeb(String diretorioDados) {
        this.diretorioDados = diretorioDados;
    }

    public void adicionarSiteWeb(SiteWeb site) throws IOException {
        String nomeArquivo = diretorioDados + File.separator + proximoId + ".data";
        try (ObjectOutputStream saida = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            saida.writeObject(site);
        }
        proximoId++;
    }
}

public class AplicativoRegistroSiteWeb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorSiteWeb gerenciador = new GerenciadorSiteWeb("dados");

        while (true) {
            System.out.println("1. Adicionar Site\n2. Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite a Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    String dataAtual = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                    SiteWeb site = new SiteWeb(descricao, url, dataAtual);
                    try {
                        gerenciador.adicionarSiteWeb(site);
                        System.out.println("Site adicionado com sucesso.");
                    } catch (IOException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
