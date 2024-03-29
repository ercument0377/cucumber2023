@db_read
Feature: read_rezervasyon_bilgileri_databaseden_oku
  @db_hotel_price
  Scenario: TC01_read_otel_bilgileri
    Given user connects to the database
    And  gets the "Price" from "tHOTELROOM" table
    And user reads all of the "Price" column data
    Then  close the connection

  @db_hotel_name
  Scenario: TC02_read_otel_bilgileri
    Given user connects to the database
    And  gets the "Name" from "tHOTEL" table
    And user reads all of the "Name" column data
    Then  close the connection

  @db_hotel_adress
  Scenario: TC02_read_otel_bilgileri
    Given user connects to the database
    And  gets the "Address" from "tHOTEL" table
    And user reads all of the "Address" column data
    Then  close the connection

  @db_hotel_code
  Scenario: TC02_read_otel_bilgileri
    Given user connects to the database
    And  gets the "Code" from "tHOTEL" table
    And user reads all of the "Code" column data
    Then  close the connection
