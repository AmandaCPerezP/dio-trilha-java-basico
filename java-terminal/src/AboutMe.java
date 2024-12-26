public class AboutMe {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Por favor, forneça o nome, sobrenome, idade e altura como argumentos.");
            return;
        }

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
    }
}
