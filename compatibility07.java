import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class compatibility07 {
    public static void main(String[] args) {


        System.out.println("この中で特に好きな分野は？");
        System.out.println("1.食事, 2.動物, 3.映画");


        Scanner junle = new Scanner(System.in);
        int junleAns = junle.nextInt();

        if (junleAns == 1) {
            List<String> list=Arrays.asList("焼き鳥は塩よりタレ派だ", "餃子は焼き餃子派だ", "ワインは白派だ", "焼肉には白飯が欠かせない");
            Collections.shuffle(list);
            String[] array =(String[])list.toArray(new String[list.size()]);
            printArray(array);


        } else if (junleAns == 2){
            List<String> list=Arrays.asList("ペットを飼っているor飼いたい" , "動物の動画をyoutube等でよくみる", "動物のlineスタンプをすぐ買ってしまう", "猫派だ");
            Collections.shuffle(list);
            String[] array =(String[])list.toArray(new String[list.size()]);
            printArray(array);

        } else if (junleAns == 3){
            List<String> list=Arrays.asList("家より映画館で観たい" , "洋画は字幕で観たい", "映画を観ると、すぐにその映画のサントラをダウンロードしてしまう", "ネタバレをチェックしてししまう");
            Collections.shuffle(list);
            String[] array =(String[])list.toArray(new String[list.size()]);
            printArray(array);
        }

    }


    public static void printArray(String[] array) {

        int[] answer = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println(array[i]);
            System.out.println("1.当てはまらない, 2.あまり当てはまらない, 3.まあまあ当てる, 4.当てはまる");

            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            answer[i] = num;

            if(answer[0] == 1 && answer[1] ==1 && answer[2] ==1){
                System.out.println("まだ全て質問していませんが…");
                break;
            }
        }

        int sumAns = answer[0] + answer[1] + answer[2] + answer[3];
        System.out.println("あなたと私の相性は");

        if (sumAns > 14) {
            System.out.println("気があうと思います！すぐに食事に行きましょう！");
        } else if (sumAns > 9) {
            System.out.println("まあまあ気が合うかも。とりあえず連絡先でも交換しましょう");
        } else {
            System.out.println("あんまりかも。機会があれば、お話ししましょう");
        }


    }


}




