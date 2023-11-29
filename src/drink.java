public class drink {

    boolean hasGas = false;
    int price = 0;



    public drink(boolean hasGas , int price){

        this.hasGas = hasGas;
        this.price = price;

    }
    public boolean getHasGas(){
        return this.hasGas;
    }
    public void setHasGas(boolean hasGas ){
        this.hasGas = hasGas;
    }

    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }



}
