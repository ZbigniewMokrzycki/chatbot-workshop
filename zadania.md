1. Podstawy: i18n
    * Napisz klasę `WordShortener` z metodą `shorten(String word)`, która dla podanego w parametrze słowa zwóci jego krótszą wersję. Np. 
        ```
        "java" -> "j2a" 
        "internationalization" -> "i18n"
        ```
    * Przetestuj różne przypadki. Warto użyć asercji: `assertNotNull`, `assertEquals`
    * Niektóre parametry nie mogą być sensownie skrócone. Jakie? Dodaj metodę `canBeShortened(String word)`, która sprawdzi czy podany parametr może zostać skrócony. Warto użyć: `assertTrue`, `assertFalse`.

2. Wyjątki: i18n
    * Dodaj więcej testów do metody `shorten`. W przypadku nieprawidłowego parametru wyrzuć wyjątek. Przetestuj, że wyjątek jest faktycznie rzucany.
  
3. Code coverage: i18n
    * W przypadku niektórych słów metoda `shorten` niespodziewanie wydłuża słowo. Jakie to słowa? 
    * Zaproponuj rozwiązanie.
    * Jak sprawdzić czy nasza zmiana jest poprawnie przetestowana?
  
4. AssertJ: Word Splitter
    * Napisz klasę `WordSplitter` z metodą `split(String sentence)`, która dla przekazanego w parametrze zdania zwróci listę słów. Np.
        ```
        "Ala ma kota" -> ["Ala", "ma", "kota"]
        ```
    * Przetestuj tę metodę. (Sprawdź czy zwrócona lista nie jest pusta, czy zawiera określone słowo, sprawdź długość listy)
    * (opcjonalnie) Co ze znakami interpunkcyjnymi?

5. AssertJ: SentenceShortener
    * Napisz klasę `SentenceShortener` z metodą `shorten(String sentence)`, która będzie skracać zdania.
      
      Np. `Ala ma kota -> Ala ma k2a`
       
      Skorzystaj z kodu napisanego do tej pory. Przetestuj dla różnych przypadków.

6. Chatbot - rozgrzewka
    * Napisz test do metody `getBotName()` w klasie `ChatBot`. Upewnij się, że zwracana nazwa to `[TwojeImię]Bot`, np. `AdamBot`.
    * Uruchom `com.tdd.chat.ProdMain`
    * Wejdź na stronę https://spring-ws-chat.herokuapp.com/ i sprawdź czy nazwa Twojego ChatBota faktycznie uległa zmianie.

7. Chatbot - raport o błędzie 
    * Użytkownik zgłasza, że Twój ChatBot ma błąd. Coś dziwnego stało się gdy ktoś napisał `I like history!`. 
    * Zweryfikuj doniesienia użytkownika.
    * Zaproponuj rozwiązanie błędu.
    
8. Chatbot - Shortener
    * Dodaj obsługę wiadomości `!shorten [zdanie]`. 
    * Otrzymawszy taką wiadomość, bot odpowiada skróconym zdaniem.
    * Np. na wiadomość: `!shorten Ala ma kota` odpowie: `Ala ma k2a`
    
9. Chatbot - gaduła (TDD ping-pong)
    * Dodaj do ChatBota metodę, która zwróci imię największej gaduły na czacie (użytkownika, który wysłał najwięcej wiadomości).
    * Zaprojektuj rozwiązanie za pomocą TDD.
    
10. Chatbot (Mockito - mockowanie odpowiedzi)
    * Na komendę `!auction start [przedmiot]` Chatbot powinien wylosować cenę z przedziału 0-1000zł. 
    * Następnie Chatbot licytuje przedmiot odpowiadając `!auction bid [cena]`
    * Aukcja kończy się gdy zostanie odebrany komunikat `!auction stop`
    * Bonus 1: Twój bot powinien wysłać `!auction I won` gdy uzna, że wygrał
    * Bonus 2: Bot wstrzymuje się od licytacji z prawdopodobieństwem 0.5
    
11. Chatbot - Mockito - weryfikacja wywołań
    * Rząd uchwalił ustawę o przeciwdziałaniu przestępstwom finansowym. Z ustawy wynika, że za każdym razem gdy ktoś licytuje za kwotę 500 PLN lub więcej, Twój ChatBot musi powiadomić API Urzędu Skarbowego.
    * Wprowadź zmianę używając klasy `HttpTaxOfficeApi` dostarczonej przez ustawodawcę.
    
12. (opcjonalnie) Chatbot - Refactor
    * Czy Twoje klasy nie urosły za bardzo? Przenieś niektóre funkcjonalności do nowych klas. 
    * Dla pewności uruchamiaj testy po każdej zmianie.
    
12. (opcjonalnie) Chatbot - Mockito - mockowanie odpowiedzi
    * Zaprojektuj przy pomocy TDD klasę `CurrencyConverter`, z metodą umożliwiającą zamianę kwoty w PLN na EUR.
    * Skorzystaj z klasy `CurrencyRates`, która dostarczy Ci kursu wymiany waluty. 
    * Jakie problemy widzisz? Jak ich uniknąć?
    * Pomyśl o wyjątkach
    * Dodaj obsługę wiadomości `!toEUR 10` do ChatBota.
    * Pamiętaj o ustawie (zadanie 11)!
    
13. Testy parametryzowane 
    * Przetestuj klasę `SentenceShortener` (z zadania 5) przy pomocy biblioteki do testów parametryzowanych.
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
        
14. (opcjonalnie) Przetestuj metodę `indexOf(String str)` z klasy `String` biblioteki standardowej javy.
    * Pomyśl o różnych przypadkach brzegowych
    * Pomyśl o nieprawidłowych użyciach
    
15. (opcjonalnie) Przetestuj metodę `abs(Integer i)` z klasy `Math` biblioteki standardowej javy.
    * Pomyśl o różnych przypadkach brzegowych
    * Czy potrafisz znaleźć błąd?
    
16. (opcjonalnie) Zaimplementuj zasady 'gry w życie' Conwaya (Conway's Game of Life). https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
    
    Opis z wikipedii: 
    Gra toczy się na nieskończonej planszy podzielonej na kwadratowe komórki. Każda komórka ma ośmiu „sąsiadów”, czyli komórki przylegające do niej bokami i rogami. Każda komórka może znajdować się w jednym z dwóch stanów: może być albo „żywa” (włączona), albo „martwa” (wyłączona). Stany komórek zmieniają się w pewnych jednostkach czasu. Stan wszystkich komórek w pewnej jednostce czasu jest używany do obliczenia stanu wszystkich komórek w następnej jednostce. Po obliczeniu wszystkie komórki zmieniają swój stan dokładnie w tym samym momencie. Stan komórki zależy tylko od liczby jej żywych sąsiadów.
    * Zacznij od implementacji (przetestowania) reguł życia komórki:
      * Każda żywa komórka z mniej niż dwoma sąsiadami umiera w następnej turze (z samotności)
      * Każda żywa komórka z dwoma lub trzema sąsiadami pozostaje przy życiu
      * Każda żywa komórka z więcej niż trzema żywymi sąsiadami umiera (z przeludnienia)
      * Każda martwa komórka z dokładnie trzema żywymi sąsiadami staje się żywa w następnej turze (reprodukcja)
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