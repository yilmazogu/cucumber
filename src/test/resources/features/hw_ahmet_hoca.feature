@Homework_ahmet_hoca
Feature: US167854_manager_login_test
  Scenario Outline: kullanici tum manager login bilgileriyle giriş yapabilmeli
    Given kullanıcı "https://www.bluerentalcars.com/" gider
    When kullanici login sayfasina gider
    And kullanıcı kullanıcı adını "<kullanıcıadı>" girer
    And kullanıcı şifreyi "<şifre>" girer
    And login butonuna basar
    Then login islemi gerçekleşir

    Examples: kullanıcı_bilgileri
    |kullanıcıadı | şifre |
    |sam.walker@bluerentalcars.com  | c!fas_art |
    |kate.brown@bluerentalcars.com  | tad1$Fas  |
    |raj.khan@bluerentalcars.com    | v7Hg_va^  |
    |pam.raymond@bluerentalcars.com | Nga^g6!   |











