package br.com.treinar;

public enum DiaSemana {

	DOMINGO(true, "a") {
		@Override
		public Boolean ehDiaUtil(Integer diaMes) {
			return null;
		}
	},
	SEGUNDA(false, "b") {
		@Override
		public Boolean ehDiaUtil(Integer diaMes) {
			return null;
		}
	},
	TERCA(false, "c") {
		@Override
		public Boolean ehDiaUtil(Integer diaMes) {
			return null;
		}
	},
	QUARTA(false, "d") {
		@Override
		public Boolean ehDiaUtil(Integer diaMes) {
			return null;
		}
	},
	QUINTA(false, "e") {
		@Override
		public Boolean ehDiaUtil(Integer diaMes) {
			return null;
		}
	},
	SEXTA(false, "f") {
		@Override
		public Boolean ehDiaUtil(Integer diaMes) {
			return null;
		}
	},
	SABADO(true, "g") {
		
		private void imprimir() {
			System.out.println();
		}
		
		@Override
		public Boolean ehDiaUtil(Integer diaMes) {
			imprimir();
			return null;
		}
	};
	
	public abstract Boolean ehDiaUtil(Integer diaMes);
	
	private Boolean ehFinalDeSemana;
	private String signo;
	
	private DiaSemana(Boolean ehFinalDeSemana, String signo) {
		this.ehFinalDeSemana = ehFinalDeSemana;
		this.signo = signo;
	}
	
	public Boolean getEhFinalDeSemana() {
		return ehFinalDeSemana;
	}
	
	public String getSigno() {
		return signo;
	}
	
}
