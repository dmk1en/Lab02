package Lab02;

public class Cart {
    private int qtyOrdered;
    private float cost;

    public static final int MAX_NUMBERS_ORDER = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDER];
    

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered >=20 ){
            System.out.println("The cart is almost full");
        }
        else{
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered += 1;
            System.out.println("The disc has been added");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed.");
                return;
            }
        }
        System.out.println("The disc was not found in the cart.");
    }

    public float totalCost(){
        for (int i = 0; i < qtyOrdered; i++){
            cost += itemsOrdered[i].getCost();
        }
        return cost;
    }
}   
