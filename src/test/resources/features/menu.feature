Feature: Menu size and add more items
  @wip
  Scenario: Menu size
    Given The user on the login page and should be able to login
    Then  The user go to basket and able to see "There is no result" message
    Then The user go to main menu and menu size should be 12
    And  The user click on the "Atıştırmalık" button
    And  The user add more items and navigate the main menu
    And  The user click on the "Yiyecek" button
    And The user add three items and go to basket





    ##Senaryo Kullanıcı giriş yapar.
    # Sepete yönlenerek sepetin boş olup olmadığının kontrolünü yapar ve anasayfaya geri döner.
    # Anasayfadaki görülen kategori sayısını konsola bastırır.
    # ‘Atıştırmalık’ kategorisini açarak iki farklı üründen ikişer tane ekler.Anasayfaya geri döner.
    # ‘Yiyecek’ kategorisinden bir üründen 3 adet ekler.Sepete giderek sepetteki ürünleri her birini birer adet daha arttırır.
    # Ürün sayılarının artıp artmadığını kontrol ettikten sonra sepetteki tüm ürünleri siler.