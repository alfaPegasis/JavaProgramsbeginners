public class Star {

public static void main(String[] args) {

int rows = 5;

for (int i = 1; i <= rows; ++i) {  //Outer loop for rows

for (int j = 1; j <= i; ++j) { //Inner loop for Col

System.out.print("* "); //Print *

}

System.out.println(); //New line

}

}

}
