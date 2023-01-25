@Data_Tables
Feature:
  @Odev_Outline
  Scenario Outline:kullanici_new_button_a_click_eder

    And kullanici new button’a Click eder
    When kullanıcı tüm "<fields>" girer
    When kullanıcı create buttona click eder
    And kullanıcı first name arar
    Then name "<fields>"’in first name içerdiğini verify eder

    Examples:Test Data
      | fields     |
      | Ercument   |
      | Ercu       |
      | manager    |
      | ABD        |
      | 444        |
      | 2023-02-22 |
      | 400        |


  @Odev_Tables
  Scenario:kullanici_new_button_a_click_eder(
    And kullanici new button’a Click eder
    When kullanıcı tüm "<fields>" girer
    When kullanıcı create buttona click eder
    And kullanıcı first name arar
    Then name "<fields>"’in first name içerdiğini verify eder

      | firsName | lastName | position | office | extension | startDate  | salary |
      | Ercument | Ercu     | manager  | ABD    | 444       | 2023-02-22 | 400    |


