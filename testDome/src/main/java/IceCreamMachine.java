import java.util.ArrayList;
import java.util.List;


//Implement the IceCreamMachine's scoops method so that it returns all combinations
// //of one ingredient and one topping. If there are no ingredients or toppings,
// the method should return an empty list.
public class IceCreamMachine {
    public String[] ingredients;
    public String[] toppings;

    public static class IceCream {
        public String ingredient;
        public String topping;

        public IceCream(String ingredient, String topping) {
            this.ingredient = ingredient;
            this.topping = topping;
        }
    }

    public IceCreamMachine(String[] ingredients, String[] toppings) {
        this.ingredients = ingredients;
        this.toppings = toppings;
    }

    public List<IceCream> scoops() {
        List<IceCream> list=new ArrayList<>();
        for (String ingredient : ingredients) {
            for (String topping : toppings) {
                list.add(new IceCream(ingredient,topping));

            }
        }

        return list;

//
    }

    public static void main(String[] args) {
        IceCreamMachine machine = new IceCreamMachine(new String[]{
                "vanilla", "chocolate"
        }, new String[]{
                "chocolate sauce"
        });


        List<IceCream> scoops = machine.scoops();

        /*
         * Should print:
         * vanilla, chocolate sauce
         * chocolate, chocolate sauce
         */
        for (IceCream iceCream : scoops) {
            System.out.println(iceCream.ingredient + ", " + iceCream.topping);
        }
    }
}
