package calculator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Float> prices = new LinkedHashMap<>();
        prices.put("Bubblegum", 2f);
        prices.put("Toffee", 0.2f);
        prices.put("Ice cream", 5f);
        prices.put("Milk chocolate", 4f);
        prices.put("Doughnut", 2.5f);
        prices.put("Pancake", 3.2f);

        /*System.out.println("Prices:");
        for (Map.Entry<String, Float> entry : prices.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());}*/
        sales(prices);
    }
    public static void sales(LinkedHashMap<String, Float> prices){
        LinkedHashMap<String, Integer> sales = new LinkedHashMap<>();
        sales.put("Bubblegum", 101);
        sales.put("Toffee", 590);
        sales.put("Ice cream", 450);
        sales.put("Milk chocolate", 420);
        sales.put("Doughnut", 430);
        sales.put("Pancake", 25);

        float totalincome = 0;
        System.out.println("\nEarned amount:");
        for (Map.Entry<String, Integer> entry : sales.entrySet()){
            String key = entry.getKey();
            int qntSold = entry.getValue();
            float price = prices.get(key);
            float income = price * qntSold;
            totalincome += income;
            System.out.println(key + ": $" + income);
        }
        System.out.println("\nIncome" + ": $" + totalincome);
        net(totalincome);
    }
    public static void net(Float totalincome){
        int staff_expense = prompt("Staff expenses:");
        int other_expense = prompt("Other expenses:");
        float netIncome = totalincome - staff_expense - other_expense;
        System.out.println("Net income" + ": $" + netIncome);
    }
    public static int prompt(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        /*System.out.print("> ");*/
        return input.nextInt();
    }
}