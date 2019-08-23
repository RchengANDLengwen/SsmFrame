package com.codejoys;

import com.codejoys.framework.Framework;
import com.sun.jndi.toolkit.url.Uri;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.List;

public class TestFramework {
    @Test
    public void test() {
        Framework framework = new Framework("config.txt");
    }

    // 读取配置文件
    @Test
    public void testReadResource() {
        // 得到资源文件的uri（资源文件的定位路径）
        URI uri = null;
        try {
            uri = getClass().getClassLoader().getResource("config.txt").toURI();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        try {
            List<String> strings = Files.readAllLines(Paths.get(uri));
            System.out.println(strings);

            for (String line : strings) {
                String[] split = line.split("=");
                System.out.println("key:" + split[0] + " value:" + split[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetConnection() {
        Framework framework = new Framework("config.txt");
        Connection connection = framework.openConnection();
    }

    @Test
    public void testQuery() {
        Framework framework = new Framework("config.txt");
        // framework.execute("findAll",);
    }
}
