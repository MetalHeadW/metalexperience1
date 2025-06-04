
import javax.swing.JOptionPane;


public class Exercicio2 {

    public static void main(String[] args) {

     int n = lerInt("Quantas Pessoas você quer cadastrar");
       String resultado = " ";
     for (int i=0; i<n; i++){
        String nome =JOptionPane.showInputDialog("Nome");
        resultado += "\n" + nome + "-" + verificaCategoria(lerInt("Idade de " + nome));
     }
     exibeMsg(resultado);
    }

    public static String verificaCategoria(int idade){
        if (idade <= 7) 
        return "infantil A";
         if (idade <= 10) 
        return "Infantil B";
         if (idade <= 17) 
        return "Jovem";
         return "adulto";

        }
        
        public static int lerInt(String msg) {
            return Integer.parseInt(JOptionPane.showInputDialog(msg));
            
        }
       public static void exibeMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
        
       }
      
        }

