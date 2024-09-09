package my.enjoy.영석;

import java.util.Arrays;

public class 배열_영석 {

    public static void main(String[] args) {
    String[] shapes = {"SPADE", "CLOVER", "HART", "DIAMOND"};
    String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

//
//    String[] copyCardNumbers = new String[13];
//    String[] copyShapes = Arrays.copyOf(shapes, 4);
//    System.arraycopy(cardNumbers, 0, copyCardNumbers, 0, cardNumbers.length);

//    int randomShapeIndex = (int)(Math.random()*shapes.length);
//    int randomCardNumberIndex = (int)(Math.random()*cardNumbers.length);

//    int randomCopyShapeIndex = (int)(Math.random()*copyShapes.length);
//    int randomCopyCardNumberIndex = (int)(Math.random()*copyCardNumbers.length);
//
//        System.out.println("첫 번째로 뽑은 카드는 " + shapes[randomShapeIndex]+" " + cardNumbers[randomCardNumberIndex]+ " 카드입니다.");
//        System.out.println("두 번째로 뽑은 카드는 " + copyShapes[randomCopyShapeIndex]+" " + copyCardNumbers[randomCopyCardNumberIndex]+ " 카드입니다.");
//
//        if(shapes[randomShapeIndex].equals(shapes[randomCopyShapeIndex])){
//            System.out.println("축하합니다! 두 장의 카드가 같은 모양입니다.");
//        }else {
//            System.out.println("아쉽습니다. 다른 모양의 카드입니다.");
//        }


        int randomShapeIndex = (int)(Math.random()*shapes.length);
        int randomCardNumberIndex = (int)(Math.random()*cardNumbers.length);

        int randomShapeIndex2 = (int)(Math.random()*shapes.length);
        int randomCardNumberIndex2 = (int)(Math.random()*cardNumbers.length);

        System.out.println("첫 번째로 뽑은 카드는 " + shapes[randomShapeIndex]+" " + cardNumbers[randomCardNumberIndex]+ " 카드입니다.");
        System.out.println("첫 번째로 뽑은 카드는 " + shapes[randomShapeIndex2]+" " + cardNumbers[randomCardNumberIndex2]+ " 카드입니다.");

        if(shapes[randomShapeIndex].equals(shapes[randomShapeIndex2])){
            System.out.println("축하합니다! 두 장의 카드가 같은 모양입니다.");
        }else {
            System.out.println("아쉽습니다. 다른 모양의 카드입니다.");
        }


}




}
