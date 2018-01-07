package lessons.generics;

public class GenericsTest {

    public void go(){
        GenericsTester<String> gt = new GenericsTester<>();
        gt.getChicken("chicken");
    }


    //clearing up whether there are limitations on what the generic can be called.. Turns out not.
    private static class GenericsTester<Chicken> {

        public Chicken getChicken(Chicken chicken){
            return chicken;
        }

    }

}
