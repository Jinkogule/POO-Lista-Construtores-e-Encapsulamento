public class Ex3_main {
    public static void main(String[] args) {

        Disciplina Matemática = new Disciplina("Matemática");
        Matemática.setCarga_horaria(68);

        Disciplina Geografia = new Disciplina("Geografia");
        Geografia.setCarga_horaria(68);

        Disciplina História = new Disciplina("História");
        História.setCarga_horaria(68);
        História.setHorarioAula("16:00h");
        System.out.println("Horário da aula de história: "+História.getHorarioAula());

        Aluno Lucas = new Aluno("Lucas");
        Lucas.AddHistorico(Matemática, 10);
        Lucas.AddHistorico(Geografia, 8);
        Lucas.AddHistorico(História, 9);

        System.out.print("Histórico Lucas: ");
        System.out.println(Lucas.getHistorico());

        System.out.print("CR Lucas: ");
        Lucas.calculaCR(Matemática, 10);
        Lucas.calculaCR(Geografia, 8);
        Lucas.calculaCR(História, 9);
        System.out.println(Lucas.getCR());

        Turma turma1 = new Turma(20);
        turma1.setMedia_da_turma(8);
        turma1.setMedia_aluno(Lucas, 6);
        System.out.print("Média de Lucas em relação ao resto da turma: ");
        System.out.println(turma1.getMediaDoAlunoNaTurma(Lucas));

        Disciplina Arquiteturas_de_comp = new Disciplina("Arquiteturas de Computadores");
        System.out.print("Ementa de Arquiteturas de Computadores: ");
        Arquiteturas_de_comp.setEmenta("*bastante coisa*");
        System.out.println(Arquiteturas_de_comp.getEmenta());
    }
}
