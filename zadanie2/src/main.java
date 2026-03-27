class main{
	public static void main(String[] args){
		kontoBankowe konto = new kontoBankowe(1000);

		konto.wplac(500);
		konto.wyplac(200);

		konto.getSaldo();
	}
}
