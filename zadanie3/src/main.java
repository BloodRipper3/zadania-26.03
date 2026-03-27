class main{
	public static void main(String[] args){
		    	
		pracownik praca = new pracownik("arek", 300);
    		programista mordeczka = new programista("marek",200, "java");
		menager pazdan = new menager("pazdan", 2000, 300);
		
		System.out.println("pracownik:"+praca.imie+" , "+praca.pensja);
    		System.out.println("Programista:"+mordeczka.imie+" , "+mordeczka.pensja+" , "+mordeczka.jezyk);
    		System.out.println("Programista:"+pazdan.imie+" , "+pazdan.pensja+" , "+pazdan.premia);
	}
}
