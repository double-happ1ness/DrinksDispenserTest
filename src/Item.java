public class Item{
    private String name;
    private Integer amountInStock;

    public Item(String name, Integer initialAmount){
        this.name=name;
        this.amountInStock=initialAmount;
    }
	
    public Boolean dispense(){
        Boolean dispensed=true;
        if (this.amountInStock!=0)
            this.amountInStock--;
        else
            dispensed=false;
        return dispensed;
    }
	
    public void restock(Integer amountToBeAdded){
        this.amountInStock+=amountToBeAdded;

    }
	
    public String toString(){
        return this.name+" items in stock: "+this.amountInStock;
    }

    public String getName(){
        return this.name;
    }
}
