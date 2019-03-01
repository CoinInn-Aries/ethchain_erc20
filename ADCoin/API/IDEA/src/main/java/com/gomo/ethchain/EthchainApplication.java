package com.gomo.ethchain;

import com.gomo.ethchain.service.GomoCoinSDK;
import com.gomo.ethchain.test.Test;
import com.gomo.ethchain.util.PropertiesUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EthchainApplication {

    static {
        //初始化环境（服务器内网ip）只需调用一次
        try {
            //GomoCoinSDK.init("http://10.26.20.193:8545/", "0xd36E09d044Cb9e82e2177a68DADF8977a71bDc42");
            //GomoCoinSDK.init("https://ropsten.infura.io/v3/5869793275ea48718b362d4753f67bd6", "0xd36E09d044Cb9e82e2177a68DADF8977a71bDc42");
            GomoCoinSDK.init("https://mainnet.infura.io/v3/f96e7b5c1ab9457d957f7d2bf813493a", "0x66d9c4D19b4C8e23a54C6dc4CeEd141f66b8111C");
        } catch (Exception e) {

        }
    }
    public static void main(String[] args) throws Exception{

        SpringApplication.run(EthchainApplication.class, args);
        //Test.testSDK();
        //System.out.println("合约地址："+Test.deployContract());
    }
}
