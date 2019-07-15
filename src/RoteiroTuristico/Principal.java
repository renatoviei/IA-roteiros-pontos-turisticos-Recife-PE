package RoteiroTuristico;

//UFRPE BCC 2017.2
//RENATO VIEIRA DE MENEZES
//DISCIPLINA: INTELIGENCIA ARTIFICIAL
//ALGORITMO ESCOLHIDO: KMEANS

public class Principal {
	public static void main(String[] args) {

		double c1[] = { 1.0, 3.0, 3.0, -8.061439, -34.872536 };
		double c2[] = { 2.0, 18.0, 8.0, -8.036799, -34.912777 };
		double c3[] = { 3.0, 23.0, 3.0, -8.050561, -34.873074 };
		double c4[] = { 4.0, 29.0, 11.0, -8.036873, -34.89243 };
		double c5[] = { 5.0, 36.0, 0.0, -8.061285, -34.881393 };
		double c6[] = { 6.0, 58.0, 11.0, -8.036735, -34.891921 };

		Kmeans teste = new Kmeans();

		teste.criarRoteiroK2(c1, c2);
		teste.criarRoteiroK4(c1, c2, c3, c4);
		teste.criarRoteiroK6(c1, c2, c3, c4, c5, c6);

		Avaliacao teste1 = new Avaliacao();

		teste1.indiceInternoK1();
		teste1.indiceInternoK2(c1, c2);
		teste1.indiceInternoK4(c1, c2, c3, c4);
		teste1.indiceInternoK6(c1, c2, c3, c4, c5, c6);

	}
}
