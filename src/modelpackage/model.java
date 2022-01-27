package modelpackage;
public class model{
    private String message;
    private String nyckel;
    public void encrypt(String message, String nyckel){
        this.message = message;
        this.nyckel = nyckel;
        {
            send1.addActionListener(e -> {


                //String message = tf1.getText();;
                //String nyckel = tf2.getText();
                String secret = "";
                String decryptedmessage = "";
                //Kryptera Message
                for (int i = 0; i < message.length(); i++) {
                    String msgbin = Integer.toBinaryString(message.charAt(i));
                    System.out.println("Binary message      " + msgbin);

                    String temp = "0" + Integer.toBinaryString(nyckel.charAt(i));
                    System.out.println("Key to binary       " + temp);
                    for (int z = 0; z < msgbin.length(); z++) {
                        if (msgbin.charAt(z) == temp.charAt(z)) {
                            secret += "0";
                        } else {
                            secret += "1";
                        }
                    }
                }
                System.out.println("Secret code         " + secret);
                //Dekryptera Secret Code
                for (int i = 0; i < message.length(); i++) {
                    String temp = "0" + Integer.toBinaryString(nyckel.charAt(i));
                    for (int z = 0; z < secret.length(); z++) {
                        if (secret.charAt(z) == temp.charAt(z)) {
                            decryptedmessage += "0";
                        } else {
                            decryptedmessage += "1";
                        }
                    }
                }
                System.out.println("Dekrypterat Message " + decryptedmessage);

            });
        }
    }
}