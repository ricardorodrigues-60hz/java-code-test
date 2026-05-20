package javaapplication2;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class JavaApplication2 {
    public static void main(String[] args) {

        // Instanciando um objeto aluno
        ClassAluno aluno1 = new ClassAluno("Carlos", 8);
        ClassAluno aluno2 = new ClassAluno("Pedro", 9);

        aluno1.exibitDados();
        aluno2.exibitDados();

        aluno1.setNota(-6);

        aluno1.setNota(9.0);
        aluno1.exibitDados();
    }
    
}
