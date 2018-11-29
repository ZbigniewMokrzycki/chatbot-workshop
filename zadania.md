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
    * Co ze znakami interpunkcyjnymi?

4. Mocki: Currency Converter
    * Napisz klasę `CurrencyConverter`, z metodami `convertEurToPln(BigDecimal amount)` i `convertPlnToEur(BigDecimal amount)`, które będą zwracać przeliczone kwoty. 
      Skorzystaj z klasy `CurrencyRates` która dostarczy Ci kursu wymiany waluty. 
    * Przetestuj swoją klasę `CurrencyConverter`.
    * Jakie problemy widzisz? Jak ich uniknąć?
