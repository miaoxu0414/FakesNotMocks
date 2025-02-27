public class Main {
    public static void main(String[] args) {
        // Use FakeExchange instead of NYSE
        Exchange exchange = new FakeExchange();

        // Creating a Cash instance with 100 cents (1 dollar)
        Cash dollar = new Cash(exchange, 100);
        System.out.println("Dollar: " + dollar.toString());

        // Convert from USD to Euro using the Fake Exchange
        Cash euro = dollar.in("Euro");
        System.out.println("Dollar to Euro: " + euro.toString());

        // Convert from USD to GBP using the Fake Exchange
        Cash gbp = dollar.in("GBP");
        System.out.println("Dollar to GBP: " + gbp.toString());
    }
}
