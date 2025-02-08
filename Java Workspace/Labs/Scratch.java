
public class Scratch {
    public static void main(String[] args) {
        boolean isPremiumCustomer = false;
        int nbooksPurchased = 0;
        int freeBooks;

        if (isPremiumCustomer){
            if (nbooksPurchased == 0){
                freeBooks = 0;
            }
            else if (nbooksPurchased >= 5){
                freeBooks = 1;
            }
            else if (nbooksPurchased >= 8){
                freeBooks = 2;
            }
        }
        else if (nbooksPurchased >= 7){
            freeBooks = 1;
        }
        else if (nbooksPurchased >= 12){
            freeBooks = 2;
        }
        
        
    }
}