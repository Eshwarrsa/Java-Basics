# **OOPS**
# Polymorphism:
## Overloading:
&nbsp; &nbsp; The process of creating multiple method with same method signature but different in number of arguments or data type is known as method overloading. This is also known as compile time polymorphism. Since these methods are called during the compile time itself. So, these methods become fixed. The example program for overloading is:
```java
class A {
    public static void main(String args[]) {
        add(1, 2);
        add(1.0, 2.0);
    }

    public static void add(int a, int b){
        return a + b;
    }

    public static void add(double a, double b){
        return a + b;
    }
}
```
## Overriding:
&nbsp; &nbsp; The process of creating same method signature in child class which is already present in the parent class with different implementation is known as overriding. For Overriding is-a relationship is mandatory. It is also known as runtime polymorphism because the method will be called according to the instance in the run time. The non private, non static and non final methods are only be overridden. private, static, final methods are connot be overridden. It is flexible during runtime. For Example:
```java
class A {
    public void m1(){
        System.out.println("Parent method");
    }
}

class B extends A {
    public void m1(){
        System.out.println("Child Method");
    }
}
```
## Difference between overloading and overriding:
|**S.No**|**Overloading**|**Overriding**|
|--------|---------------|--------------|
|**1.**|The process of writing multiple method with same method signature but different argument is known as overloading.|The process of writing the method in child class with same method signature in the parent class but different implementation is known as overriding|
|**2.**|It is also known as compile time polymorphism|It is also known as run time polymorphism|
|**3.**|is-a relationship is not mandatory|is-a relationship is mandatory|
|**4.**|It does not have any anotation|It is having an anotation `@Override` but it is not mandatory to use|
|**5.**|All method can be overloaded including main method|Only non static, non private and non final method can be Overridden|