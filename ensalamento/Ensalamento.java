public class Ensalamento
{
    public Pessoa p;
    public Aluno a;
    public Professor prof;

    Ensalamento(Pessoa p, Aluno a, Professor prof)
    {
        this.p = p;
        this.a = a;
        this.prof = prof;
    }
    public exec()
    {
        String[] nomes = {"Alfredo", "Peterson", "Wendel", "Ian", "Debra", "Luana", "Bruno", "Romeu", "Julieta", "Maria", "Capitú", "Bentinho", "Amélia"};


        Curso c1 = new Curso("TI");
        Curso c2 = new Curso("ADM");

        Disciplina d1 = new Disciplina("POO");
        Disciplina d2 = new Disciplina("ED");
        Disciplina d3 = new Disciplina("BI");
        
        Pessoa[nomes.length() + 3] pessoas = new Pessoa;

        for(int i = 0; i < nomes.length() + 3; i++)
        {
            pessoas[i].nome = nomes[i];
        }


        Professor mia = new Professor(d1);
        Professor saulo = new Professor(d2);
        Professor paula = new Professor(d3);

        for(int i = 0; i < nomes.length(); i++)
        {
            if(i % 2 == 0)
            {
                Aluno a = new Aluno(c1);
                Ensalamento e = new Ensalamento(pessoas[i], a, mia);       
            }
        }



    }
}