import java.util.Scanner;

public class CalculadoraImpostos {

   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Digite seu salário mensal: ");
      double salarioMensal = scanner.nextDouble();
      
      double salarioAnual = salarioMensal * 12;
      
      double impostoDevido = calcularImposto(salarioAnual);
      
      System.out.printf("O imposto devido é: R$%.2f", impostoDevido);
      
      scanner.close();
   }
   
   public static double calcularImposto(double salarioAnual) {
      
      double impostoDevido = 0;
      
      if (salarioAnual <= 22800) {
         impostoDevido = 0;
      } else if (salarioAnual > 22800 && salarioAnual <= 45006) {
         impostoDevido = (salarioAnual - 22800) * 0.15;
      } else if (salarioAnual > 45006 && salarioAnual <= 55976.16) {
         impostoDevido = (salarioAnual - 45006) * 0.225 + 3195.90;
      } else if (salarioAnual > 55976.16 && salarioAnual <= 74661.60) {
         impostoDevido = (salarioAnual - 55976.16) * 0.275 + 7638.63;
      } else {
         impostoDevido = (salarioAnual - 74661.60) * 0.275 + 10432.32;
      }
      
      return impostoDevido;
   }
}
