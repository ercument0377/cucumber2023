@selenium_grid
Feature: verify_application_title
 @grid_chrome
 Scenario: verify_title_on_chrome
  Given user is on the application_login page with chrome
  Then verify the title includes admin



 @grid_firefox
 Scenario: verify_title_on_firefox
  Given user is on the application_login page with firefox
  Then verify the title includes admin

#  selenium Grid ne demektir?
# Selenium Grid uzaktan (remote) test koşturmak için kullanılır
# Paralel testing için Selenium Grid kullanılır


# Ne yaparız : cross Browser Test (coklu browser de test)
# Niçin yapaız : fonksiyonların veya applicationın özelliklerinin farklı browserlerde çalışıp çalışmadığını test ederiz

# DesiredCapabilities ne demektir?
#    Browserler için farklı  name, version, platform gibi özellikleri eklemek için kullanırız.

# Romete Driver (uzaktan driver) ne demektir? Niçin kullanırız?
#   Remote driveri remote platforma  (uzaktan bir platforma) bağlanmak için kullanırız
#   Node bağlanmak için remote driver kullanırız

# Selenium grid in faydası nedir?
#  paralel test yapmak için ve zamandan kazanmak için kullanırız, butun test framework ları çalıştırabiliriz

# Hub nedemek?
#   farklı bilgisayarlarda (makine) paralel testleri çalışturduğumuz servere denir

# Node ne demek?
#   hub'lara kaydolmak için (bağlanmak için)  kullanılan server makinelerine denir. selenium grid çoklu node ile çalışabilir

# selenium gride de testlerinizi nasıl çalıştırırsınız?
#  Hub a kaydolurum, çünkü bunu server olarak kullanırım. Ardından Node kaydolurum(bağlanırım), ardından test caselerimi oluşturum ve çalıştırırım.


# Driver i nasıl guncel tutarsınız?
#  en iyi kod çalışan koddur, eğer driver çalışıyorsa kullanmaya devam et. eger driverle alakalı hata veriyorsa bu durumda guncelleme yapabiliriz.



