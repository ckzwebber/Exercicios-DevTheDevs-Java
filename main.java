import javax.swing.JFrame;

public class Main {
        public static void main(String[] args) {

                JFrame frame = new JFrame("Simple GUI");
                frame.setVisible(true);
                frame.setSize(500, 500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setLocationRelativeTo(null);
                frame.pack();
                frame.setVisible(true);
                System.out.println("Feito por Carlos Miguel, 18/02/22");

                System.out.println(" ");
                System.out.println("----------------------------------------------------------");
                System.out.println(" ");
                // Atividade 1: Armazenando dois números inteiros em uma variável e imprimindo a
                // soma:
                int numeroX, numeroY, somaNumeros;
                numeroX = 10;
                numeroY = 90;
                somaNumeros = numeroX + numeroY;

                System.out.println(
                                "Atividade 1: armazenando dois números inteiros em uma variável e imprimindo a soma:");
                System.out.println(" ");
                System.out.println("Soma das variáveis numeroX + numeroY: " + somaNumeros);

                System.out.println(" ");
                System.out.println("----------------------------------------------------------");
                System.out.println(" ");

                // Atividade 2: Armazenando 4 notas bimestrais em variáveis, calculando e
                // mostrando a média:
                int bimestres;
                bimestres = 4;

                double nota1, nota2, nota3, nota4, somaNotas, calculaMedia;
                nota1 = 8.5;
                nota2 = 7.9;
                nota3 = 9.4;
                nota4 = 10;
                somaNotas = nota1 + nota2 + nota3 + nota4;
                calculaMedia = somaNotas / bimestres;

                System.out.println(
                                "Atividade 2: armazenando 4 notas bimestrais em variáveis, calculando e mostrando a média:");
                System.out.println(" ");
                System.out.println("A soma das suas 4 notas bimestrais foi: " + somaNotas
                                + ". Com isso, a sua média resultou em: " + calculaMedia);

                System.out.println(" ");
                System.out.println("----------------------------------------------------------");
                System.out.println(" ");

                // Atividade 3: Convertendo 25.5 metros para centímetros:
                double metros, converter, centimetros;
                metros = 25.5;
                converter = 100;
                centimetros = metros * converter;

                System.out.println("Atividade 3: Convertendo 25.5 metros para centímetros:");
                System.out.println(" ");
                System.out.println("25.5 metros em centímetros são: " + centimetros + " centímetros");

                System.out.println(" ");
                System.out.println("----------------------------------------------------------");
                System.out.println(" ");

                // Atividade 4: Calculando e mostrando a área de um círculo para os raios r = 5,
                // r = 7 e r = 10.
                int raio1, raio2, raio3;
                raio1 = 5;
                raio2 = 7;
                raio3 = 10;

                double pI, areaCirculo1, areaCirculo2, areaCirculo3;
                pI = 3.14;
                areaCirculo1 = raio1 * raio1 * pI;
                areaCirculo2 = raio2 * raio2 * pI;
                areaCirculo3 = raio3 * raio3 * pI;

                System.out.println(
                                "Atividade 4: Calculando e mostrando a área de um círculo para os raios r = 5, r = 7 e r = 10:");
                System.out.println(" ");
                System.out.println("A área do círculo de raio 5 é: " + areaCirculo1);
                System.out.println(" ");
                System.out.println("A área do círculo de raio 7 é: " + areaCirculo2);
                System.out.println(" ");
                System.out.println("A área do círculo de raio 10 é: " + areaCirculo3);

                System.out.println(" ");
                System.out.println("----------------------------------------------------------");
                System.out.println(" ");

                // Atividade 5: Calculando a área de um quadrado de lado l = 10, exibindo esta
                // área e mostrando o dobro desta área na tela.
                int ladoQuadrado, areaQuadrado, dobroAreaQuadrado;
                ladoQuadrado = 10;
                areaQuadrado = ladoQuadrado * ladoQuadrado;
                dobroAreaQuadrado = areaQuadrado * 2;

                System.out.println(
                                "Atividade 5: Calculando a área de um quadrado de lado l = 10, exibindo esta área e mostrando o dobro desta área na tela:");
                System.out.println(" ");
                System.out.println("Área do quadrado: " + areaQuadrado);
                System.out.println(" ");
                System.out.println("Dobro da área do quadrado: " + dobroAreaQuadrado);

                System.out.println(" ");
                System.out.println("----------------------------------------------------------");
                System.out.println(" ");

                // Atividade 6: Transformando e mostrando a temperatura de Fahrenheit em graus
                // Celsius, mostrando o resultado da conversão de 110 graus Fahrenheit, 140
                // graus Fahrenheit e 203 graus Fahrenheit.
                double fa110, fa140, fa203, converterFAGR1, converterFAGR2, converterFAGR3;
                fa110 = 110;
                fa140 = 140;
                fa203 = 203;
                converterFAGR1 = 5 * ((fa110 - 32) / 9);
                converterFAGR2 = 5 * ((fa140 - 32) / 9);
                converterFAGR3 = 5 * ((fa203 - 32) / 9);

                System.out.println(
                                "Atividade 6: Transformando e mostrando a temperatura de Fahrenheit em graus Celsius, mostrando o resultado da conversão de 110 graus Fahrenheit, 140 graus Fahrenheit e 203 graus Fahrenheit");
                System.out.println(" ");
                System.out.println("A conversão de 110 graus Fahrenheit para graus resulta em: " + converterFAGR1);
                System.out.println(" ");
                System.out.println("A conversão de 140 graus Fahrenheit para graus resulta em: " + converterFAGR2);
                System.out.println(" ");
                System.out.println("A conversão de 203 graus Fahrenheit para graus resulta em: " + converterFAGR3);
        }
}