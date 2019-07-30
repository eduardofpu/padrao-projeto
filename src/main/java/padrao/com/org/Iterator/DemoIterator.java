package padrao.com.org.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoIterator {
    public static void main(String[] args) {

        ArrayList<AlunoVO> listaAluno = new ArrayList<AlunoVO>();

        AlunoVO aluno = null;

        /**Alimentando a coleção com objetos AlunoVO**/
        for(int i = 0; i<10; i++){
            listaAluno.add(new AlunoVO("Aluno " +i, "Endereco " +i, i));
        }

        /**Aplicando o padrão Iterator**/
        Iterator<AlunoVO> itraluno = listaAluno.iterator();

        while (itraluno.hasNext()){
            aluno = (AlunoVO) itraluno.next();
            System.out.println("Nome: " +aluno.getNome());
            System.out.println("Endereco: " +aluno.getEndereco());
            System.out.println("Matrícula: " +aluno.getMatricula());
            System.out.println();
            System.out.println();
        }

    }


}
