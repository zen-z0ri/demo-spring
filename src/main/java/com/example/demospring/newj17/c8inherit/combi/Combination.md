## Initialization
Instance variable will be initialized with default value;
<br/> primary type -> 0 false ...
reference type -> null
### 1. Lazy initialization
```java
String laz;
if (laz == null) {
    laz = "lazy initialzation"
}
```
### 2. instance initializer
```java
class Test {
    String name;
    {
       name = "Instance initializer";
    }
    Test() {
        
    }
}
```

## Inherited from Object
Java只支持单一继承，但可以实现多个接口。如果未显示继承任何类，系统将默认继承对象类。但是，如果a显示继承B，则系统不会给出默认的继承对象，
而是a将继承B，B将继承object，这相当于间接地继承对象。

经典的例子是record: record 所有的都继承自隐藏的Record class. 所以不能在
