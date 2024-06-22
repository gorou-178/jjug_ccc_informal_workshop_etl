package com.example.demo.configuration;

import com.example.demo.dao.Address;
import com.example.demo.repository.AddressRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializerTest {

    @Bean
    public CommandLineRunner loadTestData(AddressRepository repository) {
        return args -> {
            // 初期データを作成
            Address data1 = new Address();
            data1.setId(1L);
            data1.setJlgCode("100001");
            data1.setOldPostalCode("12345");
            data1.setPostalCode("1234567");
            data1.setPrefectureKana("ﾄｳｷｮｳﾄ");
            data1.setCityKana("ﾁｮｳﾌｼ");
            data1.setTownKana("ｼﾞﾝﾄﾞｳｼﾞ");
            data1.setPrefecture("東京都");
            data1.setCity("調布市");
            data1.setTown("神道寺");
            data1.setMultiplePostalCodes('0');
            data1.setSpecialTownName('0');
            data1.setHasChome('1');
            data1.setMultipleTowns('0');
            data1.setUpdateStatus('0');
            data1.setUpdateReason('0');

            Address data2 = new Address();
            data1.setId(2L);
            data2.setJlgCode("100002");
            data2.setOldPostalCode("23456");
            data2.setPostalCode("2345678");
            data2.setPrefectureKana("ｵｵｻｶﾌ");
            data2.setCityKana("ｵｵｻｶｼ");
            data2.setTownKana("ｷﾀｸ");
            data2.setPrefecture("大阪府");
            data2.setCity("大阪市");
            data2.setTown("北区");
            data2.setMultiplePostalCodes('1');
            data2.setSpecialTownName('0');
            data2.setHasChome('1');
            data2.setMultipleTowns('0');
            data2.setUpdateStatus('1');
            data2.setUpdateReason('1');

            // データを保存
            repository.save(data1);
            repository.save(data2);
        };
    }

}
