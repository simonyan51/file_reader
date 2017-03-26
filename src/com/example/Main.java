package com.example;

import com.example.client.Client;

import java.io.IOException;

/**
 * Created by simonyan_51 on 25.03.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Client client = new Client();
        client.start();
    }
}
