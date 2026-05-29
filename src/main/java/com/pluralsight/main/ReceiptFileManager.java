package com.pluralsight.main;

import com.pluralsight.order.Order;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptFileManager {
    public static void saveReceipt(Order order) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        String time = LocalDateTime.now().format(formatter);

        String filename = "receipts/" + time + ".txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

            writer.write(order.toString());
            writer.close();
            System.out.println("Receipt saved!");
        } catch (Exception e) {
            System.out.println("An error occurred.");;
        }
    }
}
