public class DrinksDispenserTest{
    public static void main(String[] args){
        Integer itemListSize=Input.getInteger("item list size: ");
        DrinksDispenser drinksDispenser=new DrinksDispenser(itemListSize);
        String name;
        Integer initialAmount;
        Integer amountToBeAdded;
        Integer option;
        do{
            System.out.println("0: quit");
            System.out.println("1: add item");
            System.out.println("2: dispense item");
            System.out.println("3: restock item");
            System.out.println("4: display");
            option=Input.getInteger("option: ");
            switch (option){
                case 0:
                    System.out.println("quitting program");
                    break;
                case 1:
                    name = Input.getString("item name: ");
                    initialAmount = Input.getInteger("initial amount: ");
                    drinksDispenser.addItem(name, initialAmount);
                    break;
                case 2: // assume that a valid name will be input
                    name = Input.getString("item name: ");
                    if (drinksDispenser.dispenseItem(name))
                        System.out.println("item dispensed");
                    else
                        System.out.println("out of stock");
                    break;
                case 3: // assume that a valid name will be input
                    name = Input.getString("item name: ");
                    amountToBeAdded = Input.getInteger("amount to be added: ");
                    drinksDispenser.restockItem(name, amountToBeAdded);
                    break;
                case 4:
                    System.out.println(drinksDispenser);
                    break;
                default:
                    System.out.println("invalid option");
            }
        }while(option!=0);
    }
}
