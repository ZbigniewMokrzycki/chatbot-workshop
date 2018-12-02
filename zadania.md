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
  
3. Matchery: Word Splitter
    * Napisz klasę `WordSplitter` z metodą `split(String sentence)`, która dla przekazanego w parametrze zdania zwróci listę słów. Np.
        ```
        "Ala ma kota" -> ["Ala", "ma", "kota"]
        ```
    * Przetestuj tę metodę. (Sprawdź czy zwrócona lista nie jest pusta, czy zawiera określone słowo, sprawdź długość listy)
    * (opcjonalnie) Co ze znakami interpunkcyjnymi?

4. Parametrized 
    * Napisz klasę `SentenceShortener` z metodą `shorten(String sentence)`, która będzie skracać zdania.
      
      Np. `Ala ma kota -> Ala ma k2a`
       
      Skorzystaj z kodu napisanego do tej pory. Przetestuj przy pomocy biblioteki do testów parametryzowanych.

5. Chatbot - rozgrzewka
    * Napisz test do metody `getBotName()` w klasie `ChatBot`. Upewnij się, że zwracana nazwa to `[TwojeImię]Bot`, np. `AdamBot`.
    * Uruchom `com.tdd.chat.Main`
    * Wejdź na stronę https://spring-ws-chat.herokuapp.com/ i sprawdź czy nazwa Twojego ChatBota faktycznie uległa zmianie.

6. Chatbot - raport o błędzie 
    * Użytkownik zgłasza, że Twój ChatBot ma błąd. Coś dziwnego stało się gdy ktoś napisał `I like history!`. 
    * Zweryfikuj doniesienia użytkownika.
    * Zaproponuj rozwiązanie błędu.
    
7. (opcjonalne) Chatbot - Shortener
    * Dodaj obsługę wiadomości `!shorten [zdanie]`. 
    * Otrzymawszy taką wiadomość, bot odpowiada skróconym zdaniem.
    * Np. na wiadomość: `!shorten Ala ma kota` odpowie: `Ala ma k2a`
    
8. Chatbot - TDD 
    * Dodaj metodę do ChatBota, która zwróci imię największej gaduły na czacie (użytkownika, który wysłał najwięcej wiadomości).
    * Zaprojektuj rozwiązanie za pomocą TDD.
    
9. Chatbot - mocki
    * Zaprojektuj obsługę wiadomości `!convert 10 EUR to PLN`.
    * Skorzystaj z klasy `CurrencyRates`, która dostarczy Ci kursu wymiany waluty. 
    * Jakie problemy widzisz? Jak ich uniknąć?
