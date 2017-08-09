package prototype;

public class ItemRegistry {
    Item currentItem = new Item();
    Item getItem(){
        try {
            return (Item)currentItem.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
