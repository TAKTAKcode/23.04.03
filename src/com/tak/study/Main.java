package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //시간의 합구하기 -> cnt 선언 후 += 사용하여 합하기

        Scanner sc = new Scanner(System.in);

        //입력받을 문자
        String str = sc.nextLine();

        //횟수 담기
        int cnt = 0;

        //입력받은 문자의 길이만큼 반복
        for (int i = 0; i < str.length(); i++) {

            //오늘은 일하느라 지쳤으니.. 내일 이어서..
            switch(str.charAt(i)) {

                case 'A' :
                case 'B' :
                case 'C' :
                    cnt += 3;
                    break;

                case 'D' :
                case 'E' :
                case 'F' :
                    cnt += 4;
                    break;

                case 'G' :
                case 'H' :
                case 'I' :
                    cnt += 5;
                    break;

                case 'J' :
                case 'K' :
                case 'L' :
                    cnt += 6;
                    break;

                case 'M' :
                case 'N' :
                case 'O' :
                    cnt += 7;
                    break;

                case 'P' :
                case 'Q' :
                case 'R' :
                case 'S' :
                    cnt += 8;
                    break;

                case 'T' :
                case 'U' :
                case 'V' :
                    cnt += 9;
                    break;

                case 'W' :
                case 'X' :
                case 'Y' :
                case 'Z' :
                    cnt += 10;
                    break;
            }
        }
        System.out.print(cnt);
    }

}
