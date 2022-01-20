import java.util.function.BinaryOperator;

public class kryptering{
    public static void main(String[] args){
        String message = "O";
        char nyckel = '*';
        String secret = "";
        String decryptedmessage = "";
        for(int i = 0;i < message.length();i++){
            String msgbin = Integer.toBinaryString(message.charAt(i));
            System.out.println("Binary message " + msgbin);

            String temp = "0" + Integer.toBinaryString(nyckel);
            System.out.println("Key to binary  " + temp);
            for (int z = 0;z < msgbin.length();z++) {
                if (msgbin.charAt(z) == temp.charAt(z)) {
                    secret += "0";
                } else {
                        secret += "1";
                }
            }
        }
        System.out.println("Secret code    " + secret);
        for(int i = 0;i < message.length();i++){
            String temp = "0" + Integer.toBinaryString(nyckel);
            for (int z = 0;z < secret.length();z++) {
                if (secret.charAt(z) == temp.charAt(z)) {
                    decryptedmessage += "0";
                } else {
                        decryptedmessage += "1";
                }
            }
        }
        System.out.println("Dekryp Message " + decryptedmessage);
    }
}