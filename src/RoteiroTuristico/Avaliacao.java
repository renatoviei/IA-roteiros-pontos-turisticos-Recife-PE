package RoteiroTuristico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Avaliacao {
	// CENTROIDS (PONTOS TURISTICOS) QUE SERAO INICIALIZADOS AO INSTANCIAR O OBJETO
	private PontoTuristico centroid1;
	private PontoTuristico centroid2;
	private PontoTuristico centroid3;
	private PontoTuristico centroid4;
	private PontoTuristico centroid5;
	private PontoTuristico centroid6;

	public PontoTuristico getCentroid3() {
		return centroid3;
	}

	public PontoTuristico getCentroid5() {
		return centroid5;
	}

	public PontoTuristico getCentroid6() {
		return centroid6;
	}

	public void setCentroid5(PontoTuristico centroid5) {
		this.centroid5 = centroid5;
	}

	public void setCentroid6(PontoTuristico centroid6) {
		this.centroid6 = centroid6;
	}

	public PontoTuristico getCentroid4() {
		return centroid4;
	}

	public void setCentroid3(PontoTuristico centroid3) {
		this.centroid3 = centroid3;
	}

	public void setCentroid4(PontoTuristico centroid4) {
		this.centroid4 = centroid4;
	}

	public Avaliacao() {

	}

	public PontoTuristico getCentroid1() {
		return centroid1;
	}

	public PontoTuristico getCentroid2() {
		return centroid2;
	}

	public void setCentroid1(PontoTuristico centroid1) {
		this.centroid1 = centroid1;
	}

	public void setCentroid2(PontoTuristico centroid2) {
		this.centroid2 = centroid2;
	}

	// METODO QUE NORMALIZA AS CLASSES DE NOME DO PONTO TURISTICO E BAIRRO
	public int setClasses(String classe) {
		int norma = 0;
		if (classe.equals("TeatroDoParque") || classe.equals("BoaVista")) {

		} else if (classe.equals("TeatroBarretoJunior") || classe.equals("Pina")) {
			norma = 1;
		} else if (classe.equals("TeatroDeSantaIsabel") || classe.equals("SantoAntonio")) {
			norma = 2;
		} else if (classe.equals("TeatroApolo") || classe.equals("Recife")) {
			norma = 3;
		} else if (classe.equals("TeatroHermiloBorbaFilho") || classe.equals("Soledade")) {
			norma = 4;
		} else if (classe.equals("TeatroLuizMendonça") || classe.equals("BoaViagem")) {
			norma = 5;
		} else if (classe.equals("TeatroBoaVista") || classe.equals("SantoAmaro")) {
			norma = 6;
		} else if (classe.equals("TeatroArraial") || classe.equals("Madalena")) {
			norma = 7;
		} else if (classe.equals("TeatroValdemarOliveira") || classe.equals("CasaForte")) {
			norma = 8;
		} else if (classe.equals("TeatroAlfredoDeOliveira") || classe.equals("Jaqueira")) {
			norma = 9;
		} else if (classe.equals("TeatroMarcoCamarotti") || classe.equals("SaoJose")) {
			norma = 10;
		} else if (classe.equals("TeatroJoaquimCardozo") || classe.equals("AguaFria")) {
			norma = 11;
		} else if (classe.equals("TeatroRioMar") || classe.equals("Beberibe")) {
			norma = 12;
		} else if (classe.equals("RioMarShopping") || classe.equals("Arruda")) {
			norma = 13;
		} else if (classe.equals("ShoppingRecife") || classe.equals("Encruzilhada")) {
			norma = 14;
		} else if (classe.equals("PaçoAlfandega") || classe.equals("CasaAmarela")) {
			norma = 15;
		} else if (classe.equals("ShoppingBoaVista") || classe.equals("NovaDescoberta")) {
			norma = 16;
		} else if (classe.equals("ShoppingTacaruna") || classe.equals("Cordeiro")) {
			norma = 17;
		} else if (classe.equals("PlazaCasaForte") || classe.equals("Varzea")) {
			norma = 18;
		} else if (classe.equals("ExecutiveTradeCemter") || classe.equals("EngenhoDoMeio")) {
			norma = 19;
		} else if (classe.equals("PonteDaBoaVista") || classe.equals("Areias")) {
			norma = 20;
		} else if (classe.equals("PonteBuarqueDeMacedo") || classe.equals("Mustardinha")) {
			norma = 21;
		} else if (classe.equals("PonteDuarteCoelho") || classe.equals("Afogados")) {
			norma = 22;
		} else if (classe.equals("PonteDoLimoeiro") || classe.equals("Jordao")) {
			norma = 23;
		} else if (classe.equals("PonteMauricioDeNassau") || classe.equals("Ibura")) {
			norma = 24;
		} else if (classe.equals("PontePrincesaIsabel") || classe.equals("Parnamirim")) {
			norma = 25;
		} else if (classe.equals("MercadoDeSaoJose") || classe.equals("Apipucos")) {
			norma = 26;
		} else if (classe.equals("MercadoDaBoaVista") || classe.equals("Graças")) {
			norma = 27;
		} else if (classe.equals("MercadoDaMadalena")) {
			norma = 28;
		} else if (classe.equals("MercadoDaEncruzilhada")) {
			norma = 29;
		} else if (classe.equals("MercadoDeCasaAmarela")) {
			norma = 30;
		} else if (classe.equals("MercadoDoCordeiro")) {
			norma = 31;
		} else if (classe.equals("MuseuDoHomemDoNordeste")) {
			norma = 32;
		} else if (classe.equals("MuseuMuriloLaGreca")) {
			norma = 33;
		} else if (classe.equals("MuseuDaCidadeDoRecife")) {
			norma = 34;
		} else if (classe.equals("MuseuMilitar")) {
			norma = 35;
		} else if (classe.equals("MuseuDeArteModernaAloisioMagalhaes")) {
			norma = 36;
		} else if (classe.equals("MuseuFranciscanoDeArteSacra")) {
			norma = 37;
		} else if (classe.equals("Casa-MuseuMagdalenaEGilbertoFreyre")) {
			norma = 38;
		} else if (classe.equals("OficinaBrennand")) {
			norma = 39;
		} else if (classe.equals("InstitutoRicardoBrennand")) {
			norma = 40;
		} else if (classe.equals("MuseuDoEstadoDePernambuco")) {
			norma = 41;
		} else if (classe.equals("MuseuDaAboliçao")) {
			norma = 42;
		} else if (classe.equals("InstitutoArqueologicoHistoricoEGeograficoDePernambuco")) {
			norma = 43;
		} else if (classe.equals("MuseuDeArtePopular")) {
			norma = 44;
		} else if (classe.equals("CaisDoSertao")) {
			norma = 45;
		} else if (classe.equals("CasaDoCarnaval")) {
			norma = 46;
		} else if (classe.equals("ObservatorioCulturalTorreMalakoff")) {
			norma = 47;
		} else if (classe.equals("SinagogaKahalZurIsrael")) {
			norma = 48;
		} else if (classe.equals("PaçoDoFrevo")) {
			norma = 49;
		} else if (classe.equals("MemorialChicoScience")) {
			norma = 50;
		} else if (classe.equals("MemorialLuizGonzaga")) {
			norma = 51;
		} else if (classe.equals("MuseuDoTrem")) {
			norma = 52;
		} else if (classe.equals("MuseuDeArtesAfroBrasilRolandoToro")) {
			norma = 53;
		} else if (classe.equals("FeiraDomVital")) {
			norma = 54;
		} else if (classe.equals("FeiraAguaFria")) {
			norma = 55;
		} else if (classe.equals("FeiraDeBeberibe")) {
			norma = 56;
		} else if (classe.equals("FeiraArruda")) {
			norma = 57;
		} else if (classe.equals("FeiraEncruzilhada")) {
			norma = 58;
		} else if (classe.equals("FeiraAltoDoDeodato")) {
			norma = 59;
		} else if (classe.equals("FeiraCasaAmarela")) {
			norma = 60;
		} else if (classe.equals("FeiraNovaDescoberta")) {
			norma = 61;
		} else if (classe.equals("FeiraBombaGrande")) {
			norma = 62;
		} else if (classe.equals("FeiraDoCordeiro")) {
			norma = 63;
		} else if (classe.equals("FeiraDaVarzea")) {
			norma = 64;
		} else if (classe.equals("FeiraDoEngenhoDoMeio")) {
			norma = 65;
		} else if (classe.equals("FeiraDeAreias")) {
			norma = 66;
		} else if (classe.equals("FeiraDaMustardinha")) {
			norma = 67;
		} else if (classe.equals("FeiraDeAfogados")) {
			norma = 68;
		} else if (classe.equals("FeiraDoJordao")) {
			norma = 69;
		} else if (classe.equals("FeiraDoIburaUR01")) {
			norma = 70;
		} else {
			norma = 666;
		}
		return norma;
	}

	public ArrayList<PontoTuristico> LerArquivo() throws NumberFormatException, IOException {
		FileReader file = new FileReader("Artefatos\\ARFF - projeto.txt");
		BufferedReader arq = new BufferedReader(file);

		// LEITURA DO ARQUIVO DE ENTRADA PARA CARREGAR OS PONTOS NO VETOR DE
		// CARACTERISTICAS
		// DO KMEANS
		String linha = "";
		String[] vet;
		double pt[] = new double[5];
		ArrayList<PontoTuristico> pontos = new ArrayList<PontoTuristico>();

		while ((linha = arq.readLine()) != null) {

			vet = linha.split(",");
			pt = new double[5];
			for (int i = 0; i < 5; i++) {

				if (setClasses(vet[i]) != 666) {

					pt[i] = setClasses(vet[i]);
				} else {

					pt[i] = Double.parseDouble(vet[i]);

				}

			}

			pontos.add(new PontoTuristico(pt));

		}
		arq.close();
		file.close();
		return pontos;
		// RETORNA O ARRAY DE PONTOS TURISTICOS
	}

	// CALCULO DO CENTROID DO CONJUNTO DE DADOS TOTAL
	public PontoTuristico calculaM() {
		ArrayList<PontoTuristico> pontos = new ArrayList<>();
		try {
			pontos = LerArquivo();
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;

		for (int i = 0; i < pontos.size(); i++) {

			a = a + pontos.get(i).getVetorCar()[0];
			b = b + pontos.get(i).getVetorCar()[1];
			c = c + pontos.get(i).getVetorCar()[2];
			d = d + pontos.get(i).getVetorCar()[3];
			e = e + pontos.get(i).getVetorCar()[4];
		}
		a = a / pontos.size();
		b = b / pontos.size();
		c = c / pontos.size();
		d = d / pontos.size();
		e = e / pontos.size();

		double c13[] = { a, b, c, d, e };

		PontoTuristico m = new PontoTuristico(c13);
		return m;
		// RETORNA O CENTROID TOTAL
	}

	// VAI USAR O CENTROID TOTAL
	public void indiceInternoK1() {
		// ONDE SERA ARMAZENADO TODOS OS VETORES DE PONTOS TURISTICOS
		ArrayList<PontoTuristico> pontos = new ArrayList<>();

		try {
			pontos = LerArquivo();

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		double parte1 = 0;

		double wss = 0;
		double bss = 0;
		double total = 0;

		for (int i = 0; i < pontos.size(); i++) {

			// RODA CADA VALOR DE CADA PONTO DO GRUPO1
			for (int j = 0; j < 1; j++) {
				// FAZ O CALCULO DAS DISTANCIAS EM RELAÇAO AOS VALORES DE CADA PONTO i
				parte1 = parte1 + Math.pow(pontos.get(i).getVetorCar()[j] - calculaM().getVetorCar()[j], 2)
						+ Math.pow(pontos.get(i).getVetorCar()[j + 1] - calculaM().getVetorCar()[j + 1], 2)
						+ Math.pow(pontos.get(i).getVetorCar()[j + 2] - calculaM().getVetorCar()[j + 2], 2)
						+ Math.pow(pontos.get(i).getVetorCar()[j + 3] - calculaM().getVetorCar()[j + 3], 2)
						+ Math.pow(pontos.get(i).getVetorCar()[j + 4] - calculaM().getVetorCar()[j + 4], 2);

			}

		}

		wss = parte1;
		parte1 = 0;

		for (int j = 0; j < 1; j++) {

			parte1 = Math.pow(calculaM().getVetorCar()[j] - calculaM().getVetorCar()[j], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 1] - calculaM().getVetorCar()[j + 1], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 2] - calculaM().getVetorCar()[j + 2], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 3] - calculaM().getVetorCar()[j + 3], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 4] - calculaM().getVetorCar()[j + 4], 2);

		}
		parte1 = parte1 * pontos.size();

		bss = parte1;

		total = wss + bss;

		System.out.println("\nPara K = 1\n");
		System.out.println("\nwss = " + wss + "\n");
		System.out.println("\nbss = " + bss + "\n");
		System.out.println("\nTotal = wss + bss = " + total + "\n");
	}

	// RECEBE OS 2 CENTROIDS INICIAIS
	public void indiceInternoK2(double[] c1, double[] c2) {
		// ONDE SERA ARMAZENADO TODOS OS VETORES DE PONTOS TURISTICOS
		ArrayList<PontoTuristico> pontos = new ArrayList<>();

		this.centroid1 = new PontoTuristico(c1);
		this.centroid2 = new PontoTuristico(c2);

		int aux1 = 0;

		// ARRAY LIST QUE REPRESENTA OS GRUPOS QUE SERAO FORMADOS
		ArrayList<PontoTuristico> grupo1 = new ArrayList<>();
		ArrayList<PontoTuristico> grupo2 = new ArrayList<>();

		try {
			pontos = LerArquivo();

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// APOS TESTES FEITOS, CONCLUIU-SE QUE 5 ITERAÇOES SAO SUFICIENTES PARA FORMAÇAO
		// DOS GRUPOS SEM MODIFICAR MUITO OS NOVOS CENTROIDS, DE FORMA QUE PRIORIZE
		// ESTRATEGICAMENTE
		// A PROXIMIDADE ENTRE OS PONTOS
		while (aux1 < 5) {

			grupo1 = new ArrayList<>();
			grupo2 = new ArrayList<>();

			// RODA OS PONTOS i DO ARRAY DE PONTOS
			for (int i = 0; i < pontos.size(); i++) {

				// VERIFICA SE O PONTO ANALIZADO NÃO É O MESMO DOS CENTROIDS INICIAIS QUE ESTOU
				// USANDO
				if ((pontos.get(i).getVetorCar()[1] != centroid1.getVetorCar()[1]
						&& pontos.get(i).getVetorCar()[1] != centroid2.getVetorCar()[1])) {
					double dc1 = 0;
					double dc2 = 0;

					// RODA CADA VALOR DE CADA PONTO DO ARRAY LIST
					for (int j = 0; j < 1; j++) {
						// FAZ O CALCULO DAS DISTANCIAS EM RELAÇAO AO AOS VALORES DE CADA PONTO i
						dc1 = Math.sqrt(Math.pow(pontos.get(i).getVetorCar()[j] - centroid1.getVetorCar()[j], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 1] - centroid1.getVetorCar()[j + 1], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 2] - centroid1.getVetorCar()[j + 2], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 3] - centroid1.getVetorCar()[j + 3], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 4] - centroid1.getVetorCar()[j + 4], 2));

						dc2 = Math.sqrt(Math.pow(pontos.get(i).getVetorCar()[j] - centroid2.getVetorCar()[j], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 1] - centroid2.getVetorCar()[j + 1], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 2] - centroid2.getVetorCar()[j + 2], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 3] - centroid2.getVetorCar()[j + 3], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 4] - centroid2.getVetorCar()[j + 4], 2));

					}
					// GUARDA O PONTO COM MENOR DISTANCIA
					double valor[] = { dc1, dc2 };
					double menor = 666;

					for (int z = 0; z < valor.length; z++) {
						if (valor[z] < menor) {
							menor = valor[z];
						}
					}

					// DE ACORDO COM A MENOR DISTANCIA, ADICIONA O PONTO NO SEU RESPECTIVO GRUPO
					if (menor == valor[0]) {
						grupo1.add(pontos.get(i));
					} else if (menor == valor[1]) {
						grupo2.add(pontos.get(i));
					}

				} else {
					continue;
				}

			}
			// ADICIONA O PROPIO CENTROID AO SEU RESPECTIVO GRUPO
			grupo1.add(centroid1);
			grupo2.add(centroid2);

			// FAZ OS CALCULO DE NOVOS CENTROIDS PARA CADA ITERAÇAO
			double x = 0;
			double y = 0;
			double w = 0;
			double z = 0;
			double v = 0;
			for (int k = 0; k < grupo1.size(); k++) {

				x = x + grupo1.get(k).getVetorCar()[0];
				y = y + grupo1.get(k).getVetorCar()[1];
				w = w + grupo1.get(k).getVetorCar()[2];
				z = z + grupo1.get(k).getVetorCar()[3];
				v = v + grupo1.get(k).getVetorCar()[4];
			}
			x = x / grupo1.size();
			y = y / grupo1.size();
			w = w / grupo1.size();
			z = z / grupo1.size();
			v = v / grupo1.size();

			double c7[] = { x, y, w, z, v };

			for (int k = 0; k < grupo2.size(); k++) {

				x = x + grupo2.get(k).getVetorCar()[0];
				y = y + grupo2.get(k).getVetorCar()[1];
				w = w + grupo2.get(k).getVetorCar()[2];
				z = z + grupo2.get(k).getVetorCar()[3];
				v = v + grupo2.get(k).getVetorCar()[4];
			}
			x = x / grupo2.size();
			y = y / grupo2.size();
			w = w / grupo2.size();
			z = z / grupo2.size();
			v = v / grupo2.size();

			double c8[] = { x, y, w, z, v };

			centroid1 = new PontoTuristico(c7);
			centroid2 = new PontoTuristico(c8);

			aux1++;
		}

		double parte1 = 0;
		double parte2 = 0;
		double wss = 0;
		double bss = 0;
		double total = 0;

		for (int i = 0; i < grupo1.size(); i++) {
			if ((grupo1.get(i).getVetorCar()[1] != centroid1.getVetorCar()[1])) {
				// RODA CADA VALOR DE CADA PONTO DO GRUPO1
				for (int j = 0; j < 1; j++) {
					// FAZ O CALCULO DAS DISTANCIAS EM RELAÇAO AOS VALORES DE CADA PONTO i
					parte1 = parte1 + Math.pow(grupo1.get(i).getVetorCar()[j] - centroid1.getVetorCar()[j], 2)
							+ Math.pow(grupo1.get(i).getVetorCar()[j + 1] - centroid1.getVetorCar()[j + 1], 2)
							+ Math.pow(grupo1.get(i).getVetorCar()[j + 2] - centroid1.getVetorCar()[j + 2], 2)
							+ Math.pow(grupo1.get(i).getVetorCar()[j + 3] - centroid1.getVetorCar()[j + 3], 2)
							+ Math.pow(grupo1.get(i).getVetorCar()[j + 4] - centroid1.getVetorCar()[j + 4], 2);

				}
			} else {
				continue;
			}
		}

		for (int i = 0; i < grupo2.size(); i++) {
			if ((grupo2.get(i).getVetorCar()[1] != centroid2.getVetorCar()[1])) {
				// RODA CADA VALOR DE CADA PONTO DO GRUPO2
				for (int j = 0; j < 1; j++) {
					// FAZ O CALCULO DAS DISTANCIAS EM RELAÇAO AO AOS VALORES DE CADA PONTO i
					parte2 = parte2 + Math.pow(grupo2.get(i).getVetorCar()[j] - centroid2.getVetorCar()[j], 2)
							+ Math.pow(grupo2.get(i).getVetorCar()[j + 1] - centroid2.getVetorCar()[j + 1], 2)
							+ Math.pow(grupo2.get(i).getVetorCar()[j + 2] - centroid2.getVetorCar()[j + 2], 2)
							+ Math.pow(grupo2.get(i).getVetorCar()[j + 3] - centroid2.getVetorCar()[j + 3], 2)
							+ Math.pow(grupo2.get(i).getVetorCar()[j + 4] - centroid2.getVetorCar()[j + 4], 2);

				}
			} else {
				continue;
			}
		}

		wss = parte1 + parte2;
		parte1 = 0;
		parte2 = 0;
		for (int j = 0; j < 1; j++) {

			parte1 = Math.pow(calculaM().getVetorCar()[j] - centroid1.getVetorCar()[j], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 1] - centroid1.getVetorCar()[j + 1], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 2] - centroid1.getVetorCar()[j + 2], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 3] - centroid1.getVetorCar()[j + 3], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 4] - centroid1.getVetorCar()[j + 4], 2);

		}
		parte1 = parte1 * grupo1.size() - 1;
		for (int j = 0; j < 1; j++) {

			parte2 = Math.pow(calculaM().getVetorCar()[j] - centroid2.getVetorCar()[j], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 1] - centroid2.getVetorCar()[j + 1], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 2] - centroid2.getVetorCar()[j + 2], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 3] - centroid2.getVetorCar()[j + 3], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 4] - centroid2.getVetorCar()[j + 4], 2);

		}
		parte2 = parte2 * grupo2.size() - 1;
		bss = parte1 + parte2;

		total = wss + bss;

		System.out.println("\nPara K = 2\n");
		System.out.println("\nwss = " + wss + "\n");
		System.out.println("\nbss = " + bss + "\n");
		System.out.println("\nTotal = wss + bss = " + total + "\n");
	}

	// RECEBE OS CENTROIDS INICIAIS
	public void indiceInternoK4(double[] c1, double[] c2, double[] c3, double[] c4) {
		// ONDE SERA ARMAZENADO TODOS OS VETORES DE PONTOS TURISTICOS
		ArrayList<PontoTuristico> pontos = new ArrayList<>();

		this.centroid1 = new PontoTuristico(c1);
		this.centroid2 = new PontoTuristico(c2);
		this.centroid3 = new PontoTuristico(c3);
		this.centroid4 = new PontoTuristico(c4);

		int aux1 = 0;

		// ARRAY LIST QUE REPRESENTA OS GRUPOS QUE SERAO FORMADOS
		ArrayList<PontoTuristico> grupo1 = new ArrayList<>();
		ArrayList<PontoTuristico> grupo2 = new ArrayList<>();
		ArrayList<PontoTuristico> grupo3 = new ArrayList<>();
		ArrayList<PontoTuristico> grupo4 = new ArrayList<>();

		try {
			pontos = LerArquivo();

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// APOS TESTES FEITOS, CONCLUIU-SE QUE 5 ITERAÇOES SAO SUFICIENTES PARA FORMAÇAO
		// DOS GRUPOS SEM MODIFICAR MUITO OS NOVOS CENTROIDS, DE FORMA QUE PRIORIZE
		// ESTRATEGICAMENTE
		// A PROXIMIDADE ENTRE OS PONTOS
		while (aux1 < 5) {

			grupo1 = new ArrayList<>();
			grupo2 = new ArrayList<>();
			grupo3 = new ArrayList<>();
			grupo4 = new ArrayList<>();

			// RODA OS PONTOS i DO ARRAY DE PONTOS
			for (int i = 0; i < pontos.size(); i++) {

				// VERIFICA SE O PONTO ANALIZADO NÃO É O MESMO DOS CENTROIDS INICIAIS QUE ESTOU
				// USANDO
				if ((pontos.get(i).getVetorCar()[1] != centroid1.getVetorCar()[1]
						&& pontos.get(i).getVetorCar()[1] != centroid2.getVetorCar()[1])
						&& (pontos.get(i).getVetorCar()[1] != centroid3.getVetorCar()[1]
								&& pontos.get(i).getVetorCar()[1] != centroid4.getVetorCar()[1])) {
					double dc1 = 0;
					double dc2 = 0;
					double dc3 = 0;
					double dc4 = 0;

					// RODA CADA VALOR DE CADA PONTO DO ARRAY LIST
					for (int j = 0; j < 1; j++) {
						// FAZ O CALCULO DAS DISTANCIAS EM RELAÇAO AO AOS VALORES DE CADA PONTO i
						dc1 = Math.sqrt(Math.pow(pontos.get(i).getVetorCar()[j] - centroid1.getVetorCar()[j], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 1] - centroid1.getVetorCar()[j + 1], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 2] - centroid1.getVetorCar()[j + 2], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 3] - centroid1.getVetorCar()[j + 3], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 4] - centroid1.getVetorCar()[j + 4], 2));

						dc2 = Math.sqrt(Math.pow(pontos.get(i).getVetorCar()[j] - centroid2.getVetorCar()[j], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 1] - centroid2.getVetorCar()[j + 1], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 2] - centroid2.getVetorCar()[j + 2], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 3] - centroid2.getVetorCar()[j + 3], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 4] - centroid2.getVetorCar()[j + 4], 2));

						dc3 = Math.sqrt(Math.pow(pontos.get(i).getVetorCar()[j] - centroid3.getVetorCar()[j], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 1] - centroid3.getVetorCar()[j + 1], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 2] - centroid3.getVetorCar()[j + 2], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 3] - centroid3.getVetorCar()[j + 3], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 4] - centroid3.getVetorCar()[j + 4], 2));

						dc4 = Math.sqrt(Math.pow(pontos.get(i).getVetorCar()[j] - centroid4.getVetorCar()[j], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 1] - centroid4.getVetorCar()[j + 1], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 2] - centroid4.getVetorCar()[j + 2], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 3] - centroid4.getVetorCar()[j + 3], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 4] - centroid4.getVetorCar()[j + 4], 2));

					}
					// GUARDA O PONTO COM MENOR DISTANCIA
					double valor[] = { dc1, dc2, dc3, dc4 };
					double menor = 666;

					for (int z = 0; z < valor.length; z++) {
						if (valor[z] < menor) {
							menor = valor[z];
						}
					}

					// DE ACORDO COM A MENOR DISTANCIA, ADICIONA O PONTO NO SEU RESPECTIVO GRUPO
					if (menor == valor[0]) {
						grupo1.add(pontos.get(i));
					} else if (menor == valor[1]) {
						grupo2.add(pontos.get(i));
					} else if (menor == valor[2]) {
						grupo3.add(pontos.get(i));
					} else if (menor == valor[3]) {
						grupo4.add(pontos.get(i));
					}

				} else {
					continue;
				}

			}
			// ADICIONA O PROPIO CENTROID AO SEU RESPECTIVO GRUPO
			grupo1.add(centroid1);
			grupo2.add(centroid2);
			grupo3.add(centroid3);
			grupo4.add(centroid4);

			// FAZ OS CALCULO DE NOVOS CENTROIDS PARA CADA ITERAÇAO
			double x = 0;
			double y = 0;
			double w = 0;
			double z = 0;
			double v = 0;
			for (int k = 0; k < grupo1.size(); k++) {

				x = x + grupo1.get(k).getVetorCar()[0];
				y = y + grupo1.get(k).getVetorCar()[1];
				w = w + grupo1.get(k).getVetorCar()[2];
				z = z + grupo1.get(k).getVetorCar()[3];
				v = v + grupo1.get(k).getVetorCar()[4];
			}
			x = x / grupo1.size();
			y = y / grupo1.size();
			w = w / grupo1.size();
			z = z / grupo1.size();
			v = v / grupo1.size();

			double c7[] = { x, y, w, z, v };

			for (int k = 0; k < grupo2.size(); k++) {

				x = x + grupo2.get(k).getVetorCar()[0];
				y = y + grupo2.get(k).getVetorCar()[1];
				w = w + grupo2.get(k).getVetorCar()[2];
				z = z + grupo2.get(k).getVetorCar()[3];
				v = v + grupo2.get(k).getVetorCar()[4];
			}
			x = x / grupo2.size();
			y = y / grupo2.size();
			w = w / grupo2.size();
			z = z / grupo2.size();
			v = v / grupo2.size();

			double c8[] = { x, y, w, z, v };

			for (int k = 0; k < grupo3.size(); k++) {

				x = x + grupo3.get(k).getVetorCar()[0];
				y = y + grupo3.get(k).getVetorCar()[1];
				w = w + grupo3.get(k).getVetorCar()[2];
				z = z + grupo3.get(k).getVetorCar()[3];
				v = v + grupo3.get(k).getVetorCar()[4];
			}
			x = x / grupo3.size();
			y = y / grupo3.size();
			w = w / grupo3.size();
			z = z / grupo3.size();
			v = v / grupo3.size();

			double c9[] = { x, y, w, z, v };
			for (int k = 0; k < grupo4.size(); k++) {

				x = x + grupo4.get(k).getVetorCar()[0];
				y = y + grupo4.get(k).getVetorCar()[1];
				w = w + grupo4.get(k).getVetorCar()[2];
				z = z + grupo4.get(k).getVetorCar()[3];
				v = v + grupo4.get(k).getVetorCar()[4];
			}
			x = x / grupo4.size();
			y = y / grupo4.size();
			w = w / grupo4.size();
			z = z / grupo4.size();
			v = v / grupo4.size();

			double c10[] = { x, y, w, z, v };

			centroid1 = new PontoTuristico(c7);
			centroid2 = new PontoTuristico(c8);
			centroid3 = new PontoTuristico(c9);
			centroid4 = new PontoTuristico(c10);

			aux1++;
		}

		double parte1 = 0;
		double parte2 = 0;
		double parte3 = 0;
		double parte4 = 0;
		double wss = 0;
		double bss = 0;
		double total = 0;

		for (int i = 0; i < grupo1.size(); i++) {
			if ((grupo1.get(i).getVetorCar()[1] != centroid1.getVetorCar()[1])) {
				// RODA CADA VALOR DE CADA PONTO DO GRUPO1
				for (int j = 0; j < 1; j++) {
					// FAZ O CALCULO DAS DISTANCIAS EM RELAÇAO AOS VALORES DE CADA PONTO i
					parte1 = parte1 + Math.pow(grupo1.get(i).getVetorCar()[j] - centroid1.getVetorCar()[j], 2)
							+ Math.pow(grupo1.get(i).getVetorCar()[j + 1] - centroid1.getVetorCar()[j + 1], 2)
							+ Math.pow(grupo1.get(i).getVetorCar()[j + 2] - centroid1.getVetorCar()[j + 2], 2)
							+ Math.pow(grupo1.get(i).getVetorCar()[j + 3] - centroid1.getVetorCar()[j + 3], 2)
							+ Math.pow(grupo1.get(i).getVetorCar()[j + 4] - centroid1.getVetorCar()[j + 4], 2);

				}
			} else {
				continue;
			}
		}

		for (int i = 0; i < grupo2.size(); i++) {
			if ((grupo2.get(i).getVetorCar()[1] != centroid2.getVetorCar()[1])) {
				// RODA CADA VALOR DE CADA PONTO DO GRUPO2
				for (int j = 0; j < 1; j++) {
					// FAZ O CALCULO DAS DISTANCIAS EM RELAÇAO AOS VALORES DE CADA PONTO i
					parte2 = parte2 + Math.pow(grupo2.get(i).getVetorCar()[j] - centroid2.getVetorCar()[j], 2)
							+ Math.pow(grupo2.get(i).getVetorCar()[j + 1] - centroid2.getVetorCar()[j + 1], 2)
							+ Math.pow(grupo2.get(i).getVetorCar()[j + 2] - centroid2.getVetorCar()[j + 2], 2)
							+ Math.pow(grupo2.get(i).getVetorCar()[j + 3] - centroid2.getVetorCar()[j + 3], 2)
							+ Math.pow(grupo2.get(i).getVetorCar()[j + 4] - centroid2.getVetorCar()[j + 4], 2);

				}
			} else {
				continue;
			}
		}

		for (int i = 0; i < grupo3.size(); i++) {
			if ((grupo3.get(i).getVetorCar()[1] != centroid3.getVetorCar()[1])) {
				// RODA CADA VALOR DE CADA PONTO DO GRUPO3
				for (int j = 0; j < 1; j++) {
					// FAZ O CALCULO DAS DISTANCIAS EM RELAÇAO AOS VALORES DE CADA PONTO i
					parte3 = parte3 + Math.pow(grupo3.get(i).getVetorCar()[j] - centroid3.getVetorCar()[j], 2)
							+ Math.pow(grupo3.get(i).getVetorCar()[j + 1] - centroid3.getVetorCar()[j + 1], 2)
							+ Math.pow(grupo3.get(i).getVetorCar()[j + 2] - centroid3.getVetorCar()[j + 2], 2)
							+ Math.pow(grupo3.get(i).getVetorCar()[j + 3] - centroid3.getVetorCar()[j + 3], 2)
							+ Math.pow(grupo3.get(i).getVetorCar()[j + 4] - centroid3.getVetorCar()[j + 4], 2);

				}
			} else {
				continue;
			}
		}

		for (int i = 0; i < grupo4.size(); i++) {
			if ((grupo4.get(i).getVetorCar()[1] != centroid4.getVetorCar()[1])) {
				// RODA CADA VALOR DE CADA PONTO DO GRUPO4
				for (int j = 0; j < 1; j++) {
					// FAZ O CALCULO DAS DISTANCIAS EM RELAÇAO AO AOS VALORES DE CADA PONTO i
					parte4 = parte4 + Math.pow(grupo4.get(i).getVetorCar()[j] - centroid4.getVetorCar()[j], 2)
							+ Math.pow(grupo4.get(i).getVetorCar()[j + 1] - centroid4.getVetorCar()[j + 1], 2)
							+ Math.pow(grupo4.get(i).getVetorCar()[j + 2] - centroid4.getVetorCar()[j + 2], 2)
							+ Math.pow(grupo4.get(i).getVetorCar()[j + 3] - centroid4.getVetorCar()[j + 3], 2)
							+ Math.pow(grupo4.get(i).getVetorCar()[j + 4] - centroid4.getVetorCar()[j + 4], 2);

				}
			} else {
				continue;
			}
		}

		wss = parte1 + parte2 + parte3 + parte4;
		parte1 = 0;
		parte2 = 0;
		parte3 = 0;
		parte4 = 0;

		for (int j = 0; j < 1; j++) {

			parte1 = Math.pow(calculaM().getVetorCar()[j] - centroid1.getVetorCar()[j], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 1] - centroid1.getVetorCar()[j + 1], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 2] - centroid1.getVetorCar()[j + 2], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 3] - centroid1.getVetorCar()[j + 3], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 4] - centroid1.getVetorCar()[j + 4], 2);

		}
		parte1 = parte1 * grupo1.size() - 1;
		for (int j = 0; j < 1; j++) {

			parte2 = Math.pow(calculaM().getVetorCar()[j] - centroid2.getVetorCar()[j], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 1] - centroid2.getVetorCar()[j + 1], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 2] - centroid2.getVetorCar()[j + 2], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 3] - centroid2.getVetorCar()[j + 3], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 4] - centroid2.getVetorCar()[j + 4], 2);

		}
		parte2 = parte2 * grupo2.size() - 1;
		for (int j = 0; j < 1; j++) {

			parte3 = Math.pow(calculaM().getVetorCar()[j] - centroid3.getVetorCar()[j], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 1] - centroid3.getVetorCar()[j + 1], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 2] - centroid3.getVetorCar()[j + 2], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 3] - centroid3.getVetorCar()[j + 3], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 4] - centroid3.getVetorCar()[j + 4], 2);

		}
		parte3 = parte3 * grupo3.size() - 1;
		for (int j = 0; j < 1; j++) {

			parte4 = Math.pow(calculaM().getVetorCar()[j] - centroid4.getVetorCar()[j], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 1] - centroid4.getVetorCar()[j + 1], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 2] - centroid4.getVetorCar()[j + 2], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 3] - centroid4.getVetorCar()[j + 3], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 4] - centroid4.getVetorCar()[j + 4], 2);

		}
		parte4 = parte4 * grupo4.size() - 1;
		bss = parte1 + parte2 + parte3 + parte4;

		total = wss + bss;

		System.out.println("\nPara K = 4\n");
		System.out.println("\nwss = " + wss + "\n");
		System.out.println("\nbss = " + bss + "\n");
		System.out.println("\nTotal = wss + bss = " + total + "\n");
	}

	// RECEBE OS CENTROIDS INICIAIS, QUE SAO OS PONTOS PRINCIPAIS DE VISITA
	public void indiceInternoK6(double[] c1, double[] c2, double[] c3, double[] c4, double[] c5, double[] c6) {
		// ONDE SERA ARMAZENADO TODOS OS VETORES DE PONTOS TURISTICOS
		ArrayList<PontoTuristico> pontos = new ArrayList<>();

		this.centroid1 = new PontoTuristico(c1);
		this.centroid2 = new PontoTuristico(c2);
		this.centroid3 = new PontoTuristico(c3);
		this.centroid4 = new PontoTuristico(c4);
		this.centroid5 = new PontoTuristico(c5);
		this.centroid6 = new PontoTuristico(c6);

		int aux1 = 0;

		// ARRAY LIST QUE REPRESENTA OS GRUPOS QUE SERAO FORMADOS
		ArrayList<PontoTuristico> grupo1 = new ArrayList<>();
		ArrayList<PontoTuristico> grupo2 = new ArrayList<>();
		ArrayList<PontoTuristico> grupo3 = new ArrayList<>();
		ArrayList<PontoTuristico> grupo4 = new ArrayList<>();
		ArrayList<PontoTuristico> grupo5 = new ArrayList<>();
		ArrayList<PontoTuristico> grupo6 = new ArrayList<>();
		try {
			pontos = LerArquivo();

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// APOS TESTES FEITOS, CONCLUIU-SE QUE 5 ITERAÇOES SAO SUFICIENTES PARA FORMAÇAO
		// DOS GRUPOS SEM MODIFICAR MUITO OS NOVOS CENTROIDS, DE FORMA QUE PRIORIZE
		// ESTRATEGICAMENTE
		// A PROXIMIDADE ENTRE OS PONTOS
		while (aux1 < 5) {

			grupo1 = new ArrayList<>();
			grupo2 = new ArrayList<>();
			grupo3 = new ArrayList<>();
			grupo4 = new ArrayList<>();
			grupo5 = new ArrayList<>();
			grupo6 = new ArrayList<>();
			// RODA OS PONTOS i DO ARRAY DE PONTOS
			for (int i = 0; i < pontos.size(); i++) {

				// VERIFICA SE O PONTO ANALIZADO NÃO É O MESMO DOS CENTROIDS INICIAIS QUE ESTOU
				// USANDO
				if ((pontos.get(i).getVetorCar()[1] != centroid1.getVetorCar()[1]
						&& pontos.get(i).getVetorCar()[1] != centroid2.getVetorCar()[1])
						&& (pontos.get(i).getVetorCar()[1] != centroid3.getVetorCar()[1]
								&& pontos.get(i).getVetorCar()[1] != centroid4.getVetorCar()[1]
								&& pontos.get(i).getVetorCar()[1] != centroid5.getVetorCar()[1]
								&& pontos.get(i).getVetorCar()[1] != centroid6.getVetorCar()[1])) {
					double dc1 = 0;
					double dc2 = 0;
					double dc3 = 0;
					double dc4 = 0;
					double dc5 = 0;
					double dc6 = 0;
					// RODA CADA VALOR DE CADA PONTO DO ARRAY LIST
					for (int j = 0; j < 1; j++) {
						// FAZ O CALCULO DAS DISTANCIAS EM RELAÇAO AOS VALORES DE CADA PONTO i
						dc1 = Math.sqrt(Math.pow(pontos.get(i).getVetorCar()[j] - centroid1.getVetorCar()[j], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 1] - centroid1.getVetorCar()[j + 1], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 2] - centroid1.getVetorCar()[j + 2], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 3] - centroid1.getVetorCar()[j + 3], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 4] - centroid1.getVetorCar()[j + 4], 2));

						dc2 = Math.sqrt(Math.pow(pontos.get(i).getVetorCar()[j] - centroid2.getVetorCar()[j], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 1] - centroid2.getVetorCar()[j + 1], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 2] - centroid2.getVetorCar()[j + 2], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 3] - centroid2.getVetorCar()[j + 3], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 4] - centroid2.getVetorCar()[j + 4], 2));

						dc3 = Math.sqrt(Math.pow(pontos.get(i).getVetorCar()[j] - centroid3.getVetorCar()[j], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 1] - centroid3.getVetorCar()[j + 1], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 2] - centroid3.getVetorCar()[j + 2], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 3] - centroid3.getVetorCar()[j + 3], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 4] - centroid3.getVetorCar()[j + 4], 2));

						dc4 = Math.sqrt(Math.pow(pontos.get(i).getVetorCar()[j] - centroid4.getVetorCar()[j], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 1] - centroid4.getVetorCar()[j + 1], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 2] - centroid4.getVetorCar()[j + 2], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 3] - centroid4.getVetorCar()[j + 3], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 4] - centroid4.getVetorCar()[j + 4], 2));

						dc5 = Math.sqrt(Math.pow(pontos.get(i).getVetorCar()[j] - centroid5.getVetorCar()[j], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 1] - centroid5.getVetorCar()[j + 1], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 2] - centroid5.getVetorCar()[j + 2], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 3] - centroid5.getVetorCar()[j + 3], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 4] - centroid5.getVetorCar()[j + 4], 2));

						dc6 = Math.sqrt(Math.pow(pontos.get(i).getVetorCar()[j] - centroid6.getVetorCar()[j], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 1] - centroid6.getVetorCar()[j + 1], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 2] - centroid6.getVetorCar()[j + 2], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 3] - centroid6.getVetorCar()[j + 3], 2)
								+ Math.pow(pontos.get(i).getVetorCar()[j + 4] - centroid6.getVetorCar()[j + 4], 2));
					}
					// GUARDA O PONTO COM MENOR DISTANCIA
					double valor[] = { dc1, dc2, dc3, dc4, dc5, dc6 };
					double menor = 666;

					for (int z = 0; z < valor.length; z++) {
						if (valor[z] < menor) {
							menor = valor[z];
						}
					}

					// DE ACORDO COM A MENOR DISTANCIA, ADICIONA O PONTO NO SEU RESPECTIVO GRUPO
					if (menor == valor[0]) {
						grupo1.add(pontos.get(i));
					} else if (menor == valor[1]) {
						grupo2.add(pontos.get(i));
					} else if (menor == valor[2]) {
						grupo3.add(pontos.get(i));
					} else if (menor == valor[3]) {
						grupo4.add(pontos.get(i));
					} else if (menor == valor[4]) {
						grupo5.add(pontos.get(i));
					} else if (menor == valor[5]) {
						grupo6.add(pontos.get(i));
					}

				} else {
					continue;
				}

			}
			// ADICIONA O PROPIO CENTROID AO SEU RESPECTIVO GRUPO
			grupo1.add(centroid1);
			grupo2.add(centroid2);
			grupo3.add(centroid3);
			grupo4.add(centroid4);
			grupo5.add(centroid5);
			grupo6.add(centroid6);

			// FAZ OS CALCULO DE NOVOS CENTROIDS PARA CADA ITERAÇAO
			double x = 0;
			double y = 0;
			double w = 0;
			double z = 0;
			double v = 0;
			for (int k = 0; k < grupo1.size(); k++) {

				x = x + grupo1.get(k).getVetorCar()[0];
				y = y + grupo1.get(k).getVetorCar()[1];
				w = w + grupo1.get(k).getVetorCar()[2];
				z = z + grupo1.get(k).getVetorCar()[3];
				v = v + grupo1.get(k).getVetorCar()[4];
			}
			x = x / grupo1.size();
			y = y / grupo1.size();
			w = w / grupo1.size();
			z = z / grupo1.size();
			v = v / grupo1.size();

			double c7[] = { x, y, w, z, v };

			for (int k = 0; k < grupo2.size(); k++) {

				x = x + grupo2.get(k).getVetorCar()[0];
				y = y + grupo2.get(k).getVetorCar()[1];
				w = w + grupo2.get(k).getVetorCar()[2];
				z = z + grupo2.get(k).getVetorCar()[3];
				v = v + grupo2.get(k).getVetorCar()[4];
			}
			x = x / grupo2.size();
			y = y / grupo2.size();
			w = w / grupo2.size();
			z = z / grupo2.size();
			v = v / grupo2.size();

			double c8[] = { x, y, w, z, v };

			for (int k = 0; k < grupo3.size(); k++) {

				x = x + grupo3.get(k).getVetorCar()[0];
				y = y + grupo3.get(k).getVetorCar()[1];
				w = w + grupo3.get(k).getVetorCar()[2];
				z = z + grupo3.get(k).getVetorCar()[3];
				v = v + grupo3.get(k).getVetorCar()[4];
			}
			x = x / grupo3.size();
			y = y / grupo3.size();
			w = w / grupo3.size();
			z = z / grupo3.size();
			v = v / grupo3.size();

			double c9[] = { x, y, w, z, v };
			for (int k = 0; k < grupo4.size(); k++) {

				x = x + grupo4.get(k).getVetorCar()[0];
				y = y + grupo4.get(k).getVetorCar()[1];
				w = w + grupo4.get(k).getVetorCar()[2];
				z = z + grupo4.get(k).getVetorCar()[3];
				v = v + grupo4.get(k).getVetorCar()[4];
			}
			x = x / grupo4.size();
			y = y / grupo4.size();
			w = w / grupo4.size();
			z = z / grupo4.size();
			v = v / grupo4.size();

			double c10[] = { x, y, w, z, v };

			for (int k = 0; k < grupo5.size(); k++) {

				x = x + grupo5.get(k).getVetorCar()[0];
				y = y + grupo5.get(k).getVetorCar()[1];
				w = w + grupo5.get(k).getVetorCar()[2];
				z = z + grupo5.get(k).getVetorCar()[3];
				v = v + grupo5.get(k).getVetorCar()[4];
			}
			x = x / grupo5.size();
			y = y / grupo5.size();
			w = w / grupo5.size();
			z = z / grupo5.size();
			v = v / grupo5.size();

			double c11[] = { x, y, w, z, v };

			for (int k = 0; k < grupo6.size(); k++) {

				x = x + grupo6.get(k).getVetorCar()[0];
				y = y + grupo6.get(k).getVetorCar()[1];
				w = w + grupo6.get(k).getVetorCar()[2];
				z = z + grupo6.get(k).getVetorCar()[3];
				v = v + grupo6.get(k).getVetorCar()[4];
			}
			x = x / grupo6.size();
			y = y / grupo6.size();
			w = w / grupo6.size();
			z = z / grupo6.size();
			v = v / grupo6.size();

			double c12[] = { x, y, w, z, v };

			centroid1 = new PontoTuristico(c7);
			centroid2 = new PontoTuristico(c8);
			centroid3 = new PontoTuristico(c9);
			centroid4 = new PontoTuristico(c10);
			centroid5 = new PontoTuristico(c11);
			centroid6 = new PontoTuristico(c12);
			aux1++;
		}

		double parte1 = 0;
		double parte2 = 0;
		double parte3 = 0;
		double parte4 = 0;
		double parte5 = 0;
		double parte6 = 0;
		double wss = 0;
		double bss = 0;
		double total = 0;

		for (int i = 0; i < grupo1.size(); i++) {
			if ((grupo1.get(i).getVetorCar()[1] != centroid1.getVetorCar()[1])) {
				// RODA CADA VALOR DE CADA PONTO DO GRUPO1
				for (int j = 0; j < 1; j++) {
					// FAZ O CALCULO DAS DISTANCIAS EM RELAÇAO AOS VALORES DE CADA PONTO i
					parte1 = parte1 + Math.pow(grupo1.get(i).getVetorCar()[j] - centroid1.getVetorCar()[j], 2)
							+ Math.pow(grupo1.get(i).getVetorCar()[j + 1] - centroid1.getVetorCar()[j + 1], 2)
							+ Math.pow(grupo1.get(i).getVetorCar()[j + 2] - centroid1.getVetorCar()[j + 2], 2)
							+ Math.pow(grupo1.get(i).getVetorCar()[j + 3] - centroid1.getVetorCar()[j + 3], 2)
							+ Math.pow(grupo1.get(i).getVetorCar()[j + 4] - centroid1.getVetorCar()[j + 4], 2);

				}
			} else {
				continue;
			}
		}

		for (int i = 0; i < grupo2.size(); i++) {
			if ((grupo2.get(i).getVetorCar()[1] != centroid2.getVetorCar()[1])) {
				// RODA CADA VALOR DE CADA PONTO DO GRUPO2
				for (int j = 0; j < 1; j++) {
					// FAZ O CALCULO DAS DISTANCIAS EM RELAÇAO AOS VALORES DE CADA PONTO i
					parte2 = parte2 + Math.pow(grupo2.get(i).getVetorCar()[j] - centroid2.getVetorCar()[j], 2)
							+ Math.pow(grupo2.get(i).getVetorCar()[j + 1] - centroid2.getVetorCar()[j + 1], 2)
							+ Math.pow(grupo2.get(i).getVetorCar()[j + 2] - centroid2.getVetorCar()[j + 2], 2)
							+ Math.pow(grupo2.get(i).getVetorCar()[j + 3] - centroid2.getVetorCar()[j + 3], 2)
							+ Math.pow(grupo2.get(i).getVetorCar()[j + 4] - centroid2.getVetorCar()[j + 4], 2);

				}
			} else {
				continue;
			}

		}

		for (int i = 0; i < grupo3.size(); i++) {
			if ((grupo3.get(i).getVetorCar()[1] != centroid3.getVetorCar()[1])) {
				// RODA CADA VALOR DE CADA PONTO DO GRUPO3
				for (int j = 0; j < 1; j++) {
					// FAZ O CALCULO DAS DISTANCIAS EM RELAÇAO AOS VALORES DE CADA PONTO i
					parte3 = parte3 + Math.pow(grupo3.get(i).getVetorCar()[j] - centroid3.getVetorCar()[j], 2)
							+ Math.pow(grupo3.get(i).getVetorCar()[j + 1] - centroid3.getVetorCar()[j + 1], 2)
							+ Math.pow(grupo3.get(i).getVetorCar()[j + 2] - centroid3.getVetorCar()[j + 2], 2)
							+ Math.pow(grupo3.get(i).getVetorCar()[j + 3] - centroid3.getVetorCar()[j + 3], 2)
							+ Math.pow(grupo3.get(i).getVetorCar()[j + 4] - centroid3.getVetorCar()[j + 4], 2);

				}
			} else {
				continue;
			}
		}

		for (int i = 0; i < grupo4.size(); i++) {
			if ((grupo4.get(i).getVetorCar()[1] != centroid4.getVetorCar()[1])) {
				// RODA CADA VALOR DE CADA PONTO DO GRUPO4
				for (int j = 0; j < 1; j++) {
					// FAZ O CALCULO DAS DISTANCIAS EM RELAÇAO AOS VALORES DE CADA PONTO i
					parte4 = parte4 + Math.pow(grupo4.get(i).getVetorCar()[j] - centroid4.getVetorCar()[j], 2)
							+ Math.pow(grupo4.get(i).getVetorCar()[j + 1] - centroid4.getVetorCar()[j + 1], 2)
							+ Math.pow(grupo4.get(i).getVetorCar()[j + 2] - centroid4.getVetorCar()[j + 2], 2)
							+ Math.pow(grupo4.get(i).getVetorCar()[j + 3] - centroid4.getVetorCar()[j + 3], 2)
							+ Math.pow(grupo4.get(i).getVetorCar()[j + 4] - centroid4.getVetorCar()[j + 4], 2);

				}
			} else {
				continue;
			}
		}

		for (int i = 0; i < grupo5.size(); i++) {
			if ((grupo5.get(i).getVetorCar()[1] != centroid5.getVetorCar()[1])) {
				// RODA CADA VALOR DE CADA PONTO DO GRUPO5
				for (int j = 0; j < 1; j++) {
					// FAZ O CALCULO DAS DISTANCIAS EM RELAÇAO AOS VALORES DE CADA PONTO i
					parte5 = parte5 + Math.pow(grupo5.get(i).getVetorCar()[j] - centroid5.getVetorCar()[j], 2)
							+ Math.pow(grupo5.get(i).getVetorCar()[j + 1] - centroid5.getVetorCar()[j + 1], 2)
							+ Math.pow(grupo5.get(i).getVetorCar()[j + 2] - centroid5.getVetorCar()[j + 2], 2)
							+ Math.pow(grupo5.get(i).getVetorCar()[j + 3] - centroid5.getVetorCar()[j + 3], 2)
							+ Math.pow(grupo5.get(i).getVetorCar()[j + 4] - centroid5.getVetorCar()[j + 4], 2);

				}
			} else {
				continue;
			}
		}

		for (int i = 0; i < grupo6.size(); i++) {
			if ((grupo6.get(i).getVetorCar()[1] != centroid6.getVetorCar()[1])) {
				// RODA CADA VALOR DE CADA PONTO DO GRUPO6
				for (int j = 0; j < 1; j++) {
					// FAZ O CALCULO DAS DISTANCIAS EM RELAÇAO AOS VALORES DE CADA PONTO i
					parte6 = parte6 + Math.pow(grupo6.get(i).getVetorCar()[j] - centroid6.getVetorCar()[j], 2)
							+ Math.pow(grupo6.get(i).getVetorCar()[j + 1] - centroid6.getVetorCar()[j + 1], 2)
							+ Math.pow(grupo6.get(i).getVetorCar()[j + 2] - centroid6.getVetorCar()[j + 2], 2)
							+ Math.pow(grupo6.get(i).getVetorCar()[j + 3] - centroid6.getVetorCar()[j + 3], 2)
							+ Math.pow(grupo6.get(i).getVetorCar()[j + 4] - centroid6.getVetorCar()[j + 4], 2);

				}
			} else {
				continue;
			}
		}

		wss = parte1 + parte2 + parte3 + parte4 + parte5 + parte6;
		parte1 = 0;
		parte2 = 0;
		parte3 = 0;
		parte4 = 0;
		parte5 = 0;
		parte6 = 0;

		for (int j = 0; j < 1; j++) {

			parte1 = Math.pow(calculaM().getVetorCar()[j] - centroid1.getVetorCar()[j], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 1] - centroid1.getVetorCar()[j + 1], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 2] - centroid1.getVetorCar()[j + 2], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 3] - centroid1.getVetorCar()[j + 3], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 4] - centroid1.getVetorCar()[j + 4], 2);

		}
		parte1 = parte1 * grupo1.size() - 1;
		for (int j = 0; j < 1; j++) {

			parte2 = Math.pow(calculaM().getVetorCar()[j] - centroid2.getVetorCar()[j], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 1] - centroid2.getVetorCar()[j + 1], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 2] - centroid2.getVetorCar()[j + 2], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 3] - centroid2.getVetorCar()[j + 3], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 4] - centroid2.getVetorCar()[j + 4], 2);

		}
		parte2 = parte2 * grupo2.size() - 1;
		for (int j = 0; j < 1; j++) {

			parte3 = Math.pow(calculaM().getVetorCar()[j] - centroid3.getVetorCar()[j], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 1] - centroid3.getVetorCar()[j + 1], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 2] - centroid3.getVetorCar()[j + 2], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 3] - centroid3.getVetorCar()[j + 3], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 4] - centroid3.getVetorCar()[j + 4], 2);

		}
		parte3 = parte3 * grupo3.size() - 1;
		for (int j = 0; j < 1; j++) {

			parte4 = Math.pow(calculaM().getVetorCar()[j] - centroid4.getVetorCar()[j], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 1] - centroid4.getVetorCar()[j + 1], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 2] - centroid4.getVetorCar()[j + 2], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 3] - centroid4.getVetorCar()[j + 3], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 4] - centroid4.getVetorCar()[j + 4], 2);

		}
		parte4 = parte4 * grupo4.size() - 1;
		for (int j = 0; j < 1; j++) {

			parte5 = Math.pow(calculaM().getVetorCar()[j] - centroid5.getVetorCar()[j], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 1] - centroid5.getVetorCar()[j + 1], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 2] - centroid5.getVetorCar()[j + 2], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 3] - centroid5.getVetorCar()[j + 3], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 4] - centroid5.getVetorCar()[j + 4], 2);

		}
		parte5 = parte5 * grupo5.size() - 1;
		for (int j = 0; j < 1; j++) {

			parte6 = Math.pow(calculaM().getVetorCar()[j] - centroid6.getVetorCar()[j], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 1] - centroid6.getVetorCar()[j + 1], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 2] - centroid6.getVetorCar()[j + 2], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 3] - centroid6.getVetorCar()[j + 3], 2)
					+ Math.pow(calculaM().getVetorCar()[j + 4] - centroid6.getVetorCar()[j + 4], 2);

		}
		parte6 = parte6 * grupo6.size() - 1;

		bss = parte1 + parte2 + parte3 + parte4 + parte5 + parte6;

		total = wss + bss;

		System.out.println("\nPara K = 6\n");
		System.out.println("\nwss = " + wss + "\n");
		System.out.println("\nbss = " + bss + "\n");
		System.out.println("\nTotal = wss + bss = " + total + "\n");

	}

}
