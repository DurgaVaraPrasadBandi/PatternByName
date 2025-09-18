import java.util.Scanner;

public class PatternByName {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Please Enter Your Name:");
        String name=in.nextLine();
        for(int i=1;i<=5;i++){
            for(int k=0;k<name.length();k++){
                char ch=name.charAt(k);
                switch (ch){
                    case 'a':
                    case 'A':
                        for (int j = 1; j <=5; j++) {
                            if(i==1 && j==3 || i==2 &&(j==2||j==4) || i==3|| (i==4||i==5)&& (j==1||j==5)){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'b':
                    case 'B':
                        for(int j=1;j<=5;j++){
                            if((i==1|| i==3|| i==5)&& j<5 || j==1||(i==2 || i==4)&&j==5){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'c':
                    case 'C':
                        for(int j=1;j<=5;j++){
                            if((i==1||i==5)&&j>1 || (i>1 &&i<5)&& j==1){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'd':
                    case 'D':
                        for(int j=1;j<=5;j++){
                            if(j==1 || (i==1|| i==5)&& j<5||(i>1 && i<5)&&j==5){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'e':
                    case 'E':
                        for (int j = 1; j <=5 ; j++) {
                            if((i==1||i==5)&&j>1 || i==3|| j==1){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'f':
                    case 'F':
                        for (int j = 1; j <=5 ; j++) {
                            if(j==1|| i==1||i==3){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'g':
                    case 'G':
                        for(int j=1;j<=5;j++){
                            if(i == 1 && j > 1 || i > 1 && i < 5 && j == 1 || i == 5 && (j == 2 || j == 3 || j == 5) || i == 4 && (j == 4 || j == 5) || i == 3 && j > 2){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'h':
                    case 'H':
                        for (int j = 1; j <=5 ; j++) {
                            if(j==1 || j==5 || i==3){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }

                        }
                        System.out.print(" ");
                        break;

                    case 'i':
                    case 'I':
                        for (int j = 1; j <=5 ; j++) {
                            if(i==1||i==5||j==3){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'j':
                    case 'J':
                        for (int j = 1; j <=5 ; j++) {
                            if(i==1|| j==3|| (i==3|| i==4||i==5)&&j==1 || i==5 && j==2){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'k':
                    case 'K':
                        for (int j = 1; j <=5 ; j++) {
                            if(j==1 || (i==1|i==5)&&j==5 || (i==2||i==4)&&j==4 || i==3 && (j==3||j==2)){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'l':
                    case 'L':
                        for (int j = 1; j <=5 ; j++) {
                            if(j==1||i==5){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'm':
                    case 'M':
                        for (int j = 1; j <=5 ; j++) {
                            if(j==1||j==5||i==2&&(j==2||j==4)||i==3&&j==3){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'n':
                    case 'N':
                        for (int j = 1; j <=5 ; j++) {
                            if(j==1||j==5||i==j){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case'o':
                    case 'O':
                        for (int j = 1; j <=5 ; j++) {
                            if((i==1||i==5)&&(j>1&&j<5)||(j==1||j==5)&&(i>1&&i<5)){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'p':
                    case 'P':
                        for (int j = 1; j <=5 ; j++) {
                            if(j==1||(i==1||i==3)&&j<5||i==2&&j==5){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'q':
                    case 'Q':
                        for (int j = 1; j <=5 ; j++) {
                            if((i==1||i==5)&&(j>1&&j<5)||(j==1||j==5)&&(i>1&&i<5) || i>2&&(i==j)){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'r':
                    case 'R':
                        for (int j = 1; j <=5 ; j++) {
                            if(j==1||(i==1||i==3)&&j<5||i==2&&j==5 || i>3&&(i==j)){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 's':
                    case 'S':
                        for (int j = 1; j <=5 ; j++) {
                            if(j==1&&(i==2||i==5)||(i==1||i==3||i==5)&&(j>1&&j<5)||(i==4||i==1)&&j==5){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 't':
                    case 'T':
                        for (int j = 1; j <=5 ; j++) {
                            if(i==1||j==3){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'u':
                    case 'U':
                        for (int j = 1; j <=5 ; j++) {
                            if((j==1||j==5)&&i<5||i==5&&(j>1&&j<5)){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'v':
                    case 'V':
                        for (int j = 1; j <=5 ; j++) {
                            if((j==1||j==5)&& i<4||i==4&&(j==2||j==4)||i==5&&j==3){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'w':
                    case 'W':
                        for (int j = 1; j <=5 ; j++) {
                            if(j==1||j==5||(j==2||j==4)&&i==4||i==3&&j==3){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'x':
                    case 'X':
                        for (int j = 1; j <=5 ; j++) {
                            if(i==j||j==(5-i+1)){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'y':
                    case 'Y':
                        for (int j = 1; j <=5 ; j++) {
                            if(i==j && i<4||j==(5-i+1)){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    case 'z':
                    case 'Z':
                        for (int j = 1; j <=5 ; j++) {
                            if(i==1||i==5||j==(6-i)){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print(" ");
                        break;

                    default:
                        for (int j = 1; j <=5 ; j++) {
                            System.out.print("  ");
                        }
                }

            }
            System.out.println();
        }

    }

}
