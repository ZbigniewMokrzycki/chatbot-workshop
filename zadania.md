0. Przetestuj metodę `abs(int i)` z klasy `Calculator`.
    * Pomyśl o różnych przypadkach brzegowych
    * Czy potrafisz znaleźć błąd?

1. Podstawy: i18n
    * Napisz klasę `WordShortener` z metodą `String shorten(String word) {}`, która dla podanego w parametrze słowa zwóci jego krótszą wersję. Np. 
        ```
        "java" -> "j2a" 
        "internationalization" -> "i18n"
        ```
    * Przetestuj kilka różnych słów. Warto użyć asercji: `assertNotNull`, `assertEquals`
    
2. Podstawy (cd): i18n
    * Niektóre parametry nie mogą być sensownie skrócone. Jakie? 
    * Czy może zdarzyć się, że metoda `shorten` niespodziewanie wydłuży słowo? 
    * Użytkownicy klasy `WordShortener` potrzebują sposobu aby sprawdzić czy ich słowo może być skrócone zanim spróbują je skrócić.
    * Dodaj metodę `boolean canBeShortened(String word) {}`, która odpowie czy podane słowo może zostać skrócone. 
    * Przetestuj tę metodę.
    * Warto użyć: `assertTrue`, `assertFalse`.

3. Wyjątki: i18n
    * Zmodyfikuj metodę `String shorten(String word) {}` tak aby rzucała wyjątek w momencie gdy ktoś spróbuje skrócić nieskracalne słowo.
    * Przetestuj, że wyjątek jest faktycznie rzucany.
  
4. Code coverage: i18n
    * Zmierz pokrycie kodu dla klasy `WordShortener`
    * Dodaj nową funkcjonalność do metody `shorten`: niech skraca słowo `Aleksandra` od `Ola`.
    * Ponownie sprawdź pokrycie kodu. Jak się zmieniło?
    * Przetestuj zmianę.
  
5. AssertJ: Word Splitter
    * Napisz klasę `WordSplitter` z metodą `List<String> split(String sentence) {}`, która dla przekazanego w parametrze zdania zwróci listę słów. Np.
        ```
        "Ala ma kota" -> ["Ala", "ma", "kota"]
        ```
    * Przetestuj tę metodę. (Sprawdź czy zwrócona lista nie jest pusta, czy zawiera określone słowo, sprawdź długość listy)
    * (opcjonalnie) Co ze znakami interpunkcyjnymi?

6. AssertJ: SentenceShortener
    * Napisz klasę `SentenceShortener` z metodą `String shorten(String sentence) {}`, która będzie skracać zdania.
      Np. `Ala ma kota -> Ala ma k2a`
       
    * Skorzystaj z kodu napisanego do tej pory. Przetestuj dla różnych przypadków.

7. (opcjonalnie) AssertJ: n largest
    * Napisz klasę `NumFilter` z metodą `List<Integer> nlargest(List<Integer> ints, Integer n) {}`, która dla podanej listy liczb zwróci n największych z nich.
    * Przetestuj rozwiązanie.

8. Prod Debug - Chatbot
    * Upewnij się czy prowadzący uruchomił Chatbota
    * Nasz Chatbot jest bardzo prosty. Jednyne co potrafi to odpowiedzieć `Hello!` w momencie gdy ktoś napisze `hi`.
    * Wejdź na stronę https://spring-ws-chat.herokuapp.com/ 
    * Zweryfikuj czy Chatbot faktycznie działa tak jak powinien.
    * Czy potrafisz wskazać błąd w kodzie? Spróbuj go naprawić.
    * Spróbuj przetestować poprawiony kod.
    
9. TDD - Rok przestępny
    * Za pomocą techniki TDD!
    * Zaprojektuj metodę która stwierdzi czy podany rok jest rokiem przestępnym.
    * Lata podzielne przez 400 - SĄ przestępne (np. 2000 był rokiem przestępnym),
    * Lata podzielne przez 100 ale nie przez 400 - NIE są przestępne (np. 1700, 1800, and 1900 NIE były przestępne, ani 2100 NIE będzie),
    * Lata podzielne przez 4 ale nie przez 100 - SĄ przestępne (np. 2008, 2012, 2016),
    * Lata nie podzielne przez 4 - NIE są przestępne (np. 2017, 2018, 2019).    
    
10. TDD - Historia wizyt
    * Za pomocą techniki TDD!
    * Napisz klasę `VisitHistory` do śledzenia historii odwiedzin u Twoich znajomych: 
      `void insert(String item) {}` - do dodawania odwiedzin
      `List<String> getHistory() {}` - do sprawdzania obecnej zawartości historii
    * Początkowo lista jest pusta
    * Ostatnio dodany element jest na liście jako pierwszy, a najwcześniej dodany jako ostatni
    * Elementy na liście są unikalne (występują tylko raz), dodatnie duplikatu skutkuje przesunięciem elementu na początek listy
    * (opcjonalnie) nie pozwól na dodanie pustego elementu `""`
    * (opcjonalnie) ogranicz wielkość listy do `n` (najstarsze elementy są usuwane przy osiągnięciu maksymalnego rozmiaru listy)
    * Np: po dodatniu kolejno: "Ala", "Tomek", "Wojtek", "Wojtek", "Tomek", lista ma zwrócić `[ "Tomek", "Wojtek", "Ala" ]`
     
11. TDD - Rozkład liczby na czynniki pierwsze
    * Za pomocą techniki TDD!
    * Napisz metodę, która rozłoży podaną liczbę `n` na listę jej czynników pierwszych. 
    * http://matematyka.pisz.pl/strona/1349.html
    
12. Mockito (mockowanie odpowiedzi) - Lottery
    * Zaprojektuj klasę `Lottery`, która pozwala wyciągnąć los.
    * Los zwykle jest pusty
    * 1 na 1000 losów jest wygrany
    * 90% spośród wygranych losów wygrywa telewizor
    * 10% spośród wygranych losów wygrywa samochód
    * Przetestuj czy zasady loterii zostały poprawnie zakodowane.
    
13. Mockito (weryfikacja wywołań) - Lottery
    * Rząd uchwalił ustawę o przeciwdziałaniu przestępstwom finansowym. Z ustawy wynika, że za każdym razem gdy ktoś wygra na loterii, musisz powiadomić API Urzędu Skarbowego.
    * Zmień klasę `Lottery` tak aby była zgodna z ustawą. Użyj klasy `HttpTaxOfficeApi` dostarczonej przez ustawodawcę.
    * W przypadku nagrody pocieszenia, powiadom API o podejrzeniu unikania podatku od wygranej.
    * W przypadku głównej wygranej, powiadom API o dużej sumie pieniędzy.
    * (opcjonalnie) Nowelizacja ustawy przewiduje jedynie kontrolę wyrywkową. Powiadamiaj API co drugi przypadek wygranej.
    * (opcjonalnie) Odtwórz fanfary dla głównej wygranej (przetestuj!)
    
14. Mockito (mockowanie odpowiedzi) - CurrencyConverter
    * Zaprojektuj (najchętniej przy pomocy TDD) klasę `CurrencyConverter`, z metodą umożliwiającą zamianę kwoty w PLN na EUR, np. `100 PLN -> ~25 EUR`
    * Skorzystaj z klasy `com.tdd.currency.CurrencyRates`, która dostarczy Ci kursu wymiany waluty: Dostępna tam metoda `getEurPlnRate()` zwraca ok 4zł w zależności od kursu dnia.
    * Jakie problemy widzisz? Jak ich uniknąć?
    * Pomyśl o wyjątkach

15. Mockito (weryfikacja wywołań) - CurrencyConverter
    * Rząd uchwalił ustawę o przeciwdziałaniu przestępstwom finansowym. Z ustawy wynika, że za każdym razem gdy ktoś przelicza kwotę 500 PLN lub więcej, musisz powiadomić API Urzędu Skarbowego.
    * Wprowadź zmianę używając klasy `HttpTaxOfficeApi` dostarczonej przez ustawodawcę.
    
16. Testy parametryzowane 
    * Przetestuj klasę `SentenceShortener` (z zadania 5) przy pomocy biblioteki do testów parametryzowanych.
    * Dokumentację biblioteki znajdziesz tutaj: https://junit.org/junit5/docs/5.0.3/user-guide/#writing-tests-parameterized-tests
    * Użyj kilku przykładów zdań i ich skróconych odpowiedników jako parametrów do testu.
    * Użyj zależności mavena
        ```
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-params</artifactId>
            <version>5.3.2</version>
            <scope>test</scope>
        </dependency>
        ```
  
Zadania domowe:
        
1. (opcjonalnie) Przetestuj metodę `indexOf(String str)` z klasy `String` biblioteki standardowej javy.
    * Pomyśl o różnych przypadkach brzegowych
    * Pomyśl o nieprawidłowych użyciach
    
2. (opcjonalnie) Przetestuj metodę `replace(String s1, String s2)` z klasy `String` biblioteki standardowej javy.
    * Pomyśl o różnych przypadkach brzegowych
    
3. (opcjonalnie) Czy można dodać `null` jako element do listy w javie? 
    * Co według Ciebie powinno się stać? 
    * Sprawdź za pomocą testu jaką decyzję podjęli autorzy javy. 
    
4. (opcjonalnie) TDD/AssertJ - Napisz program 'FizzBuzz' (https://en.wikipedia.org/wiki/Fizz_buzz).
    * Program przyjmuje jeden parametr `n` - liczbę iteracji programu 
    * W każdej iteracji program wypisuje kolejne liczby całkowite, od 1 do n
    * Dla liczb podzielnych przez 3 - zamiast liczby wypisuje `Fizz`
    * Dla liczb podzielnych przez 5 - zamiast liczby wypisuje `Buzz`
    * Dla liczb podzielnych zarówno przez 3 jak i 5 - zamiast liczby wypisuje `Fizz Buzz`
    * Przetestuj poprawność działania programu
    * Przykładowe wyjście programu dla n = 23:
    `1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23`
    
5. (opcjonalnie) TDD - Zaimplementuj podstawowe zasady 'gry w życie' Conwaya (Conway's Game of Life). https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
    
    Opis z wikipedii: 
    Gra toczy się na nieskończonej planszy podzielonej na kwadratowe komórki. Każda komórka ma ośmiu „sąsiadów”, czyli komórki przylegające do niej bokami i rogami. Każda komórka może znajdować się w jednym z dwóch stanów: może być albo „żywa” (włączona), albo „martwa” (wyłączona). Stany komórek zmieniają się w pewnych jednostkach czasu. Stan wszystkich komórek w pewnej jednostce czasu jest używany do obliczenia stanu wszystkich komórek w następnej jednostce. Po obliczeniu wszystkie komórki zmieniają swój stan dokładnie w tym samym momencie. Stan komórki zależy tylko od liczby jej żywych sąsiadów.
    
    * Skup się tylko na implementacji (przetestowaniu) podstawowych reguł życia komórki:
      * Każda żywa komórka z mniej niż dwoma sąsiadami umiera w następnej turze (z samotności)
      * Każda żywa komórka z dwoma lub trzema sąsiadami pozostaje przy życiu
      * Każda żywa komórka z więcej niż trzema żywymi sąsiadami umiera (z przeludnienia)
      * Każda martwa komórka z dokładnie trzema żywymi sąsiadami staje się żywa w następnej turze (reprodukcja)
    
6. (opcjonalnie) TDD - Zaimplementuj resztę 'gry w życie' z poprzedniego zadania
    * Dodaj zmianę stanu komórki w kolejnych turach gry
    * Zaprojektuj planszę gry (dla uproszczenia 50x50), która będzie zarządzać komórkami 
    * Wypisuj stan planszy na ekran
    
    Przykład (1 żywa komórka, plansza 2x2)
    
    Tura 1:
    ```
        ..
        .x    
    ```
    Tura 2:
    
    ```
        ..
        ..    
    ```
    
Zadania na Chatbota:  

1. Chatbot - rozgrzewka
    * Napisz test do metody `getBotName()` w klasie `ChatBot`. Upewnij się, że zwracana nazwa to `[TwojeImię]Bot`, np. `AdamBot`.
    * Uruchom `com.tdd.chat.ProdMain`
    * Wejdź na stronę https://spring-ws-chat.herokuapp.com/ i sprawdź czy nazwa Twojego ChatBota faktycznie uległa zmianie.
    
2. Chatbot - Shortener
    * Dodaj obsługę wiadomości `!shorten [zdanie]`. 
    * Otrzymawszy taką wiadomość, bot odpowiada skróconym zdaniem.
    * Np. na wiadomość: `!shorten Ala ma kota` odpowie: `Ala ma k2a`    
    * Użyj klas z poprzednich zadań
    
3. Chatbot - gaduła (TDD ping-pong)
    * Dodaj do ChatBota metodę, która zwróci imię największej gaduły na czacie (użytkownika, który wysłał najwięcej wiadomości).
    * Zaprojektuj rozwiązanie za pomocą TDD.
    
4. Chatbot - moderator (TDD / Mockito)
    1. Gdy na czacie zostanie napisane `motyla noga` ChatBot powinien odpisać `Nie do wiary [użytkownik]! Jak można się tak brzydko wyrażać?!`.   
    2. (Mockito - mockowanie odpowiedzi) Jeżeli `motyla noga` pojawi się 2 razy w ciągu 1 minuty. Wówczas ChatBot powinien odpisać `...` (tj. zgodnie z _pyszną radą_ udać że nic nie słyszy).
    3. (Mockito - weryfikacja wywołań) Jednocześnie o naruszeniu zasad czystości języka powinien zostać poinformowany Wujek Dobra Rada. W tym celu użyj `pl.tvp.UncleGoodAdviceApi`.
    4. Co się stanie jeśli `UncleGoodAdviceApi` rzuci wyjątek?
    
5. (opcjonalnie) Chatbot - aukcja (Mockito - mockowanie odpowiedzi)
    * Na komendę `!auction start [przedmiot]` Chatbot powinien wylosować cenę z przedziału 0-1000zł. 
    * Następnie Chatbot licytuje przedmiot odpowiadając `!auction bid [cena]`
    * Aukcja kończy się gdy zostanie odebrany komunikat `!auction stop`
    * Bonus 1: Twój bot powinien wysłać `!auction I won` gdy uzna, że wygrał
    * Bonus 2: Bot wstrzymuje się od licytacji z prawdopodobieństwem 0.5
    
6. Chatbot - przelicznik walut
    * Dodaj obsługę wiadomości `!toEUR 10` do ChatBota.