// widening and narrowing

class type{
public static void main(String [] args){
byte a =10;
short s = a;
int i = s;
long l= i;
float f = l;
double d = f;
System.out.println(a);
System.out.println(s);
System.out.println(i);
System.out.println(l);
System.out.println(f);
System.out.println(d);
System.out.println(Short.MAX_VALUE);
System.out.println(Short.MIN_VALUE);
}
}