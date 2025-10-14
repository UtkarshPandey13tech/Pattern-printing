//pattern
class pattern{
public static void main(String [] args){
int i ,j;
for(i=1;i<=3;i++){
for(j=1;j<=2*i-1;j++){
System.out.print("*");
}
System.out.println();
}
}
}
/*

C:\Users\ankur\OneDrive\Desktop\Javanote>javac pattern.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java pattern
*
***
*****
*/