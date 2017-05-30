package edu.oit.lesson9.assignment;

public class Demo {
private int i;
private static int num = 4;

public Demo(int i) {
this.i = i;
}

public int calculate() {
int sum = 0;
int num = 0;
for (int i = 0; i < 3; i++) {
sum += i * (i + 1);
}
num += sum;
return sum;
}
public static int getResult(int i, int j){
return i++ * ++j;
}
public static void main(String[] args) {
int a = 5;
int b = 2;
for (int i = 10; i > 0; i--) {
for (int j = 0; j < 5; j++) {
if (j > i) {
break;
}
System.out.println("execute");
}
}
System.out.printf("%d,%d,%d",a,b,getResult(a,b));
}


}