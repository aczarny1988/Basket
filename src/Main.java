public class Main {
    public static void main(String[] args) {
        basket(2, 3, 5);
    }

    public static void basket(int apple, int orange, int coin) {
        /*
        Kucharz dostał na urodziny dwa kosze owoców. W pierwszym koszu jest J jabłek, w drugim P pomarańczy.
        Kucharz lubi pomarańcze i jabłka tak samo bardzo dlatego chciałby mieć ich po równo.
        Każde jabłko i każda pomarańcza kosztuje 1 złotą monetę. Kucharz ma Z monet.
        Napisz program, który na wejściu dostaje trzy liczby:
        J P Z (ilość jabłek, ilość pomarańczy, ilość złotych monet).
        Program ma wypisywać jaka jest minimalna możliwa różnica między ilością jabłek i pomarańczy po zakupie owoców.
        Kucharz jest bardzo łakomy więc zawsze wydaje wszystkie monety na zakupach.
         */

        int appleAdd = 1;
        int orangeAdd = 1;

        for (int i = 0; i < coin; i++) {
                if(apple<orange) {
                    apple += 1;
                    coin--;
                } else if(orange<apple) {
                    orange +=1;
                    coin--;
                }else {
                    orange++;
                    coin--;
                }
        }

/*        while(coin !=0 ) {
            if(apple>orange) {
                orange++;
                coin--;
            } else if(orange>apple) {
                apple++;
                coin--;
            } else {
                orange++;
                coin--;
            }
        }*/

        System.out.println("Orange: " + orange);
        System.out.println("Apple" + apple);

        int summary = orange-apple;
        System.out.println("Summary: " + summary);
    }
}
