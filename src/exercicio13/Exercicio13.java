package exercicio13;

import javax.swing.JOptionPane;
public class Exercicio13 {

    public static void main(String[] args) {
		double sb, vp, lp;
		sb = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario bruto: "));
		vp = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do emprestimo bruto: "));
		
		lp = sb*0.3;
		
		if(vp>lp) {
			JOptionPane.showMessageDialog(null, "emprestimo NEGADO!");
		}else{
			JOptionPane.showMessageDialog(null, "emprestimo APROVADO!"); 
			}
		}
	}