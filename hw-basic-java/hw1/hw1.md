### Hw1 lesson 2

- [Github Page](https://github.com/moahmadkamel/qa6-java/tree/master/hw-basic-java/hw1)

---

**Раздел 1. Не делаем его в среде разработки**

    mercedes = (1 + (3*(2-4))%3 + (11-7)*2)+(3-5)*3;
    volvo = mercedes*3 - 9%mercedes + 16-(-mercedes);
    opel = mercedes%volvo;
    Необходимо вычислить значения mercedes, volvo и opel?

mercedes = (1 + (3*(2-4))%3 + (11-7)*2)+(3-5)*3;

mercedes = (1 + (-6) % 3 + (4) * 2) + (-2) * 3;

mercedes = (1 + 0 + 8 ) - 6;

mercedes = 9 - 6 = 3;

volvo = mercedes*3 - 9%mercedes + 16-(-mercedes);

volovo = 3 * 3 - 9 % 3 + 16 - (-3);

volvo = 9 - 0 + 16 + 3;

volvo = 9 + 19;

volvo = 28;

opel = mercedes%volvo;

opel = 3 % 28;

opel = 3;

Solution: mercedes = 3 and volvo = 28 and opel = 3
___ 

    int x = 3;
    int y = ++x*2;
    x+=-y*3 + ++x + --y;
    y+=(-x++)%3;
    int z = x + y;
    Необходимо вычислить значения x, y и z?

int x = 3;

x = 3;

int y = ++x * 2;

y = 4 * 2;

y = 8;

x += -y * 3 + ++x + --y;

x += -8 * 3 + 5 + 7;

x += -24 + 12;

x += -12;

x = 4 + (-12);

x = -8;

y += (-x++) % 3;

y += (-(-8)) % 3;

y += 8 % 3;

y += 2;

y = 7 + 2;

y = 9;

int z = x + y;

z = -7 + 9;

z = 2;

Solution: x = -7 and y = 9 and z = 2    

*** 
        
    boolean a = (85/5+(19-25%3))==(-3)*(-2+14/(-2))&&(2%7-1)*3<=2;
    boolean b = !a||a&&!a;
    boolean c = false&&!true||!((23%3+14)%3==7);
    Необходимо вычислить значения a, b и c?

boolean a = (85 / 5 + (19 - 25 % 3)) == (-3) * (-2 + 14 / (-2)) && (2 % 7 - 1) * 3 <= 2;

a = (17 + (19 - 1)) == (-3) * (-2 + -7) && (2 - 1) * 3 <= 2;

a = (35) == (27) && (3) <= 2;

a = false && false;

a = false;

boolean b = !a || a && !a;

b = !false || false && !false;

b = true || false && true;

b = true || false;

b = true;

boolean c = false && !true || !((23 % 3 + 14) % 3 == 7);

c = false && false || !((2 + 14) % 3 == 7);

c = false && false || !(1 == 7);

c = false && false || !false;

c = false && false || true;

c = false || true;

c = true;

Solution: a = false and b = true and c = true    

---

__Раздельчик 2. Делаем его в среде разработки__

    Coздать две переменные типа int:
    int a = 7;
    int b = 9;
    Поменять между собой значения переменных a и b.
    Создавать новые переменные нельзя.
    Можно применять только арифметические 
    действия к перемнным a и b.
    Вывести в консоль значения переменных 
    a и b после их переопределения.

``` java
int num1 = 7;
int num2 = 9;

// first method
num1 = num1 + num2;
num2 = num1 - num2;
num1 = num1 - num2;
System.out.println("num1 = " + num1 + " and num2 = " + num2); 
// num1 = 9 and num2 = 7 

// second method
num2 = num1 + num2 - (num1 = num2);
System.out.println("num1 = " + num1 + " and num2 = " + num2); 
// num1 = 9 and num2 = 7 
``` 


