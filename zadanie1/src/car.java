class car{
	public String marka;
	public String model;
	public int Rokprodukcji;

	public car(String marka, String model, int rokprodukcji) {
        	this.marka = marka;
        	this.model = model;
        	Rokprodukcji = rokprodukcji;
    	}

	public void showinfo(){
		System.out.println("marka:" + marka + " " + "model:"+model + " "+ "rokProdukcji:" + Rokprodukcji);
	}
}
