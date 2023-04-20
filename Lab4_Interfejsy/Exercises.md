## Zadania ✏️
1 Przygotuj dwa interfejsy
* **Moveable** z dwiema metodami *void start()* oraz *void stop()*
* **Measurable** z metodą *int getWeigth()*

a następnie utwórz klasę **Car** oraz **Bike** implementującą oba te interfejsy.  
Zaproponuj wyświetlenie zwracanych wartości w metodzie main().

2 Utwórz metodę *static void invoke(Measurable measurable)* bazującą na interfejsie z poprzedniego zadania, a następnie wywołaj ją na dwa sposoby:
* przekazując referencję do obiektu
* przekazując lamdę

3 Korzystając z danych *var dni = new String[] {"Poniedziałek", "Wtorek", ...}* wywołaj funkcję **Arrays.sort(dni, lambda)** przekazującą funkcję lambda sortującą dane według ilości znaków.

4 Zamień podany kod na kod funkcyjny wykorzystujący lambdę
```java
var miasta = Arrays.asList("Kraków", "Gdynia", "Warszawa", "Wrocław", "Poznań", "Katowice");
long counter = 0;
for (String miasto : miasta) {
    if (miasto.length() == 6) {
        counter++;
    }
}
System.out.println(counter);
```

5 Napisz program, który zapyta użytkownika o dodatnią liczbę całkowitą **X**, a następnie w jednym streamie wyemituje liczby od 0 do **X** pomijając liczby parzyste.

6 Napisz program, który będzie emitował strumień IntStream (range 0 - 50), a następnie:
* filtrował liczby nieparzyste,
* dzielił pozostałe liczby przez 5 (wynik jako double),
* mapował je na Stringa dodając słówko "Liczba: ",
* wypisywał wynik na ekranie po przecinku

*Przykładowe operatory .range, .filter, .map, .mapObj, .mapToDouble, asDoubleStream, forEach*