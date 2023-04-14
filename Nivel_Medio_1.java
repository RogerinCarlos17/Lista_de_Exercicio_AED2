import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
            System.out.println("Informe a base do retangulo: ");
            float x = a.nextFloat();

            System.out.println("Informe a altura do retangulo: ");
            float z = a.nextFloat();
            
            Retangulo r = new Retangulo(z,x);
            float area = r.getArea();
            System.out.println(r.getArea());
  
    }
}
