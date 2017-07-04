# Day # 2 Find the next biggest number with the same digits

You have to create a method that takes a positive integer number and returns the next bigger number formed by the same digits:

```java
BiggestNumber.findTheNextBiggerNumber(12)==21
BiggestNumber.findTheNextBiggerNumber(513)==531
BiggestNumber.findTheNextBiggerNumber(2017)==2071
```
If no bigger number can be composed using those digits, return -1:

```java
BiggestNumber.findTheNextBiggerNumber(9)==-1
BiggestNumber.findTheNextBiggerNumber(111)==-1
BiggestNumber.findTheNextBiggerNumber(531)==-1
```