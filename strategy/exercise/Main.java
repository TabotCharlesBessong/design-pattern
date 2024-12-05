package strategy.exercise;

public class Main {
  public static void main(String[] args) {
    // Using DES encryption
    ChatClient client1 = new ChatClient(new DESEncryption());
    client1.send("Hello, World!");

    // Using AES encryption
    ChatClient client2 = new ChatClient(new AESEncryption());
    client2.send("Hello, World!");
  }
}
