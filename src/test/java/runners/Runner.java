package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

// calıstırmak ıstediğim feature file yi belirtmem lazım
@CucumberOptions(
        features = "src/test/resources/Sprint_13.05/Eagles/Day16_C5_US100450_kullanici_manager_kullanici_bilgilerini_kullanarak_login_yapmali.feature",  //ZORUNLUDUR  -- dosyanın  pathini girmemiz lazım
        glue = "stepdefinitions", // ZORUNLUDUR => Stepdefinition adresi veya pathini yazıyoruz
        tags = "@manager_login_test",  // opsiyoneldir kullanılmayabilir  hangi feature file koşmalı onu belirtmeliyiz -- eger tags kullanmaz isek Runner tum featureleri run eder
        dryRun = false       //opsiyoneldir yani yazmasakta false olur

)

public class Runner {

}
/*
Runner: feature file'lari calistirmak icin kullanilir
@RunWith : Cucumber.class'lari calistirmak icin kullanilir, kullanmadan Runner calismaz
@CucumberOptions() : feature path'i eklemek icin kullanilir , step deginition paht, tags, dryRun, report plugins icerir
 -feature : feature dosyasi path'ini verir, spesifik bir feature file isaret edilebilir
 -glue : step definition class'inda spesifik path'i isaret eder
 -tags : hangi feature yada senaryo kosacak bunu belirler. bu tag'i feature file ekliyoruz
 -dryRun : herhangi bir JAVA kod eksikligini kontol eder (step definition kullaniriz)
           : dryRun 2 value (deger) alir, true (head-less) veya false
           : dryRun = false => Herhangi bir JAVA kodunun eksik olup olmadigini kotrol ederken tarayicida testleri calistirir
           : dryRun = true =>  Herhangi bir JAVA kodunun eksik olup olmadigini kotrol ederken tarayici olmadan testleri calistirir
 */