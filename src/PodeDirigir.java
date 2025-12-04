/**

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos anos você tem?");
        var idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você pode dirigir!");
            return;
        } else {
            System.out.println("Você é emancipado?");
        }

        var emancipado = scanner.nextBoolean();

        if (idade >= 16 && emancipado) {
            System.out.println("Você pode dirigir");
        } else {
            System.out.println("Você não pode dirigir");

        }

*/