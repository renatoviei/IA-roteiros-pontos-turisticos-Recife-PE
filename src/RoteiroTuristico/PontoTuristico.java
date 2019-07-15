package RoteiroTuristico;

import java.util.Arrays;

//PONTOS TURISTICOS SAO VETORES COM VALORES QUE CONTEM INFORMAÇOES SOBRE ELES
public class PontoTuristico {
	private double[] vetorCar;

	public PontoTuristico(double[] vetorCar) {
		this.vetorCar = vetorCar;

	}

	public double[] getVetorCar() {
		return vetorCar;
	}

	public void setVetorCar(double[] vetorCar) {
		this.vetorCar = vetorCar;
	}

	@Override
	public String toString() {
		return "PontoTuristico [vetorCar=" + Arrays.toString(vetorCar) + "]";
	}

}
