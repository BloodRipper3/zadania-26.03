public class kontoBankowe {
	private double saldo;

	public kontoBankowe(double startSaldo){
		this.saldo = startSaldo;
	}

	public void wplac(double kwota){
		if(kwota > 0){
			saldo += kwota;
			System.out.println("Wpłacono" + kwota + "saldo:" + saldo);
		}
		else{
			System.out.println("kwota ma byc wieksza niz 0");
		}
	}

	public void wyplac(double kwota){
		if(saldo >= kwota){
			saldo -= kwota;
			System.out.println("Wypłacono"+kwota+"Saldo:"+saldo);
		}
		else{
			System.out.println("Niemasz tyle siana");
		}
	}
	public void getSaldo(){
		System.out.println("Twoje Saldo:"+saldo);
	}
}

